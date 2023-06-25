package user;

import batting.Money;
import card.Card;
import card.CardDeck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    @DisplayName("딜러가 보유한 카드가 있을 경우 openFirstCard 는 not null 이다. ")
    void openFirstCard() throws Exception {

        // given
        Dealer dealer = new Dealer(new Money());
        CardDeck cardDeck = CardDeck.create();
        dealer.receiveCard(cardDeck.giveCard());

        // when
        Card card = dealer.openFirstCard();

        // then
        assertNotNull(card);
    }

    @Test
    @DisplayName("딜러가 보유한 카드가 없을 경우 openFirstCard 는 NotSuchElementException 뱉는다. ")
    void openFirstCardThrowException() {

        // given
        Dealer dealer = new Dealer(new Money());

        // then
        assertThrows(NoSuchElementException.class, dealer::openFirstCard);
    }


}