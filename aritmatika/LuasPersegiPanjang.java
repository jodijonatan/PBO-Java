package aritmatika;

public class LuasPersegiPanjang {

    // Method dengan parameter dan return
    static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        // Contoh pemanggilan method
        int hasil1 = hitungLuas(5, 3);
        int hasil2 = hitungLuas(10, 4);

        System.out.println("Luas 1: " + hasil1);
        System.out.println("Luas 2: " + hasil2);
    }
}