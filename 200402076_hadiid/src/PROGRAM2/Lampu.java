/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM2;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Lampu {
    int status;
    void lampuDinyalakan(){
        status = 1;
    }
    void lampuDimatikan(){
        status = 0;
    }
}

class Lain {
    public static void main (String args []){
    Lampu lampuku = new Lampu ();
    lampuku.lampuDinyalakan();
    System.out.println(lampuku.status);
}
}
