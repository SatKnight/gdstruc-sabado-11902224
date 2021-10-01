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
        System.out.println(sizeCounter);
    }

    public void removeFirstNode()
    {
        PlayerNode temp = head;
        PlayerNode current;

       temp.setPlayer() = null;
    }

    public void containsFunction()
    {

    }

    public void indexOfFunction(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {
            current.getPlayer();
            index++;

            if(current.getPlayer().equals(player))
            {
                break;
            }
            else {
                current.getNextPlayer();
            }
        }
        System.out.println(index);
    }
}
