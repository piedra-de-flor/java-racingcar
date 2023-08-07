import controller.ViewController;
import medel.cars.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    Cars testCars;
    ViewController testViewController = new ViewController();
    private void initPropertyForTest() {
        InputTest.initTestScanner("Test");
        testViewController.inputCarNames();
    }

    @DisplayName("차량 전진 테스트")
    @Test
    void 차량_전진_테스트() {
        initPropertyForTest();
        testCars = new Cars(new ArrayList<>(), testViewController.getCarNames().getCarNames());

        testCars.getCars().get(0).forward();
        assertThat(getFirstCarLocation()).isEqualTo(1);
    }

    private int getFirstCarLocation() {
        return testCars.getCars().get(0).getLocation();
    }
}
