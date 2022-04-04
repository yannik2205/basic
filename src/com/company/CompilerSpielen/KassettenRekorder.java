package com.company.CompilerSpielen;
/*
Aufgabe: Code gegeb, der nicht ganz funktioniert. Zeilen hinzufügen, die den ode zum laufen bringen
*/

public class KassettenRekorder {
    boolean kannAufzeichnen = false;
    void kassetteAbspielen()
    {
        System.out.println("Spiele Kassette");
    }

    void kassetteAufzeichnen()
    {
        System.out.println("Zeichne Kassette auf");
    }
}
class KassettenRekorderTestlauf {
    public static void main(String[] args) {
        KassettenRekorder kr = new KassettenRekorder(); //hinzugefügt
        kr.kannAufzeichnen = true;
        kr.kassetteAbspielen();

        if (kr.kannAufzeichnen == true)
        {
            kr.kassetteAufzeichnen();
        }
    }
}