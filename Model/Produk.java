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
public class Produk {
    private int id_produk;
    private int id_user;
    private String namaProduk;
    private String deskripsi;
    private int harga;
    private int id_kategori;
    private String ukuran; 
    private String warna;
    private String gambar;
    private int stok;
    
    public Produk(){}

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
// Tampilkan hasil input
public void infoProduk(){
String pesan = "Data Produk:\n"
        + "ID Produk: " + getId_produk() + "\n"
        + "Nama Produk: " + getNamaProduk() + "\n"
        + "Deskripsi: " + getDeskripsi() + "\n"
        + "Harga: " + getHarga() + "\n"
        + "ID Kategori: " + getId_kategori() + "\n"
        + "Ukuran: " + getUkuran() + "\n"
        + "Warna: " + getWarna() + "\n"
        + "Gambar: " + getGambar() + "\n"
        + "Stok: " + getStok();

    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data produk berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, pesan, "Info Client", JOptionPane.INFORMATION_MESSAGE);
    }
}

    