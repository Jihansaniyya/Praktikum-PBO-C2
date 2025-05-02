/* Nama File :Burung.java
 * Deskripsi : Berisi atribut dan method dalam subclass Burung
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 30 April 2025
 */

 public class Burung extends Anabul {

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan terbang");
    }

    public void suara(){
        System.out.println(nama + " bunyinya cit cit");
    }
    
}
