package JavaOOP.Haidar.PraktikumPemro.Soal3;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa (String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama () {
        return nama;
    }
    public String getNim () {
        return nim;
    }

    public String toString () {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
