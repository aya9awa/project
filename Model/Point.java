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
public class Point {
    private int id_poin;
    private int id_user;
    private int nominal_poin;
    
    public Point(){};

    public int getId_poin() {
        return id_poin;
    }

    public void setId_poin(int id_poin) {
        this.id_poin = id_poin;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getNominal_poin() {
        return nominal_poin;
    }

    public void setNominal_poin(int nominal_poin) {
        this.nominal_poin = nominal_poin;
    }
    
    public void infoPoint(){
    String pesan = "Data Point :\n"
                + "ID Poin : " + getId_poin() + "\n"
                + "ID User : " + getId_user() + "\n"
                + "Nominal Poin : " + getNominal_poin() + "\n";
    
    // Beri notifikasi sukses
    JOptionPane.showMessageDialog(null, "Data Point berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);       
    JOptionPane.showMessageDialog(null, pesan, "Info point", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
