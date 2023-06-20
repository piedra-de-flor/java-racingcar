import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InputViewTest {

    @DisplayName("자동차 대수 입력 테스트")
    @Test
    void 자동차_대수_입력_테스트() {
        InputView inputView = new InputView();
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        InputView.scanner = new Scanner(System.in);
        assertThat(Integer.parseInt(input)).isEqualTo(inputView.getCarNumber());
    }

    @DisplayName("전진 시도 횟수 입력 테스트")
    @Test
    void 전진_시도_횟수_입력_테스트() {
        InputView inputView = new InputView();
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        InputView.scanner = new Scanner(System.in);
        assertThat(Integer.parseInt(input)).isEqualTo(inputView.getTryCount());
    }
}
