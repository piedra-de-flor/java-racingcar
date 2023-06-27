package cars;

public class RandomNumberFactory {
    private final int MULTIPLE_NUMBER_FOR_RANDOM_NUMBER_BETWEEN_0_TO_10 = 10;
    public double makeRandomNumber() {
        return Math.random() * MULTIPLE_NUMBER_FOR_RANDOM_NUMBER_BETWEEN_0_TO_10;
    }
}
