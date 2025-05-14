package aritmatika;
import java.util.Scanner;

public class Kali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== PROGRAM PERKALIAN SEDERHANA ==");
        try {
            System.out.println("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.println("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            double hasil = angka1 * angka2;
            System.out.println("Hasil perkalian adalah: " + hasil);
        } catch (Exception e) {
            System.err.println("Error: Masukkan angka yang valid");
        } finally {
            scanner.close();
        }
    }
}
