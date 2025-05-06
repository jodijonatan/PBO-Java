package parameter;

public class TanpaParameter {
    // Method dengan parameter
    public static void sapa(String name) {
        System.out.println("Halo " + name + "!");
    }

    // Parameter default value
    public static void sapa() {
        sapa("Anonymous");
    }

    public static void main(String[] args) {
        sapa("Jo"); // metode dengan data
        sapa(); // metode tanpa data (default value)
    }
}
