package game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private final int CAR_NAME_MAXIMUM_LENGTH = 5;
    public static Scanner scanner = new Scanner(System.in);
    private String[] cars;
    private int tryCount;

    public int getTryCount() {
        return tryCount;
    }
    public String[] getCarNames() {
        return cars;
    }

    public void inputTryCount() {
        InputView.getInstance().printAskingTryCount();
        do {
            tryCount = Integer.parseInt(tryInput());
        } while (!validateInput(tryCount));
    }

    private String tryInput() {
        try {
            return scanner.next();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException(InputView.getInstance().printException());
        }
    }

    public boolean validateInput(int input) {
        return (input > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }

    public void inputCarNames() {
        InputView.getInstance().printAskingCarNames();
        do {
            String carNames = removeBlanks(tryInput());
            cars = carNames.split(",");
        } while (!validateNames(cars));
    }

    public boolean validateNames(String[] cars) {
        Object[] tempList = Arrays.stream(cars)
                .filter(s -> s.length() <= CAR_NAME_MAXIMUM_LENGTH && s.length() > 0)
                .toArray();

        return cars.length == tempList.length;
    }

    public String removeBlanks(String carNames) {
        return carNames.replaceAll(" ", "");
    }
}
