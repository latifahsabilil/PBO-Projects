/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Tabung {
    public double phi;
    public int jari2;
    public int tinggi;
    
    //methods
    public void hitungVolume(){
        double hasil = phi * jari2 * tinggi;
        System.out.println("Volume Tabung : " + hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 2 * phi * jari2 * tinggi;
        System.out.println("Luas Selimut Tabung : " + hasil);
    }
}
