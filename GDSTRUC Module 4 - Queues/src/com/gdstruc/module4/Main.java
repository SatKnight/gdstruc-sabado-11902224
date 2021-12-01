package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(12);

        Random rand = new Random();
        Scanner pause = new Scanner(System.in);

        int matchesMade = 0;

        while (matchesMade != 10) {

            while(queue.size() < 5)
            {
                int randomPlayer = rand.nextInt(7) + 1;

                System.out.println("Adding " + randomPlayer + " players to Queue.");
                pause.nextLine();

                for (int i = 0; i < randomPlayer; i++) {
                    queue.add(new Player(rand.nextInt(999) + 1, "ACreativeAndOriginalName", 68));
                }

                System.out.println("Number of Players in Queue: " + queue.size());
                pause.nextLine();
            }

            System.out.println("Match is ready! Removing 5 players from Queue.");
            pause.nextLine();

            for (int i = 0; i < 5; i++)
            {
                queue.remove();
            }

            matchesMade++;

            System.out.println("Remaining Players in Queue: " + queue.size());
            System.out.println("Matches Made: " + matchesMade);
            pause.nextLine();
        }
    }
}

//Important to note
//Queues follow FIFO, First In First Out.

//Create a matchmaking algorithm for players.
//
//Mechanics:
//
//Every turn, x players will queue for matchmaking (x = rand () 1 to 7). Pressing enter ends the turn.
//A game can be started when at least 5 players are in the queue.
//When a game starts, pop the first 5 players from the queue.
//The program terminates when 10 games have been successfully made.