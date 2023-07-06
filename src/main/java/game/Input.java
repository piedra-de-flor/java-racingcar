package game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private final int CAR_NAME_MAXIMUM_LENGTH = 5;
    public static Scanner scanner = new Scanner(System.in);
    private String[] cars;
    private int carNumber;
    private int tryCount;

    public int getCarNumber() {
        return carNumber;
    }

    public int getTryCount() {
        return tryCount;
    }
    public String[] getCarNames() {
        return cars;
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

    public void inputCarNames() {
        String inputNames;
        InputView.getInstance().printAskingCarNames();
        do {
            inputNames = scanner.next();
            cars = inputNames.split(",");
        } while (!validateName(cars));
    }

    public boolean validateName(String[] cars) {
        String[] tempList = (String[]) Arrays.stream(cars)
                .filter(s -> s.length() < 5)
                .toArray();

        return cars.length == tempList.length;
    }
}
