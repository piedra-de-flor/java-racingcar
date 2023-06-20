public class Filter {
    private final int CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE = 0;
    private final int CAR_FORWARD_CONDITION_MINIMUM_VALUE = 4;
    public boolean CheckCarNumberAndTryNumberValidate(int number) {
        return number > CAR_NUMBER_AND_TRY_NUMBER_MINIMUM_VALUE;
    }

    public boolean CheckRandomNumber(double randomNumber) {
        return randomNumber >= CAR_FORWARD_CONDITION_MINIMUM_VALUE;
    }
}
