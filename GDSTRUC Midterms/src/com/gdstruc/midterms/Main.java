package com.gdstruc.midterms;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner pause = new Scanner(System.in);

        CardStack deck = new CardStack();
        CardStack hand = new CardStack();
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

                    System.out.println("Too little cards! Taking " + temp + " cards instead.");
                    pause.nextLine();

                    moveCard(temp, hand, deck);
                }
                else {
                    moveCard(numberOfCards, hand, deck);
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

                    System.out.println("Too little cards! Taking " + temp + " cards instead.");
                    pause.nextLine();

                    moveCard(temp, hand, discardPile);
                }
                else {
                    moveCard(numberOfCards, hand, discardPile);
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

                    System.out.println("Too little cards! Discarding " + temp + " cards instead.");
                    pause.nextLine();

                    moveCard(temp, discardPile, hand);
                }
                else {
                    moveCard(numberOfCards, discardPile, hand);
                }
            }

            System.out.println("List of Cards in your hand:");
            hand.printStack();
            System.out.println("\nNumber of Cards in the deck: " + deck.size());
            System.out.println("Number of Cards in the Discard Pile: " + discardPile.size());
            pause.nextLine();
        }

        System.out.println("Out of Cards in the Deck!");
    }

    public static void moveCard(int numberOfCards, CardStack toAdd, CardStack toRemove)
    {
        for (int i = 0; i < numberOfCards; i++) {
            //Discard from hand
            toAdd.push(toRemove.pop());
        }
    }
}
