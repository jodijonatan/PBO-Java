package pembagian;
import java.util.Scanner;

public class Bagi {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("== PROGRAM PEMBAGIAN SEDERHANA ==");
        try {
            System.out.println("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.println("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            if (angka2 == 0) {
                System.err.println("Error: Pembagian dengan nol tidak diperbolehkan");
            } else {
                double hasil = angka1 / angka2;
                System.out.println("Hasil pembagian adalah: " + hasil);
            }
        } catch (Exception e) {
            System.err.println("Error: Masukkan angka yang valid");
        } finally {
            scanner.close();
        }
    }
}