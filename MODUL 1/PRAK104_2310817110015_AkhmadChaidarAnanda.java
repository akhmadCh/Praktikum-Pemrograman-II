import java.util.Scanner;

public class PRAK104_2310817110015_AkhmadChaidarAnanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String tanganBagas = input.nextLine();

        // input menjadi array
        String[] pilihanAbu = tanganAbu.split(" ");
        String[] pilihanBagas = tanganBagas.split(" ");

        int skorAbu = 0, skorBagas = 0;

        for (int i = 0; i < 3; i++) {
            String abu = pilihanAbu[i];
            String bagas = pilihanBagas[i];

            if (abu.equals(bagas)) {
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                       (abu.equals("G") && bagas.equals("K")) ||
                       (abu.equals("K") && bagas.equals("B"))) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
