/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alicia.constantino
 */
import javax.swing.JFrame;
public class MouseApp {
    
    public static void main(String[] args){
    
        MouseTrackerFrame mouseTrackerFrame = newMouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300,100);
        mouseTrackerFrame.setVisible(true);    
    }
    
}
