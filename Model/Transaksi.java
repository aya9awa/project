/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Transaksi {
    private int id_transaksi;
    private String nama_depan_transaksi;
    private String nama_belakang_transaksi;
    private int telpon;
    private String kota;
    private String alamat;
    private String status;
    
    public Transaksi(){}

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getNama_depan_transaksi() {
        return nama_depan_transaksi;
    }

    public void setNama_depan_transaksi(String nama_depan_transaksi) {
        this.nama_depan_transaksi = nama_depan_transaksi;
    }

    public String getNama_belakang_transaksi() {
        return nama_belakang_transaksi;
    }

    public void setNama_belakang_transaksi(String nama_belakang_transaksi) {
        this.nama_belakang_transaksi = nama_belakang_transaksi;
    }

    public int getTelpon() {
        return telpon;
    }

    public void setTelpon(int telpon) {
        this.telpon = telpon;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void infoTransaksi(){
    String pesan = "Data Transaksi :\n"
                + "ID Transaksi : " + getId_transaksi() + "\n"
                + "Nama Depan Transaki : " + getNama_depan_transaksi() + "\n"
                + "Nama Belakang Transaksi : " + getNama_belakang_transaksi() + "\n" 
                + "No Telepon : " + getTelpon() + "\n" 
                + "Kota : " + getKota() + "\n" 
                + "Alamat : " + getAlamat() + "\n" 
                + "Status : " + getStatus() + "\n";

    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data produk berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info Transaksi", JOptionPane.INFORMATION_MESSAGE);
    }
}
