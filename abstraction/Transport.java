package abstraction;

// Kelas abstrak
abstract class Kendaraan {
    String nama;

    // Constructor
    Kendaraan(String nama) {
        this.nama = nama;
    }

    // Metode abstrak: harus diimplementasi di subclass
    abstract void berjalan();

    // Metode biasa
    void info() {
        System.out.println("Nama Kendaraan: " + nama);
    }
}

// Subclass: Mobil
class Mobil extends Kendaraan {
    Mobil(String nama) {
        super(nama);
    }

    // Implementasi metode abstrak
    void berjalan() {
        System.out.println(nama + " berjalan di jalan raya dengan empat roda.");
    }
}

// Subclass: Sepeda
class Sepeda extends Kendaraan {
    Sepeda(String nama) {
        super(nama);
    }

    // Implementasi metode abstrak
    void berjalan() {
        System.out.println(nama + " dikayuh oleh manusia di jalur sepeda.");
    }
}

// Main class
public class Transport {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Avanza");
        Kendaraan k2 = new Sepeda("Polygon");

        k1.info();
        k1.berjalan();

        System.out.println();

        k2.info();
        k2.berjalan();
    }
}
