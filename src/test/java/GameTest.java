import cars.Game;
import filters.Condition;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testConditions.TestConditionForFail;
import testConditions.TestConditionForSuccess;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {
    Condition testFilter;
    Game testGame;
    private void initPropertyForTest() {
        InputTest.initTestScanner("Test");
        InputView.getInstance().inputCarNames();
    }

    @DisplayName("차량 전진 성공 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_성공_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestConditionForSuccess();
        testGame = new Game(testFilter);

        for (int i = 0; i < tryNumber; i++) {
            testGame.forwardCar();
        }

        assertThat(getFirstCarLocation()).isEqualTo(tryNumber);
    }

    @DisplayName("차량 전진 실패 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void 차량_전진_실패_테스트(int tryNumber) {
        initPropertyForTest();
        testFilter = new TestConditionForFail();
        testGame = new Game(testFilter);

        for (int i = 0; i < tryNumber; i++) {
            testGame.forwardCar();
        }

        assertThat(getFirstCarLocation()).isEqualTo(0);
    }

    private int getFirstCarLocation() {
        return testGame.getCars().get(0).getLocation();
    }
}
