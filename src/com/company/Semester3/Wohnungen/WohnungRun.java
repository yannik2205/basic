package com.company.Semester3.Wohnungen;

import java.util.Scanner;

public class WohnungRun {
    public static void Run() throws negativeMiete{
        int anzahlWohnungen = 0;
        int anzahlDach = 0;


        Wohnung home []= new Wohnung[100];
        Dachwohnung dach[] = new Dachwohnung[100];
        Scanner scan = new Scanner(System.in);
        loop: while (true)
        {
            System.out.println(
                    "Welche Art von Wohnung wollen sie eingeben?\n" +
                            "'d' für Dachgeschosswohnungen\n" +
                            "'w' für eine normale Wohnung"
            );

            if (scan.nextLine().equals("d"))
            {
                System.out.println("Geben sie die Innenfläche an");
                Double InnenFläche = Double.valueOf(scan.nextLine());
                System.out.println("Geben sie die Balkonfläche an:");
                Double Balkonfläche = Double.valueOf(scan.nextLine());
                System.out.println("Geben sie den Mietpreis an");
            }
            else if (scan.nextLine().equals("w"))
            {

            }
            else
            {
                System.out.println("Sie haben was falsch gemacht sie Wixer");
            }

        }


    }
}
