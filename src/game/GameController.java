package game;

import java.util.Scanner;

import money.Money;
import money.MoneyUnit;

/**
 * @author jhkim
 * @since 2023/06/27
 *
 */
public class GameController {
	public Money getParticipantBattingMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("> 배팅금액을 입력하세요");
		int battingMoney = sc.nextInt();

		System.out.println("> 배팅금액 화폐 단위를 입력하세요." + MoneyUnit.getMoneyUnitList());
		String moneyUnitVal = sc.next();

		return new Money(battingMoney, MoneyUnit.valueOf(moneyUnitVal));
	}
}
