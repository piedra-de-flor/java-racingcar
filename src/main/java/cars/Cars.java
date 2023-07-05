package cars;

import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList, int carNumber) {
        makeCarList(carList, carNumber);
        this.carList = carList;
    }

    private void makeCarList(List<Car> carList, int carNumber) {
        for (int index = 0; index < carNumber; index++) {
            carList.add(makeCar());
        }
    }

    private Car makeCar() {
        return new Car();
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }
}
