/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class PakirMobil {
     Scanner input = new Scanner (System.in);
    int jml_Mobil;
    int jml_Pendapatan;
    
    void MobilMasuk (){
       int MobilMasuk = Integer.parseInt(JOptionPane.showInputDialog("JUMLAH MOBIL MASUK : "));
        System.out.println("JUMLAH MOBIL MASUK : "+MobilMasuk+" MOBIL");
       
       //  int MobilMasuk =JOptionPane.showInputDialog("JUMLAH MOBIL KELUAR : "); 
        
//       System.out.print("JUMLAH MOBIL KELUAR : ");
//       int MobilMasuk = input.nextInt();
       
       this.jml_Mobil = 0 + MobilMasuk;
       this.jml_Pendapatan = this.jml_Mobil * 3000;
        
    }
    
    void MobilKeluar(){
        
          int keluar = Integer.parseInt(JOptionPane.showInputDialog("JUMLAH MOBIL KELUAR : "));
           System.out.println("JUMLAH MOBIL KELUAR : "+keluar+" MOBIL");
        
//        Scanner input = new Scanner (System.in);
//        System.out.print("JUMLAH MOBIL KELUAR :");
//        int keluar = input.nextInt();
         
        this.jml_Mobil = this.jml_Mobil - keluar;
    }
    
    void cetakhasil(){
        
        
       String st = "JUMLAH MOBIL YANG PAKIR SAAT INI ADALAH : ( "+this.jml_Mobil+ " MOBIL ) & JUMLAH PENDAPATAN SAAT INI ADALAH : ( RP. "+this.jml_Pendapatan+" )";
     
       JOptionPane.showMessageDialog(null, st);
       
       System.out.println("JUMLAH MOBIL YANG PAKIR SAAT INI ADALAH : ( "+this.jml_Mobil+ " MOBIL ) & JUMLAH PENDAPATAN SAAT INI ADALAH : ( RP. "+this.jml_Pendapatan+" ) ");
       
    }
    
    
}
