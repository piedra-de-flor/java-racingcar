package controller;

import medel.InputVO.CarNames;
import medel.InputVO.TryCount;
import veiw.InputView;
import veiw.ResultView;

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

    public CarNames getCarNames() {
        return carNames;
    }

    public TryCount getTryCount() {
        return tryCount;
    }
}
