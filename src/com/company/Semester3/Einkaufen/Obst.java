package com.company.Semester3.Einkaufen;

public class Obst extends Einkaufsposten{
    public Obst(String bezeichnung, long anzahl, double nettoEinzelPreis) {
        super(bezeichnung, anzahl, nettoEinzelPreis);
    }

    public double getBruttoEinzelPreis() {
        return getNettoEinzelPreis() * 1.07;
    }
}
