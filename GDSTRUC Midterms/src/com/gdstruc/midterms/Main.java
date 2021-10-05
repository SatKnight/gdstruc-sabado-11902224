package com.gdstruc.midterms;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner pause = new Scanner(System.in);

        CardStack deck = new CardStack();
        LinkedList<Card> hand = new LinkedList<Card>();
        CardStack discardPile = new CardStack();

        deck.push(new Card("dog"));
        deck.push(new Card("cat"));
        deck.push(new Card("horse"));
        deck.push(new Card("shark"));
        deck.push(new Card("giraffe"));
        deck.push(new Card("mouse"));
        deck.push(new Card("kangaroo"));
        deck.push(new Card("dragon"));
        deck.push(new Card("rabbit"));
        deck.push(new Card("lion"));
        deck.push(new Card("monkey"));
        deck.push(new Card("crab"));
        deck.push(new Card("wolf"));
        deck.push(new Card("fox"));
        deck.push(new Card("squirrel"));
        deck.push(new Card("fish"));
        deck.push(new Card("cow"));
        deck.push(new Card("pig"));
        deck.push(new Card("sheep"));
        deck.push(new Card("chicken"));
        deck.push(new Card("tiger"));
        deck.push(new Card("eagle"));
        deck.push(new Card("octopus"));
        deck.push(new Card("bear"));
        deck.push(new Card("deer"));
        deck.push(new Card("moose"));
        deck.push(new Card("penguin"));
        deck.push(new Card("eagle"));
        deck.push(new Card("turtle"));
        deck.push(new Card("alligator"));

        while(!deck.isEmpty())
        {
            int randomizer = rand.nextInt(3);
            int numberOfCards = rand.nextInt(5) + 1;

            if (randomizer == 0)
            {
                System.out.println("Taking " + numberOfCards + " from deck...");
                pause.nextLine();

                if (deck.isEmpty() == true) {
                    System.out.println("No more cards in the deck!");
                    pause.nextLine();
                }
                else if (deck.size() < numberOfCards){
                    int temp = deck.size();

                    System.out.println(" Too little cards! Taking " + temp + " cards instead.");
                    pause.nextLine();

                    for (int i = 0; i < temp; i++) {
                        //Draw Cards from discard pile
                        hand.push(deck.pop());
                    }
                }
                else {
                    for (int i = 0; i < numberOfCards; i++) {
                        //Draw Cards from deck
                        hand.push(deck.pop());
                    }
                }
            }
            else if (randomizer == 1)
            {
                System.out.println("Taking " + numberOfCards + " cards from discard pile...");
                pause.nextLine();

                if (discardPile.isEmpty() == true) {
                    System.out.println("No cards in the discard pile!");
                    pause.nextLine();
                }
                else if (discardPile.size() < numberOfCards){
                    int temp = discardPile.size();

                    System.out.println(" Too little cards! Taking " + temp + " cards instead.");
                    pause.nextLine();

                    for (int i = 0; i < temp; i++) {
                        //Draw Cards from discard pile
                        hand.push(discardPile.pop());
                    }
                }
                else {
                    for (int i = 0; i < numberOfCards; i++) {
                        //Draw Cards from discard pile
                        hand.push(discardPile.pop());
                    }
                }
            }
            else if (randomizer == 2)
            {
                System.out.println("Discarding "  + numberOfCards + " cards from hand...");
                pause.nextLine();

                if (hand.isEmpty() == true) {
                    System.out.println("No cards in your hand!");
                    pause.nextLine();
                }
                else if (hand.size() < numberOfCards){
                    int temp = hand.size();

                    System.out.println(" Too little cards! Discarding " + temp + " cards instead.");
                    pause.nextLine();

                    for (int i = 0; i < temp; i++) {
                        //Discard from hand
                        discardPile.push(hand.pop());
                    }
                }
                else {
                    for (int i = 0; i < numberOfCards; i++) {
                        //Discard from hand
                        discardPile.push(hand.pop());
                    }
                }
            }

            System.out.println("Number of Cards in the deck: " + deck.size());
            System.out.println("Number of Cards in the Discard Pile: " + discardPile.size());
            pause.nextLine();
        }
        System.out.println("Out of Cards in the Deck!");
    }
}

//Turns
//   The program gives commands every turn. The commands are given at random.
//
//   Possible commands are:
//     Draw x cards (x can be a random value from 1 to 5)
//     Discard x cards
//     Get x cards from the discarded pile
//
//   After each round, the program must display the following info:
//     List of cards that the player is currently holding
//     Number of remaining cards in the player deck
//     Number of cards in the discarded pile
//
//   Player Deck
//     Contains 30 cards
//     Give each card a name. Names can be duplicated.
//
//   Discarded Pile
//     This contains all the cards discarded by the player.
//
//   Notes
//
//     The player deck and discarded pile should work as a STACK. The next card to be drawn must be the top of the deck.
//
//     You may create the following classes:
//       Card.java
//       CardStack.java
//
//     You may use an array or a linked list for your Stack class.
//     The program ends when the player deck is emptied.