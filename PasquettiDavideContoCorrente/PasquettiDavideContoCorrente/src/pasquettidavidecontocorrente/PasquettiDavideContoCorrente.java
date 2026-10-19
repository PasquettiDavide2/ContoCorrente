/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasquettidavidecontocorrente;

/**
 *
 * @author pasquetti.davide
 */
public class PasquettiDavideContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContoCorrente B1 = new ContoCorrente ("Davide", "Pasquetti", 500);
        /**
         * metodo che versa il saldo sul contocorentre
         */
        B1.Versa(500);
        /**
         * metodo che prelieva il saldo sul contocorrente
         */
        B1.Preleva(0);
        
        System.out.println(B1.toString());
        
    }
    
}
