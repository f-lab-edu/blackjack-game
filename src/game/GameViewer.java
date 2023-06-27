package game;

import money.Money;
import money.MoneyUnit;

/**
 * @author jhkim
 * @since 2023/06/27
 *
 */
public class GameViewer {
	public void printBattingMoney(Money money) {
		int battingMoney = money.getBattingMoney();
		MoneyUnit moneyUnitVal = money.getMoneyUnit();
		System.out.println("입력하신 금액 : " + battingMoney + moneyUnitVal);
	}
}
