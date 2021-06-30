/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM5;

/**
 *
 * @author HADIID ANDRI YULISON
 */

class konversi {
    //deklarasi variabel dengan type data atau atribut
    int jarak;
    
    // method meterkilo
    void meterkilo(){
        jarak = 1/1000;
        System.out.println(jarak);
    }
    
    // method kilokemeter
    void kilokemeter(){
        jarak = 1*1000;
        System.out.println(jarak);
    }
}

public class TesKonversi {
    
    public static void main (String args []){
    konversi konversiku = new konversi ();
    konversiku.meterkilo();
    konversiku.kilokemeter();
    
        
    }
}
