package cars;

public class RandomNumberFactory {
    private final int NUMBER_FOR_RANDOM_NUMBER_BETWEEN_0_TO_10 = 10;
    public double makeRandomNumber() {
        return Math.random() * NUMBER_FOR_RANDOM_NUMBER_BETWEEN_0_TO_10;
    }
}
