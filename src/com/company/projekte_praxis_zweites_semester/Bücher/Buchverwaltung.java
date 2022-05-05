package com.company.projekte_praxis_zweites_semester.Bücher;

import java.util.Scanner;

public class Buchverwaltung {

    public static void Hauptausgabe() {
        Buch bücher[] = new Buch[100];
        System.out.println("\n Geben sie nun ihre Bücher nach und nach ein.");

        Scanner scan = new Scanner(System.in);
        System.out.println("gib Mehrwertsteuer");
        double Mehrwertsteuer;
        Mehrwertsteuer = Double.parseDouble(scan.nextLine());
        int counter = 0;
        //ließt die Werte für die Bücher ein
        loop: for (int i = 0; i<= bücher.length;i++)
        {
            System.out.println("Titel:");
            String Titelscan = scan.nextLine();
            System.out.println("Inventarnummer:");
            int Invnummer = scan.nextInt();
            System.out.println("Nettopreis");
            double Nettoscan = scan.nextDouble();
            System.out.println("Anzahl:");
            int Stückscan = scan.nextInt();
            bücher[i] = new Buch(Invnummer, Titelscan, Nettoscan,Stückscan);
            bücher[i].setMehrwertsteuerfürbrutto(Mehrwertsteuer);
            counter++;
            System.out.println("Sind sie fertig? Wenn ja dann :- ja- . Wenn nicht dann: -nein- eingeben");
            String fertig = scan.next();
            String ja = "ja";
            scan.nextLine();
            if (ja.equals(fertig))
            {
                break loop;
            }

        }
        System.out.println("Geben sie die Mehrwertsteuer an:");
        System.out.println("\n\n");
        // gibt die Bücher aus
        double bruttopreis;
        double Mehrwertsteuerrechnen = Mehrwertsteuer*0.001 + 1;
        for (int j = 0; j< counter;j++)
        {
            System.out.println(bücher[j]);
        }


    }

}
