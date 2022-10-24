package com.company.Semester3.AbstrakteKlassen;

public class MPG_LiterAuf100km extends Umrechnung{
    public MPG_LiterAuf100km(){super("mpg","1/100km");}

    public double rechneUm (double ein) {return 235.2 / ein;}
}
