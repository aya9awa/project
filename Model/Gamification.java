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
public class Gamification {
    private int id_gamification;
    private int id_user;
    private String first_name;
    private String last_name;
    
    public Gamification(){}

    public int getId_gamification() {
        return id_gamification;
    }

    public void setId_gamification(int id_gamification) {
        this.id_gamification = id_gamification;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void infoGamification(){
    String pesan = "Data Gamification :\n"
                + "ID Gamification : " + getId_gamification() + "\n"
                + "ID User : " + getId_user() + "\n"
                + "First Name : " + getFirst_name() + "\n"
                + "Last Name : " + getLast_name() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data gamification berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info gamification", JOptionPane.INFORMATION_MESSAGE);
    }
}
