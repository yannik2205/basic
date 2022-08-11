package com.company.stuff.KlausurVorbereitung;

public class CD {
    private String Interpret;
    private String Titel;
    private int Rating;

    public CD(String Interpret, String Titel, int Rating)
    {
        this.Interpret = Interpret;
        this.Titel = Titel;
        this.Rating = Rating;
    }

    public String getInterpret() {return Interpret;}
    public void setInterpret(String interpret) {Interpret = interpret;}

    public String getTitel() {return Titel;}
    public void setTitel(String titel) {Titel = titel;}

    public int getRating() {return Rating;}
    public void setRating(int rating) {Rating = rating;}

    @Override
    public String toString() {
        return "CD{" +
                "Interpret='" + Interpret + '\'' +
                ", Titel='" + Titel + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
