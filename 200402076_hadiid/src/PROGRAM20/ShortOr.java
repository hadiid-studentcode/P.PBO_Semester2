/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM20;
// penggunaan operator boolean
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class ShortOr {
    public static void main (String args[]){
        int a=5, b=7;
        if ((a<2) || (b++<10)) b+=2;
        System.out.println(b);
    }
}
