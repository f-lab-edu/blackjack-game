package card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardHolderTest {

    @Test
    @DisplayName("CardHolder 가 리턴한 카드 리스트는 수정할 수 없다")
    void getAllCardCannotModify() throws Exception {

        // given
        CardHolder cardHolder = CardHolder.create();
        cardHolder.addCard(new Card(1, Suit.HEART));
        cardHolder.addCard(new Card(2, Suit.SPADE));

        // when
        List<Card> allCard = cardHolder.getAllCard();

        // then
        assertThrows(UnsupportedOperationException.class, () -> {
            allCard.add(1, new Card(3, Suit.CLOVER));
        });
    }

    @Test
    @DisplayName("카드 홀더에 카드가 없을 경우 첫번째 카드를 요청하면 CardHolderEmptyException 발생한다.")
    void whenGetFirstCardEmpty() throws Exception {

        CardHolder cardHolder = CardHolder.create();

        assertThrows(CardHolderEmptyException.class, cardHolder::getFirstCard);

    }




}