/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;
import javax.swing.JOptionPane;
import java.util.Scanner;
        
/**
 *
 * @author HADIID ANDRI YULISON
 * NIM : 200402076
 */
public class Main {
    int saldo;
    Scanner masukan = new Scanner (System.in);
    public Main(int saldo){
        this.saldo = saldo;
    }
    
    void simpanAwal(){
       JOptionPane.showInputDialog(null,"Saldo Anda Saat ini Adalah "+saldo);
       
    }
    void simpanUang(int simpan){
     
        saldo = simpan + saldo;
        System.out.println("Saldo saat ini adalah Rp. "+saldo);
        System.out.println();
    }
    void ambilUang(int ambil){
       
        if (saldo <= ambil){
            System.out.println("Maaf Saldo anda kurang!");
            System.out.println();
        }else{
            saldo = saldo-ambil;
            System.out.println("Saldo saat ini adalah Rp."+saldo);
            System.out.println();
        }
            
    }
        
    public static void main (String[]args){
         Scanner input  = new Scanner (System.in);
         int simpan = 0;
         int ambil = 0;
         int opsi;
        
         
         Main bank = new Main(0);
        
         System.out.println("Program hadiid Andri Yulison");
         System.out.println();
        for (int a = 1 ; a<=100;a++){
        
    
        
         
         
        
        System.out.println("Menu Transaksi Bank");
        System.out.println("1. Tambah Tabungan");
        System.out.println("2. Tarik Tabungan ");
        System.out.println("3. Lihat Saldo");
        System.out.println("4. keluar");
        
        System.out.print("Pilihan Anda : ");
        opsi = input.nextInt();
        
        if (opsi == 1){
            
            String inputan1 = JOptionPane.showInputDialog("Masukkan Nominal yang akan ditambahkan : ");
            simpan = Integer.parseInt(inputan1);
            bank.simpanUang(simpan);
            
            
            
        } else if (opsi == 2){
            String inputan2 = JOptionPane.showInputDialog("Masukkan Nominal yang akan ditarik : ");
           ambil = Integer.parseInt(inputan2);
            bank.ambilUang(ambil);
        
        } else if (opsi == 3){
            bank.simpanAwal();
             
        }if (opsi == 4){
            System.out.println();
             System.out.println("Terima Kasih Atas Kunjungannya !");
            break;
        } else if (opsi >4){ 
            System.out.println("Menu tidak ada ");
            System.out.println("Ulangi Pilih Menu ATM :");
            System.out.println();
        }
        }
            
        
       
        
        
        }    
    }

