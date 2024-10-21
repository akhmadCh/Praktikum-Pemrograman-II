public class PRAK203_2310817110015_AkhmadChaidarAnanda {
    public static void main(String[] args) {
        
        Pegawai p1 = new Pegawai();
        // atribut nama kurang titik koma
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // solusi dari problem baris 15
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        // Pada baris ini output yang dihasilkan berupa nilai 0
        // artinya value dari atribut umur masih null, belum diisi
        // dan di dalam baris 18 harus menambahkan string "tahun"
        // System.out.println("Umur: " + p1.umur);   
        System.out.println("Umur: " + p1.umur + " tahun");

    }
}
