package repository;

import model.domain.Car;
import model.vo.Winners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars, List<String> carNames) {
        makeCarListWithNames(cars, carNames);
        this.cars = cars;
    }
    private void makeCarListWithNames(List<Car> cars, List<String> carNames) {
        for (String carName : carNames) {
            cars.add(makeCar(carName));
        }
    }

    public List<Car> getWinners() {
        return new Winners(new ArrayList<>(), cars).getWinners();
    }

    private Car makeCar(String name) {
        return new Car(name);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public int getCarsSize() {
        return cars.size();
    }
}
