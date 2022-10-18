package com.company.Semester3.AbstrakteKlassen;

public class LiterAuf100km_MPG extends Umrechnung {
    public LiterAuf100km_MPG() {
        super("1/100km", "mpg");
    }

    public double rechneUm(double ein) {
        return 235.2 / ein;
    }
}
