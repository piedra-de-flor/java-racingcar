package cars;

import java.util.List;

public abstract class CarManager {
    private final List<Car> carList;

    public CarManager(int carNumber) {
        CarObjectMaker carObjectMaker = new CarObjectMaker();
        carList = carObjectMaker.makeCar(carNumber);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public abstract void forwardCar();

    public abstract boolean validateForward();
}
