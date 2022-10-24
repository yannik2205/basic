package com.company.Semester3.AbstrakteKlassen;

public class Inch_Centimeter extends Umrechnung{
    public Inch_Centimeter(){super("i","cm");}

    public double rechneUm (double ein) {return ein * 2.54;}
}
