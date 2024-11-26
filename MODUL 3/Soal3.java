package JavaOOP.Haidar.PraktikumPemro.Soal3;

import java.util.Scanner;
import java.util.ArrayList;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaMahasiswa = new ArrayList<>();
        int pilihan;
        do {
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: "); 
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 0:
                    System.out.println("Terima Kasih!");
                    break;
            
                case 1: // Tambah Mahasiswa
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    mahasiswaMahasiswa.add(new Mahasiswa(nama, nim));

                    System.out.println("Mahasiswa \"" + nama + "\" ditambahkan");
                    break;
            
                case 2: // hapus mahasiswa berdasarkan NIM
                    if (mahasiswaMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada mahasiswa (kosong)");
                    } else {
                        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                        String nimYangDihapus = input.nextLine();
                        input.nextLine();
                        
                        for (int i = 0; i < mahasiswaMahasiswa.size(); i++) {
                            if (mahasiswaMahasiswa.get(i).getNim().equals(nimYangDihapus)) {
                                System.out.println("Mahasiswa dengan NIM " + nimYangDihapus + " dihapus");
                                mahasiswaMahasiswa.remove(i);
                                break;
                            }
                        }
                    }
                    break;
            
                case 3: // cari mahasiswa berdasarkan nim
                    if (mahasiswaMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada mahasiswa (kosong)");
                    } else {
                        System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                        String nimYangDicari = input.nextLine();
                        input.nextLine();

                        for (int i = 0; i < mahasiswaMahasiswa.size(); i++) {
                            if (mahasiswaMahasiswa.get(i).getNim().equals(nimYangDicari)) {
                                System.out.println("Mahasiswa dengan NIM " + nimYangDicari);
                                System.out.println(mahasiswaMahasiswa.get(i));
                            }
                        }
                    }
                    break;
            
                case 4: // menampilkan daftar mahasiswa
                    if (mahasiswaMahasiswa.isEmpty()) {
                        System.out.println("Daftar Mahasiswa Kosong");
                    } else {
                        System.out.println("\nDaftar Mahasiswa: ");
                        for (int i = 0; i < mahasiswaMahasiswa.size(); i++) {
                            System.out.println(mahasiswaMahasiswa.get(i));
                        }
                    }
                    break;
            
                default:
                    System.out.println("Pilihan Tidak Valid. Coba Lagi.");
            }
        } while (pilihan != 0);
    }
}
