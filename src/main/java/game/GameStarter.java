package game;

import cars.CarManager;
import cars.CarMoveByRandomNumberManager;

//어플리케이션을 시작 및 제어하는 main 클래스
public class GameStarter {
    private final Filter filter = new Filter();
    private CarManager manager;
    private int carNum;
    private int tryCount;
    //어플리케이션 시작
    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        gameStarter.run();
    }

    //어플리케이션 흐름 제어
    private void run() {
        initGameProperty();
        startGame(tryCount);
    }

    private void initGameProperty() {
        checkInput(InputView.getInstance(), filter);
        manager = new CarMoveByRandomNumberManager(carNum);
    }

    private void startGame(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            manager.forwardCar();
            ResultView.getInstance().showResult(manager.getCarList());
        }
    }

    private void checkInput(InputView inputView, Filter filter) {
        do {
            carNum = inputView.getCarNumber();
            tryCount = inputView.getTryCount();
        } while (!filter.CheckCarNumberAndTryNumberValidate(carNum) || !filter.CheckCarNumberAndTryNumberValidate(tryCount));
    }
}
