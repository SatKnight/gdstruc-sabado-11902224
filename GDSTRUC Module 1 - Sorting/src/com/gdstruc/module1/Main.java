package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = 87;
        numbers[2] = 32;
        numbers[3] = 11;
        numbers[4] = 7;
        numbers[5] = 2;
        numbers[6] = 63;
        numbers[7] = 108;
        numbers[8] = 70;
        numbers[9] = 57;

        //Bubble Sort
//        System.out.println("Before Bubble Sort: ");
//        printArrayElement(numbers);
//
//        bubbleSort(numbers);
//
//        System.out.println("\n\nAfter Bubble Sort: ");
//        printArrayElement(numbers);

        //Selection Sort
        System.out.println("Before Selection Sort: ");
        printArrayElement(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter Selection Sort: ");
        printArrayElement(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElement(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
