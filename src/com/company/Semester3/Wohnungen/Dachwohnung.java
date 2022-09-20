package com.company.Semester3.Wohnungen;

public class Dachwohnung extends Wohnung{
    private double flaecheSchraege;

    public Dachwohnung(double innen, double balkon, double PreisQ, double Schraeg) throws negativeMiete {
        super(innen, balkon, PreisQ);
        this.setFlaecheSchraege(Schraeg);
    }

    public Dachwohnung() throws negativeMiete {
        this(0.0,0.0,0.0,0.0);
    }

    public double getFlaecheSchraege() {
        return flaecheSchraege;
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
                + "\nInnenfläche: " + this.getflaechenInnen()
                + "davon: " + this.getFlaecheSchraege() + " unter Schrägen"
                + "\nBalkonfläche: " + this.getflaecheBalkon()
                + "\nGesamtfläche: " + this.getGesamt();
    }
}
