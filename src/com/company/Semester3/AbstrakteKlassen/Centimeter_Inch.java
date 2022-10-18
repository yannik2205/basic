package com.company.Semester3.AbstrakteKlassen;

public class Centimeter_Inch extends Umrechnung{
    public Centimeter_Inch() {super("cm", "i");}

    public double rechneUm(double ein) {return ein / 2.54;}
}
