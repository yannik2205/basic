package com.company.Semester3.Einkaufen;

public class Getraenkedose extends Einkaufsposten{

    public Getraenkedose(String bezeichnung, long anzahl, double nettoEinzelPreis) {
        super(bezeichnung, anzahl, nettoEinzelPreis);
    }

    public double getBruttoEinzelPreis() {
        return getNettoEinzelPreis() * 1.19 + 0.25;
    }
}
