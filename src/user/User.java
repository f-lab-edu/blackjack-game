package user;

import batting.Money;
import card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public abstract class User {

    private final Money money;
    private final List<Card> cardList = new ArrayList<>();

    public User(Money money) {
        this.money = money;
    }
}
