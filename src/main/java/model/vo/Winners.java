package model.vo;

import model.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Winners {
    private final List<Car> winners;

    public Winners(List<Car> winners, List<Car> cars) {
        this.winners = winners;
        List<Car> sortedCars = new ArrayList<>(cars);

        sortedCars.sort(new CarLocationComparator());

        Car winner = sortedCars.get(0);
        final int MAX_LOCATION = winner.getLocation();

        sortedCars.stream()
                .filter(car -> car.getLocation() == MAX_LOCATION)
                .forEach(winners::add);
    }

    private static class CarLocationComparator implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
            return Integer.compare(car2.getLocation(), car1.getLocation());
        }
    }

    public List<Car> getWinners() {
        return winners;
    }
}
