package Black_Jack;
import java.util.Scanner; // used for player input
import java.util.LinkedList; // used to construct player's hand, dealer's hand, the deck, and player's split hand;


public class MainClass {

    //********************************************* GLOBAL VARIABLES *************************************************

    public static int wallet = 500; // players inital amount of money to bet 
    public static int cardNum = 0; // holds # of how many cards have been dealt
    public static int pot = 0; // holds how much the player has choses to bet
    public static final int cardMax = 52; // max number of cards that are in the games deck
    public static int totalGames = 0; // holds how many total games a player has played
    
    public static void main(String[] args) {

        // ************************** LOCAL VARIABLES ******************************

        Scanner input = new Scanner(System.in);
        int score = 0, gamesWon = 0, userInput = 0;
        boolean keep_playing = true, same_round = true, split_hand = false;
        LinkedList<Card> gameDeck = new LinkedList<Card>();
        LinkedList<Card> hand = new LinkedList<Card>(); // players hand 
        LinkedList<Card> splitHand = new LinkedList<Card>(); // split had if player chooses to split their hand 
        LinkedList<Card> dealerHand = new LinkedList<Card>(); // dealers hand, will be use

        // ***************************** INTRODUCTION *********************************

        System.out.println("\n\n\n\tWelcome to Simulated Black Jack \n---------------------------------------------");
        wait(3);
        System.out.println("\n\n\tLet's get started with the rules... \n");
        wait(3);
        rules();
        wait(5);
        System.out.println("\nIf at anytime you need a refresher, you will find the rules in the game menu: \n");
        wait(3);
        while(keep_playing == true){ // ensures that we are in the same game session 

            gameDeck = generateDeck(); // generates a new deck for each round of black jack
            //Player should recieve two cards at start of each round
            hit(hand);
            hit(hand);
            //dealer will also recieve two cards to start, player will be able to only see the first card of the dealer.
            hit(dealerHand);
            hit(dealerHand);
            System.out.println("Place your bet for this round: ");
            int temp = input.nextInt();
            pot = temp;
            wallet -= temp;
            while(same_round == true){ // 
                menu(score, gamesWon);

                // checks if hand is split and prints split hand

                if(split_hand == true){
                    System.out.print("Hand: ");
                    printList(hand);
                    System.out.println("Split Hand: ");
                    printList(splitHand);
                }else{
                    System.out.print("Hand: ");
                    printList(hand);
                } 

                // ask for user input
                System.out.print("\nSelection: ");
                userInput = input.nextInt();
                switch(userInput){
                    case 1:
                        hit(hand);
                        break;
                    case 2:
                        stand();
                        break;
                    case 3:
                        rules();
                        break;
                    case 4:
                        quit(keep_playing, same_round, score, gamesWon);
                        break;
                    default:
                        System.out.println("The selection is invalid.");
                }
            }
        }
 
        input.close();
    }

    // **************************************** USER ACCESSIBLE FUNCTIONS *****************************************

    public static void rules(){
        // explains the rules for this version of black jack, it is slightly simplified compared to what would be on the website.
        System.out.println("\tRules for Black Jack \n---------------------------------------------------");
        wait(3);
        System.out.println("Objective: The player must attempt to beat the dealer by getting a count as close to 21 as \n\t  possible, without going over 21.\n");
        wait(3);
        System.out.println("- Player will determine whether the value of \n  the ace is 1 or 11. All other cards will \n  have the value of the cards are their pip value. \n  Kings, Queens, and Jacks will all have a value of 10. ");
        wait(3);
        System.out.println("- At the start of each game, the player will place a bet of any value between $2 and $500.");
        wait(3);
        System.out.println("- Hit: Hit will allow players to request another card from the deck.\n  If a player has reached a total value in their hand that exceeds 21, the \n round will automatically end.");
        wait(3);
        System.out.println("- Split: Split is a special move that will become available if \n the player receieves two cards of the same value in their hand.");
        wait(3);
        System.out.println("- Stand: If a player stands, they will no longer have teh ability to draw any more cards. \n The dealer must play their hand until it \n has reached a value close to, exactly, or over 21. \n");
        wait(3);
        System.out.println("From there the dealer will compare the values of the hands. \nAnyone that went over 21 will have immediately lost that round.\nWhoever got the closest or the exact value of 21 swill have won the round.  ");
        wait(3);
    }

    
    public static void hit(LinkedList<Card> aList){
        //will hit
    }
     
    public static void split(){
        // will split the hands
    }

    public static void stand(){
        //will stand
    }

    public static void quit(boolean a, boolean b, int points, int won){
        wait(5);
        System.out.println("Quitting game...");
        wait(3);
        System.out.println("Game Stats: \n");
        System.out.println("Player Score: " + points + "\nTotal Games Played: " + totalGames + "\nGames Won: " + won + "\nWallet: $" + wallet);
        a = false;
        b = false; 
        // not sure if this works, i just kinda roughly did it 
    }

    // ********************************* OTHER FUNCTIONS ****************************************

    public static void wait(int seconds){
        //This function is used to time actions in the game
        try { 
	        Thread.sleep(seconds*1000); // 10000ms = 10s 
        } catch(InterruptedException ex){ 
 
	        System.exit(0); 
        } 

    }

    public static void menu(int points, int won){
        // game options menu
        System.out.println("\tBlack Jack \n-----------------------");
        System.out.println("Player Score: " + points + "\nTotal Games Played: " + totalGames + "\nGames Won: " + won + "\nWallet: $" + wallet);
        System.out.println("1) Hit");
        System.out.println("2) Stand");
        System.out.println("3) Rules");
        System.out.println("4) Quit");

    }

    public static LinkedList<Card> generateDeck(){
        // used to generate card deck and will be able to generate a new card each round.
        LinkedList<Card> cardList = new LinkedList<Card>();
        Deck aDeck = new Deck(cardMax);
        aDeck.generateDeckInfo();
        for(int i = 0; i < cardMax; i++){
            Card temp = aDeck.getCard(i);
            cardList.add(i, temp);
        }
        return cardList;
    }

    public static void printList (LinkedList<Card> sample){
        if(sample == null){
            System.out.println("This list is null.");
            return;
        }else{
            int size = sample.size();
            for(int i = 0; i < size; i++){
                Card temp = sample.get(i);
                System.out.print(temp.getCardName() + " ,");
            }
            System.out.println("\n");
        }
    }

} // END OF BLACK JACK CLASS

