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
public class Kategori {
    private int id_kategori;
    private String nama_kategori;
    
    public Kategori (){};

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public void infoKategori(){
    String pesan = "Data Kategori :\n"
                + "ID Kategori : " + getId_kategori() + "\n"
                + "Nama Kategori : " + getNama_kategori() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data kategori berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info Kategori", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
