package JavaOOP.Haidar.PraktikumPemro.Modul5.Soal1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    };

    // toString
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    };
}
