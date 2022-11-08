package com.company.Semester3.BeispielInterface.MatheFunktionen;

public class StartSinus {
    public static void main(String[] args) {
        Funktion sqrt = new QuadratFunktion();
        Kurvendiskussion sqrtkd = new Kurvendiskussion(sqrt);
        QuadratFunktion fkt = new QuadratFunktion();
        Kurvendiskussion kd = new Kurvendiskussion(fkt);
        System.out.println(sqrtkd.getMax(0, 5, 1000));
        System.out.println(sqrtkd.getMin(0, 5, 1000));
    }
}
