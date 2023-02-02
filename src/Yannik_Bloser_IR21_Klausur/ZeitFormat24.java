package Yannik_Bloser_IR21_Klausur;

public class ZeitFormat24 extends ZeitFormat {
    public ZeitFormat24(int pStunde, int pMinute) throws BrauchbareZeit {
        super(pStunde, pMinute);
    }

    @Override
    public void ausgabe() {
        if (getStunde() < 10) {
            if (getMinute() < 10) {
                System.out.println("Uhrzeit: 0" + getStunde() + ":" + "0" + getMinute());
            } else {
                System.out.println("Uhrzeit: 0" + getStunde() + ":" + getMinute());
            }
        }
        else {
            System.out.println("Uhrzeit: " + getStunde() + ":" + getMinute());
        }
    }
}
