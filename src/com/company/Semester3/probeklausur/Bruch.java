package com.company.Semester3.probeklausur;

public class Bruch {
    private int zähler;
    private int nenner;

    public void setZähler(int zähler) {
        this.zähler = zähler;
    }

    public void setNenner(int nenner) throws NennerIstNullException{
        if (nenner == 0)
        {
            throw new NennerIstNullException();
        }
        this.nenner = nenner;
    }
    public double toDouble()
    {
        return zähler / nenner;
    }
}
class NennerIstNullException extends Exception{}

