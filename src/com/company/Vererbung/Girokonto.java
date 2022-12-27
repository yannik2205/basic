package com.company.Vererbung;

public class Girokonto extends Konto{
    double limit;
    public Girokonto(String pKontonummer, double pKontostand, double pLimit) {
        super(pKontonummer, pKontostand);
        this.limit = pLimit;
    }
    double getLimit(){return limit;}
    void setLimit(double l){limit = l;}


    public void auszahlen(double Auszahlungssumme) {
        if ((getKontostand() - Auszahlungssumme) <= getLimit()){
            setKontostand(getKontostand() -Auszahlungssumme);
        }
    }
}
