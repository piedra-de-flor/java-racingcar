package game;

import cars.CarManager;
import cars.CarMoveByRandomNumberManager;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameStarter {
    private final Filter filter = new Filter();
    private CarManager manager;

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
        InputView.getInstance().checkInput(filter);
        manager = new CarMoveByRandomNumberManager(InputView.getInstance().getCarNumber());
    }

    private void startGame() {
        for (int i = 0; i < InputView.getInstance().getTryCount(); i++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCarList());
        }
    }
}
