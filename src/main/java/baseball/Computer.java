package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {


    private final List<Integer> computerNumbers = new ArrayList<>();

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
    }

    public void requestInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void createComputerNumbers() {
        clearComputerNumbers();
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            addUninqueNumber(computerNumbers, randomNumber);
        }
    }

    public void clearComputerNumbers() {
        computerNumbers.clear();
    }

    private void addUninqueNumber(List<Integer> computerNumbers, int randomNumber) {
        if (!computerNumbers.contains(randomNumber)) {
            computerNumbers.add(randomNumber);
        }
    }
}
