public class Board{
	private Player player;
	private Player autoPlayer;
	private Player nextPlayer;
	private Player secondPlayer;
	private Card trumpCard;
	private Deck deck;

	public Board(Player player, Player autoPlayer) {
		this.player = player;
		this.autoPlayer = autoPlayer;
		this.nextPlayer = player;
		this.secondPlayer = autoPlayer;
		this.deck = new Deck();
		this.trumpCard = this.deck.next();
	}
	
	public Card trumpCard(){
		return this.trumpCard;
	}
	
	public Player next() {
		return this.nextPlayer;
	}

	/*
	* Metoden move(), som updatere Board efter den første spiller
	* i runden spiller card1 og den anden spiller spiller card2.
	* Derefter returnere en reference til hvem der vandt.
	*/
	public Player move(Card card1, Card card2) {
		boolean win;
		/*
		* Først vil vi lade koden dikterer om hvorvidt en af spillerne
		* spiller et kort fra trump suit, og returnere en reference til
		* hvem der vinder alt efter hvem der spillede kortet.
		*/
		if(card1.suit.equals(card2.suit)){
			if(card1.isHigherThan(card2))
				win = true;
			else
			win = false;
		}
		else if(card1.suit.equals(this.trumpCard.suit))
			win = true;
		else if(card2.suit.equals(this.trumpCard.suit))
			win = false;
		else
			win = true;
		
		/*
		* Herefter har vi delen som giver kort så længe der er kort
		* tilbage i Deck er give fra.
		*/
		this.nextPlayer.removeFromHand(card1);
		this.secondPlayer.removeFromHand(card2);
		if(!this.deck.isEmpty()){
			this.nextPlayer.addToHand(this.deck.nextPlayer());
			if(this.deck.isEmpty())
				this.secondPlayer.addToHand(this.trumpCard);
			else
				this.secondPlayer.addToHand(this.deck.nextPlayer());
		}
		
		/*
		* Til sidst har vi delen som ud fra vinderen, dikteret tidligere
		* i koden, tager begge kort spillet og tilføjer dem til eget deck.
		* Til sidst i metoden vælger vi personen der begynder næste runde
		* ud fra hvem der tabte nuværende runde.
		*/
		if(win){
			this.nextPlayer.addToCollectedCards(card1);
			this.nextPlayer.addToCollectedCards(card2);
		}
		else{
			this.secondPlayer.addToCollectedCards(card1);
			this.secondPlayer.addToCollectedCards(card2);
			Player nextBeginner = this.nextPlayer;
			this.nextPlayer = this.secondPlayer;
			this.secondPlayer = nextBeginner;
		}
		return this.nextPlayer;
	}
	
	/*
	* For at kunne afgøre om spillet er slut, har vi valgt at
	* se på length for player's hånd.
	*/
	public boolean gameOver() {
		if(this.player.hand().length == 0)
			return true;
		else
			return false;
	}

}
