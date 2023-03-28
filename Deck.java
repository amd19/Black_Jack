package Black_Jack;
import java.util.Random;

public class Deck {
    int deckSize;
    Card[] thisDeck;
    Random rand = new Random();


    public Deck(int size){
        deckSize = size;
        thisDeck = new Card[deckSize];

    }
    public void generateDeckInfo(){
        generateCardID();
        generateSuits();
        generateCardRankValue();
        shuffle();
    }
    public void printDeckInfo(){
        System.out.print("The Deck: ");
        for(int i = 0; i < deckSize; i++){
            if(thisDeck[i] != null){
                System.out.println("Card ID: "+ thisDeck[i].getCardID() + "," );
                System.out.println("\t Card Suit: "+ thisDeck[i].getSuit() + "," );
                System.out.println("\t Card Rank: "+ thisDeck[i].getRank() + "," );
                System.out.println("\t Card Name: "+ thisDeck[i].getCardName() + "," );
            }
        }
    }
    public void shuffle(){
        int randIndex;
        Card temp;
        for (int i = 0; i < deckSize; i++){
            randIndex = rand.nextInt(deckSize);
            temp = thisDeck[randIndex];
            thisDeck[randIndex] = thisDeck[i];
            thisDeck[i] = temp;
        }
    }
    public void generateCardID(){
        for(int i = 0; i < deckSize; i++ ){
            thisDeck[i] = new Card(i + 1);
        }

    }
    public void generateSuits(){
        // sets the suits of each card
        for(int i = 0; i < deckSize; i++){
            int tempID = thisDeck[i].getCardID();
            if(tempID > 0 && tempID <= 13){
                thisDeck[i].setSuit("Hearts");
            }else if(tempID > 13   && tempID <= 26){
                thisDeck[i].setSuit("Diamonds");
            }else if(tempID > 26 && tempID <= 39){
                thisDeck[i].setSuit("Spades");
            }else if(tempID > 39 && tempID <= 52){
                thisDeck[i].setSuit("Clubs");
            }
        }
    }
    public void generateCardRankValue(){
        // there is probably a faster way to do this just for this is what i got for now 
        int num;
        for(int i = 0; i < deckSize; i++){
            num = thisDeck[i].getCardID() % 13;
            if(num >= 2 || num <=10){
                thisDeck[i].setRank(Integer.toString(num));
                thisDeck[i].setValue(num);
            }
            switch(num){
                case 1:
                    thisDeck[i].setRank("Ace");
                    // this cards value can be either a 1 or 11,
                    //we should let th user determine what the value of this card will be 
                    break;
                case 11:
                    thisDeck[i].setRank("Jack");
                    thisDeck[i].setValue(10);
                    break;
                case 12:
                    thisDeck[i].setRank("Queen");
                    thisDeck[i].setValue(10);
                    break;
                case 0:
                    thisDeck[i].setRank("King");
                    thisDeck[i].setValue(10);
                    break;
            }
            thisDeck[i].setCardName();
        }

    }
    
}
