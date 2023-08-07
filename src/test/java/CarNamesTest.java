import controller.ViewController;
import medel.cars.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarNamesTest {
    ViewController testViewController = new ViewController();

    @DisplayName("차량 이름이 5자를 넘어갈 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"over five", "over five,over five1", "over five,over five1,over five2"})
    void 차량_이름이_5자를_넘을경우_예외_테스트(String input) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car testCar = new Car(input);});
    }

    @DisplayName("차량 이름에 공백이 포함 될 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"a,,", "a,b,", ",,,"})
    void 차량_이름에_공백이_포함_될_경우_예외_테스트(String input) {
        InputTest.initTestScanner(input);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            testViewController.inputCarNames();});
    }
}
