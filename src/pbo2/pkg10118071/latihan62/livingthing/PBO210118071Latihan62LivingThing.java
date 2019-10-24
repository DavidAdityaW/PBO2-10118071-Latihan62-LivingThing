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
public class PBO210118071Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instansiasi objek
        Human h = new Human();
        h.setNama("David Aditya Winarto");
     
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
        
    }
    
}
