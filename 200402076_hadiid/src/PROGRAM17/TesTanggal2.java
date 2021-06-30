/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM17;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class TesTanggal2 {
    public static void main (String[]args){
        Tanggal2 tanggalku = new Tanggal2(14,9,70);
        Tanggal2 minggudepan = tanggalku.tambah_tgl(7);
        minggudepan.cetak();
    }
    
}
