package card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {

    @Test
    void giveCardShouldNotNull(){
        CardDeck cardDeck = CardDeck.create();
        Card card = cardDeck.giveCard();
        assertNotNull(card);
    }



}