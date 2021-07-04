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
public class Encapsulation {
    // Encapsulasi merupakan sebuah proses dimana method dan juga atribut
    // dibungkus dalam program. yang bersifat menyembunyikan informasi yang
    // terdapat di dalam program, sehingga lebih aman dan tidak mudah diambil
    // oleh orang lain dan untuk membuat program yang bersifat pribadi misalnya
    // membutuhkan modifier yaitu private
    
    private String nama;
    private int nim;
    
    public String getNama(){
        return this.nama;
    } 
    
    public void ModifNama(String nama){
        this.nama = nama;
    }
}
