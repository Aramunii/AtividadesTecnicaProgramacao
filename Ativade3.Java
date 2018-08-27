package atividade3;

import javax.swing.JOptionPane;

/**
 *
 * @author Maerzão
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    
        public static float tamanhoCubo; // declara a variavel TamanhoCubo
   
    
    public static void Entrada(){
    
    tamanhoCubo = Integer.parseInt(JOptionPane.showInputDialog("insira o valor do cubo")); // solicita um numero inteiro
    
    }
    
    public static float ValorCubo(float tamanhoCubo){
    
         float resultado = tamanhoCubo /6 ; // calcula o tamanho do cubo
    
    return resultado;
    }
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        Entrada(); //chama o procedimento de entrada de dados
       float Resultado = ValorCubo(tamanhoCubo);  // chama a função que calcula o tamanho do cubo 
        JOptionPane.showMessageDialog(null, Resultado); // exibe o resultado na tela
               
        
    }
    
}
