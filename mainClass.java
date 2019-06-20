package Hilos;

/**
 *
 * @author damian
 */
public class mainClass {
    
    public static void main(String[] args) {
        hilo1 hilo1 = new hilo1();
        hilo2 hilo2 = new hilo2();
        hilo3 hilo3 = new hilo3();
        hilo4 hilo4 = new hilo4();
        
        
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo1 " + ex);
        }
        
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo2 " + ex);
        }
        
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo3 " + ex);
        }
        
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo4 " + ex);
        }
        
    }
    
}
