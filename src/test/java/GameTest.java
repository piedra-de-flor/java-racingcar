import cars.Game;
import filters.Conditions;
import game.Input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testFilters.TestConditionForFail;
import testFilters.TestConditionForSuccess;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {
    Input testInput = new Input();
    Conditions testFilter;
    Game testGame;
    private void initPropertyForTest() {
        InputViewTest.initTestScanner(String.valueOf(1));
        testInput.inputCarNumber();
    }

    @DisplayName("차량 전진 성공 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_성공_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestConditionForSuccess();
        testGame = new Game(testFilter, testInput);

        for (int i = 0; i < tryNumber; i++) {
            testGame.forwardCar();
        }

        assertThat(getFirstCarLocation()).isEqualTo(1 + tryNumber);
    }

    @DisplayName("차량 전진 실패 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_실패_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestConditionForFail();
        testGame = new Game(testFilter, testInput);

        for (int i = 0; i < tryNumber; i++) {
            testGame.forwardCar();
        }

        assertThat(getFirstCarLocation()).isEqualTo(1);
    }

    private int getFirstCarLocation() {
        return testGame.getCarList().get(0).getLocation();
    }
}
