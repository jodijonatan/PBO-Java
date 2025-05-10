package aritmatika;
import java.util.Scanner;

public class LuasTrapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi sejajar (alas atas dan alas bawah)
        System.out.print("Masukkan panjang sisi atas (a): ");
        double a = input.nextDouble();

        System.out.print("Masukkan panjang sisi bawah (b): ");
        double b = input.nextDouble();

        // Input tinggi trapesium
        System.out.print("Masukkan tinggi (t): ");
        double t = input.nextDouble();

        // Menghitung luas trapesium
        double luas = 0.5 * (a + b) * t;

        // Menampilkan hasil
        System.out.println("Luas trapesium adalah: " + luas);
        
        input.close();
    }
}