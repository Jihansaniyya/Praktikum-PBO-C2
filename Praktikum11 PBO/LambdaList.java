import java.util.ArrayList;

/**
 * File: LambdaList.java
 * Nama: Jihan Saniyya Pudaliba
 * NIM: 24060123130101
 * Deskripsi: Implementasi lambda pada list, digunakan sebagai parameter pada method
 */
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}
