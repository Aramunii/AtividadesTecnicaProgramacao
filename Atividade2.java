    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    package atividade2;

    import javax.swing.JOptionPane;

    /**
     *
     * @author Maerzão
     */
    public class Atividade2 {

        /**
         * @param args the command line arguments
         */
         public static int base;
         public static int altura;
                  
              
        public static void Base(){
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));  // SOLICITA A BASE
        }

        public static void Altura(){
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));  // SOLICITA A ALTURA
        }
       

        public static float CalculoArea(int b, int a){  // FUNÇÃO DE CALCULO DA AREA

              float resultado = b * a / 2;  // calcula a area
            
        return resultado;

        }

        public static void main(String[] args) {
             Base();
             Altura();
            float Resultado = CalculoArea(base,altura);  // CHAMA A FUNÇÃO que mostra o resultado RESULTADO,
            JOptionPane.showMessageDialog(null, Resultado);

            // TODO code application logic here
        }

    }
