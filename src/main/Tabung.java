/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements HitungRuang {
    double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }
    @Override
    public double volume() {
        return this.luas() * this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        return this.keliling() * (this.jari + this.tinggi);
    }
    
}
