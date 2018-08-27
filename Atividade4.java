/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author Maerzão
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static int Inteiro; // declara a variavel TamanhoCubo

    public static void Entrada() {

        Inteiro = Integer.parseInt(JOptionPane.showInputDialog("insira o valor do cubo")); // solicita um numero inteiro

    }

    public static double Cubo(double x) {

        double cubo = x / 6; // calcula o tamanho do cubo
            return cubo;
    }
      
    

    public static double Esfera(int x) {

        double Esfera = ( 4 * 3.14 * (x ^ 3) ) / 3; // calcula a esfera

        return Esfera;
    }
    
    public static double Equacao(double x,double y ){
           
        double Equacao = (x*3) + (y*3) + 2;
    
    return Equacao;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Entrada();                                   //chama o procedimento de entrada de dados
        double ResultCubo = Cubo(Inteiro);          // chama a função que calcula o volume da esfera
        double ResultEsfera = Esfera(Inteiro);    // chama a função que calcula o tamanho do cubo 
        
        double Resultado = Equacao(ResultCubo,ResultEsfera); // COLOCA O RESULTADO DO CUBO NO X E O RESULTADO DA ESFERA NO Y E CALCULA 
        
               System.out.println("O Valor do cubo é " + ResultCubo);
        System.out.println("O Volume da esfera é " + ResultEsfera);
        System.out.println("O resultado da equação é " + Resultado);

    }

}
