package card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2023/06/19
 */
public class CardHolder {
    private final List<Card> cardList = new ArrayList<>();

    private CardHolder() {}

    public static CardHolder create() {
        return new CardHolder();
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

}
