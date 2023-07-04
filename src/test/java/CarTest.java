import cars.Car;
import cars.CarManager;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest extends CarManager {
    private final int CAR_NUMBER_FOR_TEST = 1;
    private final int INITIAL_LOCATION = 1;

    @Override
    public void forwardCar() {
        getCarList().forEach(Car::forward);
    }

    private void forwardCar(int tryNumber, CarManager testManager) {
        for (int i = 0; i < tryNumber; i++) {
            testManager.forwardCar();
        }
    }

    @Override
    public boolean validateForward() {
        return false;
    }

    private void initPropertyForTest() {
        InputViewTest.initTestScanner(String.valueOf(CAR_NUMBER_FOR_TEST));
        InputView.getInstance().inputCarNumber();
    }

    @DisplayName("차량 전진 성공 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void 차량_전진_성공_테스트(int tryNumber) {
        initPropertyForTest();
        CarManager testManager = new CarTest();

        forwardCar(tryNumber, testManager);

        assertThat(testManager.getCarList().get(0).getLocation()).isEqualTo(tryNumber + INITIAL_LOCATION);
    }

    @DisplayName("차량 전진 실패 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void 차량_전진_실패_테스트(int tryNumber) {
        initPropertyForTest();
        CarManager testManager = new CarTest();

        if (validateForward()) {
            forwardCar(tryNumber, testManager);
        }

        assertThat(testManager.getCarList().get(0).getLocation()).isEqualTo(INITIAL_LOCATION);
    }
}
