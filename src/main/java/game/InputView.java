package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private static final InputView INPUT_VIEW = new InputView();
    public Scanner scanner = new Scanner(System.in);
    private int carNumber;
    private int tryCount;

    private InputView() {}

    public static InputView getInstance() {
        return INPUT_VIEW;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void inputCarNumber() {
        System.out.println("자동차 대수는 몇 대인가요?");
        do {
            carNumber = tryInput();
        } while (!validateInput(carNumber));
    }

    public void inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        do {
            tryCount = tryInput();
        } while (!validateInput(tryCount));
    }

    private int tryInput() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("input must be Integer");
        }
    }

    public boolean validateInput(int input) {
        return (input > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }
}
