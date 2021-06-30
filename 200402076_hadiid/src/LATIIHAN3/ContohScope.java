/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIIHAN3;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class ContohScope {
    private int i = 1;
    public void method1(){
        int i = 4, j = 5;
        this.i = i+j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(this.i);
         System.out.println("=========");
        method2(7);
        System.out.println(i);
        System.out.println(j);
        System.out.println(this.i);
        
    }
    public void method2(int i){
        int j = 8;
        this.i = i+j;
    }
}

class TesScope {
    public static void main ( String [] args){
        ContohScope scope = new ContohScope();
        scope.method1();
    }
}





