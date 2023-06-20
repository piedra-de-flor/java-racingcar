import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FilterTest {
    @DisplayName("입력값 필터링 테스트 실패 케이스")
    @Test
    void 입력값_필터링_테스트_실패_케이스() {
        Filter filter = new Filter();
        assertThat(false).isEqualTo(filter.CheckInputValidate(-1));
    }

    @DisplayName("입력값 필터링 테스트 성공 케이스")
    @Test
    void 입력값_필터링_테스트_성공_케이스() {
        Filter filter = new Filter();
        assertThat(true).isEqualTo(filter.CheckInputValidate(1));
    }
}
