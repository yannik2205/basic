package com.company.KlausurVorbereitung;

public class Dachwohnung extends Wohnung {
    private double flaecheSchraege;

    public Dachwohnung(double innen, double balkon, double Schraeg)  {
        super(innen, balkon);
        this.setFlaecheSchraege(Schraeg);
    }

    public Dachwohnung()  {
        this(0.0,0.0,0.0);
    }

    public double getFlaecheSchraege() {
        return flaecheSchraege;
    }

    @Override
    public double getFlaecheInnen() {
        return super.getFlaecheInnen();
    }
    @Override
    public double getFlaecheBalkon() {
        return super.getFlaecheBalkon();
    }

    public void setFlaecheSchraege(double flaecheSchraege) {
        this.flaecheSchraege = flaecheSchraege;
    }
    public double getGesamt(){
        return super.getGesamt() - this.getFlaecheSchraege() / 2;
    }

    @Override
    public String toString() {
        return "Eine Dachwohnung mit"
                + "\nInnenfläche: " + this.getFlaecheInnen()
                + "davon: " + this.getFlaecheSchraege() + " unter Schrägen"
                + "\nBalkonfläche: " + this.getFlaecheBalkon()
                + "\nGesamtfläche: " + this.getGesamt();
    }

}
