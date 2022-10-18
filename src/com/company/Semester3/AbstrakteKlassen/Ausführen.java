package com.company.Semester3.AbstrakteKlassen;

import java.util.Scanner;

public class Ausführen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casenummer = 0;
        double einscannen;
        int fertigeinscannen;
        boolean fertig = false;
        do {
                System.out.println("Was wollen sie umrechnen?\n" +
                        "1. Celcius in Fahrenheit\n" +
                        "2. Fahrenheit in Celcius\n" +
                        "3. Liter pro 100km in Miles pro Galleon\n" +
                        "4. Miles pro Galleon in Liter pro 100km\n" +
                        "5. Euro in Dollar \n" +
                        "6. Dollar in Euro \n" +
                        "7. Inch in Centimeter \n" +
                        "8. Centimeter in Inch");
                casenummer = scan.nextInt();
                switch (casenummer) {
                    case 1:
                        System.out.println("Celcius eingeben:");
                        einscannen = scan.nextDouble();
                        Celcius_Fahrenheit.ausgeben(new Celcius_Fahrenheit(), einscannen);
                        break;
                    case 2:
                        System.out.println("Fahrenheit eingeben:");
                        einscannen = scan.nextDouble();
                        Fahrenheit_Celcius.ausgeben(new Fahrenheit_Celcius(), einscannen);
                        break;
                    case 3:
                        System.out.println("Liter pro 100km eingeben:");
                        einscannen = scan.nextDouble();
                        LiterAuf100km_MPG.ausgeben(new LiterAuf100km_MPG(), einscannen);
                        break;
                    case 4:
                        System.out.println("Miles pro Galleon eingeben:");
                        einscannen = scan.nextDouble();
                        MPG_LiterAuf100km.ausgeben(new MPG_LiterAuf100km(), einscannen);
                        break;
                    case 5:
                        System.out.println("Euro eingeben:");
                        einscannen = scan.nextDouble();
                        Euro_Dollar.ausgeben(new Euro_Dollar(), einscannen);
                        break;
                    case 6:
                        System.out.println("Dollar eingeben:");
                        einscannen = scan.nextDouble();
                        Dollar_Euro.ausgeben(new Dollar_Euro(), einscannen);
                        break;
                    case 7:
                        System.out.println("Inch eingeben:");
                        einscannen = scan.nextDouble();
                        Inch_Centimeter.ausgeben(new Inch_Centimeter(), einscannen);
                        break;
                    case 8:
                        System.out.println("Centimeter eingeben:");
                        einscannen = scan.nextDouble();
                        Centimeter_Inch.ausgeben(new Centimeter_Inch(), einscannen);
                        break;
                }
                System.out.println("Sind sie fertig? 1 für ja, 2 für nein");
                fertigeinscannen = scan.nextInt();
                if (fertigeinscannen == 1){
                    fertig = true;
                    break;
                }
            }
        while (fertig == false);
        }
    }

