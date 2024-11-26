package JavaOOP.Haidar.PraktikumPemro.Soal1;

import java.util.Random;

public class Dadu {
    private int nilai;
    
    // constructor
    public Dadu () {
        this.acakNilai(); // memanggil method acak nilai saat objek dibuat
    }

    // method acak nilai random 
    public void acakNilai () {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1;
    }

    // getter untuk nilai
    public int getNilai () {
        return nilai;
    }

    // method untuk mendapatkan nilai dari object
    public String toString () {
        return " bernilai " + nilai;
    }
}