/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat : Jihan Saniyya Pudaliba/24060123130101
 * Tanggal : Kamis, 27 Februari 2025
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int SKS;

    public MataKuliah() {
        idMatKul = "";
        nama = "";
        SKS = 0;
    }

    public MataKuliah(String idMatKul, String nama, int SKS) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return SKS;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int SKS) {
        this.SKS = SKS;
    }
}
