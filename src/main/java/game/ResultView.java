package game;

import cars.Car;

import java.util.List;

public class ResultView {
    private static final ResultView RESULT_VIEW = new ResultView();
    private ResultView() {
        System.out.println("실행 결과");
    }
    public static ResultView getInstance() {
        return RESULT_VIEW;
    }

    public void showResult(List<Car> carList) {
        carList.forEach(this::showCarStatus);
        System.out.println();
    }

    private void showCarStatus(Car car) {
        showCarName(car);
        showCarLocation(car);
    }

    private void showCarLocation(Car car) {
        for (int index = 0; index < car.getLocation(); index++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private void showCarName(Car car) {
        System.out.print(car.getName() + " : ");
    }
}
