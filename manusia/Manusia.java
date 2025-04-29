package manusia;    
public class Manusia {
    // Deklarasi atribut (variabel instansi)
    String nama;
    int usia;
    String alamat;

    // Konstruktor untuk menginisialisasi objek dengan nama dan usia
    public Manusia(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi tentang manusia
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Manusia dengan nama dan usia
        Manusia orang = new Manusia("JODI JONATAN", 15, "Medan");

        // Menampilkan informasi orang
        orang.tampilkanInfo();
    }
}
