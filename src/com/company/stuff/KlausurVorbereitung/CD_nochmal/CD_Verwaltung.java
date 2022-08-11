package com.company.stuff.KlausurVorbereitung.CD_nochmal;

import java.util.Scanner;

public class CD_Verwaltung {
    public static void start()
    {
      CD disc[] = new CD[100];
      String Titeltemp;
      String Interprettemp;
      double Ratingtemp = 0; //hier null, damit es in der while schleife funktioniert
        double Durchschnittsrating = 0;
      int counter = 0;
      boolean RatingImBereich = false;
      String SindSieFertig;
      String ja = "ja";
        Scanner scan = new Scanner(System.in);
        System.out.println("CD SAMMLUNG BITTE CD´s EINGEBEN\n\n\n");
        loop: for (int i = 0; i< disc.length;i++)
        {
            counter = counter +1;
            System.out.println("Titel:");
            Titeltemp = scan.nextLine();
            System.out.println("Interpret:");
            Interprettemp = scan.nextLine();
            System.out.println("Geben sie ihr Rating ein: (wichtig! mit -.- eingeben");
            while (RatingImBereich == false)
            {
                Ratingtemp = Double.parseDouble(scan.nextLine());
                if (Ratingtemp >= 0 == true && Ratingtemp <= 10 == true)
                {
                    RatingImBereich = true;
                }
                else{
                    System.out.println("Ihr Rating lag nicht im Bereich von 0 bis 10!");
                }
            }
            RatingImBereich = false;
            Durchschnittsrating = Durchschnittsrating + Ratingtemp;
            disc[i] = new CD(Titeltemp,Interprettemp,Ratingtemp);
            System.out.println("Sind sie fertig mit dem Eingeben? wenn ja: -ja- eingeben, wenn nein dann -nein- eingeben");
            SindSieFertig = scan.nextLine();
            if (SindSieFertig.equals(ja))
            {
                break loop;
            }
        }
        Durchschnittsrating = Durchschnittsrating/counter;
        for (int i = 0;i<counter;i++)
        {
            System.out.println(disc[i].toString());
        }
        System.out.println("Durchschnittsrating: " + Durchschnittsrating);
    }
}
