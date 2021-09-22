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
public class Bola {
    public int r;
    public double phi;
    
    //methods
    public void hitungVolume(){
        double hasil = 4 * phi * r * r * r;
        System.out.println("Volume Bola : " + hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 4 * phi * r * r;
        System.out.println("Luas Selimut Bola : " + hasil);
    }
}
