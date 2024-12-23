package JavaOOP.Haidar.PraktikumPemro.Modul5.Soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere (double r) {
        super("Sphere");
        radius = r;
    }

    public double area() {
        return 4 * Math.PI * (radius * radius);
    };

    // toString
    public String toString() {
        return super.toString() + " of radius " + radius;
    };
}
