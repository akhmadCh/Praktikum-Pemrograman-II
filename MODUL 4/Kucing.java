package JavaOOP.Haidar.PraktikumPemro.Modul4.Soal2;

import JavaOOP.Haidar.PraktikumPemro.Modul4.Soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing (String n, String r, String wb) {
        super(n, r);
        this.warnaBulu = wb;
    }

    public void displayDetailKucing () {
        super.display();
        System.out.println("Memiliki Warna Bulu: " + warnaBulu);
    }
}
