package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors
 public BlackJackCard() {
     super();
 }
 
public BlackJackCard(int fac, String cardSuit) {
    super(fac,cardSuit);
}


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
                   int pv = 0;
                    for (int i = 0; i < FACES.length; i++) {
                        if(FACES[i].equals(FACES[super.getFace()])) {
                            if(super.getFace() == 1) {
                               pv = 11; 
                            }
                            else {
                                pv = i;
                            }
                        }
                    }
		return pv;
  	}
  	
 }