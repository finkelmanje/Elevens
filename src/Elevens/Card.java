package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String suit;
		private int face;

  	//constructors
public Card(String s, int a) {
    suit = s;
    face = a;
}

	public void setFace(int a) {
            face = a;
        }
        
        public void setSuit(String s) {
            suit = s;
        }


  	public int getFace() {
            return face;
        }
       
        public String getSuit() {
            return suit;
        }


  	public String toString() {
           return  face + " of " + suit; 
        }

 }