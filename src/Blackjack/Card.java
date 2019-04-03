package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public abstract class Card {

    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};

    private String suit;
    private int face;

  	//constructors
    public Card() {
        face = 0;
        suit = "CLUBS";
    }
    
    public Card(int fac, String cardSuit) {
		face = fac;
		suit = cardSuit;
	
	}

    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the face
     */
    public int getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(int face) {
        this.face = face;
    }
  	
    
    public abstract int getValue();

    public boolean matches(Card otherCard) {
      Boolean match = false;
      if (otherCard.getSuit().equals(this.getSuit()) && otherCard.getFace() == this.getFace()) {
          match = true;
      }
        return match;
               
                
    }

  	//toString
    public String toString()
{
return FACES[getFace()] + " of " + getSuit() + " | value = "  + getValue();
}


}
