/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author alicia.constantino
 */
import java.util.Scanner;
public class ContaBancaria {
     double saldo;
     double limite;
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); 
       ContaBancaria minhaConta;
       minhaConta = new ContaBancaria();
       
       minhaConta.limite = 100.00;
       minhaConta.saldo = 1000.0;
    }//fim do main
    
    public double saca(double saldo){
        System.out.println("Quanto você deseja sacar?Lembrando que seu limite é 100 reais");
        int valor = scanner.nextDouble();
        
    }
    
}//fim da classe
