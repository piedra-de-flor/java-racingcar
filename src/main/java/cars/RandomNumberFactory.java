package cars;

public class RandomNumberFactory {
    private final int SCALE_FACTOR_ZERO_TO_TEN = 10;
    public double makeRandomNumber() {
        return Math.random() * SCALE_FACTOR_ZERO_TO_TEN;
    }
}
