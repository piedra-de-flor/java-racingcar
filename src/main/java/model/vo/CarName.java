package model.vo;

public class CarName {
    private static final int CAR_NAME_MAXIMUM_LENGTH = 5;
    private final String carName;

    public CarName(String carName) {
        validateName(carName);
        this.carName = carName;
    }

    private void validateName(String carName) {
        if (!(checkNamesLength(carName) && !carName.isEmpty())) {
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
