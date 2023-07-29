package cars;

import game.Input;

import java.util.List;

public class CarNames {
    private static final int CAR_NAME_MAXIMUM_LENGTH = 5;
    private static final int DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER = 1;
    private final List<String> carName;

    public CarNames(List<String> carName) {
        if (validateNames(carName, Input.getInstance().getCarNames())) {
            this.carName =carName;
        }
        else {
            throw new IllegalArgumentException("wrong names");
        }
    }

    public List<String> getCarNames() {
        return carName;
    }

    public boolean validateNames(List<String> cars, String carNames) {
        return (checkCarsNamesSize(carNames, cars) && checkNamesLength(cars) && !carNames.isEmpty());
    }

    public boolean checkCarsNamesSize(String carNames, List<String> cars) {
        return (checkNumberOfCommas(carNames) + DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER) == cars.size();
    }

    public int checkNumberOfCommas(String carNames) {
        return (int) carNames.chars()
                .filter(c -> c == ',')
                .count();
    }

    public boolean checkNamesLength(List<String> cars) {
        Object[] tempList = cars.stream()
                .filter(s -> s.length() <= CAR_NAME_MAXIMUM_LENGTH)
                .toArray();

        return cars.size() == tempList.length;
    }
}
