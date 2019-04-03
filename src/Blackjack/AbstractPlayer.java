package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import Blackjack.Card;
import Blackjack.BlackJackCard;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand = new ArrayList<Card>();
   private int winCount;

   //constructors

   public  void addCardToHand( Card temp )
   {
        hand.add(temp);

   }

   public  void resetHand( )
   {
       hand.clear();

   }

   public  void setWinCount( int numwins )
   {
       winCount = numwins;

   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
		//great example of polymorphism
      int total=0;

       total = hand.stream().map((i) -> i.getValue()).reduce(total, Integer::sum);

      return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString() + " \n-  # wins " + winCount;
   }
}