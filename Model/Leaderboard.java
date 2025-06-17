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
public class Leaderboard {
    private int id_leaderboard;
    private int id_user;
    
    public Leaderboard(){}
   
    public int getId_leaderboard() {
        return id_leaderboard;
    }

    public void setId_leaderboard(int id_leaderboard) {
        this.id_leaderboard = id_leaderboard;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    public void infoLeaderboard(){
    String pesan = "Data Leaderboard :\n"
                + "ID Leaderboard : " + getId_leaderboard() + "\n"
                + "ID User : " + getId_user() + "\n";

    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data leaderboard berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info Leaderboard", JOptionPane.INFORMATION_MESSAGE);
    }
}