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
        carList.forEach(this::showCarLocation);
        System.out.println();
    }

    public void showCarLocation(Car car) {
        for (int aCar = 0; aCar < car.getLocation(); aCar++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
