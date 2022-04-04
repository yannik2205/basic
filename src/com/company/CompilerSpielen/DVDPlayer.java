package com.company.CompilerSpielen;
/*
Aufgabe: Code gegeb, der nicht ganz funktioniert. Zeilen hinzufügen, die den ode zum laufen bringen
*/
public class DVDPlayer {
    boolean kannAufzeichnen = false;

    void dvdaufzeichnen()
    {
        System.out.println("DVD aufzeichnen");
    }

    void dvdAbspielen()                      //hinzugefügt
    {                                        //hinzugefügt
        System.out.println("DVD abspielen"); //hinzugefügt
    }                                        //hinzugefügt
}
class DVDPlayerTestlauf{
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.dvdAbspielen();

        if (d.kannAufzeichnen == true)
        {
            d.dvdaufzeichnen();
        }
    }
}
