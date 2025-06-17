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
public class Reward {
    private int id_reward;
    private int id_user;
    private LocalDate date_reward;
    
    public Reward(){};

    public int getId_reward() {
        return id_reward;
    }

    public void setId_reward(int id_reward) {
        this.id_reward = id_reward;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public LocalDate getDate_reward() {
        return date_reward;
    }

    public void setDate_reward(LocalDate date_reward) {
        this.date_reward = date_reward;
    }
    
    public void infoReward(){
    String pesan = "Data Reward :\n"
                + "ID Reward : " + getId_reward() + "\n"
                + "ID User : " + getId_user() + "\n"
                + "Date Reward : " + getDate_reward() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data reward berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "InfoReward", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
