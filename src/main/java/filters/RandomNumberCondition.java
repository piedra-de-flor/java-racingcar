package filters;

public class RandomNumberCondition implements Condition {
    private final int MINIMUM_VALUE_FOR_CAR_FORWARD = 4;
    private final int SCALE_FACTOR_ZERO_TO_TEN = 10;

    @Override
    public boolean validateForward() {
        return makeRandomNumber() >= MINIMUM_VALUE_FOR_CAR_FORWARD;
    }

    public double makeRandomNumber() {
        return Math.random() * SCALE_FACTOR_ZERO_TO_TEN;
    }
}
