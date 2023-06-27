package user;

import batting.Money;


/**
 * @author gutenlee
 * @since 2023/06/18
 */
public class Gamer extends User  {

    public Gamer(Money money) {
        super(money);
    }

    public void bat(int battingMoney) {
        super.money.setBattingMoney(battingMoney);
    }


}
