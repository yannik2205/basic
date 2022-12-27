package com.company.Vererbung;

public class Konto {
    private String Kontonummer;
    private double Kontostand;
    public Konto(String pKontonummer, double pKontostand){
        this.Kontonummer = pKontonummer;
        this.Kontostand = pKontostand;
    }
    //getter methods
    public String getKontonummer() {return Kontonummer;}
    public double getKontostand()  {return Kontostand;}
    public void setKontonummer(String kontonummer) {Kontonummer = kontonummer;}
    public void setKontostand(double kontostand) {Kontostand = kontostand;}

    public void einzahlen(double Erhöhung){
        double tempKontostand = getKontostand() + Erhöhung;
        setKontostand(tempKontostand);
    }
    public void auszahlen( double Auszahlungssumme){
        double tempKontostand = getKontostand() - Auszahlungssumme;
        setKontostand(tempKontostand);
    }
}
