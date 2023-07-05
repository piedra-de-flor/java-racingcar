package cars;

import filters.Conditions;
import game.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    private final int POSITIVE_INTEGER_START = 0;
    private final Cars cars;
    private final Conditions conditions;

    public Game(Conditions conditions, Input input) {
        this.cars = new Cars(new ArrayList<>(), input.getCarNumber());
        this.conditions = conditions;
    }

    public List<Car> getCarList() {
        return cars.getCarList();
    }

    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, getCarList().size())
                .filter(i -> conditions.validateForward())
                .forEach(i -> getCarList().get(i).forward());
    }
}
