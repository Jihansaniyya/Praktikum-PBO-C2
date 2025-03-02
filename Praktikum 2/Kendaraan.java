/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Kamis, 27 Februari 2025
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;
    
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan (String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    //Mutator 
    public void setNoplat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }



}
