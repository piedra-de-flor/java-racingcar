package game;

import cars.Game;
import filters.Condition;
import filters.RandomNumberCondition;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameStarter {
    private Game manager;
    private final Condition condition = new RandomNumberCondition();

    //어플리케이션 시작
    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        gameStarter.run();
    }

    //어플리케이션 흐름 제어
    private void run() {
        initGameProperty();
        announceResult();
        runForwardLogic();
        showGameResult();
    }

    private void initGameProperty() {
        InputView.getInstance().inputCarNames();
        InputView.getInstance().inputTryCount();
        manager = new Game(condition);
    }

    private void announceResult() {
        ResultView.getInstance().printResultAnnouncement();
    }

    private void runForwardLogic() {
        for (int tryCount = 0; tryCount < InputView.getInstance().getTryCount(); tryCount++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCars());
        }
    }

    private void showGameResult() {
        ResultView.getInstance().showWinner(manager.getWinner());
    }
}
