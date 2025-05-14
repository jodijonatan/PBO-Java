package pewarisan;
// Kelas Induk
class Telepon {
  String nama;

  public Telepon() {
      nama = "Telepon Kabel";
  }

  public void menelpon() {
      System.out.println(nama + " digunakan untuk menelpon menggunakan kabel.");
  }
}

// Kelas Turunan dari Telepon
class TeleponGenggam extends Telepon {
  public TeleponGenggam() {
      nama = "Telepon Genggam";
  }

  public void sms() {
      System.out.println(nama + " bisa digunakan untuk mengirim SMS.");
  }
}

// Kelas Turunan dari TeleponGenggam
class Smartphone extends TeleponGenggam {
  public Smartphone() {
      nama = "Smartphone";
  }

  public void browsingInternet() {
      System.out.println(nama + " bisa digunakan untuk browsing internet dan menggunakan aplikasi.");
  }
}

class Smartestphone extends Smartphone {
  public Smartestphone() {
      nama = "Smartestphone";
  }

  public void camera() {
      System.out.println(nama + " bisa digunakan untuk manangkap foto dengan kamera.");
  }
}

// Kelas Main
public class PerkembanganTelepon {
  public static void main(String[] args) {
      System.out.println("== Simulasi Fitur Telepon Berdasarkan Perkembangannya ==\n");

      // Telepon Kabel
      Telepon telepon = new Telepon();
      telepon.menelpon();

      System.out.println("\n-------------------\n");

      // Telepon Genggam
      TeleponGenggam genggam = new TeleponGenggam();
      genggam.menelpon();
      genggam.sms();

      System.out.println("\n-------------------\n");

      // Smartphone
      Smartphone smartphone = new Smartphone();
      smartphone.menelpon();
      smartphone.sms();
      smartphone.browsingInternet();

      System.out.println("\n-------------------\n");

      Smartestphone smartestphone = new Smartestphone();
      smartestphone.menelpon();
      smartestphone.sms();
      smartestphone.browsingInternet();
      smartestphone.camera();
  }
}