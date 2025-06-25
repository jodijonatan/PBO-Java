package inheritanc;
// Kelas Induk
class Kendaraan {
    String nama;

    public Kendaraan() {
        nama = "Kendaraan Umum";
    }

    public void bergerak() {
        System.out.println(nama + " digunakan untuk berpindah tempat.");
    }
}

// Kelas Turunan dari Kendaraan
class Mobil extends Kendaraan {
    public Mobil() {
        nama = "Mobil";
    }

    public void klakson() {
        System.out.println(nama + " bisa membunyikan klakson.");
    }
}

// Kelas Turunan dari Mobil
class MobilSport extends Mobil {
    public MobilSport() {
        nama = "Mobil Sport";
    }

    public void turboBoost() {
        System.out.println(nama + " memiliki fitur turbo untuk kecepatan tinggi.");
    }
}

// Kelas Turunan dari MobilSport
class MobilListrikSport extends MobilSport {
    public MobilListrikSport() {
        nama = "Mobil Listrik Sport";
    }

    public void isiDaya() {
        System.out.println(nama + " menggunakan daya listrik dan ramah lingkungan.");
    }
}

// Kelas Main
public class VehicleDevelopment {
    public static void main(String[] args) {
        System.out.println("== Simulasi Fitur Kendaraan Berdasarkan Perkembangannya ==\n");

        // Kendaraan Umum
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.bergerak();

        System.out.println("\n-------------------\n");

        // Mobil
        Mobil mobil = new Mobil();
        mobil.bergerak();
        mobil.klakson();

        System.out.println("\n-------------------\n");

        // Mobil Sport
        MobilSport sport = new MobilSport();
        sport.bergerak();
        sport.klakson();
        sport.turboBoost();

        System.out.println("\n-------------------\n");

        // Mobil Listrik Sport
        MobilListrikSport listrikSport = new MobilListrikSport();
        listrikSport.bergerak();
        listrikSport.klakson();
        listrikSport.turboBoost();
        listrikSport.isiDaya();
    }
}
