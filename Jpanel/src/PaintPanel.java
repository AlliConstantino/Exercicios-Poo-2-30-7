
import java.awt.BorderLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
public class PaintPanel extends JPanel {
    private int pointCount = 0;
    private Point[] points = new Point[10000];
    
public PaintPanel(){
   addMouseMotionListener(
     new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent event){
          if (pointCount < points.length){
            points[pointCount] = event.getPoint();
            pointCount++;
            repaint();
          }
        }
     }// fim da classe interna
   ); //fim da chamada addMouseMotionListener       
}// fim contrutor PaintPanel

//desenha ovais em um quadro de 4 por 4 nas localidades especificadas na janela
public void paintComponenent(Graphics g){
   super.paintComponents(g); //limpa area de desenho


//desenha todos os pontos no array
for (int i = 0; i < pointsCount; i++){
  g.fillOval(points[i].x, points[i].y,4, 4);
  }
}

public static void main (String[] args){
  //cria JFrame
  JFrame application  = new JFrame("Um programa de pintar simples");
  PaintPanel paintPanel = new PaintPanel(); //cria painel de pintura
  application.add(paintPanel, BorderLayout.CENTER); //NO CENTRO
  application.add(new JLabel("Move o mouse para desenhar"), BorderLayout.SOUTH);
  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  application.setSize(400,200);
  application.setVisible(true);
}
}
