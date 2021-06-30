/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM23;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Tanggal {
    public int tgl;
    public int bulan;
    public int tahun;
    public Tanggal (int stgl, int sbulan, int stahun){
        tgl = stgl; bulan = sbulan; tahun = stahun;
    }
    public static void main (String [] args){
        Tanggal tanggalku = new Tanggal (12,3,2007);
        if ((tanggalku.tgl != '\0') && (tanggalku.tgl>31)){
            System.out.println("ada yang salah dengan tanggal !");
            
        }else if ((tanggalku.bulan != '\0') && (tanggalku.bulan>12)){
            System.out.println("ada yang salah dengan bulan !");
            
        } else {
            System.out.println("tanggal yang ditampilkan adalah : tanggal "+tanggalku.tgl+" , bulan : "+tanggalku.bulan+", tahun "+tanggalku.tahun);
        }
        
      
    } 
}
