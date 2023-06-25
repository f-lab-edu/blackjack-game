package card;

import java.util.List;

import static card.CardType.NUMBER;

/**
 * @author gutenlee
 * @since 2023/06/25
 */
public class CardViewer {

    public static void print(Card card) {
        System.out.println(getCardInfo(card));
    }

    public static void print(List<Card> cardList) {
        for (Card card : cardList) {
            System.out.println(getCardInfo(card));
        }
    }

    private static String getCardInfo(Card card) {

        CardType cardType = card.getCardType();
        int cardNumber = card.getNumber();
        Suit suit = card.getSuit();

        return String.format("[ %s, %s, %s ]", cardType, (cardType==NUMBER ? cardNumber : ""), suit);
    }
}
