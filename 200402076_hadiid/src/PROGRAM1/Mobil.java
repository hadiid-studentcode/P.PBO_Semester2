/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM1;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Mobil {
    String aktifitas, warna;
    int kecepatan;
    void cekKecepatan(){
        if(kecepatan == 0)
            aktifitas = "parkir";
    }
    
    void cetakAtribut(){
        System.out.println("Aktifitas = "+aktifitas);
        System.out.println("Warna     = "+warna);
        System.out.println("Kecepatan = "+kecepatan);
    }
    
    public static void main (String args []){
        Mobil mobilku = new Mobil ();
        mobilku.kecepatan = 0;
        mobilku.warna = "merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
    
}
