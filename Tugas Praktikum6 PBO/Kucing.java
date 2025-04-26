/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam subclass Kucing
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Rabu, 23 April 2025
 */

public class Kucing extends Anabul {
    public Kucing (String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(nama  + " bergerak dengan melata ");
    }

    @Override
    public void suara(){
        System.out.println(nama + " bunyinya: Meongggggg");
    }
    
}
