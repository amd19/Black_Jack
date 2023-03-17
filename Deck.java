package Black_Jack;

public class Deck {
    int deckSize;
    Card[] thisDeck;

    public Deck(int size){
        deckSize = size;
        thisDeck = new Card[deckSize];

    }
    public void generateDeckInfo(){
        generateCardID();
        generateSuits();
        generateCardRank();
    }
    public void printDeckInfo(){
        System.out.print("The Deck: ");
        for(int i = 0; i < deckSize; i++){
            if(thisDeck[i] != null){
                System.out.println("Card ID: "+ thisDeck[i].getCardID() + "," );
                System.out.println("\t Card Suit: "+ thisDeck[i].getSuit() + "," );
                System.out.println("\t Card Rank: "+ thisDeck[i].getRank() + "," );
            }
        }
    }
    public void generateCardID(){
        for(int i = 0; i < deckSize; i++ ){
            thisDeck[i] = new Card(i + 1);
        }

    }
    public void generateSuits(){
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
    public void generateCardRank(){
        // there is probably a faster way to do this just for this is what i got 
        int num;
        for(int i = 0; i < deckSize; i++){
            num = thisDeck[i].getCardID() % 13;
            switch(num){
                case 1:
                    thisDeck[i].setRank("Ace");
                case 2: 
                    thisDeck[i].setRank("2");
                case 3:
                    thisDeck[i].setRank("3");
                case 4:
                    thisDeck[i].setRank("4");
                case 5:
                    thisDeck[i].setRank("5");
                case 6:
                    thisDeck[i].setRank("6");
                case 7: 
                    thisDeck[i].setRank("7");
                case 8:
                    thisDeck[i].setRank("8");
                case 9:
                    thisDeck[i].setRank("9");
                case 10: 
                    thisDeck[i].setRank("10");
                case 11:
                    thisDeck[i].setRank("Jack");
                case 12:
                    thisDeck[i].setRank("Queen");
                case 0:
                    thisDeck[i].setRank("King");
                default:
                    System.out.println("No Rank was generated for this card.");
            }
        }

    }
    
}
