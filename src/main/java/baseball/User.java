package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> userNumber = new ArrayList<>();

    public List<Integer> getUserNumber() {
        return userNumber;
    }

    public void inputUserNumber() {
        userNumber.clear();
        String userStringNumber;
        userStringNumber = Console.readLine();
        stringToIntNumber(userStringNumber);
        checkException(userNumber);
    }

    private void checkException(List<Integer> userNumber) {
        if (userNumber.size() != 3 || userNumber.contains(0)) {
            throw new IllegalArgumentException();
        }
    }

    private void stringToIntNumber(String userStringNumber) {
        String[] splittedUserNumber;
        splittedUserNumber = userStringNumber.split("");
        for (String elementNumber : splittedUserNumber) {
            addUserNumber(elementNumber);
        }
    }

    private void addUserNumber(String elementNumber) {
        if (userNumber.contains(elementNumber) || userNumber.contains(" ")) {
            throw new IllegalArgumentException(); // 중복 제거
        } else {
            userNumber.add(Integer.parseInt(elementNumber));
        }
    }
}
