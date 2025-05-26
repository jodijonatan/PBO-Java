package enkapsulasi;

public class Mobil {
    // Data (atribut) disembunyikan
    private String merek;
    private int kecepatan;

    // Setter untuk merek
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter untuk merek
    public String getMerek() {
        return merek;
    }

    // Setter untuk kecepatan (dengan validasi)
    public void setKecepatan(int kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak boleh negatif!");
        }
    }

    // Getter untuk kecepatan
    public int getKecepatan() {
        return kecepatan;
    }
}
