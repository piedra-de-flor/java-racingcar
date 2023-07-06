package game;

import cars.Game;
import filters.Conditions;
import filters.RandomNumberCondition;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameStarter {
    private Game manager;
    Input input = new Input();
    private final Conditions conditions = new RandomNumberCondition();

    //어플리케이션 시작
    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        gameStarter.run();
    }

    //어플리케이션 흐름 제어
    private void run() {
        initGameProperty();
        startGame();
    }

    private void initGameProperty() {
        input.inputCarNames();
        input.inputTryCount();
        manager = new Game(conditions, input);
    }

    private void startGame() {
        for (int tryCount = 0; tryCount < input.getTryCount(); tryCount++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCarList());
        }
    }
}
