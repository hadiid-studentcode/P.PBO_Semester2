/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGRAM22;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class ContohTernary {
    public static void main (String [] args){
        int x=2, y=6, m;
        int a=1,b=2,c=3;
        m = x > y ? x : y;
        System.out.println(m);
        m = a > b ? (c > a ? c : a ): (c > b ? c : b);
        System.out.println(m);
    }
}
