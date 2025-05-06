package parameter;

public class DenganParameter {
    public static void sapa(String nama) {
        System.out.println("Halo " + nama + "!");
    }

    public static void main(String[] args) {
        sapa("Jodi");  // cetak: Halo Andi!
        sapa("Jonatan");  // cetak: Halo Rina!
    }
}