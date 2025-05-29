/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jihan Saniyya
 */



public class MysqlMahasiswaService {
    
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    /**
     * Membuat objek mahasiswa dari ResultSet
     * @param rs ResultSet dari query database
     * @return objek mahasiswa
     * @throws SQLException jika ada error saat mengambil data
     */
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }
    
    /**
     * Menambahkan data mahasiswa ke database
     * @param mhs objek mahasiswa yang akan ditambahkan
     */
    public void add(Mahasiswa mhs) {
        String sql;
        
        // Jika ID = 0 atau tidak diset, gunakan auto increment
        if (mhs.getId() == 0) {
            sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        } else {
            // Jika ID sudah diset, insert dengan ID manual
            sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        }
        
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            
            if (mhs.getId() == 0) {
                // Auto increment
                ps.setString(1, mhs.getNama());
            } else {
                // Manual ID
                ps.setInt(1, mhs.getId());
                ps.setString(2, mhs.getNama());
            }
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data mahasiswa berhasil ditambahkan: " + mhs.getNama());
            } else {
                System.out.println("❌ Gagal menambahkan data mahasiswa");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat menambahkan data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Update data mahasiswa di database
     * @param mhs objek mahasiswa dengan data baru
     */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data mahasiswa berhasil diupdate: ID " + mhs.getId());
            } else {
                System.out.println("❌ Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat update data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Delete data mahasiswa berdasarkan ID
     * @param id ID mahasiswa yang akan dihapus
     */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data mahasiswa dengan ID " + id + " berhasil dihapus");
            } else {
                System.out.println("❌ Data mahasiswa dengan ID " + id + " tidak ditemukan");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat menghapus data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Ambil mahasiswa berdasarkan ID
     * @param id ID mahasiswa yang dicari
     * @return objek mahasiswa atau null jika tidak ditemukan
     */
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                System.out.println("🔍 Mahasiswa ditemukan: " + mhs.toString());
                return mhs;
            } else {
                System.out.println("❓ Mahasiswa dengan ID " + id + " tidak ditemukan");
                return null;
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat mencari mahasiswa: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Ambil semua data mahasiswa dari database
     * @return List berisi semua mahasiswa
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY id";
        
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMahasiswa.add(mhs);
            }
            
            System.out.println("📋 Berhasil mengambil " + listMahasiswa.size() + " data mahasiswa");
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat mengambil semua data: " + e.getMessage());
            e.printStackTrace();
        }
        
        return listMahasiswa;
    }
    
    /**
     * Reset indeks tabel mahasiswa ke 1
     * Method ini akan mereset AUTO_INCREMENT counter ke 1
     */
    public void indexReset() {
        String sql = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("✅ Index tabel mahasiswa berhasil direset ke 1");
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat reset index: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Memeriksa apakah tabel mahasiswa kosong
     * @return true jika tabel kosong, false jika ada data
     */
    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) as total FROM mahasiswa";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                int total = rs.getInt("total");
                boolean empty = (total == 0);
                
                if (empty) {
                    System.out.println("📭 Tabel mahasiswa kosong");
                } else {
                    System.out.println("📋 Tabel mahasiswa berisi " + total + " data");
                }
                
                return empty;
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat cek tabel kosong: " + e.getMessage());
            e.printStackTrace();
        }
        
        return true; // Default return true jika ada error
    }
    
    /**
     * Menutup koneksi ke database
     * Method ini akan menutup koneksi yang sedang aktif
     */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                koneksi = null;
                System.out.println("🔒 Koneksi database ditutup dari service");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error saat menutup koneksi: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Method untuk mendapatkan jumlah total mahasiswa
     * @return jumlah total mahasiswa di database
     */
    public int getTotalMahasiswa() {
        String sql = "SELECT COUNT(*) as total FROM mahasiswa";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                return rs.getInt("total");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat menghitung total: " + e.getMessage());
            e.printStackTrace();
        }
        
        return 0;
    }
    
    /**
     * Method untuk menghapus semua data mahasiswa (untuk testing)
     */
    public void deleteAll() {
        String sql = "DELETE FROM mahasiswa";
        try {
            Statement stmt = koneksi.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("🗑️ Semua data mahasiswa dihapus (" + result + " records)");
            
            // Reset auto increment setelah delete all
            indexReset();
            
        } catch (SQLException e) {
            System.err.println("❌ Error saat menghapus semua data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Method untuk setup data awal (untuk testing/demo)
     */
    public void setupInitialData() {
        // Hapus semua data lama
        deleteAll();
        
        // Insert data awal
        add(new Mahasiswa(1, "Nina"));
        add(new Mahasiswa(2, "Rudi"));
        add(new Mahasiswa(3, "Beni"));
        
        System.out.println("🎯 Data awal berhasil disetup");
    }
}