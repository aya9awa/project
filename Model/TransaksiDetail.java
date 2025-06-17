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
public class TransaksiDetail {
    private int id_transaksi_detail;
    private int id_transaksi;
    private int quantity;
    
    public TransaksiDetail(){};

    public int getId_transaksi_detail() {
        return id_transaksi_detail;
    }

    public void setId_transaksi_detail(int id_transaksi_detail) {
        this.id_transaksi_detail = id_transaksi_detail;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
    
    public void infoDetail(){
    String pesan = "Data Detail Transaksi :\n"
                + "ID Transaksi Detail : " + getId_transaksi_detail() + "\n"
                + "ID Transaksi : " + getId_transaksi() + "\n"
                + "Quantity : " + getQuantity() + "\n";

    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data Detail Transaksi berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info Detail", JOptionPane.INFORMATION_MESSAGE);
    }
}
