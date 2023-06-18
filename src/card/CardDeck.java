package card;

import java.util.Collections;
import java.util.Stack;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class CardDeck {
    private Stack<Card> cardList;

    private CardDeck() {
        initCardDeck();
        shuffle();
    }

    public static CardDeck create() {
        return new CardDeck();
    }



    /**
     * 카드 섞기
     */
    private void shuffle() {
        Collections.shuffle(cardList);
    }


    /**
     *  슈트 * (카드 번호) 13 개 = 52 개
     */
    private void initCardDeck() {

        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 14; i++) {
                cardList.add(new Card(i, suit));
            }
        }
    }

}
