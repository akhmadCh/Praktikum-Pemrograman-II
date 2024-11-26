package JavaOOP.Haidar.PraktikumPemro.Soal2;

import java.util.HashMap;

public class Negara {
    private String namaNegara;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    // constructor untuk negara monarki
    public Negara (String namaNegara, String jenisKepemimpinan, String namaPemimpin) {
        this.namaNegara = namaNegara;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }
    
    // constructor untuk selain monarki
    public Negara (String namaNegara, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.namaNegara = namaNegara;   
        this.jenisKepemimpinan = jenisKepemimpinan;      
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;      
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
        
    }

    public HashMap<Integer, String> bulan = new HashMap<>(); {
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
    }

    public String getKepemimpinan () {
        return jenisKepemimpinan;
    }

    public String toString () {
        if (getKepemimpinan().equalsIgnoreCase("monarki")) {
            return "Negara " + namaNegara + " mempunyai Raja bernama " + namaPemimpin;
        } else {
            return "Negara " + namaNegara + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin + 
            "\nDeklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan; 
        }
    }
}
