import java.util.ArrayList;
import java.util.List;

/**
 * @author jhkim
 * @since 2023/06/18
 * 카드덱 객체
 */
public class CardDeck {
	private List<Card> cardDeck;

	public void settingCard() {
		cardDeck = new ArrayList<>();
		for (Shape shape : Shape.values()) {
			for (Number number : Number.values()) {
				Card card = new Card(number, shape);
				cardDeck.add(card);
			}
		}
	}
}
