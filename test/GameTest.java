import batting.Money;
import card.Card;
import card.CardDeck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import user.Dealer;
import user.Gamer;

/**
 * @author gutenlee
 * @since 2023/06/21
 */
public class GameTest {

    @Test
    void giveCardTest() throws Exception {

        CardDeck cardDeck = CardDeck.create();

        Card card = cardDeck.giveCard();

        Assertions.assertNotNull(card);
    }


    @Test
    void receiveCardTest() throws Exception {

        Gamer gamer = new Gamer(new Money());
        CardDeck cardDeck = CardDeck.create();

        gamer.receiveCard(cardDeck.giveCard());
        gamer.receiveCard(cardDeck.giveCard());


    }




}
