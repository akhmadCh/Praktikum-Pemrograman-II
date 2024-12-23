package JavaOOP.Haidar.PraktikumPemro.Modul5.Soal1;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        // Instantiate the three shapes to paint
        Rectangle deck = new Rectangle(20, 30);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        double deckAmt, bigBallAmt, tankAmt;
        
        // Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        bigBallAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        // Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(bigBallAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
        
    }
}
