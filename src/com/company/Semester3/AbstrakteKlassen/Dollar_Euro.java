package com.company.Semester3.AbstrakteKlassen;

public class Dollar_Euro extends Umrechnung{
    public Dollar_Euro(){super("$","€");}

    @Override
    public double rechneUm(double ein) {return ein * 1.02;}
}
