package cars;

import java.util.ArrayList;
import java.util.List;

public class CarObjectMaker {
    public List<Car> makeCar(int carNumber) {
        List<Car> carList = new ArrayList<>();
        for (int aCar = 0; aCar < carNumber; aCar++) {
            Car car = new Car();
            carList.add(car);
        }
        return carList;
    }
}
