package user;

import batting.Money;

/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Gamer extends User implements Openable {

    public Gamer(Money money) {
        super(money);
    }

    public void bat(int battingMoney) {
        super.money.setBattingMoney(battingMoney);
    }

    @Override
    public void openCard() {
        System.out.println("Gamer Card " + cardHolder.getCardList());
    }
}
