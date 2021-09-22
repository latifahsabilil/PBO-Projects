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
public class Lingkaran {
    // atribut
    public int jarijari;
    public double phi;
    
    // methods
    public void hitungLuas(){
        double hasil = phi * jarijari * jarijari;
        System.out.println("Luas Lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * phi * jarijari;
        System.out.println("Keliling Lingkaran: " + hasil);
    }

}
