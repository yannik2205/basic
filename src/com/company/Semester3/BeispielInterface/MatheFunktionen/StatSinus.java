package com.company.Semester3.BeispielInterface.MatheFunktionen;

public class StatSinus {
    public static void main(String[] args) {
        Funktion fkt = new SinusFunktion();
        Kurvendiskussion kd = new Kurvendiskussion(fkt);
        System.out.println(kd.getMax(0, 5, 100));
    }
}
