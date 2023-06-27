import game.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InputViewTest {
    String input = "5";

    private void initTestScanner() {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        InputView.getInstance().scanner = new Scanner(System.in);
    }

    @DisplayName("자동차 대수 입력 테스트")
    @Test
    void 자동차_대수_입력_테스트() {
        initTestScanner();

        assertThat(Integer.parseInt(input)).isEqualTo(InputView.getInstance().inputCarNumber());
    }

    @DisplayName("자동차 대수 입력 테스트")
    @Test
    void 자동차_대수_입력_테스트() {
        initTestScanner();

        assertThat(Integer.parseInt(input)).isEqualTo(InputView.getInstance().inputCarNumber());
    }

    @DisplayName("전진 시도 횟수 입력 예외 테스트")
    @Test
    void 전진_시도_횟수_입력_테스트() {
        input = "-1";
        initTestScanner();

        assertThat(Integer.parseInt(input)).isEqualTo(InputView.getInstance().inputTryCount());
    }

    @DisplayName("전진 시도 횟수 입력 예외 테스트")
    @Test
    void 전진_시도_횟수_입력_테스트() {
        input = "-1";
        initTestScanner();

        assertThat(Integer.parseInt(input)).isEqualTo(InputView.getInstance().inputTryCount());
    }

    @DisplayName("입력값 필터링 테스트 실패 케이스")
    @Test
    void 입력값_필터링_테스트_실패_케이스() {
        assertThat(false).isEqualTo(InputView.getInstance().validateInput(-1, -1));
        assertThat(false).isEqualTo(InputView.getInstance().validateInput(1, -1));
        assertThat(false).isEqualTo(InputView.getInstance().validateInput(-1, 1));
    }

    @DisplayName("입력값 필터링 테스트 성공 케이스")
    @Test
    void 입력값_필터링_테스트_성공_케이스() {
        assertThat(true).isEqualTo(InputView.getInstance().validateInput(1, 1));
    }
}
