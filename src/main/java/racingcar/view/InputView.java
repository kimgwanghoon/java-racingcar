package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    public int inputCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    public int inputMoveCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }
}