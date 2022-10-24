package com.company.Semester3.AbstrakteKlassen;

public class Euro_Dollar extends Umrechnung{
    public Euro_Dollar(){super("€","$");}

    @Override
    public double rechneUm(double ein) {return ein / 1.02;}
}
