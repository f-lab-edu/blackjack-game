package user;

import batting.Money;
import card.Cards;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public abstract class User {

    private final Money money;
    private final Cards holdingCards;

    public User(Money money) {
        this.money = money;
        this.holdingCards = Cards.init();
    }

}
