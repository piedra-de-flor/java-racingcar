import java.util.List;

public class ResultView {
    private static final ResultView resultView = new ResultView();
    private ResultView() {
    }
    public static ResultView getInstance() {
        System.out.println("실행 결과");
        return resultView;
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
