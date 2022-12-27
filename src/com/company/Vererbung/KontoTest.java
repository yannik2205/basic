package com.company.Vererbung;

public class KontoTest {
    public static void main(String[] args) {
        Konto Konto1 = new Konto("0000000001", 1000.00);
        System.out.println(Konto1.getKontonummer() + "\n" + Konto1.getKontostand());
        Konto1.einzahlen(500.00);
        System.out.println(Konto1.getKontostand());
        Konto1.auszahlen(750.00);
        System.out.println(Konto1.getKontostand());
    }
}
