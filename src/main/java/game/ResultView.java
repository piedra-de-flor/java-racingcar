package game;

import cars.Car;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private static final ResultView RESULT_VIEW = new ResultView();
    private ResultView() {
    }
    public static ResultView getInstance() {
        return RESULT_VIEW;
    }

    public void printResultAnnouncement() {
        System.out.println("실행 결과");
    }

    public void showResult(List<Car> cars) {
        cars.forEach(this::showCarStatus);
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

    public void showWinner(List<Car> winners) {
        String winnerNames = String.join(", ", changeCarListToStringList(winners));
        System.out.println(winnerNames + "가 최종 우승했습니다");
    }

    private List<String> changeCarListToStringList(List<Car> cars) {
        List<String> names = new ArrayList<>();
        cars.forEach(car -> names.add(car.getName()));

        return names;
    }
}
