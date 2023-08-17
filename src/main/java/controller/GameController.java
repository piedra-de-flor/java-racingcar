package controller;

import medel.service.Game;
import medel.service.filter.Condition;
import medel.service.filter.RandomNumberCondition;

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
        viewController.announceResult();
        runForwardLogic();
        viewController.showGameResult(manager.getWinner());
    }

    private void initGameProperty() {
        viewController.initInputProperty();
        manager = new Game(condition, viewController.getCarNames());
    }

    private void runForwardLogic() {
        int inputTryCount = viewController.getTryCount();
        for (int tryCount = 0; tryCount < inputTryCount; tryCount++) {
            manager.forwardCar();
            viewController.showStatus(manager.getCars());
        }
    }
}
