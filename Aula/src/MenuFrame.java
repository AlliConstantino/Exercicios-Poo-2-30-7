
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
public class MenuFrame extends JFrame {
    private final Color colorValues[] = { Color.BLACK, Color.BLUE, Color.RED,Color.GREEN };
    private JRadioButtonMenuItem colorItems[];
    private JRadioButtonMenuItem fonts[];
    private JCheckBoxMenuItem styleItems[];
    private JLabel displayJLabel;
    private ButtonGroup fontButtonGroup; //gerencia itens do menu color
    private  ButtonGroup colorButtonGroup; //gerencia itens do menu color
    private int style; //usada prar criar estilos de fonte
    
    public MenuFrame() {
      super("Usando JMenus");
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic('F'); //configura mnemonic como F
      
      //create About... menu item
      JMenuItem aboutItem = JMenuItem("About...");
      aboutItem.setMnemonic('A'); //set mnemonic to A
      fileMenu.add(aboutItem);
      
      aboutItem.addActionListener(new ActionListener() {
                 // anonima
                 //exibe dialog quando usuario seleciona About...
                 public void actionPerfomed(ActionEvent event){
                     JOptionPane.showMessageDialog(MenuFrame.this, "This is an example\nof using menus", "About", JOptionPane.PLAIN_MESSAGE);
                 }

          @Override
          public void actionPerformed(ActionEvent e) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
    }
);
       //Item de menu Exit(Que aparentemente fecha do programa)
      JMenuItem exitItem = new JMenuItem("Exit");//cria o item de menu Exit
      aboutItem.setMnemonic('x'); //atalho dele sera x
      fileMenu.add(exitItem); //adiciona de vez

      exitItem.addActionListener(new ActionListener() { //ouvidor do menu,se a pessoa clicar nele fecha
          //anonima
          //fecha o programa...?
                 public void actionPerformed(ActionEvent event) {
                    System.exit(0);
          }
}
      );  
      
      JMenuBar bar = new JMenuBar();
      setJMenuBar(bar);
      bar.add(fileMenu);
      JMenu formatMenu = new JMenu("Format");
      formatMenu.setMnemonic('r');
      // array listing string colors
      String colors[] = { "Black", "Blue", "Red", "Green"};
      JMenu colorMenu = new JMenu("Color");
      colorMenu.setMnemonic('C');
      
      //create color radio button menu items
      for( int count = 0; count < colors.length; count++){
        colorsItems[ count] = new JRadioButtonMenuItem( colors[count]);
        colorMenu.add(colorItems[ count]);
        colorButtonGroup.add( colorItems[ count ]);
        colorItems[ count ].addActionListener( itemHandler);
      }
      
      colorItems[0].setSelected(true); //seleciona primeira cor do item
      formatMenu.add( colorMenu); //add color menu to format menu
      formatMenu.addSeparator(); //add separator in menu
      
      //array listing font names
      String fontNames[] = { "Serif, "Monospaced"}
    } 
    
    
}
