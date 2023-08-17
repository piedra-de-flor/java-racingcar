package medel.vo;

import java.util.InputMismatchException;

public class TryCount {
    private static final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private final int tryCount;

    public TryCount(String input) {
        try {
            int tryCount = Integer.parseInt(input);
            this.tryCount = validateTryCount(tryCount);
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("wrong try count input");
        }
    }

    private int validateTryCount(int input) {
        if (input <= CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE) {
            throw new IllegalArgumentException("wrong try count input");
        }

        return input;
    }

    public int getTryCount() {
        return tryCount;
    }
}
