package game;

import cars.CarManager;
import cars.CarMoveByRandomNumberManager;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameStarter {
    private CarManager manager;
    InputView inputView = InputView.getInstance();

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
        inputView.inputCarNumber();
        inputView.inputTryCount();
        manager = new CarMoveByRandomNumberManager();
    }

    private void startGame() {
        for (int tryCount = 0; tryCount < inputView.getTryCount(); tryCount++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCarList());
        }
    }
}
