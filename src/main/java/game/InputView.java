package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private static final InputView INPUT_VIEW = new InputView();
    public Scanner scanner = new Scanner(System.in);
    private int carNumber;
    private int tryCount;

    private InputView() {
    }

    public static InputView getInstance() {
        return INPUT_VIEW;
    }

    private int inputCarNumber() {
        System.out.println("자동차 대수는 몇 대인가요?");
        return input();
    }

    private int inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return input();
    }

    private int input() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("input error - check your input it must be in Integer");
        }
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void tryInput() {
        do {
            carNumber = inputCarNumber();
            tryCount = inputTryCount();
        } while (!validateInput(carNumber, tryCount));
    }

    public boolean validateInput(int carNumber, int tryCount) {
        return (carNumber > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE && tryCount > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }
}
