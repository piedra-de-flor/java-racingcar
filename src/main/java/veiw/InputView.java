package veiw;

import java.util.Scanner;

public class InputView {
    public static Scanner scanner = new Scanner(System.in);
    private static final InputView INPUT_VIEW = new InputView();

    private InputView() {
    }

    public static InputView getInstance() {
        return INPUT_VIEW;
    }

    public String inputTryCount() {
        return scanner.nextLine();
    }

    public String inputCarNames() {
        return scanner.nextLine();
    }
}
