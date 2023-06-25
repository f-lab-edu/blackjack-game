package user;

import batting.Money;
import card.Card;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Dealer extends User implements Openable {

    public Dealer(Money money) {
        super(money);
    }

    @Override
    public void openCard() {
        Card card = cardHolder.getCardList().get(0);
        System.out.println("Dealer Card [" + card + "]");
    }

}
