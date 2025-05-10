package parameter;

public class TanpaParameter {
    // Method dengan parameter
    public static void sapa(String name) {
        System.out.println("Halo " + name + "!");
    }

    public static void sapa() {
        sapa("Anonymous");
    }

    public static void main(String[] args) {
        sapa("Jodi");
        sapa();
    }
}