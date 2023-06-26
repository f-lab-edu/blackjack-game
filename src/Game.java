/**
 * @author jhkim
 * @since 2023/06/18
 */
public class Game {
	public void start() {
		System.out.println(" ======== start play blackjack ======== ");
		Dealer dealer = new Dealer();
		Participant participant = new Participant();

		participant.settingBattingMoney();
		CardDeck cardDeck = new CardDeck();

		participant.setHoldingCardList(cardDeck.distributeCard(2));
		dealer.setHoldingCardList(cardDeck.distributeCard(2));
	}
}
