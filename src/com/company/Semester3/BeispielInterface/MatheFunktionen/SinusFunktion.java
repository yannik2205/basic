package com.company.Semester3.BeispielInterface.MatheFunktionen;

public class SinusFunktion implements Funktion{
    @Override
    public double fktWert(double x) {
        return Math.sin(x);
    }
}
