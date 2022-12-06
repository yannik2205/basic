package com.company.FehlerErkennung.QuadratKlasse;

public class Quadrat {
    protected int len; //Seitenlaenge

    Quadrat(int len) {
        this.len = len;
    }

    public int getArea() {
        return len * len;
    }
}
