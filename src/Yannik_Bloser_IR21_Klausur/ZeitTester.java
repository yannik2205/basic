package Yannik_Bloser_IR21_Klausur;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZeitTester {
    public static void main(String[] args) throws BrauchbareZeit, IOException {
        Zeit time = new Zeit (0,0);
        time.setStunde(15);
        time.setMinute(3);
        //System.out.println(time.getStunde() + " Uhr " + time.getMinute());

        Zeit Zeit1 = new Zeit(10,20);
        Zeit Zeit2 = new Zeit(12,40);
        int AusgabenArray[] = new int[2];
        AusgabenArray = Zeit1.getDifferenz(Zeit2);
        System.out.println(" Die Differenz beträgt: " + AusgabenArray[0] + " Stunden und " + AusgabenArray[1] + " Minuten! xD");


        PrintWriter pWriter = null;
        String s = "/Users/blose/Documents/newnew/src/Yannik_Bloser_IR21_Klausur/Bloser.txt";

        try {
            pWriter = new PrintWriter(new FileWriter(s));
            pWriter.println(" Die Differenz beträgt: " + AusgabenArray[0] + " Stunden und " + AusgabenArray[1] + " Minuten! xD");
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            if (pWriter != null){
                pWriter.flush();
                pWriter.close();
            }
        }


    }
}
