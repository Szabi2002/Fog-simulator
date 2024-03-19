package example;

public class Teglalap {
    private double a;
    private double b;

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = (double)a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = (double)b;
    }

    public Teglalap(double a, double b) {
        this.a = (double)a;
        this.b = (double)b;
    }

    public static void main(String[] args) {
        Teglalap teglalap = new Teglalap(5, 9);
        double kerulet = 2*teglalap.getA()+2*teglalap.getB();
        double terulet = teglalap.getA()*teglalap.getB();
        System.out.println(kerulet);
        System.out.println(terulet);
        System.out.println(teglalap.getA());
        System.out.println(teglalap.getB());
    }
}
