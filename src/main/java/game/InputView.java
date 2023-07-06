package game;

public class InputView {
    private static final InputView INPUT_VIEW = new InputView();

    private InputView() {}

    public static InputView getInstance() {
        return INPUT_VIEW;
    }

    public void printAskingCarNumber() {
        System.out.println("자동차 대수는 몇 대인가요?");
    }

    public void printAskingCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void printAskingTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public String printException() {
        return  "input must be Integer";
    }
}
