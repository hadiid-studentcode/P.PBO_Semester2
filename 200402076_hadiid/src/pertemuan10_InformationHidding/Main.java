/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10_InformationHidding;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Main {
    public static void main(String[]args){
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(20);
        System.out.println("Panjang :"+ pp.getPanjang());
        System.out.println("Lebar :"+ pp.getLebar());
        System.out.println("Luas :"+ pp.getLuas());
    }
}
