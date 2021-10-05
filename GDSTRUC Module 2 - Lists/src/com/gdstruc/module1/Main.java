package com.gdstruc.module1;

//import java.util.ArrayList;
//import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player greg = new Player(1, "Greg", 100);
        Player bongo = new Player(2, "Bongo", 200);
        Player hopscotch = new Player(3, "Hopscotch", 50);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(greg);
        playerLinkedList.addToFront(bongo);
        playerLinkedList.addToFront(hopscotch);

        playerLinkedList.removeFirstNode();

        playerLinkedList.printList();

        System.out.println("Index of Element: " + playerLinkedList.indexOfFunction(hopscotch));

        System.out.println("Contains Element: " + playerLinkedList.containsFunction(hopscotch));

    }
}

//Array List

//        //Nothing in the ArrayList<>() means there the List has a capacity of 10.
//        List<Player> playerList = new ArrayList<>();
//
//        playerList.add(new Player(1, "Greg", 100));
//        playerList.add(new Player(2, "Bongo", 200));
//        playerList.add(new Player(3, "Hopscotch", 50));
//
//        //Accesses a singular element in a list
//        System.out.println(playerList.get(1));
//
//        //Adds an element
//        playerList.add(2, new Player(553, "Sunday", 55));
//
//        //Removes an element
//        playerList.remove(2);
//
//        //Returns true if the list contains the specified element
//        System.out.println(playerList.contains(new Player(2, "Bongo", 200)));
//
//        //Shows what the index of the specified element is. Returns -1 if it returns nothing.
//        System.out.println(playerList.indexOf(new Player(2, "Bongo", 200)));
//
//        //Displays elements
//        for (Player p : playerList)
//        {
//            System.out.println(p);
//        }

