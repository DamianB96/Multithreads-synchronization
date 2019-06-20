package Hilos;

/**
 *
 * @author damian
 */
public class hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
             System.out.print(i + ": H");
             
            try {
                hilo1.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo1 " + ex);
            }
        }
    }

}
