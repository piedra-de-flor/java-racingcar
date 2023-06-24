package game;

public class Filter {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    public boolean CheckCarNumberAndTryNumberValidate(int carNumber, int tryNumber) {
        return (carNumber > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE && tryNumber > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE);
    }
}
