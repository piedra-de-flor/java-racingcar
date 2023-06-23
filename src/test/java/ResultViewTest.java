import cars.Car;
import game.ResultView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ResultViewTest {
    @DisplayName("자동차 위치 출력 테스트")
    @Test
    void 자동차_위치_출력_테스트() {
        String expectResult = "----\r\n";
        //Car car = new Car();

        for (int i = 0; i < 3; i++) {
            //car.forward();
        }

        OutputStream realResult = new ByteArrayOutputStream();
        System.setOut(new PrintStream(realResult));
        //ResultView.getInstance().showCarLocation(car);

        assertThat(expectResult).isEqualTo(realResult.toString());
    }
}
