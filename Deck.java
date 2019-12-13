/* Denne Deck Class skal repræsentere et helt nyt dæk med de 40 kort fra Card.class, som den putter i en vilkårlig rækkefølge.
constructoren fungere således, at den laver dækket med 40 kort i, mens at next() metoden derefter bruges til at returnere et kort,
som derefter fjernes. derved bliver dækket mindre og mindre, hvilket fører til, at isEmpty() metoden til sidst vil returnere true,
da der ikke er flere kort tilbage i dækket.
*/
 import java.util.Random;
Public class Deck {
	private Card[] cardDeck;
	private Random randomCard = new Random();
//Laver et nyt Dæk kort, som indeholder 40 kort.
    public Deck(){
		Card[] cardValues = Card.values();
		int deckLength = cardValues.length();
		int cardNumber = 0;
		while (cardNumber < deckLength){
		this.cardDeck;
		cardDeck.add(cardValues[cardNumber]);
		cardnumber++;
		}
}
//Returnere det næste kort i dækket, som bliver fjernet derefter.
    public Card next(){
		this.cardDeck = cardDeck;
		this.random = random;
		Int ranCardToRemove = randomCard.nextInt(cardDeck.size());
		return cardDeck.remove(ranCardToRemove);	
}
//Tjekker om dækket er tomt. hvis det er, returneres True.
    public boolean isEmpty(){
		If (cardDeck.size() == null)
		return true;	
}




}

