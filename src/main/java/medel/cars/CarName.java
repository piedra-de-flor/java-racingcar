package medel.cars;

public class CarName {
    private static final int CAR_NAME_MAXIMUM_LENGTH = 5;
    private final String carName;

    CarName(String carName) {
        if (checkNamesLength(carName) && !carName.isEmpty()) {
            this.carName = carName;
        }
        else {
            throw new IllegalArgumentException("wrong naming");
        }
    }

    public String getCarName() {
        return carName;
    }

    public boolean checkNamesLength(String carName) {
        return carName.length() <= CAR_NAME_MAXIMUM_LENGTH;
    }
}
