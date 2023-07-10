package cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Winners {
    private final List<Car> winners;
    private List<Car> sortedCars;

    public Winners(List<Car> cars) {
        this.winners = new ArrayList<>();
        findWinners(cars);
    }

    private void findWinners(List<Car> cars) {
        sortedCars = new ArrayList<>(cars);
        sortedCars.sort(new CarLocationComparator());

        makeWinners(sortedCars);
    }

    private void makeWinners(List<Car> sortedCars) {
        final int maxLocation = sortedCars.get(0).getLocation();
        sortedCars.stream()
                .filter(car -> car.getLocation() == maxLocation)
                .forEach(winners::add);
    }

    private static class CarLocationComparator implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
            return Integer.compare(car2.getLocation(), car1.getLocation());
        }
    }

    public List<Car> getWinners() {
        return Collections.unmodifiableList(winners);
    }
}
