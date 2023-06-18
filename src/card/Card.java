package card;

import static card.CardType.UNDEFINED;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Card {
    private final CardType cardType;
    private final int number;
    private final Suit suit;

    public Card(int number, Suit suit) {
        this.cardType = getCardType(number);
        this.number = number;
        this.suit = suit;
    }


    private CardType getCardType(int number) {

        CardType type = CardType.getCardType(number);
        if (cardType == UNDEFINED)
            throw new RuntimeException("카드 번호 범위 초과");

        return type;
    }
}