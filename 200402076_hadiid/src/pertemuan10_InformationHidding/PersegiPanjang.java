/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10_InformationHidding;

/**
 *
 * @author HADIID ANDRI YULISON
 * 
 */
public class PersegiPanjang {
   // Information hiding adalah menyembunyikan attribute suatu objek dari objek lain
  // Information sendiri sangat berkaitan dengan enkapsulasi yaitu menyembunyikan 
  //atau melindungi informasi berupa atribut maupun method dengan menggunakan hak akses (modifier) private.
  // contoh program information Hidding :
    
    private double panjang ; // attribute yang di hide
    private double lebar ; // attribute yang di hide
    
    public PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    private double luas (double p, double l){ // di Encapsulaion
        return p*l;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void setLebar (double lebar){
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public double getLuas(){
        return luas (panjang, lebar);
    }
 
}
