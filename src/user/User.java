package user;

import java.util.List;

import card.Card;
import money.Money;

/**
 * @author jhkim
 * @since 2023/06/18
 */
public class User {
	private Money holdingMoney;
	private List<Card> holdingCardList;

	public void battingMoney(Money battingMoney) {
		this.holdingMoney = battingMoney;
	}

	public void takeCard(List<Card> shuffledCardList) {
		if (shuffledCardList.size() == 0) {
			throw new IllegalArgumentException("딜러가 준 카드가 없습니다");
		}
		this.holdingCardList = shuffledCardList;
	}
}
