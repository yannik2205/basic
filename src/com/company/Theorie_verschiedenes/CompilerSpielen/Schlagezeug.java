package com.company.Theorie_verschiedenes.CompilerSpielen;

public class Schlagezeug {
    boolean tomTom = true;
    boolean snare = true;

    void spieleSnare()
    {
        System.out.println("pamm pamm pa-pamm");
    }

    void spieleTomTom()
    {
        System.out.println("dumm dumm du-dumm");
    }
}
class SchlagezeugTestlauf {
    public static void main(String[] args) {
        Schlagezeug s = new Schlagezeug();
        s.snare = false;
        if (s.snare == true)
        {
            s.spieleSnare();
        }
        s.spieleSnare();
        s.spieleTomTom();
    }
}

