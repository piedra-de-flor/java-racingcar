package cars;

import java.util.Collections;
import java.util.List;

public class CarsMakeFactory {
    private final List<Car> carList;

    public CarsMakeFactory(List<Car> carList, int carNumber) {
        makeCarList(carList, carNumber);
        this.carList = carList;
    }

    public void makeCarList(List<Car> carList, int carNumber) {
        for (int aCar = 0; aCar < carNumber; aCar++) {
            carList.add(makeCar());
        }
    }

    public Car makeCar() {
        return new Car();
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }
}
