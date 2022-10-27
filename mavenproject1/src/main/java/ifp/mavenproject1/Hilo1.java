/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.mavenproject1;

/**
 *
 * @author thedoc
 */
public class Hilo1 extends Thread {

    @Override
    public void run() {
        int numero = 0;
        boolean salir = false;
      
      
        while (!salir) {            
            numero = numero + 3;
            System.out.println(numero);
            if(numero == 102){
                salir = true;
                return;
            }
        }
        
    }
    
}
