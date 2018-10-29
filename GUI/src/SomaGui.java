/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */

import javax.swing.JOptionPane;
public class SomaGui {
    
    
    public static void main(String[] args){
      
        
        //pedir ao usuario que insira os numeros
        String numero1 = JOptionPane.showInputDialog("Digite o primeiro número a ser somado");
        String numero2 =  JOptionPane.showInputDialog("Digite o segundo número");
        
        //converter String em valores para calcular
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        int soma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "A soma dos números " + numero1 + " e " + numero2 + " é " + soma );
    }
}
