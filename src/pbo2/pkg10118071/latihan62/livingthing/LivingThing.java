    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan62.livingthing;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk menampilkan
*                     perilaku benda hidup dengan konsep abstraksi
* 
*/
abstract public class LivingThing {
    
    abstract public void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
    
}
