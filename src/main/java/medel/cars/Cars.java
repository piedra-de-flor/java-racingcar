package medel.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    private Car makeCar(String name) {
        return new Car(name);
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        List<Car> sortedCars = new ArrayList<>(cars);

        sortedCars.sort(new CarLocationComparator());

        final int MAX_LOCATION = sortedCars.get(0).getLocation();

        sortedCars.stream()
                .filter(car -> car.getLocation() == MAX_LOCATION)
                .forEach(winners::add);

        return winners;
    }

    private static class CarLocationComparator implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
            return Integer.compare(car2.getLocation(), car1.getLocation());
        }
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public int getCarsSize() {
        return cars.size();
    }
}
