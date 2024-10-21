public class PRAK201_2310817110015_AkhmadChaidarAnanda {
    public static class Buah {
        String nama;
        double berat, harga, jumlahBeli;
        double diskon4kg;

        Buah (String namaBuah, double beratPerUnit, double hargaPerUnit, double jumlahBeliBuah) {
            this.nama = namaBuah;
            this.berat = beratPerUnit;
            this.harga = hargaPerUnit;
            this.jumlahBeli = jumlahBeliBuah;
            this.diskon4kg = jumlahBeliBuah / 4;
        }
        
        public double hitungHargaSebelumDiskon () {
            return (harga / berat) * jumlahBeli;
        }
        
        public double hitungDiskon () {
            return (Math.floor(diskon4kg) * 0.02 * harga * 4); 
        }

        public double hitungHargaSetelahDiskon () {
            return hitungHargaSebelumDiskon() - hitungDiskon();
        }

        public void info () {
            System.out.println("\n");
            System.out.println("Nama Buah: " + nama);
            System.out.println("Berat: " + berat);
            System.out.println("Harga: " + harga);
            System.out.println("Jumlah Beli: " + jumlahBeli);
            System.out.println("Harga Sebelum Diskon: " + hitungHargaSebelumDiskon());
            System.out.println("Total Diskon: " + hitungDiskon());
            System.out.println("Harga Setelah Diskon: " + hitungHargaSetelahDiskon());
        }
    }
    
    public static void main(String[] args) {

        Buah apel = new Buah("Apel", 0.4, 7000, 40);
        Buah mangga = new Buah("Mangga", 0.2, 3500, 15);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000, 12);

        apel.info();
        mangga.info();
        alpukat.info();

    }
}
