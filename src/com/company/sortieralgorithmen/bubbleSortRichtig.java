package com.company.sortieralgorithmen;
import java.util.Random;
public class bubbleSortRichtig {
    public static void main(String[] args) {
        Random zufall = new Random();
        int zahlen[] =  new int[10];
        int counter = zahlen.length-1; // damit die sortierten Zahlen richtig herum ausgegeben werden
        int temp = 0;
        System.out.println("Unsortierte Zahlen:");
        for (int i = 0; i<zahlen.length;i++)
        {
            zahlen[i] = zufall.nextInt(100);
            System.out.print(zahlen[i] + " ");
        }
        System.out.println("\n"+"Sortierte Reihenfolge:");
        for (int j = 0; j < zahlen.length; j++)
        {
            for ( int i = 1; i< zahlen.length; i++)
            {
                if (zahlen[i-1] > zahlen[i] == true)
                {
                    tauschi(zahlen, j, i);
                }
            }
            System.out.print(" " + zahlen[counter]);
            counter--;
        }
    }

    private static void tauschi(int[] zahlen, int j, int i) {
        int temp = zahlen[i-1];
        zahlen[i-1] = zahlen[i];
        zahlen[i] = temp;
    }
}
