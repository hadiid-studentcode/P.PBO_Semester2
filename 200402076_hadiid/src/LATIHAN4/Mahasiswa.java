/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN4;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Mahasiswa {
   public int nrp; // nomor induk registrasi pokok
   public String nama;
    
    public  Mahasiswa(int i, String n){
       this.nrp = i;
       this.nama = n;
    }
    
    public int getNRP (){
 
    return nrp;
    }
    
    public String getNama (){
      
        return nama;   
    }
    
    public void setNRP (int nrp){
      nrp = 2001;
    
    }
    
    public void setNama (String nama){
      nama = "Hadiid Andri Yulison";  
      
    }
    
    public static void main (String [] args){
        Mahasiswa siswa =new Mahasiswa (1212,"hadiid");     
       
        // menggunakan method getter
            System.out.println("NRP 1   = "+siswa.getNRP());
            System.out.println("Nama 1    = "+siswa.getNama());
        
//         // menggunakan method setter
//         siswa.setNRP(2001);
//         siswa.setNama("hadiid andri yulison");
        
       
        
    }

   
}
