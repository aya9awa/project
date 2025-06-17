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
public class User {
    private int id_user;
    private int total_poin;
    private int badge_id;

    public User(){}

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getTotal_poin() {
        return total_poin;
    }

    public void setTotal_poin(int total_poin) {
        this.total_poin = total_poin;
    }

    public int getBadge_id() {
        return badge_id;
    }

    public void setBadge_id(int badge_id) {
        this.badge_id = badge_id;
    }
    
    public void infoUser(){
    String pesan = "Data User:\n"
                + "ID User: " + id_user + "\n"
                + "Total Poin: " + total_poin + "\n"
                + "Badge ID: " + badge_id;
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data produk berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info User", JOptionPane.INFORMATION_MESSAGE);
    }
}
