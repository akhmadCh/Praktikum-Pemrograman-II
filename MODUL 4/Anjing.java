package JavaOOP.Haidar.PraktikumPemro.Modul4.Soal2;

import JavaOOP.Haidar.PraktikumPemro.Modul4.Soal1.HewanPeliharaan;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String kemampuan;

    public Anjing (String n, String r, String wb, String k) {
        super(n, r);
        this.warnaBulu = wb;
        this.kemampuan = k;
    }

    public void displayDetailAnjing () {
        super.display();
        System.out.println("Memiliki Warna Bulu: " + warnaBulu);
        
        System.out.println("Kemampuan: " + kemampuan);
    }
}
