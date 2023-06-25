import batting.Money;
import card.Card;
import card.CardDeck;
import card.CardViewer;
import user.Dealer;
import user.Gamer;
import user.User;

import java.util.Scanner;

/**
 * @author gutenlee
 * @since 2023/06/25
 */
public class GameApp {
    public static void main(String[] args) {

        System.out.println("========[블랙잭 게임 입장]========");

        Gamer gamer = new Gamer(new Money());
        Dealer dealer = new Dealer(new Money());

        System.out.println("배팅 금액을 입력하시오" + System.lineSeparator());
        Scanner scanner = new Scanner(System.in);
        int battingMoney = scanner.nextInt();
        System.out.println("배팅 금액 [ " + battingMoney + " ]");

        gamer.bat(battingMoney);

        CardDeck cardDeck = CardDeck.create();
        giveCards(gamer, cardDeck, 2);
        giveCards(dealer, cardDeck, 2);

        Card openFirstCard = dealer.openFirstCard();
        CardViewer.print(openFirstCard);
    }

    private static void giveCards(User user, CardDeck cardDeck, int giveCardCount) {
        for (int i = 0; i < giveCardCount; i++) {
            user.receiveCard(cardDeck.giveCard());
        }
    }

}
