package encapsulation;

class Siswa {
    private String nama;
    private int umur;
    private String kelas;

    // Setter untuk mengisi data
    public void setNama(String n) {
        nama = n;
    }

    public void setUmur(int u) {
        umur = u;
    }

    public void setKelas(String k) {
        kelas = k;
    }

    // Getter untuk mengambil data
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKelas() {
        return kelas;
    }
}

public class Index {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();

        // Mengisi data menggunakan setter
        s1.setNama("Andi");
        s1.setUmur(16);
        s1.setKelas("XI RPL");

        // Menampilkan data menggunakan getter
        System.out.println("Nama  : " + s1.getNama());
        System.out.println("Umur  : " + s1.getUmur() + " tahun");
        System.out.println("Kelas : " + s1.getKelas());
    }
}