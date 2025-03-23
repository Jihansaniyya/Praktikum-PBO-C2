/* Nama File : PNS.java
 * Deskripsi : Berisi atribut dan method dalam subclass PNS
 * Pembuat : Jihan Saniyya Pudaliba / 24060123130101
 * Tanggal : Jumat, 21 Maret 2025
 */
import java.util.Date;
public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private static final int A = 3;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        PNS.counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip; 
    }

    public static int getCounterPNS() {
        return counterPNS; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return new Date().getYear() - tgl_mulai_kerja.getYear() + A;
    }
    
    @Override
    public String hitungPajak() {
        return formatRupiah(0.1 * pendapatan);
    }
}