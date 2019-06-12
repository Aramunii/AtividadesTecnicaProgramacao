/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula1106;

import javax.swing.JOptionPane;

/**
 *
 * @author A06164256
 */
public class Aula1106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        igual7 vd = new igual7();
       int num= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
       
        try {
            vd.validaNumero(num);
        } catch (ExcNumero e) {
           JOptionPane.showMessageDialog(null, e.numDigitado());
        }
         
        
        
        
    }
    
}
