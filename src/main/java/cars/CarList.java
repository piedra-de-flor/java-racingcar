package cars;

import game.InputView;

import java.util.Collections;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList(List<Car> carList) {
        makeCarList(carList);
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }

    public void makeCarList(List<Car> carList) {
        for (int aCar = 0; aCar < InputView.getInstance().getCarNumber(); aCar++) {
            carList.add(makeCar());
        }
    }

    public Car makeCar() {
        return new Car();
    }
}
