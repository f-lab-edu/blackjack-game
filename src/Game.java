/**
 * @author jhkim
 * @since 2023/06/18
 * 게임 객체
 */
public class Game {
	public void start() {
		System.out.println(" ======== start play blackjack ======== ");
		Dealer dealer = new Dealer();
		Participant participant = new Participant();
		CardDeck cardDeck = new CardDeck();
		cardDeck.settingCard();
	}
}
