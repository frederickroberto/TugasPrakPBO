/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pilihMenu = new Scanner(System.in);
        Scanner inputData = new Scanner(System.in);
        int Kembali,inputPanjang,inputLebar, inputTinggi, inputJari, inputTinggiTabung;
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        int Menu = pilihMenu.nextInt();
        
        if(Menu == 1){
            System.out.print("Input Panjang : ");
            inputPanjang = inputData.nextInt();
            System.out.print("Input Lebar : ");
            inputLebar = inputData.nextInt();
            System.out.print("Input Tinggi : ");
            inputTinggi = inputData.nextInt();
            Balok balok = new Balok(inputPanjang,inputLebar,inputTinggi);
            System.out.println("Luas PersegiPanjang : " +balok.luas());
            System.out.println("Keliling PersegiPanjang  : " + balok.keliling());
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas Permukaan Balok : " + balok.luaspermukaan());
        }
        else if(Menu == 2){
            System.out.print("Input Tinggi : ");
            inputTinggiTabung = inputData.nextInt();
            System.out.print("Input Jari-jari : ");
            inputJari = inputData.nextInt();
            Tabung tabung = new Tabung(inputTinggiTabung, inputJari);
            System.out.println("Luas Lingkaran : " +tabung.luas());
            System.out.println("Keliling Lingkaran  : " + tabung.keliling());
            System.out.println("Volume Tabung : " + tabung.volume());
            System.out.println("Luas Permukaan Tabung : " + tabung.luaspermukaan());
        }
       
    Scanner BackMenu = new Scanner(System.in);
    System.out.println("Ulangi? (Ya : 1 || Tidak : 0");
    Kembali = BackMenu.nextInt();
    
}while (Kembali == 1);
    }
}
