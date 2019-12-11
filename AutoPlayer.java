/*
* Denne class skal extend Player med to yderligere metoder,
* med den idé at den skal returnere den træk som autoplayer
* skal foretage, alt efter om den er først eller den anden.
*/
public class AutoPlayer extends Player{
	/*
	* Først laver jeg en contructor, med inheritance fra Player
	* kan jeg bruges super() til at referere til den constructor
	* fra Player som laver en ny spiller med et givent navn.
	*/
	public AutoPlayer(String name){
		super(name);
	}
	
	/*
	* Metode som lægger det første kort fra AutoPlayer. Dette kort
	* er ikke et strategisk lagt kort, blot det første i arrayet.
	*/
	public Card next(){
		Card[] hand=this.hand();
		int i=0;
		while(i<3){
			if(hand[i]!=null)
				return hand[i];
			i=i+1;
		}
		return null;
	}
	
	/*
	* Metode som lægger et kort efter Player og tager højde for om
	* det første kort i arrayet er et godt valg, hvis ikke, prøver
	* det det næste kort i arrayet.
	*/
	public Card next(Card card){
		Card[] hand=this.hand();
		int i=0;
		while(i<3){
			if(hand[i]!=null)
				return hand[i];
			i=i+1;
		}
		return null;
	}
}