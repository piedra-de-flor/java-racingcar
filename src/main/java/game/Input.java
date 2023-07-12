package game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private static final int CAR_NAME_MAXIMUM_LENGTH = 5;
    private static final int DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER = 1;
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
        do {
            InputView.getInstance().printAskingTryCount();
            tryCount = Integer.parseInt(tryInput());
        } while (!validateInput(tryCount));
    }

    private String tryInput() {
        try {
            return scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException(InputView.getInstance().inputException());
        }
    }

    public boolean validateInput(int input) {
        return (input > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }

    public void inputCarNames() {
        String carNames;

        do {
            InputView.getInstance().printAskingCarNames();
            carNames = tryInput();
            cars = carNames.split(",");
        } while (!validateNames(cars, carNames));
    }

    public boolean validateNames(String[] cars, String carNames) {
        return (checkCarsNamesSize(carNames, cars) && checkNamesLength(cars) && !carNames.isEmpty());
    }

    public boolean checkCarsNamesSize(String carNames, String[] cars) {
        return (checkNumberOfCommas(carNames) + DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER) == cars.length;
    }

    public int checkNumberOfCommas(String carNames) {
        return (int) carNames.chars()
                .filter(c -> c == ',')
                .count();
    }

    public boolean checkNamesLength(String[] cars) {
        Object[] tempList = Arrays.stream(cars)
                .filter(s -> s.length() <= CAR_NAME_MAXIMUM_LENGTH)
                .toArray();

        return cars.length == tempList.length;
    }
}
