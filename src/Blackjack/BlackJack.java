package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
    private final Player player = new Player();
    private final Dealer dealer = new Dealer();
	public BlackJack()
	{


	}

	public void playGame()
	{
	Scanner keyboard = new Scanner(System.in);	
        dealer.shuffle();
        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        int playerTotal = player.getHandValue();
        int dealerTotal = dealer.getHandValue();

        out.println("\nPLAYER ");
        out.println("Hand Value :: " + getPV(player));
        out.println("Hand Size :: " + player.getHandSize());
        out.println("Cards in Hand :: " + player.toString());
        out.println("\nDEALER ");
        out.println("Hand Value :: " + getPV(dealer));
        out.println("Hand Size :: " + dealer.getHandSize());
        out.println("Cards in Hand :: " + dealer.toString());

        while (playerTotal < 21) {

            out.println("Would you like to hit? (y/n)");
            if (getAns(keyboard).equals("y")) {
                player.addCardToHand(dealer.deal());
                playerTotal = player.getHandValue();
                out.println("Hand Value :: " + getPV(player));
                out.println("Hand Size :: " + player.getHandSize());
            } else {
                break;
            }
        }

        while (dealerTotal < 17) {
            dealer.addCardToHand(dealer.deal());
            dealerTotal = dealer.getHandValue();
        }

        if (playerTotal > 21 && dealerTotal <= 21) {
            out.println("\nDealer wins - Player busted!");
        } else if (playerTotal <= 21 && dealerTotal > 21) {
            out.println("\nPlayer wins - Dealer busted!");
        } else if (playerTotal > 21 && dealerTotal > 21) {
            out.println("Both players bust!");
        } else if ((playerTotal < dealerTotal)&&!(hasAce(player)&&(playerTotal+10)>=dealerTotal&&playerTotal<=11) ) {
            out.println("\nDealer has bigger hand value!");
        } else {
            out.println("\nPlayer has bigger hand value!");
        }
        out.println("\n"+ playerTotal + "and"+dealerTotal + "\n");
        out.println("\nPlay Again?");
        if (getAns(keyboard).equals("y")) {
            player.resetHand();
            dealer.resetHand();
            playGame();

        }


	}
        
        public String getPV(AbstractPlayer player){
        if(hasAce(player))
            return ""+player.getHandValue()+" or "+(player.getHandValue()+10);
        else
        return ""+player.getHandValue();
    }
    public String getAns(Scanner keyboard) {
        String ans = keyboard.nextLine();
        if (ans.equals("y") || ans.equals("n")) {
            return ans;
        }
        out.println("Invalid Answer");
        ans = getAns(keyboard);
        return ans;
    }
    
    public boolean hasAce(AbstractPlayer player){
        return player.toString().contains("ACE");
    }

	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}