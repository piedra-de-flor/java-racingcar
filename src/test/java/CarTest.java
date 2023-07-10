import cars.Cars;
import game.Input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest{
    Input testInput = new Input();
    Cars testCars;
    private void initPropertyForTest() {
        InputViewTest.initTestScanner("Test");
        testInput.inputCarNames();
    }

    @DisplayName("차량 전진 테스트")
    @Test
    void 차량_전진_테스트() {
        initPropertyForTest();
        testCars = new Cars(new ArrayList<>(), testInput.getCarNames());

        testCars.getCars().get(0).forward();
        assertThat(getFirstCarLocation()).isEqualTo(2);
    }

    private int getFirstCarLocation() {
        return testCars.getCars().get(0).getLocation();
    }
}
