package BlackJack;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Stack<Card> deck;
    static Player player = new Player();
    static Dealer dealer = new Dealer();
    static Scanner input = new Scanner(System.in);

public static void main (String[] args){
    gameSetupBlackJack();
    gameLogicBlackJack();
}

    public static void gameSetupBlackJack(){
        deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);
        GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());
    }

    public static void gameLogicBlackJack(){
        boolean playerTurn = true;
        while(true) {
            showHands();
            if(GameRules.blackJackCheckValues(player.getHand()) == -1){
//                System.out.println("You've gone bust! Do you want to play again?");
                break;
            } else if(GameRules.blackJackCheckValues(player.getHand()) != 21) {
//                System.out.print("Your total is: " + GameRules.blackJackCheckValues(player.getHand()));
//                System.out.println("\nWhat would you like to do? \n 1. Hit Me \n 2. Hold");
                int choice = 1;

//                input.nextLine();

                GameRules.blackJackHitMe(deck, player.getHand());
            }  //                System.out.println("Win State");

        }
    }
    public static void showHands(){
        dealer.showHand();
        player.showHand();
    }

}

