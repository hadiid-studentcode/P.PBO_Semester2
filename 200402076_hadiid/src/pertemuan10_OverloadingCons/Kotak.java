/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10_OverloadingCons;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Kotak {
    
    // overloading Konstruktor adalah mekanisme dimana kita dapat membuat konstruktor
    // lebih dari satu dalam class, tapi dengan ketentuan setiap konstruktor memiliki 
    // parameter yang berbeda , bisa berbeda jumlah parameternya ataupun
    // berbeda type data parameternya
    
    double panjang;
    double lebar;
    double tinggi;
    
    // mendifinisikan konstruktor dengan parameter
    
    public Kotak(double p , double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public Kotak (double sisi){
        panjang = lebar = tinggi = sisi;
    }
    
    public Kotak(){
        panjang = 5;
        lebar = 3;
        tinggi = 8;
    }
    public double hitungVolume(){
        return (panjang*lebar*tinggi);
    }
    
    public static void main (String[] args){
        Kotak kotak1 = new Kotak (2,3,4);
        Kotak kotak2 = new Kotak (4);
        Kotak kotak3 = new Kotak();
        
        System.out.println("volume Kotak 1 : "+kotak1.hitungVolume());
        System.out.println("Volume kotak 2 : "+kotak2.hitungVolume());
        System.out.println("Volume Kotak 3 : "+kotak3.hitungVolume());
        
    }
    
    
}
