package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<BlackJackCard> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		
		
		//loop through suits
			//loop through faces
				//add in a new card
            
            stackOfCards = new ArrayList<BlackJackCard>(52);
             topCardIndex = 52;

                  
            for(int suit = 0; suit < SUITS.length; suit++){
              for(int face = 1; face < Card.FACES.length; face++){
                  stackOfCards.add( new BlackJackCard(face, SUITS[suit]));
            }
        }
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
         
            Collections.shuffle(stackOfCards);
   	 topCardIndex = stackOfCards.size();
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex;
	}

	public Card nextCard()
	{
		topCardIndex--;
       if (topCardIndex == -1) {
           return null;
       }
           BlackJackCard c = stackOfCards.get(topCardIndex);
           return c;
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}