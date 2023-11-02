/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import controlador.CtrVtnAerolinea;
import vista.VtnAerolinea;

/**
 *
 * @author Sellan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         iniciarAplicacionAerolinea();
    }
    
    private static void iniciarAplicacionAerolinea(){
        VtnAerolinea oVtnAerolinea = new VtnAerolinea();
        new CtrVtnAerolinea(oVtnAerolinea);
        oVtnAerolinea.setVisible(true);
    }
}
