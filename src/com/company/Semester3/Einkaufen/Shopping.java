package com.company.Semester3.Einkaufen;

public class Shopping {

    public static void main(String[] args) {
        Einkaufsposten[] liste = new Einkaufsposten[5];
        liste[0] = new Obst("Mango", 1, 2.49);
        liste[1] = new Obst("Gurke", 3, 0.99);
        liste[2] = new Obst("Pilz", 9, 0.49);
        liste[3] = new Getraenkedose("Monster", 2, 1.69);
        liste[4] = new Getraenkedose("RedBull", 1, 1.99);

        for (int i=0; i< liste.length;i++)
        {
            System.out.println("Produkt " + i);
            System.out.println("Wat: " + liste[i].getBezeichnung() +
                              "\nWie oft: " + liste[i].getAnzahl() +
                              "\nGesamtPreis: " + liste[i].getGesamtPreis() +"\n");
        }
    }
}
