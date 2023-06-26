package card;

import java.util.*;

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

    public Card getFirstCard() {
        if (hasCards()) {
            return new Card(cardList.get(0));
        }
        throw new CardHolderEmptyException();
    }

    public List<Card> getAllCard() {
        return Collections.unmodifiableList(cardList);
    }


    private boolean hasCards(){
        return cardList.size() > 0;
    }

}
