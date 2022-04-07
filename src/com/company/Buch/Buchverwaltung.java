package com.company.Buch;

import java.util.Scanner;

public class Buchverwaltung {

    public static void main(String[] args) {
        Buch bücher[] = new Buch[100];
        System.out.println("\n Geben sie nun ihre Bücher nach und nach ein.");

        Scanner scan = new Scanner(System.in);
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
        double Mehrwertsteuer = scan.nextDouble();
        System.out.println("\n\n");
        // gibt die Bücher aus
        double bruttopreis;
        double Mehrwertsteuerrechnen = Mehrwertsteuer*0.001 + 1;
        for (int j = 0; j< counter;j++)
        {
            System.out.println("Buch" + j+1 + ":");
            System.out.println("Inventarnummer: " + bücher[j].getInventarnummer());
            System.out.println("Titel: " + bücher[j].getTitel());
            System.out.println("Nettopreis: " + bücher[j].getNettopreis());
            System.out.println("Bruttopreis: " + bücher[j].getNettopreis()*Mehrwertsteuerrechnen);
            System.out.println("Auf Lager: " + bücher[j].getStückzahl() + "\n\n");
        }
    }

}
