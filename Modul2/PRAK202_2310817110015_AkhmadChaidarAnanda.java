public class PRAK202_2310817110015_AkhmadChaidarAnanda {
    public static class Kopi {
        String namaKopi;
        String ukuran;
        double harga;
        private String namaPembeli;

        public void setPembeli (String nama) {
            this.namaPembeli = nama;
        }

        public String getPembeli () {
            return namaPembeli;
        }

        public double getPajak () {
            return harga * 11 / 100; 
        }

        public void info () {
            System.out.println("Nama Kopi: " + namaKopi);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: " + harga);
        }
    }
    
    public static void main(String[] args) {
        
        Kopi kopi1 = new Kopi();
        kopi1.namaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.harga = 25000;

        kopi1.info();
        kopi1.setPembeli("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
        System.out.println("Pajak Kopi: " + kopi1.getPajak());

    }
}