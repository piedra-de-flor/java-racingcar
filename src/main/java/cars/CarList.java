package cars;

import game.InputView;

import java.util.Collections;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList(List<Car> carList) {
        makeCars(carList);
        this.carList = carList;
    }

    public void makeCars(List<Car> carList) {
        for (int aCar = 0; aCar < InputView.getInstance().getCarNumber(); aCar++) {
            Car car = new Car();
            carList.add(car);
        }
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }
}
