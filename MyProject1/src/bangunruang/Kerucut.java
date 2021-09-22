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
public class Kerucut {
    public double phi;
    public int jari;
    public int tinggi;
    public double apotema;
    
    //methods
    public void hitungVolume(){
        double hasil = phi * jari * jari * tinggi / 3;
        System.out.println("Volume Kerucut : " + hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = phi * jari * tinggi * apotema;
        System.out.println("Luas Selimut Kerucut : " + hasil);
    }
}
