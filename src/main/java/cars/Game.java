package cars;

import filters.CarFilter;
import game.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    private final int POSITIVE_INTEGER_START = 0;
    private final Cars cars;
    private final CarFilter carFilter;

    public Game(CarFilter carFilter) {
        this.cars = new Cars(new ArrayList<>(), InputView.getInstance().getCarNumber());
        this.carFilter = carFilter;
    }

    public List<Car> getCarList() {
        return cars.getCarList();
    }

    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, getCarList().size())
                .filter(i -> carFilter.validateForward())
                .forEach(i -> getCarList().get(i).forward());
    }
}
