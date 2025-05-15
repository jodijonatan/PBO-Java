package abstraction;

// Kelas abstrak sebagai kerangka pembayaran
abstract class Pembayaran {
    double jumlahBayar;

    Pembayaran(double jumlah) {
        this.jumlahBayar = jumlah;
    }

    // Metode abstrak: harus diimplementasi di kelas turunannya
    abstract void prosesPembayaran();

    void cetakStruk() {
        System.out.println("Pembayaran sebesar: Rp " + jumlahBayar);
    }
}

// Transfer bank
class TransferBank extends Pembayaran {
    TransferBank(double jumlah) {
        super(jumlah);
    }

    void prosesPembayaran() {
        System.out.println("Melakukan transfer bank sejumlah Rp " + jumlahBayar);
        // Logika transfer bank di sini...
    }
}

// Kartu Kredit
class KartuKredit extends Pembayaran {
    KartuKredit(double jumlah) {
        super(jumlah);
    }

    void prosesPembayaran() {
        System.out.println("Memproses pembayaran kartu kredit sejumlah Rp " + jumlahBayar);
        // Logika pembayaran kartu kredit di sini...
    }
}

// E-wallet
class EWallet extends Pembayaran {
    EWallet(double jumlah) {
        super(jumlah);
    }

    void prosesPembayaran() {
        System.out.println("Memproses pembayaran e-wallet sejumlah Rp " + jumlahBayar);
        // Logika e-wallet di sini...
    }
}

// Main class untuk uji coba
public class Payment {
    public static void main(String[] args) {
        Pembayaran p1 = new TransferBank(150000);
        Pembayaran p2 = new KartuKredit(200000);
        Pembayaran p3 = new EWallet(100000);

        p1.prosesPembayaran();
        p1.cetakStruk();

        System.out.println();

        p2.prosesPembayaran();
        p2.cetakStruk();

        System.out.println();

        p3.prosesPembayaran();
        p3.cetakStruk();
    }
}
