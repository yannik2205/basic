package klausur;

public class MainRechnerTest {
    public static void main(String[] args) {
        double zahl1 = 2.3;
        double zahl2 = 1.2;
        MainRechner mr = new MainRechner(zahl1, zahl2);
        System.out.println(mr.add());
        System.out.println(mr.modulo());
        System.out.println(mr.subtrahiere());
    }
}