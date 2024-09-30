import java.util.Scanner;

public class PRAK105_2310817110015_AkhmadChaidarAnanda {
    public class Global {
        final public static double PHI = 3.14; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari, tinggi, hasil;
        
        System.out.print("Masukkan jari-jari: ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        
        hasil = volumeTabung(jariJari, tinggi);

        System.out.printf(
            "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", 
            jariJari, tinggi, hasil
        );

        input.close();
    }   

    static double volumeTabung (double r, double t) {
        return (Global.PHI * r * r) * t;
    }
}