package abstraction;

// Abstract class
abstract class Kendaraan {
    String nama;

    Kendaraan(String nama) {
        this.nama = nama;
    }

    // Abstract method
    abstract void jalankan();

    // Method biasa
    void info() {
        System.out.println("Ini adalah kendaraan bernama " + nama);
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {

    Mobil(String nama) {
        super(nama);
    }

    @Override
    void jalankan() {
        System.out.println(nama + " melaju di jalan raya.");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan("Umum"); // SALAH: abstract tidak bisa diinstansiasi
        Mobil m = new Mobil("Toyota Avanza");
        m.info();
        m.jalankan();
    }
}