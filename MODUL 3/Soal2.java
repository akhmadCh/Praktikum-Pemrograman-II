package JavaOOP.Haidar.PraktikumPemro.Soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> negaraLL = new LinkedList<>();
    
        int banyakNegara = Integer.parseInt(input.nextLine().trim());
        
        // input data negara dari user
        for (int i = 0; i < banyakNegara; i++) {
            String namaNegara = input.nextLine().trim();
            
            // ada kondisi jika monarki
            // jika monarki, tidak perlu input tanggal, bulan, dan tahun kemerdekaan
            String jenisKepemimpinan = input.nextLine().trim();

            String namaPemimpin = input.nextLine().trim();
            
            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                // Negara dengan jenis kepemimpinan monarki
                negaraLL.add(new Negara(namaNegara, jenisKepemimpinan, namaPemimpin));
            } else {
                // Negara dengan jenis kepemimpinan selain monarki   
                int tanggalKemerdekaan = Integer.parseInt(input.nextLine().trim());
                
                int bulanKemerdekaan = Integer.parseInt(input.nextLine().trim());
                
                int tahunKemerdekaan = Integer.parseInt(input.nextLine().trim());
                
                // constructor selain negara monarki
                negaraLL.add(new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
            }
        }

        // output data negara
        System.out.println();
        for (int j = 0; j < negaraLL.size(); j++) {
            Negara negara = negaraLL.get(j);
            System.out.println(negara);
            System.out.println();
        }

    }
}
