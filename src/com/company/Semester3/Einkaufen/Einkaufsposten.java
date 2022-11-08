package com.company.Semester3.Einkaufen;

public abstract class Einkaufsposten {
    private String bezeichnung;
    private long anzahl;
    private double nettoEinzelPreis;

    public Einkaufsposten (String bezeichnung, long anzahl, double nettoEinzelPreis)
    {
        this.bezeichnung = bezeichnung;
        this.anzahl = anzahl;
        this.nettoEinzelPreis = nettoEinzelPreis;
    }

    // getter Setter
    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public long getAnzahl() {
        return anzahl;
    }
    public void setAnzahl(long anzahl) {
        this.anzahl = anzahl;
    }

    public double getNettoEinzelPreis() {
        return nettoEinzelPreis;
    }
    public void setNettoEinzelPreis(double nettoEinzelPreis) {
        this.nettoEinzelPreis = nettoEinzelPreis;
    }
    //getter setter end

    public abstract double getBruttoEinzelPreis();
    public double getGesamtPreis()
    {
       return this.anzahl * getBruttoEinzelPreis();
    }

    @Override
    public String toString() {
        return "Einkaufsposten{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", anzahl=" + anzahl +
                ", nettoEinzelPreis=" + nettoEinzelPreis +
                '}';
    }
}
