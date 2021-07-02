/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Main {
    
    public static void main (String args []){
       
        int nomor;
        String barang;
        int harga;
        int qiy;
        int subtotal;
       char status;
       
      System.out.println("DAFTAR PENJUALAN HADIID ANDRI YULISON ( 200402076 )     ");
      System.out.println("=======================================================");
      System.out.println("NO        NAMA BARANG     HARGA       QIY     SUBTOTAL");
      System.out.println("=======================================================");
      

    for(nomor = 1 ; nomor >= 1 ; nomor++){
       barang = JOptionPane.showInputDialog("barang : ");
       harga = Integer.parseInt(JOptionPane.showInputDialog("HARGA BARANG : RP. "));
       qiy = Integer.parseInt(JOptionPane.showInputDialog("QIY BARANG : "));
       subtotal = harga * qiy;
      System.out.println(nomor+ "            "+barang+"         "+harga+"        "+qiy+"        "+subtotal);
    
    }

    }
}
