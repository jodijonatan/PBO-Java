package aritmatika;
import java.util.Scanner;

public class Bagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("== PROGRAM PEMBAGIAN SEDERHANA ==");
        try {
            System.out.println("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.println("Masukkan angka kedua");
            double angka2 = scanner.nextDouble();
            if (angka2 != 0) {
                double hasil = angka1 / angka2;
                System.out.println("Hasilnya adalah: " + hasil);
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan");
                return;
            } 
        }  catch (Exception e) {
            System.out.println("Masukkan angka yang valid");
        } finally {
            scanner.close();
        }
    } 
} 