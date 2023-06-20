import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final InputView inputView = new InputView();
    Scanner scanner = new Scanner(System.in);
    private InputView() {
    }
    public static InputView getInstance() {
        return inputView;
    }
    public int getCarNumber() {
        System.out.println("자동차 대수는 몇 대인가요?");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("input error : 양의 정수값을 입력해야 합니다.");
            return getCarNumber();
        }
    }

    public int getTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("input error : 양의 정수값을 입력해야 합니다.");
            return getTryCount();
        }
    }
}
