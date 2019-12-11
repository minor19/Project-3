import java.util.ArrayList;
import java.util.Random;
import java.util.List;
Public class Deck {
	private List<Card> cardDeck;
	private Random random;
//Laver et nyt Dæk kort, som indeholder 40 kort.
    public Deck(){
		this.cardDeck = new ArrayList<Card>();
		Card[] cardValues = Card.values();
		this.random = new Random;
		for (int deckLength = values.length, valueOfCard = 0; valueOfCard < deckLength; valueOfCard++) {
			this.cardDeck;
			cardDeck.add(cardValues[valueOfCard]);
		}
}
//Returnere det næste kort i dækket, som bliver fjernet derefter.
    public Card next(){
		this.cardDeck = cardDeck;
		this.random = random;
		return cardDeck.remove(random.nextInt(cardDeck.size()));	
}
//Tjekker om dækket er tomt. hvis det er, returneres True.
    public boolean isEmpty(){
		this.cardDeck = cardDeck;
		return cardDeck.size() == null;	
}

