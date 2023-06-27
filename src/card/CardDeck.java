package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jhkim
 * @since 2023/06/18
 */
public class CardDeck {
	private Queue<Card> cardDeck;

	{
		cardDeck = new LinkedList<>();
		List<Card> shuffleCardList = new ArrayList<>();
		for (Shape shape : Shape.values()) {
			for (CardNumber cardNumber : CardNumber.values()) {
				Card card = new Card(cardNumber, shape);
				shuffleCardList.add(card);
			}
		}
		Collections.shuffle(shuffleCardList);
		cardDeck.addAll(shuffleCardList);
	}

	public List<Card> distributeCard(int count) {
		if (count < 0 || count < 2) {
			throw new IllegalArgumentException("요청 카드 수는 2장 이하여야합니다.");
		}
		List<Card> drawnCardList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			drawnCardList.add(cardDeck.poll());
		}
		return drawnCardList;
	}

}
