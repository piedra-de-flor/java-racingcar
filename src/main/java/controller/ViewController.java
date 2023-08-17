package controller;

import medel.domain.Car;
import medel.vo.CarNames;
import medel.vo.TryCount;
import veiw.InputView;
import veiw.ResultView;

import java.util.List;

public class ViewController {
    private CarNames carNames;
    private TryCount tryCount;

    void initInputProperty() {
        inputTryCount();
        inputCarNames();
    }

    public void inputTryCount() {
        ResultView.getInstance().printInputTryCountMassage();
        tryCount = new TryCount(InputView.getInstance().inputTryCount());
    }

    public void inputCarNames() {
        ResultView.getInstance().printInputCarNamesMassage();
        carNames = new CarNames(InputView.getInstance().inputCarNames());
    }

    public List<String> getCarNames() {
        return carNames.getCarNames();
    }

    public int getTryCount() {
        return tryCount.getTryCount();
    }

    public void announceResult() {
        ResultView.getInstance().printResultAnnouncement();
    }

    public void showGameResult(List<Car> winners) {
        ResultView.getInstance().showWinner(winners);
    }

    public void showStatus(List<Car> cars) {
        ResultView.getInstance().showStatus(cars);
    }
}
