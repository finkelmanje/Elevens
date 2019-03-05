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
	
	private List<Card> cards;
	private int top;

   public Deck(String[] suits, int[] values) {
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
                  
                      for (int i = 0; i <suits.length; i++) {
                          for (int k = 0; k < values.length; k++) {
                          Card card = new Card(suits[i], values[k]);
                          cards.add(card);
                         
                      }  
                      }
                BlackJackCard bcard = new BlackJackCard()   
                        cards.add(bcard);
                        top = cards.size();
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
