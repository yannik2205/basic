package Yannik_Bloser_IR21_Klausur;

public class Zeit {
    private int Stunde;
    private int Minute;
    public Zeit (int pStunde, int pMinute) throws BrauchbareZeit{
        this.Stunde = pStunde;
        this.Minute = pMinute;
    }

    public int getStunde() { return Stunde; }
    public void setStunde(int stunde) throws BrauchbareZeit{
        try {
            if (stunde >= 0) {
                if (stunde <= 24) {
                    this.Stunde = stunde;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getMinute() { return Minute; }
    public void setMinute(int minute) throws BrauchbareZeit{
        try {
            if (minute >= 0) {
                if (minute <= 60) {
                    Minute = minute;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }}


}
