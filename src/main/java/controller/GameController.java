package controller;

import model.Game;
import model.condition.Condition;
import model.condition.RandomNumberCondition;
import model.domain.Car;
import model.vo.CarNames;
import model.vo.TryCount;
import veiw.InputView;
import veiw.ResultView;

import java.util.List;

public class GameController {
    private CarNames names;
    private TryCount tryCount;
    private Game manager;
    private final Condition condition = new RandomNumberCondition();

    //어플리케이션 흐름 제어
    public void run() {
        initGameProperty();
        announceResult();
        runForwardLogic();
        showGameResult(manager.getWinner());
    }

    private void initGameProperty() {
        inputCarNames();
        inputTryCount();
        manager = new Game(condition, names.getCarNames());
    }

    public List<String> getNames() {
        return names.getCarNames();
    }

    private void runForwardLogic() {
        for (int count = 0; count < tryCount.getTryCount(); count++) {
            manager.forwardCar();
            showStatus(manager.getCars());
        }
    }

    public void inputTryCount() {
        ResultView.getInstance().printInputTryCountMassage();
        tryCount = new TryCount(InputView.getInstance().inputTryCount());
    }

    public void inputCarNames() {
        ResultView.getInstance().printInputCarNamesMassage();
        names = new CarNames(InputView.getInstance().inputCarNames());
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
