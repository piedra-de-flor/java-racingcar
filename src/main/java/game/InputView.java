package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final InputView inputView = new InputView();
    public Scanner scanner = new Scanner(System.in);
    private int carNumber;
    private int tryCount;

    private InputView() {
    }

    public static InputView getInstance() {
        return inputView;
    }

    public int inputCarNumber() {
        System.out.println("자동차 대수는 몇 대인가요?");
        try {
            carNumber = scanner.nextInt();
            return carNumber;
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException();
        }
    }

    public int inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            tryCount = scanner.nextInt();
            return tryCount;
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException();
        }
    }
    public int getCarNumber() {
        return carNumber;
    }

    public int getTryCount() {
        return tryCount;
    }

    void validateInput(Filter filter) {
        do {
            carNumber = inputCarNumber();
            tryCount = inputTryCount();
        } while (!filter.CheckCarNumberAndTryNumberValidate(carNumber, tryCount));
    }
}
