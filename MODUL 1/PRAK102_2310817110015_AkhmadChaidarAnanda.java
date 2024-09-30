import java.util.Scanner;

public class PRAK102_2310817110015_AkhmadChaidarAnanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, N;
        N = input.nextInt();

        while (i <= 11) {
            if (N % 5 == 0 && i == 11) {
                System.out.print((N / 5) - 1);
            } else if (i == 11) {
                System.out.print(N);
            } else if (N % 5 != 0) {
                System.out.print(N + ", ");
            } else {
                System.out.print((N / 5) - 1 + ", ");
            }
            N++;
            i++;
        }

        input.close();
    }
}