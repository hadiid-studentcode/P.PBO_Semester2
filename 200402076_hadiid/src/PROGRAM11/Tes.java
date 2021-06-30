/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM11;
// penggunaan tipe bilangan pecahan
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Tes {
    public static void main (String args []){
        float harga = 150000;
        double total;
        System.out.println("Harga barang = "+harga);
        total = harga + 0.1*harga; // harga + 10% pajak
        System.out.println("Total penjualan = "+total);
    }
}
