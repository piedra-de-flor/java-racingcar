import medel.cars.Car;
import medel.cars.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WinnerTest {
    @DisplayName("우승자 선정 테스트")
    @Test
    void 우승자_선정_테스트() {
        List<String> testCarNames = new ArrayList<>();
        testCarNames.add("우승자");
        testCarNames.add("우승못한자");
        Cars testCars = new Cars(new ArrayList<>(), testCarNames);

        testForwardForWin(testCars.getCars());

        assertThat(getTestWinnersName(testCars)).isEqualTo("우승자");
    }

    private void testForwardForWin(List<Car> testCars) {
        testCars.get(0).forward();
    }

    private String getTestWinnersName(Cars testCars) {
        return testCars.getWinners().get(0).getName();
    }
}
