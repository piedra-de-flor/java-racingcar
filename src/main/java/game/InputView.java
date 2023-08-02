package game;

import game.InputVO.CarNames;
import game.InputVO.TryCount;

import java.util.Scanner;

public class InputView {
    public static Scanner scanner = new Scanner(System.in);
    private CarNames carNames;
    private TryCount tryCount;
    private static final InputView INPUT_VIEW = new InputView();

    private InputView() {
    }

    public static InputView getInstance() {
        return INPUT_VIEW;
    }

    public int getTryCount() {
        return tryCount.getTryCount();
    }

    public CarNames getCarNames() {
        return carNames;
    }

    public void inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        tryCount = new TryCount(scanner.nextLine());
    }

    public void inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        carNames = new CarNames(scanner.nextLine());
    }
}
