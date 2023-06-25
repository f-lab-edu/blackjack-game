package user;

import batting.Money;
import card.Card;
import card.CardHolder;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public abstract class User {

    protected final Money money;
    protected final CardHolder cardHolder;

    public User(Money money) {
        this.money = money;
        this.cardHolder = CardHolder.create();
    }

    public void receiveCard(Card card) {
        cardHolder.addCard(card);
    }

}
