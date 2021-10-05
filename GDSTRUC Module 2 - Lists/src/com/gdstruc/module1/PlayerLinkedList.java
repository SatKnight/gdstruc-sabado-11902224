package com.gdstruc.module1;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        int sizeCounter = 0;
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            sizeCounter++;
        }
        System.out.println("null");
        System.out.println("Linked List Size: " + sizeCounter);
    }

    public void removeFirstNode()
    {
        PlayerNode current = head;

        head = current.getNextPlayer();
    }

    public boolean containsFunction(Player player)
    {
        PlayerNode current = head;
        while (current != null)
        {
            current.getPlayer();

            if(current.getPlayer() == player)
            {
                return true;
            }
            else
            {
                current = current.getNextPlayer();
            }
        }
        return  false;
    }

    public int indexOfFunction(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {
            current.getPlayer();

            if(current.getPlayer() == player)
            {
                return index;
            }
            else {
                current = current.getNextPlayer();
            }
            index++;
        }
        return -1;
    }
}
