/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10_Encapsulaion;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Main {
    public static void main (String[] args){
        Encapsulation objek = new Encapsulation();
        objek.ModifNama("Hadiid Andri Yulison");
        System.out.println("Nama : "+ objek.getNama());
    }
}
