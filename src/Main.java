
import controller.LivroDAO;
import view.TelaPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronnison
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                TelaPrincipal telaPrinc = new TelaPrincipal();
                telaPrinc.setVisible(true);
            }
        };
        
        runnable.run();
    }
    
}
