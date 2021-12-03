package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(1, "Plooful", 135);
        Player wardell = new Player(2, "TSM Wardell", 135);
        Player deadlyJimmy = new Player(3, "DeadlyJimmy", 135);
        Player subroza = new Player(4, "Subroza", 135);
        Player annieBro = new Player(5, "C9 Annie", 135);

        FunnyHashtable hashtable = new FunnyHashtable();

        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieBro.getUserName(), annieBro);

        hashtable.remove("Plooful");
        hashtable.printHashtable();
        // System.out.println(hashtable.get("Subroza"));
    }
}
