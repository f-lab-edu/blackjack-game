package user;

import batting.Money;
import card.Hand;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public abstract class User {

    private final Money money;
    private final Hand holdingHand;

    public User(Money money) {
        this.money = money;
        this.holdingHand = Hand.create();
    }

}
