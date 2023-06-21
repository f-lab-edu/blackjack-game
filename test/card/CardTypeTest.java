package card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CardTypeTest {

    @Test
    void getCardTypeTest() throws Exception {
        Assertions.assertEquals(CardType.UNDEFINED, CardType.getCardType(1));
        Assertions.assertEquals(CardType.NUMBER, CardType.getCardType(2));
        Assertions.assertEquals(CardType.NUMBER, CardType.getCardType(5));
        Assertions.assertEquals(CardType.NUMBER, CardType.getCardType(10));
        Assertions.assertEquals(CardType.JACK, CardType.getCardType(11));
        Assertions.assertEquals(CardType.QUEEN, CardType.getCardType(12));
        Assertions.assertEquals(CardType.KING, CardType.getCardType(13));
        Assertions.assertEquals(CardType.ACE, CardType.getCardType(14));
        Assertions.assertEquals(CardType.UNDEFINED, CardType.getCardType(15));
    }


}