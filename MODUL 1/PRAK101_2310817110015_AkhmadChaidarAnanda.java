import java.util.Scanner;

public class PRAK101_2310817110015_AkhmadChaidarAnanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir= input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float beratBadan= input.nextFloat();

        String bulanLahirStr;
        switch (bulanLahir) {
            case 1 -> bulanLahirStr = "Januari";
            case 2 -> bulanLahirStr = "Februari";
            case 3 -> bulanLahirStr = "Maret";
            case 4 -> bulanLahirStr = "April";
            case 5 -> bulanLahirStr = "Mei";
            case 6 -> bulanLahirStr = "Juni";
            case 7 -> bulanLahirStr = "Juli";
            case 8 -> bulanLahirStr = "Agustus";
            case 9 -> bulanLahirStr = "September";
            case 10 -> bulanLahirStr = "Oktober";
            case 11 -> bulanLahirStr = "November";
            case 12 -> bulanLahirStr = "Desember";
            default -> {
                System.out.println("Tidak Ada");
                return;
            }
        }

        // Output
        System.out.println(
            "Nama Lengkap " + nama + ", " + "Lahir di " + tempatLahir + " pada Tanggal "
            + tanggalLahir + " " + bulanLahirStr + " " + tahunLahir + " Tinggi Badan " + tinggiBadan 
            + " cm dan Berat Badan " + beratBadan + " kilogram" 
        );

        input.close();
    }
}