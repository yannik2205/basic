package com.company.Theorie_verschiedenes.Arbeitsblätter;
// code gegeben mit Lücken, den man ausfüllen soll
public class Dreieck {
    double fläche;
    int höhe;
    int breite;

    public static void main(String[] args) {
        int x = 0;
        Dreieck[] dr = new Dreieck[4];
        while (x<4)
        {
            dr[x] = new Dreieck();
            dr[x].höhe = (x+1) *2;
            dr[x].breite = x+4;
            dr[x].setFläche();
            System.out.print("Dreieck "+x+", Fläche");
            System.out.println(" = " + dr[x].fläche);
            x = x+1;
        }
        int y = x;
        x = 27;
        Dreieck d5 = dr[2];
        dr[2].fläche = 343;
        System.out.print("y = " + y);
        System.out.println(", d5 Fläche = "+ d5.fläche);
    }

    void setFläche()
    {
        fläche = höhe * breite /2;
    }
}
