package Yannik_Bloser_IR21_Klausur;

public class ZeitFormatTest {
    public static void main(String[] args) throws BrauchbareZeit {

        ZeitFormat[] time = new ZeitFormat[6];



        time[0] = new ZeitFormat12(1,0);
        time[1] = new ZeitFormat12(8,10);
        time[2] = new ZeitFormat12(14,20);
        time[3] = new ZeitFormat24(4,30);
        time[4] = new ZeitFormat24(14,40);
        time[5] = new ZeitFormat24(18,50);

        for (int i = 0; i<time.length; i++){
            time[i].ausgabe();
        }
    }
}
//Bewertung
//Aufgabe 1:
//Klasse Zeit                   10/10
//Getter                         5/5
//Setter                        15/15
//
//Aufgabe 2:
//Klasse ZeitFormat              5/5
//abstrakte Methode              5/5
//
//Aufgabe 3:
//Klasse ZeitFormat12           10/10
//mit ausgabe()                 10/10
//Klasse ZeitFormat24           10/10
//mit ausgabe()                 10/10
//
//Aufgabe 4:
//Testklasse mit main()          4/4
//mit 3 Objekten ZeitFormat12
//und Funktionsaufruf            8/8
//mit 3 Objekten ZeitFormat24
//und Funktionsaufruf            8/8
//Gesamt                       100/100
