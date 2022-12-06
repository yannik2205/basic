package com.company.FehlerErkennung.QuadratKlasse;

public class Rechteck extends Quadrat {
    private int hoehe;

    Rechteck(int len, int hoehe) {
        super(len);
        this.hoehe = hoehe;
    }

    @Override
    public int getArea() {
        return len * hoehe;
    }
}
