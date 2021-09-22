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
public class BangunRuangMain {
    public static void main(String[] args) {
            
        Bola bb = new Bola();
            bb.r = 25;
            bb.phi = 3.14;
            bb.hitungVolume();
            bb.hitungLuasSelimut();
            
        System.out.println("------------------------------");
        
        Tabung tb = new Tabung();
            tb.phi = 3.14;
            tb.jari2 = 25;
            tb.tinggi = 30;
            tb.hitungVolume();
            tb.hitungLuasSelimut();
        
        System.out.println("------------------------------");
        
        Kerucut kr = new Kerucut();
            kr.phi = 3.14;
            kr.jari = 3;
            kr.tinggi = 4;
            kr.apotema = 5;
            kr.hitungVolume();
            kr.hitungLuasSelimut();
    }
}
