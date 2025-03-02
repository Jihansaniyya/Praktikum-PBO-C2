/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main Mahasiswa
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Kamis, 27 Februari 2025
 */

public class Main { public static void main(String[] args) {
    // Mahasiswa 1
    System.out.println("===== Mahasiswa 1 =====");
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
    MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
    Dosen D1 = new Dosen("123", "Andi", "Informatika");
    Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatkul(PBO);
    M1.addMatkul(MBD);
    M1.printDetailMhs();

    // Mahasiswa 2
    System.out.println("===== Mahasiswa 2 =====");
    MataKuliah SISCER = new MataKuliah("SC", "SISTEM CERDAS", 3);
    MataKuliah MBD2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    Mahasiswa M2 = new Mahasiswa("101", "Jihan", "Informatika");
    Dosen D2 = new Dosen("112", "Aris", "Informatika");
    Kendaraan K2 = new Kendaraan("G 4 ZA", "Mobil");
    M2.setDosenWali(D2);
    M2.setKendaraan(K2);
    M2.addMatkul(SISCER);
    M2.addMatkul(MBD2);
    M2.addMatkul(PBO);
    M2.printDetailMhs();
}
    
}
