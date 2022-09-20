package com.company.Semester3.probeklausur;

public class Test{
    public static void main(String[] args) {
        Bruch bruch = new Bruch();
        bruch.setZähler(2);
        try {
            bruch.setNenner(3);
        } catch (NennerIstNullException e) {
            System.out.println("Nenner darf nicht null sein");
        }
        System.out.println(bruch.toDouble());
    }
}
