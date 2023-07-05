import cars.CarManager;
import filters.CarFilter;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testFilters.TestFilterForFail;
import testFilters.TestFilterForSuccess;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarManagerTest {
    CarFilter testFilter;
    CarManager testManager;
    private void initPropertyForTest() {
        InputViewTest.initTestScanner(String.valueOf(1));
        InputView.getInstance().inputCarNumber();
    }

    @DisplayName("차량 전진 성공 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_성공_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestFilterForSuccess();
        testManager = new CarManager(testFilter);

        for (int i = 0; i < tryNumber; i++) {
            testManager.forwardCar();
        }

        assertThat(testManager.getCarList().get(0).getLocation()).isEqualTo(1 + tryNumber);
    }

    @DisplayName("차량 전진 실패 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_실패_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestFilterForFail();
        testManager = new CarManager(testFilter);

        for (int i = 0; i < tryNumber; i++) {
            testManager.forwardCar();
        }

        assertThat(testManager.getCarList().get(0).getLocation()).isEqualTo(1);
    }
}
