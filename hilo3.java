/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author damian
 */
public class hilo3 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
             System.out.print("l");
             
        try {
            hilo3.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo3 " + ex);
        }
        }
    }
}
