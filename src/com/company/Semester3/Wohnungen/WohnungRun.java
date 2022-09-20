package com.company.Semester3.Wohnungen;

public class WohnungRun {
    public static void main(String[] args){
        try {
            Wohnung home = new Wohnung(100.00,10.00,9.99);
            Dachwohnung dach = new Dachwohnung(100.00,100.00,9.99,2);
            System.out.println(home);
            System.out.println(dach);
        } catch (negativeMiete e) {
            System.out.println("Hast was falsch gemacht");
        }

        boolean legal = true;

    }
}
