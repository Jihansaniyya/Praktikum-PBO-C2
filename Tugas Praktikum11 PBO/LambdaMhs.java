import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMhs.java
 * Nama/NIM: Jihan Saniyya Pudaliba/24060123130101
 * Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan  key (NIM) dan value (nama mahasiswa) menggunakan ekspresi lambda
 */

public class LambdaMhs {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("2341760001", "Jipopps");
        mahasiswaMap.put("2341760002", "Sanyy");
        mahasiswaMap.put("2341760003", "Jeju");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}