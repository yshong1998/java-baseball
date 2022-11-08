package baseball;

import java.util.List;

public class Referee {
    private int strike;
    private int ball;

    public int getStrikeCount() {
        return strike;
    }

    public int getBallCount() {
        return ball;
    }

    public void ballCount(List<Integer> computerNumber, List<Integer> userNumber) {
        clearBallCount();
        for (int i = 0; i < 3; i++) {
            if (computerNumber.get(i).equals(userNumber.get(i))) { // depth가 3이예요
                strike++;
            } else if (computerNumber.contains(userNumber.get(i))) {
                ball++;
            }
        }
    }
    protected void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void clearBallCount() {
        strike = 0;
        ball = 0;
    }

    protected void printBallCount(int strike, int ball) {
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

}