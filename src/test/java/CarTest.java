import cars.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    final int testSize = 5;
    CarManager testManager = new CarMoveByRandomNumberManager(testSize) {
        @Override
        public boolean validateForward() {
            return true;
        }
    };

    @DisplayName("차량 리스트 생성 테스트")
    @Test
    void 차량_리스트_생성_테스트() {
        assertThat(testManager.getCarList().stream()
                .filter(car -> car.getClass().equals(Car.class))
                .collect(Collectors.toList()))
                .isEqualTo(testManager.getCarList());
    }

    @DisplayName("차량 리스트 크기 생성 테스트")
    @Test
    void 차량_리스트_크기_생성_테스트() {
        assertThat(testManager.getCarList().size()).isEqualTo(testSize);
    }

    @DisplayName("차량 전진 테스트")
    @Test
    void 차량_전진_테스트() {
        testManager.forwardCar();
        assertThat(testManager.getCarList().stream()
                .filter(car -> car.getLocation() == 2)
                .collect(Collectors.toList()))
                .isEqualTo(testManager.getCarList());
    }
}
