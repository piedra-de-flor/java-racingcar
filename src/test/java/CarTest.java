import cars.CarsContainer;
import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest{
    private void initPropertyForTest() {
        InputViewTest.initTestScanner(String.valueOf(1));
        InputView.getInstance().inputCarNumber();
    }

    @DisplayName("차량 전진 테스트")
    @Test
    void 차량_전진_테스트() {
        initPropertyForTest();
        CarsContainer testContainer = new CarsContainer(new ArrayList<>(), InputView.getInstance().getCarNumber());

        testContainer.getCarList().get(0).forward();
        assertThat(testContainer.getCarList().get(0).getLocation()).isEqualTo(2);
    }
}
