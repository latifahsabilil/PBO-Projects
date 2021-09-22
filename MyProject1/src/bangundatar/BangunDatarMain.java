/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class BangunDatarMain {
    public static void main(String[] args) {
            
        PersegiPanjang pp = new PersegiPanjang();
            pp.panjang = 25;
            pp.lebar = 38;
            pp.hitungLuas();
            pp.hitungKeliling();
            
        System.out.println("------------------------------");
        
        Persegi p1 = new Persegi();
            p1.sisi = 10;
            p1.hitungLuas();
            p1.hitungKeliling();
        
        System.out.println("------------------------------");
        
        Persegi p2 = new Persegi();
            p2.sisi = 15;
            p2.hitungLuas();
            p2.hitungKeliling();
            
        System.out.println("------------------------------");
        
        Lingkaran L1 = new Lingkaran();
            L1.jarijari = 25;
            L1.phi = 3.14;
            L1.hitungLuas();
            L1.hitungKeliling();
            
        System.out.println("------------------------------");
        
        Lingkaran L2 = new Lingkaran();
            L2.jarijari = 37;
            L2.phi = 3.14;
            L2.hitungLuas();
            L2.hitungKeliling();
    }

}
