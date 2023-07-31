package cars;

import game.Input;

import java.util.List;

public class CarNames {
    private static final int DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER = 1;
    private final List<String> carName;

    public CarNames(List<String> carName) {
        if (validateNames(carName, Input.getInstance().getCarNames())) {
            this.carName = carName;
        }
        else {
            throw new IllegalArgumentException("wrong names");
        }
    }

    public List<String> getCarNames() {
        return carName;
    }

    public boolean validateNames(List<String> cars, String carNames) {
        return (checkCarsNamesSize(carNames, cars) && !carNames.isEmpty());
    }

    public boolean checkCarsNamesSize(String carNames, List<String> cars) {
        return (checkNumberOfCommas(carNames) + DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER) == cars.size();
    }

    public int checkNumberOfCommas(String carNames) {
        return (int) carNames.chars()
                .filter(c -> c == ',')
                .count();
    }
}
