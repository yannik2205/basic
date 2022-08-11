package com.company.stuff.KlausurVorbereitung.CD_nochmal;

public class CD {
    private String Titel;
    private String Interpret;
    private double Rating;

    public CD(String Titel, String Interpret, double Rating) {
        this.Titel = Titel;
        this.Interpret = Interpret;
        this.Rating = Rating;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getInterpret() {
        return Interpret;
    }

    public void setInterpret(String interpret) {
        Interpret = interpret;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "CD{" +
                "Titel='" + Titel + '\'' +
                ", Interpret='" + Interpret + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
