/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadObligatoria1.RelojAlarma;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agust
 */
public class Reloj implements Runnable {

    private Cama cama;

    public Reloj(Cama cama) {
        this.cama = cama;
    }

    public void run() {
        while (true) {
            this.pasaHora();
            cama.actualizaHora();

        }
    }

    private void pasaHora() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
