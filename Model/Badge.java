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
public class Badge {
    private int id_badge;
    private int id_user;
    
    public Badge(){};

    public int getId_badge() {
        return id_badge;
    }

    public void setId_badge(int id_badge) {
        this.id_badge = id_badge;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    public void infoBadge(){
    String pesan = "Data Badge :\n"
                + "ID Badge : " + getId_badge() + "\n"
                + "ID User : " + getId_user() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data badge berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info badge", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
