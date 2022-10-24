package com.company.Semester3.AbstrakteKlassen;

public class Fahrenheit_Celcius extends Umrechnung {
    public Fahrenheit_Celcius() {
        super("°F", "°C");
    }

    @Override
    public double rechneUm(double ein) {
        return (ein - 32) * 5 / 9;
    }
}
