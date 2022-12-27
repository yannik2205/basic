package com.company.Vererbung;

public class GirokontoTest {
    public static void main(String[] args) {
        Girokonto gk = new Girokonto("0000000001", 1000.00, 1000.0);
        gk.auszahlen(1100.00);
        System.out.println("Kontostand: " + gk.getKontostand());
        gk.einzahlen(1100.00);
        gk.auszahlen(11001.0);
    }
}
