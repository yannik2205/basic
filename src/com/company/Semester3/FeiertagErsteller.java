package com.company.Semester3;


import java.sql.SQLOutput;
import java.util.Scanner;
public class FeiertagErsteller {
    public static void main(String[] args) {
        Feiertag Feier[] = new Feiertag[2];
        Scanner scan = new Scanner (System.in);
        int counter = 0;
        loop:for (int i = 0; i<2; i++)
        {
            System.out.println("Name:");
            String NameScan = scan.nextLine();
            System.out.println("Tag:");
            int TagScan = scan.nextInt();
            System.out.println("Monat:");
            String MonatScan = scan.nextLine();
                   MonatScan = scan.nextLine();
            Feier[i] = new Feiertag(NameScan, TagScan, MonatScan);
            counter++;
            String ja = "ja";
            System.out.println("Wenn sie fertig sind geben sie -ja- ein");
            String fertig = scan.nextLine();
            //scan.nextLine();
            if (fertig.equals(ja))
            {
                break loop;
            }
        }
        for (int j = 0; j < counter;j++)
        {
            System.out.println(Feier[j]);
        }
        String Monat1 = Feier[0].getMonat();
        String Monat2 = Feier[1].getMonat();
        int tag1 = Feier[0].getTag();
        int tag2 = Feier[1].getTag();
        System.out.println(GleicherMonat(Monat1, Monat2));
        System.out.println(drtTag(tag1, tag2));
    }
    public static boolean GleicherMonat(String Monat1, String Monat2)
    {
        System.out.println("Gleicher Monat?:");
        if (Monat1.equals(Monat2)){
            return true;
        }
        else{

            return false;
        }
    }
    public static double drtTag(double tag1, double tag2)
    {
        System.out.println("Durchschnittstaag:");
        double durchschnitt = (tag1 + tag2) /2;
        return durchschnitt;
    }
}
