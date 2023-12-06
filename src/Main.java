/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azis Nurjaman
 */
class Mobil {
    // Atribut (properti) dari class Mobil
    String merk;
    String warna;
    int tahunProduksi;

    // Constructor untuk inisialisasi objek Mobil
    public Mobil(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
// Method untuk mendapatkan informasi mobil
    public String getInfoMobil() {
        return "Mobil " + merk + " (" + tahunProduksi + "), Warna: " + warna;
    }

    // Method untuk melakukan cat ulang mobil
    public void catUlang(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Mobil dicat ulang menjadi " + warnaBaru);
    }
}

// Program utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil1 dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Biru", 2022);

        // Memanggil method getInfoMobil untuk mendapatkan informasi mobil
        System.out.println(mobil1.getInfoMobil()); // Output: Mobil Toyota (2022), Warna: Biru

        // Memanggil method catUlang untuk mengubah warna mobil
        mobil1.catUlang("Merah");

        // Memanggil method getInfoMobil setelah perubahan warna
        System.out.println(mobil1.getInfoMobil()); // Output: Mobil Toyota (2022), Warna: Merah
    }
}
