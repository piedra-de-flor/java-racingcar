import game.InputView;
import game.InputVO.TryCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class InputTest {
    public static void initTestScanner(String testInput) {
        InputStream in = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(in);

        InputView.scanner = new Scanner(System.in);
    }

    @DisplayName("차량 수, 전진 시도 횟수의 입력값들이 1보다 작을시 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"-1", "-3", "0"})
    void 입력이_1보다_작을시_테스트(String input) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new TryCount(input);});
    }

    @DisplayName("전진 시도 횟수의 입력값들이 문자가 아닐시 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"not number", "not number1", "not number2"})
    void 전진_시도_횟수_입력이_숫자가_아닐시_예외_테스트(String input) {
        initTestScanner(input);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            InputView.getInstance().inputTryCount();});
    }
}
