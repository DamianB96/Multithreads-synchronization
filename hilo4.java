package Hilos;

/**
 *
 * @author damian
 */
public class hilo4 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
             System.out.println("a");
             
        try {
            hilo4.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo4 " + ex);
        }
        }
    }
}
