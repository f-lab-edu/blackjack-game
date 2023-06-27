package game;

import card.CardDeck;
import user.Dealer;
import money.Money;
import user.Gamer;

/**
 * @author jhkim
 * @since 2023/06/18
 */
public class Game {
	public Game() {
	}

	public void start() {
		System.out.println(" ======== start play blackjack ======== ");
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		CardDeck cardDeck = new CardDeck();

		Money gamerBattingMoney = getGameController();
		getGameViewer(gamerBattingMoney);
		gamer.battingMoney(gamerBattingMoney);

		gamer.takeCard(cardDeck.distributeCard(2));
		dealer.takeCard(cardDeck.distributeCard(2));
	}

	private Money getGameController() {
		GameController gameController = new GameController();
		return gameController.getParticipantBattingMoney();
	}

	private void getGameViewer(Money money) {
		GameViewer gameViewer = new GameViewer();
		gameViewer.printBattingMoney(money);
	}

}
