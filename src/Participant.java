import java.util.Scanner;

/**
 * @author jhkim
 * @since 2023/06/18
 * 참가자 객체
 */
public class Participant extends User {

	public void settingBattingMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("> 배팅금액을 입력하세요");
		int battingMoney = sc.nextInt();

		System.out.println("> 배팅금액 화폐 단위를 입력하세요." + MoneyUnit.getMoneyUnitList());
		String moneyUnitVal = sc.next();

		System.out.println("입력하신 금액 : " + battingMoney + moneyUnitVal);
		super.setHoldingMoney(new Money(battingMoney, MoneyUnit.valueOf(moneyUnitVal)));

	}

}
