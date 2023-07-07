package cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winners {
    private final List<Car> winners;
    private int maxLocation = Integer.MIN_VALUE;

    public Winners(List<Car> cars) {
        this.winners = new ArrayList<>();
        findWinners(cars);
    }

    private void findWinners(List<Car> cars) {
        for (Car car : cars) {
            compareLocation(car);
        }
    }

    private void compareLocation(Car car) {
        if (car.getLocation() == maxLocation) {
            winners.add(car);
        }

        if (car.getLocation() > maxLocation) {
            maxLocation = car.getLocation();
            winners.clear();
            winners.add(car);
        }
    }

    public List<Car> getWinners() {
        return Collections.unmodifiableList(winners);
    }
}
