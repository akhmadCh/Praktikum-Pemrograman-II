package JavaOOP.Haidar.PraktikumPemro.Soal1;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Dadu> daduLL = new LinkedList<>();
        int jumlahDadu;
        
        System.out.print("Masukkan banyaknya jumlah dadu: ");
        jumlahDadu = input.nextInt();

        // menambah nilai ke dalam Linked List Dadu
        for (int i = 0; i < jumlahDadu; i++) {
            daduLL.add(new Dadu());
        }
        
        int total = 0;
        for (int i = 0; i < daduLL.size(); i++) {
            Dadu dadu = daduLL.get(i); // Mengambil elemen berdasarkan indeks
            System.out.println("Dadu ke-" + (i+1) + dadu);
            
            total += dadu.getNilai();
            // setelah selesai akan menghapus data dari Linked List Dadu
            daduLL.remove(dadu);
        }
        System.out.println("Total nilai dadu keseluruhan " + total);

        input.close();
    }
}
