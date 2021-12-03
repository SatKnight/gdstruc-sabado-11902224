package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(24);
        tree.insert(16);
        tree.insert(5);
        tree.insert(67);
        tree.insert(98);
        tree.insert(-7);
        tree.insert(46);
        tree.insert(69);

        //tree.traverseInOrder();
        tree.traverseInOrderDescending();

        System.out.println("Maximum Node: " + tree.getMax());
        System.out.println("Minimum Node: " + tree.getMin());
    }
}
