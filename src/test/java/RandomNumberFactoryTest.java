import cars.RandomNumberFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RandomNumberFactoryTest {

    @DisplayName("랜덤 변수 생성 테스트")
    @Test
    void 랜덤_변수_생성_테스트() {
        RandomNumberFactory factory = new RandomNumberFactory();

        assertThat(factory.makeRandomNumber()).isBetween(0.0,10.0);
    }
}
