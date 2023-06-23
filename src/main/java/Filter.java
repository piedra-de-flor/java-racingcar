public class Filter {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private final int MINIMUM_VALUE_FOR_CAR_FORWARD = 4;
    public boolean CheckCarNumberAndTryNumberValidate(int number) {
        return number > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE;
    }

    public boolean CheckRandomNumber(double randomNumber) {
        return randomNumber >= MINIMUM_VALUE_FOR_CAR_FORWARD;
    }
}
