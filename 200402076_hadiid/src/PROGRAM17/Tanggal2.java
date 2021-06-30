/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM17;
// contoh penggunaan keyword this
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Tanggal2 {
    int tgl = 1;
    int bulan = 1;
    int tahun = 2001;
    public Tanggal2(int Tgl, int Bulan,int Tahun){
        this.tgl = Tgl; this.bulan = Bulan; this.tahun = Tahun;
    }
    public Tanggal2(Tanggal2 tanggalku){
        this.tgl = tanggalku.tgl;
        this.bulan = tanggalku.bulan;
        this.tahun = tanggalku.tahun;
    }
    public Tanggal2 tambah_tgl(int banyaknya){
        Tanggal2 tanggalbaru = new Tanggal2(this);
        tanggalbaru.tgl = tanggalbaru.tgl + banyaknya;
        return tanggalbaru;
    }
    public void cetak(){
        System.out.println("tanggal :"+tgl);
        System.out.println("bulan   :"+bulan);
        System.out.println("tahun   :"+tahun);
    }
}

















