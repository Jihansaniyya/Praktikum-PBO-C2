/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Jihan Saniyya Pudaliba/ 24060123130101
 * Tanggal : Kamis, 27 Februari 2025
 */

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //setter (Mutator) untuk setiap atribut
    public void setNip(String nip){
        this.nip = nip;
    } 

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}



