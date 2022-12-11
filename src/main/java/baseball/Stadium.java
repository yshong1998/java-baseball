package baseball;

public class Stadium {

    Computer computer = new Computer();
    User user = new User();
    Referee referee = new Referee();

    public void playGame() {
        String restartNumber = "1";
        while (restartNumber.equals("1")) {
            oneGameCycle();
            restartNumber = user.inputRestartNumber();
        }
    }

    private void oneGameCycle() {
        boolean match = true;
        computer.createComputerNumbers();
        while (match) {
            computer.requestInputMessage();
            user.createUserNumber();
            referee.calculateBallCount(computer.getComputerNumbers(), user.getUserNumbers());
            referee.printBallCount();
            match = referee.checkGameOver();
        }
        computer.printEndMessage();
    }
}