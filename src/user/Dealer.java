package user;

import batting.Money;
import card.Card;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Dealer extends User {

    public Dealer(Money money) {
        super(money);
    }

    public Card openFirstCard() {
        return Optional.ofNullable(cardHolder.getFirstCard())
                .orElseThrow(NoSuchElementException::new);
    }
}
