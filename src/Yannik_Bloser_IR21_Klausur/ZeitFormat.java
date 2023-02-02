package Yannik_Bloser_IR21_Klausur;

public abstract class ZeitFormat extends Zeit {
    public ZeitFormat(int pStunde, int pMinute) throws BrauchbareZeit {
        super(pStunde, pMinute);
    }
    public abstract void ausgabe();
}
