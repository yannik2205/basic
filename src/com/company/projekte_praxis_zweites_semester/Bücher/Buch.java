package com.company.projekte_praxis_zweites_semester.Bücher;

public class Buch {
    Buchverwaltung verwaltung = new Buchverwaltung();
    private int Inventarnummer;
    private String Titel;
    private double Nettopreis;
    private static double MehrWSPS;
    private int Stückzahl;
    private double Mehrwertsteuerfürbrutto;

    public Buch (int Inventarnummer, String Titel, double Nettopreis, int Stückzahl)
    {
        getMehrwertsteuerfürbrutto();
        this.Inventarnummer = Inventarnummer;
        this.Titel = Titel;
        this.Nettopreis = Nettopreis;
        this.Stückzahl = Stückzahl;
    }

    private double getMehrwertsteuerfürbrutto() {return Mehrwertsteuerfürbrutto;}


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

    public void setMehrwertsteuerfürbrutto(double mehrwertsteuerfürbrutto) {
        this.Mehrwertsteuerfürbrutto = mehrwertsteuerfürbrutto;
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

    @Override
    public String toString() {
        return "Buch\n" +
                "Inventarnummer=" + Inventarnummer +
                ", Titel='" + Titel + '\'' +
                ", Nettopreis=" + Nettopreis +
                ", Stückzahl=" + Stückzahl +
                ", Bruttopreis=" + String.format("%.2f",Nettopreis*(1+Mehrwertsteuerfürbrutto));
    }
}
