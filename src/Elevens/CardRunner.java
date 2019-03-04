package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		
		Card one = new Card("SPADES", 9);
		System.out.println(one.getSuit());
		System.out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		System.out.println(two);
		two.setFace(3);
		System.out.println(two);

		Card three = new Card("CLUBS", 4);
		System.out.println(three);

		Card four = new Card("SPADES", 12);
		System.out.println(four);

		Card five = new Card("HEARTS", 12);
		System.out.println(five);
		
	}
}