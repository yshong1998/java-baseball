package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;

public class User {


    private final List<Integer> userNumbers = new ArrayList<>();

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public String inputRestartNumber() {
        String restartNumber = Console.readLine();
        if(!(restartNumber.equals("1") || restartNumber.equals("2"))){
            throw new IllegalArgumentException();
        }
        return restartNumber;
    }

    public void createUserNumber() {
        userNumbers.clear();
        String inputNumbers;
        inputNumbers = Console.readLine();
        checkNumberDuplicate(inputNumbers);
        checkNumberOutOfRange(inputNumbers);
        checkStringInput(inputNumbers);
        inputUserNumbers(inputNumbers);
    }

    private void inputUserNumbers(String inputNumbers) {
        String[] numbers = inputNumbers.split("");
        for (int i = 0; i < inputNumbers.length(); i++) {
            userNumbers.add(Integer.parseInt(numbers[i]));
        }
    }

    private void checkNumberDuplicate(String inputNumbers) {
        String[] splitNumbers = inputNumbers.split("");
        Set<String> numbers = new HashSet<>(Arrays.asList(splitNumbers));
        if (numbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void checkNumberOutOfRange(String inputNumbers) {
        if (inputNumbers.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void checkStringInput(String inputNumbers) {
        try {
            Integer.parseInt(inputNumbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
