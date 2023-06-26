package card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardViewerTest {

    @Test
    @DisplayName("카드 타입이 Number 가 아닐 경우 숫자가 출력되면 안된다.")
    void whenCardTypeisNotNumberTest() throws Exception {

        String cardInfo = CardViewer.getCardInfo(new Card(11, Suit.HEART));

        assertEquals("[JACK, HEART]", cardInfo);

    }


}