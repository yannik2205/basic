package com.company.Semester3.BeispielInterface.MatheFunktionen;

public class Kurvendiskussion {
    private Funktion fkt;
    public Kurvendiskussion(Funktion fkt){
        this.fkt = fkt;
    }
    public double getMax(double a, double b, int anz) {
        double h = (b-a) / anz;
        double max = this.fkt.fktWert(a);
        for (int i = 1; i <= anz ; i++) {
            double y = this.fkt.fktWert(a +i * h);
            if (y > max) {
                max = y;
            }
        }
        return max;
    }
}