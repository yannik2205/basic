package com.company.Semester3.AbstrakteKlassen;

public class Celcius_Fahrenheit extends Umrechnung{
    public Celcius_Fahrenheit(){
        super ("°C", "°F");
    }

    @Override
    public double rechneUm (double ein) { return (ein * 9/5) + 32;}
}
