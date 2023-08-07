package medel.InputVO;

import java.util.List;
import java.util.stream.IntStream;

public class CarNames {
    private static final int DIFFERENCE_OF_CAR_NUMBER_AND_COMMAS_NUMBER = 1;
    private final List<String> carName;

    public CarNames(String carNames) {
        List<String> carName = getCarNamesToList(carNames);
        if (validateNames(carName, carNames)) {
            this.carName = carName;
        } else {
            throw new IllegalArgumentException("wrong naming");
        }
    }

    private List<String> getCarNamesToList(String carNames) {
        return removeBlanks(carNames.split(","));
    }

    private List<String> removeBlanks(String[] carsSplitByComma) {
        int bound = carsSplitByComma.length;
        IntStream.range(0, bound).forEach(i -> carsSplitByComma[i] = carsSplitByComma[i].trim());
        return List.of(carsSplitByComma);
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
