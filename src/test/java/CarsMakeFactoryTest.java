import cars.CarManager;
import cars.CarMoveByRandomNumberManager;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsMakeFactoryTest {
    @DisplayName("차량 수에 맞는 크기의 리스트 생성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 9})
    void 차량_리스트_크기_테스트(int input) {
        InputViewTest.initTestScanner(String.valueOf(input));
        InputView.getInstance().inputCarNumber();
        CarManager testCarManager = new CarMoveByRandomNumberManager();

        assertThat(testCarManager.getCarList().size()).isEqualTo(input);
    }
}
