package cars;

import filters.Condition;
import game.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    private static final int POSITIVE_INTEGER_START = 0;
    private final Cars cars;
    private final Condition condition;

    public Game(Condition condition) {
        List<String> carNames = List.of(Input.getInstance().getCarsSplitByComma());
        CarNames names = new CarNames(carNames);
        this.cars = new Cars(new ArrayList<>(), names.getCarNames());
        this.condition = condition;
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, cars.getCarsSize())
                .filter(i -> condition.validateForward())
                .forEach(i -> getCars().get(i).forward());
    }

    public List<Car> getWinner() {
        return cars.getWinners();
    }
}
