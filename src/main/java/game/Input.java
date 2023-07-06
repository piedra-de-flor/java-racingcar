package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    public static Scanner scanner = new Scanner(System.in);
    private int carNumber;
    private int tryCount;

    public int getCarNumber() {
        return carNumber;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void inputCarNumber() {
        InputView.getInstance().printAskingCarNumber();
        do {
            carNumber = tryInput();
        } while (!validateInput(carNumber));
    }

    public void inputTryCount() {
        InputView.getInstance().printAskingTryCount();
        do {
            tryCount = tryInput();
        } while (!validateInput(tryCount));
    }

    private int tryInput() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException(InputView.getInstance().printException());
        }
    }

    public boolean validateInput(int input) {
        return (input > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }
}
