package com.company.Semester3.Wohnungen;

public class Wohnung {
    private double flaechenInnen;
    private double flaecheBalkon;
    private double MPQ;

    public Wohnung (double innen, double balkon, double PreisQ) throws negativeMiete {
        this.setflaechenInnen(innen);
        this.setflaecheBalkon(balkon);
        this.setMPQ(PreisQ);
    }
    public Wohnung() throws  negativeMiete {
        this(100.00,10.0,5.99);
    }

    public double getflaechenInnen() {
        return flaechenInnen;
    }

    public void setflaechenInnen(double flaechenInnen){
        if (flaechenInnen < 0)
        {
            throw new IllegalArgumentException();
        }
        this.flaechenInnen = flaechenInnen;
    }

    public double getflaecheBalkon() {
        return flaecheBalkon;
    }

    public void setflaecheBalkon(double flaecheBalkon) {
        if (flaecheBalkon < 0)
        {
            throw new IllegalArgumentException();
        }
        this.flaecheBalkon = flaecheBalkon;
    }

    public double getGesamt(){
        return this.getflaechenInnen() + this.getflaechenInnen() / 2;
    }

    public double getMPQ() {
        return MPQ;
    }

    public void setMPQ(double MPQ) throws negativeMiete {
        if (MPQ < 0)
        {
            throw new negativeMiete();
        }
        this.MPQ = MPQ;
    }

    public double getGesmatMiete(){
        return this.getGesamt() * this.getMPQ();
    }

    @Override
    public String toString() {
        return "Eine Wohnung mit \nInnenfläche: " + this.getflaechenInnen()
                + "\nBalkonfäche: " + this.getflaecheBalkon()
                + "\nGesamtfläche: " + this.getGesamt();
    }

}
class negativeMiete extends Exception{}

