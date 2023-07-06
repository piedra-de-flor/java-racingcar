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
        this.cars = new Cars(new ArrayList<>(), input.getCarNames());
        this.conditions = conditions;
    }

    public List<Car> getCars() {
        return cars.getCars();
    }

    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, getCars().size())
                .filter(i -> conditions.validateForward())
                .forEach(i -> getCars().get(i).forward());
    }

    public List<Car> getWinner() {
        Winners winners = new Winners(getCars());
        return winners.getWinners();
    }
}
