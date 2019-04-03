package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

public class CardTestOne
{
	public static void main( String args[] )
	{
		Card one = new BlackJackCard();
		out.println(one);

		Card two = new BlackJackCard(1,"DIAMONDS");
		out.println(two);

		Card three = new BlackJackCard(4,"CLUBS");
		out.println(three);
		
		Card four = new BlackJackCard(12,"SPADES");
		out.println(four);
	
		Card five = new BlackJackCard(12,"HEARTS");
		out.println(five);	
		
		Card six = new BlackJackCard(9,"SPADES");
		out.println(six);				

		out.println(one.matches(two));
		out.println(one.matches(one));		
		out.println(four.matches(five));	
		out.println(three.matches(four));						
	}
}