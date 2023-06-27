package card;

/**
 * @author jhkim
 * @since 2023/06/18
 */
public class Card {
	private final CardNumber cardNumber;
	private final Shape shape;

	public Card(final CardNumber cardNumber, final Shape shape) {
		this.cardNumber = cardNumber;
		this.shape = shape;
	}
}
