public class Car {
    private static final double INITIAL_RANDOM_NUMBER = 0;
    private static final int INITIAL_LOCATION = 1;
    private int location;
    private double randomNumber;

    public Car() {
        this.location = INITIAL_LOCATION;
        this.randomNumber = INITIAL_RANDOM_NUMBER;
    }

    public int getLocation() {
        return this.location;
    }

    public double getRandomNumber() {
        return this.randomNumber;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void forward() {
        this.location += 1;
    }
}
