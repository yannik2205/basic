package com.company.sortieralgorithmen;
import java.util.Random;

// !! das ist gar nicht der bubble sort
// ich bin dumm und weiß nicht welcher das hier ist.
// Ich glaube quick oder selection
public class bubblesort {
    public static void main(String[] args) {

        Random zufall = new Random();
        int unsortiert[] = new int[10];
        int sortiert [] = new int [10];
        int highestcurrent = 0;
        System.out.println("Zufällige unsortierte Zahlen:");
        for (int i = 0; i< unsortiert.length;i++)
        {
            unsortiert[i] = zufall.nextInt(100);
            System.out.println(i + ": " + unsortiert[i]);
        }
        System.out.println("Sortierte Reihenfolge:");
        for (int j = 0; j < sortiert.length;j++)
        {
           for ( int i = 0; i < unsortiert.length;i++)
           {
               if (unsortiert[i] >= highestcurrent == true)
               {
                   highestcurrent = unsortiert[i];

               }
           }

           sortiert[j] = highestcurrent;

            löschehöchstes(unsortiert, sortiert, highestcurrent);
            highestcurrent = 0;
            System.out.println(sortiert[j]);

        }
    }

    private static void löschehöchstes(int[] unsortiert, int[] sortiert, int highestcurrent) {
        for (int k = 0; k < sortiert.length; k++)
        {
            if (unsortiert[k] == highestcurrent)
            {
                unsortiert[k] = 0;
            }
        }
    }
}
