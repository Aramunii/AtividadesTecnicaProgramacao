    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    package atividade2;

    import javax.swing.JOptionPane;

    /**
     *
     * @author uz54049
     */
    public class Atividade2 {

        /**
         * @param args the command line arguments
         */
        
        public static void Resultado(){  // PROCEDIMENTO PARA SOLICITAR BASE E ALTURA E MOSTRAR O RESULTADO
            
           int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));  // SOLICITA A BASE
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura")); // SOLICITA A ALTURA 
            float resultado = CalculoArea(base,altura); // CHAMA A FUNÇÃO E INSERE OS VALORES NO CALCULO E RETORNA O VALOR 
            JOptionPane.showMessageDialog(null, resultado); // EXIBE NA TELA
            
    }

       

        public static float CalculoArea(int b, int a){  // FUNÇÃO DE CALCULO DA AREA

              float resultado = b * a / 2;  // calcula a area
            
        return resultado;

        }

        public static void main(String[] args) {
             
            Resultado();  // CHAMA A FUNÇÃO RESULTADO,
           

            // TODO code application logic here
        }

    }
