import java.util.Scanner;

public class PRAK103_2310817110015_AkhmadChaidarAnanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int N = input.nextInt();
        int bilAwal = input.nextInt();

        do {
            if (bilAwal % 2 != 0) { // bilAwal ganjil
                if (i != N) {
                    System.out.print(bilAwal + ", ");
                    i++;
                } else {
                    ++i;
                    System.out.print(bilAwal);
                }
                
                // System.out.print(bilAwal + ", ");
                // i++;
            } else { // bilAwal genap
                if (i != N) {
                    System.out.print(bilAwal + 1 + ", ");
                    i++;
                } else {
                    ++i;
                    System.out.print(bilAwal + 1);
                }
            }
            bilAwal += 2;
        } while (i <= N);

        input.close();
    }
}