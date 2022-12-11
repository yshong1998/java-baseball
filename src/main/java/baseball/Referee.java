package baseball;

import java.util.List;

public class Referee {

    private int strike = 0;
    private int ball = 0;

    public void calculateBallCount(List<Integer> computerNumbers, List<Integer> userNumbers) {
        clearBallCount();
        for (int i = 0; i < computerNumbers.size(); i++) {
            if (computerNumbers.get(i).equals(userNumbers.get(i))) {
                strike++;
            } else if (computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
    }

    public void printBallCount() {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike > 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        } else {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }

    public void clearBallCount() {
        strike = 0;
        ball = 0;
    }

    public boolean checkGameOver() {
        return strike != 3;
    }
}