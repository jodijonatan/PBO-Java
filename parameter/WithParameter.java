package parameter;

public class WithParameter {
    public static void sapa(String nama) {
        System.out.println("Halo " + nama + ", nice to meet you");
        System.out.println("Halo " + nama + ", CIHUYY");
        System.out.println("Halo " + nama + ", nice to meet you!");
    }

    public static void main(String[] args) {
        sapa("Jodi");
        sapa("Jonatan");
    }
}