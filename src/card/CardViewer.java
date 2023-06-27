package card;

import java.util.List;
import java.util.StringJoiner;

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

    public static String getCardInfo(Card card) {

        StringJoiner sj = new StringJoiner(", ", "[","]");
        sj.add(card.getCardType().name());
        sj.add(card.getSuit().name());
        if (card.isNumber()) {
            sj.add(Integer.toString(card.getNumber()));
        }

        return sj.toString();
    }
}
