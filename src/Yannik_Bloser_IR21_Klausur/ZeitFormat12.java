package Yannik_Bloser_IR21_Klausur;

public class ZeitFormat12 extends ZeitFormat{

    public ZeitFormat12(int pStunde, int pMinute) throws BrauchbareZeit {
        super(pStunde, pMinute);
    }

    @Override
    public void ausgabe() {
        String AMPM = "AM";
        int Stundetemp = getStunde();
        if (Stundetemp >=12){
            Stundetemp = Stundetemp -12;
            AMPM = "PM";
        }
        if (Stundetemp < 10) {
            if (getMinute() < 10) {
                System.out.println("Uhrzeit: 0" + Stundetemp + ":" + "0" + getMinute() + " " + AMPM);
            } else {
                System.out.println("Uhrzeit: 0" + Stundetemp + ":" + getMinute() + " " + AMPM);
            }
        }
        else {
            System.out.println("Uhrzeit: " + Stundetemp + ":" + getMinute() + " " + AMPM);
        }
    }
}
