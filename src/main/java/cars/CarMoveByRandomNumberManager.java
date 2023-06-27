package cars;

import java.util.stream.IntStream;

public class CarMoveByRandomNumberManager extends CarManager {
    private final int MINIMUM_VALUE_FOR_CAR_FORWARD = 4;
    private final int POSITIVE_INTEGER_START = 0;
    private final RandomNumberFactory factory = new RandomNumberFactory();

    public CarMoveByRandomNumberManager(int carNumber) {
        super(carNumber);
    }

    @Override
    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, getCarList().size())
                .filter(i -> validateForward())
                .forEach(i -> getCarList().get(i).forward());
    }

    @Override
    public boolean validateForward() {
        return factory.makeRandomNumber() >= MINIMUM_VALUE_FOR_CAR_FORWARD;
    }
}
