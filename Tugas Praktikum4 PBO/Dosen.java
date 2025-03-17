/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen dari class Pegawai
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Jumat, 14 Maret 2025
 */
import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakuktas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
    
}
