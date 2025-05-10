/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam Superclass Anabul
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 7 Mei 2025
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}