/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM14;
import javax.swing.JOptionPane;
//input bilangan menggunbakan JOptionPane
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class inputBilangan {
    public static void main (String [] args){

    int bil;
    String str = JOptionPane.showInputDialog("Masukkan bilangan :");
    bil = Integer.parseInt(str);
    System.out.println(bil);
    System.exit(0);
}
}