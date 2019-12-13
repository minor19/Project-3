public class Board{
	private Player player;
	private Player autoPlayer;
	private Card trumpCard;
	private Player nextPlayer;
	private Player secondPlayer;

	public Board(Player player, Player autoPlayer) {
		this.player = player;
		this.autoPlayer = autoPlayer;
		this.nextPlayer = player;
		this.secondPlayer = autoPlayer;
	}
	
	public Card trumpCard(){
		return this.trumpCard;	
	}
	
	public Player next() {
		return this.nextPlayer;	
	}

	public Player move(Card card1, Card card2) {

	}
	
	public boolean gameOver() {

	}

}
