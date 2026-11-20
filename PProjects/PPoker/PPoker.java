import java.util.Scanner;


public class PPoker {

    public static String[] makeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " " + suit;
            }
        }
        return deck;
    }

    public static String[] makeHand(String[] deck, int handSize) {
        String[] hand = new String[handSize];
        for (int i = 0; i < handSize; i++) {
            hand[i] = deck[i];
        }
        return hand;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        String[] playerNames = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }

        // Display the player names
        System.out.println("Players in the game:");
        for (String name : playerNames) {
            System.out.println(name);
        }

        //Deck ingredients
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Make deck
        String[] deck = makeDeck(suits, ranks);
        System.out.println("Deck of cards:");
        for (String card : deck) {
            System.out.println(card);
        }

        // Shuffle
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        System.out.println("Deck of cards(shuffled):");
        for (String card : deck) {
            System.out.println(card);
        }

        // Make hands
        
		String[][] allHands = new Sting;
		
		for (int i = 0; i <= numPlayers; i++) {
			
			String[] hand
			
		}

            
    }
}