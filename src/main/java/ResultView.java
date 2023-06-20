import java.util.List;

public class ResultView {
    public ResultView() {
        System.out.println("실행 결과");
    }

    public void showCarLocation(Car car) {
        for (int aCar = 0; aCar < car.getLocation(); aCar++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void showResult(List<Car> carList) {
        carList.forEach(this::showCarLocation);
        System.out.println();
    }
}
