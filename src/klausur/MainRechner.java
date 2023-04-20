package klausur;

public class MainRechner {
    private double zahl1;
    private double zahl2;

    public MainRechner(double pzahl1, double pzahl2) {
        this.zahl1 = pzahl1;
        this.zahl2 = pzahl2;
    }

    public double getzahl1() {
        return this.zahl1;
    }

    public double getzahl2() {
        return this.zahl2;
    }

    public void setzahl1(double pzahl1) {
        this.zahl1 = pzahl1;
    }

    public void setzahl2(double pzahl2) {
        this.zahl1 = pzahl2;
    }

    public double add() {
        return (this.zahl1 + this.zahl2);
    }

    public double modulo() {
        return (this.zahl1 % this.zahl2);
    }

    public double subtrahiere() {
        return (this.zahl1 - this.zahl2);
    }
}
