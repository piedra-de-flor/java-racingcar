import cars.Game;
import filters.CarFilter;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testFilters.TestFilterForSuccess;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    CarFilter testFilter = new TestFilterForSuccess();
    @DisplayName("차량 수에 맞는 크기의 리스트 생성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 9})
    void 차량_리스트_크기_테스트(int input) {
        InputViewTest.initTestScanner(String.valueOf(input));
        InputView.getInstance().inputCarNumber();

        Game testGame = new Game(testFilter);

        assertThat(testGame.getCarList().size()).isEqualTo(input);
    }
}
