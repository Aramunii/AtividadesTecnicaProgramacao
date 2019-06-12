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
public class Banco {
    public static void main(String[] args) {
    
        
        Conta c1 = new Conta();
        c1.setNome("Maer");
        c1.setSaldo(200);
         double sacar = Double.parseDouble(JOptionPane.showInputDialog("Sacar Quanto?"));
         
         try {
            c1.Sacar(sacar);
            JOptionPane.showMessageDialog(null, "Você tem ainda " + c1.getSaldo());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Você não tem o valor para saque");
        }
         
         
         
        
        
        
        
        
    
    
    }
}
