/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
    
     private int diameter = 10; //diametro padrão
     
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(10, 10,diameter, diameter); //desenha circulo
     }

public void setDiameter(int newDiameter){
    diameter = (newDiameter >= 0 ? newDiameter : 10);
   repaint();
}

public Dimension getPreferredSize(){
   return new Dimension(200,200);
}// fim do metodo getPreferredSize

public Dimension getMinimumSize(){
   return getPreferredSize();
   }// fim metodo Minimum Size

}//fim da classe

