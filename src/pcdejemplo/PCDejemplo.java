/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pcdejemplo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio diego
 */
public class PCDejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("hola mundo");
        
        Saludador sal = new Saludador(9);
        
        sal.Saludar("hola");
        try {
            sal.Despide("adios");
        } catch (Exception ex) {
            Logger.getLogger(PCDejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
