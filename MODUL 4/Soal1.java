package JavaOOP.Haidar.PraktikumPemro.Modul4.Soal1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String n = input.nextLine();
        System.out.print("Ras: ");
        String r = input.nextLine();

        HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(n, r);
        System.out.println();
        hewanPeliharaan.display();

        input.close();
    }
}
