package money;

/**
 * @author jhkim
 * @since 2023/06/20
 */
public class Money {
	private int battingMoney;
	private MoneyUnit moneyUnit;

	public int getBattingMoney() {
		return battingMoney;
	}

	public MoneyUnit getMoneyUnit() {
		return moneyUnit;
	}

	public Money(int battingMoney, MoneyUnit moneyUnit) {
		this.battingMoney = battingMoney;
		this.moneyUnit = moneyUnit;
	}
}
