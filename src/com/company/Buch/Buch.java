package com.company.Buch;

public class Buch {
    private int Inventarnummer;
    private String Titel;
    private double Nettopreis;
    private static double MehrWSPS;
    private int Stückzahl;

    public Buch (int Inventarnummer, String Titel, double Nettopreis, int Stückzahl)
    {
        this.Inventarnummer = Inventarnummer;
        this.Titel = Titel;
        this.Nettopreis = Nettopreis;
        this.Stückzahl = Stückzahl;
    }

    public void setInventarnummer(int inventarnummer) {
        Inventarnummer = inventarnummer;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public void setNettopreis(double nettopreis) {
        Nettopreis = nettopreis;
    }

    public static void setMehrWSPS(double mehrWSPS) {
        MehrWSPS = mehrWSPS;
    }

    public void setStückzahl(int stückzahl) {
        Stückzahl = stückzahl;
    }

    public int getInventarnummer() {
        return Inventarnummer;
    }
    public String getTitel() {
        return Titel;
    }
    public double getNettopreis() {
        return Nettopreis;
    }
    public static double getMehrWSPS() {
        return MehrWSPS;
    }
    public int getStückzahl() {
        return Stückzahl;
    }
}
