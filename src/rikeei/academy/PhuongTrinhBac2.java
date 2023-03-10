package rikeei.academy;

public class PhuongTrinhBac2 {
    double a, b, c;

    public PhuongTrinhBac2() {

    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }

    public double getR1() {
        return (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
    }
    public double getR2() {
        return (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
    }
    public  String display(){
        return "Phương trình "+a+"x2"+b+"x"+c+"=0 có nghiệm là:"+getR1()+"\n"+getR1();
    }
}
