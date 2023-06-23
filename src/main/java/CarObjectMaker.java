public class CarObjectMaker {
    private final RandomNumberFactory factory = new RandomNumberFactory();
    public void makeCar(int carNumber) {
        for (int aCar = 0; aCar < carNumber; aCar++) {
            Car car = new Car();
            GameStarter.carList.add(car);
        }
    }

    public double insertRandomNumber() {
        return factory.makeRandomNumber();
    }
}
