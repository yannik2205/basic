package com.company.Semester3.AbstrakteKlassen;

public abstract class Umrechnung extends Object{
    private String einheitVon;
    private String einheitNach;

    public Umrechnung (String von, String nach)
    {
        this.einheitVon = von;
        this.einheitNach = nach;
    }
    public String getEinheitVon() {
        return einheitVon;
    }
    public String getEinheitNach() {
        return einheitNach;
    }
    public abstract double rechneUm (double ein);
    public String rechneUmFormatiert (double ein){
        return this.rechneUm(ein) + "" + this.getEinheitNach();
    }

    public static void ausgeben (Umrechnung u, double wert) {
        String s = wert + "" + u.getEinheitVon();
            s = s + " sind " + u.rechneUmFormatiert(wert);
            System.out.println(s);
    }
}

