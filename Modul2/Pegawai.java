// error seharusnya bernama Pegawai
// public class Employee
public class Pegawai {
    public String nama;
    // Pada baris ini seharusnya tipe data yang digunakan adalah String
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama () {
        return nama;
    }

    public String getAsal () {
        return asal;
    }

    // Pada baris ini terjadi error karena fungsi setter harus memiliki parameter
    // Parameter yang diperlukan yaitu String jabatan
    // public void setJabatan () {
    public void setJabatan (String j) {
        // Pada baris ini terjadi error karena pada fungsi setter belum memiliki parameter
        this.jabatan = j;
    }
}
