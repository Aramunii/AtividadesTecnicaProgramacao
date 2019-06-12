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
public class Conta {
    private String nome;
    private double saldo;

    
    public void Sacar(double sacar){
        
        if(saldo < sacar){
        throw new IllegalArgumentException();
    }else if(saldo == 0){
        throw new IllegalArgumentException();
    }else{
        this.saldo -= sacar;
    }
 
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
