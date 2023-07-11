import cars.Game;
import filters.Conditions;
import game.Input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testFilters.TestConditionForSuccess;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    Input testInput = new Input();
    Conditions testFilter = new TestConditionForSuccess();
    @DisplayName("차량 수에 맞는 크기의 리스트 생성 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"test1", "test1,test2", "test1,test2,test3"})
    void 차량_리스트_크기_테스트(String input) {
        InputViewTest.initTestScanner(input);
        testInput.inputCarNames();
        String[] testCarNames = input.split(",");

        Game testGame = new Game(testFilter, testInput);

        assertThat(testGame.getCars().size()).isEqualTo(testCarNames.length);
    }

    @DisplayName("차량 이름 수에 맞는 크기의 리스트 생성 테스트")
    @ParameterizedTest
    @ValueSource(strings = { "test1", "test1,test2", "test1,test2,test3"})
    void 이름이_있는_차량_리스트_크기_테스트(String input) {
        InputViewTest.initTestScanner(input);
        testInput.inputCarNames();

        Game testGame = new Game(testFilter, testInput);
        String[] testCars = input.split(",");

        assertThat(testGame.getCars().size()).isEqualTo(testCars.length);
    }
}
