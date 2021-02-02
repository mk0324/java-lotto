package lotto.view;

import lotto.domain.Money;
import lotto.util.Validator;

import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public Money getMoneyToBuyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        String input = scanner.nextLine();
        return new Money(input);
    }

    public String getLottoAnswer() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String winningLottoNumber = scanner.nextLine();
        return winningLottoNumber;
    }

    public int getBonusBall() {
        System.out.println("보너스 볼을 입력해주세요.");
        int bonusBall = scanner.nextInt();
        return bonusBall;
    }
}
