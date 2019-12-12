/* Denne Deck Class skal repræsentere et helt nyt dæk med de 40 kort fra Card.class, som den putter i en vilkårlig rækkefølge.
constructoren fungere således, at den laver dækket med 40 kort i, mens at next() metoden derefter bruges til at returnere et kort,
som derefter fjernes. derved bliver dækket mindre og mindre, hvilket fører til, at isEmpty() metoden til sidst vil returnere true,
da der ikke er flere kort tilbage i dækket.
*/
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
		for (int deckLength = cardValues.length, cardNumber = 0; cardNumber < deckLength; cardNumber++) {
			this.cardDeck;
			cardDeck.add(cardValues[cardNumber]);
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
	// isEmpty metoden skal muligvis fjernes, da det burde være en metode, der fungere ligesom f.eks length, add, remove osv.

