package game;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Input {
    private static final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    public static Scanner scanner = new Scanner(System.in);
    private String carNames;
    private int tryCount;
    private String[] carsSplitByComma;

    private static final Input INPUT = new Input();

    private Input() {
    }

    public static Input getInstance() {
        return INPUT;
    }

    public int getTryCount() {
        return tryCount;
    }

    public String[] getCarsSplitByComma() {
        return carsSplitByComma;
    }

    public String getCarNames() {
        return carNames;
    }

    private int tryInput() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("wrong input");
        }
    }

    public void inputTryCount() {
        do {
            System.out.println("시도할 횟수는 몇 회인가요?");
            tryCount = tryInput();
        } while (!validateInput(tryCount));
    }

    public boolean validateInput(int input) {
        return (input > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }

    private String tryInputNames() {
        try {
            return scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("wrong input");
        }
    }
    public void inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        carNames = tryInputNames();
        carsSplitByComma = carNames.split(",");
        removeBlanks(carsSplitByComma);
    }

    private void removeBlanks(String[] carsSplitByComma) {
        IntStream.range(0, carsSplitByComma.length)
                .forEach(i -> carsSplitByComma[i] = carsSplitByComma[i].trim());
    }
}
