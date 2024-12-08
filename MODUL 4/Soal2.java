package JavaOOP.Haidar.PraktikumPemro.Modul4.Soal2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing\n2. Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            // Kucing
            System.out.print("Masukkan hewan peliharaan: ");
            String n = input.nextLine().trim();
            input.nextLine();
            System.out.print("Ras: ");
            String r = input.nextLine().trim();
            System.out.print("Warna Bulu: ");
            String wb = input.nextLine().trim();

            Kucing kucing = new Kucing(n, r, wb);
            System.out.println();
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            // Anjing
            System.out.print("Masukkan hewan peliharaan: ");
            String n = input.nextLine().trim();
            input.nextLine();
            System.out.print("Ras: ");
            String r = input.nextLine().trim();
            System.out.print("Warna Bulu: ");
            String wb = input.nextLine().trim();
            System.out.print("Kemampuan: ");
            String k = input.nextLine().trim();

            String output = k.replaceAll("\\s*,\\s*", "  ");

            Anjing anjing = new Anjing(n, r, wb, output);
            System.out.println();
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak tersedia... Coba lagi!");
        }
        input.close();
    }
}
