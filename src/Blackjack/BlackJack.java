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

        System.out.println("\nPLAYER ");
        System.out.println("Hand Value :: " + getPV(player));
        System.out.println("Hand Size :: " + player.getHandSize());
        System.out.println("Cards in Hand :: " + player.toString());
        System.out.println("\nDEALER ");
        System.out.println("Hand Value :: " + getPV(dealer));
        System.out.println("Hand Size :: " + dealer.getHandSize());
        System.out.println("Cards in Hand :: " + dealer.toString());

        while (playerTotal < 21) {

            System.out.println("Would you like to hit? (y/n)");
            if (getAns(keyboard).equals("y")) {
                
                Card hit = dealer.deal();
                player.addCardToHand(hit);
                playerTotal = player.getHandValue();
                System.out.println("\nYou were given a " + hit);
                System.out.println("Hand Value :: " + getPV(player));
                System.out.println("Hand Size :: " + player.getHandSize());
            } else {
                break;
            }
        }

        while (dealerTotal < 17) {
            dealer.addCardToHand(dealer.deal());
            dealerTotal = dealer.getHandValue();
        }

        if (playerTotal > 21 && dealerTotal <= 21) {
            System.out.println("\nDealer wins - Player busted!");
        } else if (playerTotal <= 21 && dealerTotal > 21) {
            System.out.println("\nPlayer wins - Dealer busted!");
        } else if (playerTotal > 21 && dealerTotal > 21) {
            System.out.println("Both players bust!");
        } else if ((playerTotal < dealerTotal)&&!(hasAce(player)&&(playerTotal+10)>=dealerTotal&&playerTotal<=11) ) {
            System.out.println("\nDealer has bigger hand value!");
        }
            else if (playerTotal == dealerTotal) {
                    System.out.println("\nThe game is a tie!");
                    }
         else {
            System.out.println("\nPlayer has bigger hand value!");
        }
        System.out.println("\n"+ playerTotal + " and "+dealerTotal + "\n");
        System.out.println("\nPlay Again?");
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
        System.out.println("Please type a valid answer");
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