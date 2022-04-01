package com.company.nameBubble;

import com.company.nameBubble.*;

import java.util.Date;

public class Studenttest {
    public static void main(String[] args) {
        int anzahl = 5;
        Student[] klasse = new Student[anzahl];

        klasse [0] = new Student
                ("Felix", new Date(1977-1900,11-1,17), "Drogenhandel");
        klasse[1] = new Student
                ("Furkan", new Date(2003-1900,5-1,3),"AuftragsTürke");
        klasse[2] = new Student
                ("Maksim", new Date(2001-1900, 7-1,17 ), "Prostitution");
        klasse[3] = new Student
                ("Ivan", new Date(2004-1990,11-1,15),"Verkauf des Gewichtes seiner Schwester");
        klasse[4] = new Student
                ("Bruno", new Date(2004-1900,11-1,23), "Kameramann");

        for (int i = 0; i < klasse.length;i++)
        {
            System.out.println(klasse[i].getName());
        }
        System.out.println("\n + \n");
        Student temp[] = new Student[1];
        temp[0] = new Student
                ("temp", new Date(2000-1900, 11-1, 23),"temp");
        for (int j = 0; j< klasse.length-1;j++)
        {
            for (int i = j+1;i< klasse.length;i++)
            {
                if (klasse[j].getName().compareTo(klasse[i].getName()) > 0)
                {
                  temp[0] = klasse[j];
                  klasse[j] = klasse[i];
                  klasse[i] = temp[0];

                }
            }

        }

        for(int i = 0; i < klasse.length; i++){
            System.out.println("\n"+klasse[i].getName() + "\n"+ klasse[i].getGebdatum() + "\n" +
                    klasse[i].getEinkommen());
        }
    }
}
