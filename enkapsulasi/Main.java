package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();

        mobilSaya.setMerek("Toyota Supra");
        mobilSaya.setKecepatan(200);

        System.out.println("Merek Mobil: " + mobilSaya.getMerek());
        System.out.println("Kecepatan: " + mobilSaya.getKecepatan() + " km/jam");
    }
}
