package user;

import batting.Money;
import card.Card;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Dealer extends User {

    public Dealer(Money money) {
        super(money);
    }

    public Card openFirstCard() {
        return cardHolder.getFirstCard();
    }
}
