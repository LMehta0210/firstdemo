package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //pseudodeck
        ArrayList<Card> deck = new ArrayList<Card>();
        //create a card
        Card card = new Card("Hearts", "Ace", 1);
        System.out.println(card);
        //add card to deck
        deck.add(card);
        //create 20 random cards
        for (int i = 0; i < 20; i++) {
            Card randomCard = new Card();
            deck.add(randomCard);
        }

        //print deck
        System.out.println("Pseudodeck:");
        for(Card c : deck) {
            System.out.println("\t" + c);
        }

        //tests to see if duplicate cards are added
        int numDuplicates = 0;
        for (int i = 0; i < deck.size(); i++) {
            for (int j = i + 1; j < deck.size(); j++) {
                if (deck.get(i).equals(deck.get(j))) {
                    System.out.println("Duplicate card found!: " + deck.get(i));
                    numDuplicates++;
                }
            }
        }
        System.out.println("Number of duplicates: " + numDuplicates);

    }
}
