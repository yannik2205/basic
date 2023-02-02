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
        }
    }

    public int[] getDifferenz (Zeit pZeit2){
        int diffMinZeit1 = this.getMinute();
        int diffStdZeit1 = this.getStunde();
        int diffMinZeit2 = pZeit2.getMinute();
        int diffStdZeit2 = pZeit2.getStunde();
        int differenzMinutenArray[] = new int[2];

        if ((diffMinZeit1 + diffStdZeit1 * 60) >= (diffMinZeit2 + diffStdZeit2 * 60)){
            int differenzMinuten = (diffMinZeit1 + diffStdZeit1 * 60) - (diffMinZeit2 + diffStdZeit2 * 60);
            differenzMinutenArray[0] = differenzMinuten / 60;
            differenzMinutenArray[1] = differenzMinuten % 60;
        }
        else if ((diffMinZeit1 + diffStdZeit1 * 60) <= (diffMinZeit2 + diffStdZeit2 * 60)){
            int differenzMinuten = (diffMinZeit2 + diffStdZeit2 * 60) - (diffMinZeit1 + diffStdZeit1 * 60);
            differenzMinutenArray[0] = differenzMinuten / 60;
            differenzMinutenArray[1] = differenzMinuten % 60;
        }
        else if ((diffMinZeit1 + diffStdZeit1 * 60) == (diffMinZeit2 + diffStdZeit2 * 60)){
            int differenzMinuten = 0;
            differenzMinutenArray[0] = differenzMinuten / 60;
            differenzMinutenArray[1] = differenzMinuten % 60;
        }

        return differenzMinutenArray;
    }

}
