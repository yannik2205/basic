package com.company.stuff.KlausurVorbereitung;

import java.util.Scanner;

public class CD_Verwaltung {
    public static  void Start()
    {
        String Titeltemp;
        String Interprettemp;
        int Ratingtemp = 0; //
        int counter = 0;
        boolean RatingimBereich = false;
        String FertigPrüfung = "ja";
        String fertig;
        double DurchschnittRating = 0;

        CD disc[] = new CD[100];
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "===================================\n" +
                "     ====    CD Sammlung   ====     \n" +
                "    Tragen sie hier ihre Cd´s ein    ");

       //Start des Eintragens
        loop: for (int i = 0; i< disc.length; i++)
        {
            counter = counter + 1;
            System.out.println("Tragen sie CD Nummer " + counter + " ein");
            System.out.println("Tragen sie den Titel ein:\n");
            Titeltemp = scan.nextLine();
            System.out.println("Tragen sie den interpreten ein:\n");
            Interprettemp = scan.nextLine();
            System.out.println("Tragen sie ihr Rating von 0 - 10 ein:\n");
            while (RatingimBereich == false)
            {
                Ratingtemp = Integer.parseInt(scan.nextLine());
                if (Ratingtemp >= 0 == true && Ratingtemp <=10 == true)
                {
                    RatingimBereich = true;
                }
                else {
                    System.out.println("Ihre Zahl lag nicht im definierten Bereich. Bitte geben sie die Zahl erneut ein");
                }
            }
            DurchschnittRating = DurchschnittRating + Ratingtemp;
            RatingimBereich = false; //damit beim nächsten Eintrag die while Schleife wieder aufgerufen werden kann
            disc[i] = new CD(Titeltemp, Interprettemp, Ratingtemp);
            System.out.println("Sind sie fertig mit dem eintragen?");
            System.out.println("Falls ja geben sie -ja- ein. Falls nicht -nein-");
            fertig = scan.nextLine();
            if (fertig.equals(FertigPrüfung))
            {
                break loop;
            }
        }
        for (int i = 0; i<counter;i++)
        {
            System.out.println(disc[i]);
        }
        DurchschnittRating = DurchschnittRating / counter;
        System.out.println("Durchschnitt des Ratings: " + String.format("%.1f",DurchschnittRating));
    }
}
