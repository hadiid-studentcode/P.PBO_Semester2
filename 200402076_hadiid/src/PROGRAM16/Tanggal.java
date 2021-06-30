/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM16;
//contoh pass by value
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Tanggal {
    int tgl = 1;
    int bulan = 1;
    int tahun = 2001;
    
    public Tanggal (int Tgl,int Bulan,int Tahun){
        tgl = Tgl; bulan = Bulan; tahun = Tahun; 
    }
    
    public void setTgl(int Tgl){
        tgl = Tgl;
    }
    
    public void setBulan(int Bulan){
    
        bulan = bulan;
        
    }
    
    public void setTahun(int Tahun){
        tahun = Tahun;
    }
    public void cetak(){
        System.out.println("tanggal : "+tgl);
        System.out.println("bulan   : "+bulan);
        System.out.println("tahun   : "+tahun);
    }
}














