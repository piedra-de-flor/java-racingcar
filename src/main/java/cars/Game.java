package cars;

import filters.Conditions;
import game.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    private static final int POSITIVE_INTEGER_START = 0;
    private final Cars cars;
    private final Conditions condition;

    public Game(Conditions conditions, Input input) {
        this.cars = new Cars(new ArrayList<>(), input.getCarNames());
        this.condition = conditions;
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
