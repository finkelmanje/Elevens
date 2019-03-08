package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
        
        public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private List<Card> cards;
	private int top;

   public Deck() {
   	cards = new ArrayList<Card>(52);
       top = 52;
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
                  
            for(int suit=0; suit < SUITS.length; suit++){
              for(int face = 1; face < FACES.length; face++){
                  cards.add( new BlackJackCard(SUITS[suit],face));
            }
        }
    }
                         
                      
          
   
   
   public Card dealCard() {
       top--;
       if (top == -1) {
           return null;
       }
           Card c = cards.get(top);
           return c;
       }
       
  
   
   public void shuffle() {
   	Collections.shuffle(cards);
   	top = cards.size();
   }
}

