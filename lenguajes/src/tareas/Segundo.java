/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class Segundo extends Thread{
    public void run(){
        while(true){
            try {
                //aqui pones la accion de tu Thread
                System.out.println("soy el segundo Thread que no hace nada");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    
}
