package intrface;
import java.util.Scanner;

class Siswa {
    String nama;
    int umur;

    // Method untuk mengisi data
    void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur siswa: ");
        umur = input.nextInt();

        input.close();
    }

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Umur Siswa: " + umur + " tahun");
    }
}

public class Data {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();     // membuat objek siswa
        s1.inputData();             // memanggil method untuk input
        System.out.println();       // spasi
        s1.tampilData();
    }
}