/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class SliderFrame extends JFrame {
   private JSlider diameterJSlider;
   private OvalPanel myPanel;

   
//construtor
public SliderFrame() {
  super ("Slider Demo");
  myPanel = new OvalPanel();
  myPanel.setBackground(Color.YELLOW);
  
  //Configura o JSlider para controlar o valor do diametro
  //new Slider (orientação, minimo, maximo, valorInicial)
 diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 100);
 diameterJSlider.setMajorTickSpacing(10); //criar tick cada 10
 diameterJSlider.setPaintTicks(true);
 
 //registra o ouvinte do evento do JSlider
 diameterJSlider.addChangeListener(new ChangeListener()
    {
      //trata da alteração de valor do controle deslizante 
  public void stateChanged(ChangeEvent e) {
      myPanel.setDiameter(diameterJSlider.getValue());
 }//fim do metodo stateChanged
 
 
}
 );//fim da chamada a addChangeListener
 
 add(diameterJSlider, BorderLayout.SOUTH); //adicionar slider ao frame
 add(myPanel, BorderLayout.CENTER);
}//Fim do contrutor SliderFrame

public static void main(String[] args){
   SliderFrame sliderFrame = new SliderFrame();
   sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}