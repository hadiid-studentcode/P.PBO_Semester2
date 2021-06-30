/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM16;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class TesPass {
    public static void ubahInt(int nilai){
        nilai = 55;
    }
    public static void ubahRefObjek(Tanggal ref){
        ref = new Tanggal(22,2,2007);
    }
    public static void ubahAttrObjek(Tanggal ref){
        ref.setTgl(23);
    }
    
    public static void main (String [] args){
        Tanggal tanggalku;
        int val;
        // tanda nilai variabel
        val = 11;
        //ubah nilainya dengan suatu method
        ubahInt(val);
        // periksa nilainya
        System.out.println("Nilai integer :"+val);
        // tanda nilai tanggal
        tanggalku = new Tanggal (1,1,2006);
        // ubah nilai referensi objek
        ubahRefObjek(tanggalku);
        // tampilkan nilai tanggal
        tanggalku.cetak();
    }
}














