package com.company.KlausurVorbereitung;

public class Wohnung implements Vermietung{
    private double flaecheInnen;
    private double flaecheBalkon;
    private double mieteProQm;

    public Wohnung(double innen, double balkon) {
        this.setFlaecheInnen(innen);
        this.setFlaecheBalkon(balkon);
    }

    public Wohnung() {
        this(100.0, 10.0);
    }

    public double getFlaecheInnen() {
        return this.flaecheInnen;
    }

    public void setFlaecheInnen(double innen) {
        this.flaecheInnen = innen;
    }

    public double getFlaecheBalkon() {
        return this.flaecheBalkon;
    }

    public void setFlaecheBalkon(double balkon) {
        this.flaecheBalkon = balkon;
    }

    public double getGesamt() {
        return this.getFlaecheInnen() + this.getFlaecheBalkon() / 2;
    }

    @Override
    public String toString() {
        return "Eine Wohnung mit\nInnenflaeche: " + this.getFlaecheInnen()
                + "\nBalkonflaeche: " + this.getFlaecheBalkon()
                + "\nGesamtflaeche: " + this.getGesamt();
    }

    @Override
    public double getMiete() {
        double gesamtmiete;
        gesamtmiete = this.getGesamt() * this.mieteProQm;
        return gesamtmiete;
    }
}
