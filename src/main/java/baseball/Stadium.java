package baseball;

public class Stadium {
    private final Computer computer = new Computer();
    private final User user = new User();
    private final Referee referee = new Referee();

    protected void startGame() {
        referee.printStartMessage();
        while (!computer.getRestartNumber().equals("2")) {
            playGame();
        }
    }

    private void playGame() {
        readyForGame();
        while (referee.getStrikeCount() != 3) {
            computer.requestInputMessage();
            user.inputUserNumber();
            referee.ballCount(computer.getComputerNumber(), user.getUserNumber());
            referee.printBallCount(referee.getStrikeCount(), referee.getBallCount());
        }
        computer.restarter();
        computer.restartOrNot();
    }

    private void readyForGame() {
        computer.createAnswerNumber();
        referee.clearBallCount();
    }
}