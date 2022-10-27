/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.mavenproject1;

/**
 *
 * @author thedoc
 */
public class Hilo2 extends Thread {
    String a[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}; 
    @Override
    public void run() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
}
