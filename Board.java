public class Board{
private Player player;
private Player autoPlayer;
private Card trumpCard;
private Player nextPlayer;
private Player secondPlayer;

public Board(Player playerVar1, Player playerVar2) {
this.player = playerVar1;
this.autoPlayer = playerVar2;
this.nextPlayer = playerVar1;
this.secondPlayer = playerVar2;
}
public Card trumpCard(){
return this.trumpCard;	
}
public Player next() {
return this.nextPlayer;	
}

public Player move(Card cardVar1, Card cardVar2) {
	
}
public boolean gameOver() {
	
}

}
