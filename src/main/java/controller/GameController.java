package controller;

import medel.cars.Game;
import medel.filters.Condition;
import medel.filters.RandomNumberCondition;
import veiw.ResultView;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameController {
    private Game manager;
    private final ViewController viewController = new ViewController();
    private final Condition condition = new RandomNumberCondition();

    //어플리케이션 시작
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.run();
    }

    //어플리케이션 흐름 제어
    private void run() {
        initGameProperty();
        announceResult();
        runForwardLogic();
        showGameResult();
    }

    private void initGameProperty() {
        viewController.initInputProperty();
        manager = new Game(condition, viewController.getCarNames().getCarNames());
    }

    private void announceResult() {
        ResultView.getInstance().printResultAnnouncement();
    }

    private void runForwardLogic() {
        int inputTryCount = viewController.getTryCount().getTryCount();
        for (int tryCount = 0; tryCount < inputTryCount; tryCount++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCars());
        }
    }

    private void showGameResult() {
        ResultView.getInstance().showWinner(manager.getWinner());
    }
}
