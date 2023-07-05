import game.Input;
import game.InputView;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InputViewTest {
    Input testInput = new Input();
    public static void initTestScanner(String testInput) {
        InputStream in = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(in);

        Input.scanner = new Scanner(System.in);
    }

    @DisplayName("차량 수, 전진 시도 횟수의 입력값들이 1보다 작을시 테스트")
    @ParameterizedTest
    @ValueSource(ints = {-1,-3, 0})
    void 입력이_1보다_작을시_테스트(int input) {
        boolean real = testInput.validateInput(input);

        assertThat(false).isEqualTo(real);
    }

    @DisplayName("차량 수의 입력값들이 문자가 아닐시 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"not number", "not number1", "not number2"})
    void 차량_수_입력이_숫자가_아닐시_예외_테스트(String input) {
        initTestScanner(input);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            testInput.inputCarNumber();});
    }

    @DisplayName("전진 시도 횟수의 입력값들이 문자가 아닐시 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"not number", "not number1", "not number2"})
    void 전진_시도_횟수_입력이_숫자가_아닐시_예외_테스트(String input) {
        initTestScanner(input);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            testInput.inputTryCount();});
    }
}
