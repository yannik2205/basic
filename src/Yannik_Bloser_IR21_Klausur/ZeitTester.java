package Yannik_Bloser_IR21_Klausur;

public class ZeitTester {
    public static void main(String[] args) throws BrauchbareZeit {
        Zeit time = new Zeit (0,0);
        time.setStunde(15);
        time.setMinute(3);
        System.out.println(time.getStunde() + " Uhr " + time.getMinute());
    }
}
