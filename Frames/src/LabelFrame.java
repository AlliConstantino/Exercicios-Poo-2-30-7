/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
        
public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame() {
      super("Testando JLabel");
      
      setLayout(new FlowLayout());
      label1 = new JLabel("JLabel Texto");
      label1.setToolTipText("mensagem de dica");
      add(label1);
      
      Icon inseto = new ImageIcon(getClass().getResource(name))
    }
}
