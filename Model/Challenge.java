/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.JOptionPane;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Challenge {
    private int id_challenge;
    private int id_user;
    private LocalDate date_challenge;
    
    public Challenge(){};

    public int getId_challenge() {
        return id_challenge;
    }

    public void setId_challenge(int id_challenge) {
        this.id_challenge = id_challenge;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public LocalDate getDate_challenge() {
        return date_challenge;
    }

    public void setDate_challenge(LocalDate date_challenge) {
        this.date_challenge = date_challenge;
    }
    
    public void infoChallenge(){
    String pesan = "Data Challenge :\n"
                + "ID Challenge : " + getId_challenge() + "\n"
                + "ID User : " + getId_user() + "\n"
                + "Date Challenge : " + getDate_challenge() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data challenge berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info Challenge", JOptionPane.INFORMATION_MESSAGE);
    
    }    
}
