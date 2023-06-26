import java.util.List;

/**
 * @author jhkim
 * @since 2023/06/18
 */
public class User {
	private Money holdingMoney;
	private List<Card> holdingCardList;

	public void setHoldingMoney(Money holdingMoney) {
		this.holdingMoney = holdingMoney;
	}

	public void setHoldingCardList(List<Card> holdingCardList) {
		this.holdingCardList = holdingCardList;
	}
}
