/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class GUI extends JFrame implements ActionListener {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    JLabel judul = new JLabel("KALKULATOR BALOK");
    JLabel lpanjang = new JLabel("Panjang :");
    JTextField textpanjang = new JTextField(15);
    JLabel llebar = new JLabel("Lebar :");
    JTextField textlebar = new JTextField(15);
    JLabel ltinggi = new JLabel("Tinggi :");
    JTextField texttinggi = new JTextField(15);
    
    JLabel result = new JLabel("Result :");
    JLabel luas = new JLabel("Luas :");
    JLabel keliling = new JLabel("Keliling :");
    JLabel volume = new JLabel("Volume :");
    
    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");
    
    public GUI(){
        setTitle("KALKULATOR BALOK");
        setSize(350,200);
        setLayout(null);
        
        add(judul);
        add(lpanjang);
        add
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }

    
    

