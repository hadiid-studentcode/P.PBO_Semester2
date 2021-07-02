/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;




/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Main {
       
    
    public static void main (String[] args){
      
        
        System.out.println("SELAMAT DATANG DI PROGRAM PAKIR MOBIL HADIID ANDRI YULISON ( 200402076 ) !");
        System.out.println("=============================================================");
        System.out.println("JUMLAH PAKIR MOBIL SAAT INI ADALAH : 0 MOBIL ");
         System.out.println("=============================================================");
        System.out.println("HARGA PAKIR UNTUK MOBIL ADALAH RP. 3000");
         System.out.println("=============================================================");
        System.out.println();
        PakirMobil mobil = new PakirMobil();
        mobil.MobilMasuk();
        mobil.MobilKeluar();
         System.out.println("=============================================================");
        mobil.cetakhasil();
        
       
        
       
     
         
        
        
       

            
            
        
        
       
    }

    
}
