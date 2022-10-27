/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifp.mavenproject1;

/**
 *
 * @author thedoc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread hilo1 = new Hilo1();
       Thread hilo2 = new Hilo2();
       hilo1.start();
       hilo2.start();
    }
    
}
