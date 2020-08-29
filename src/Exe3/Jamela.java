/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author sandy
 */
public class Jamela extends JFrame {
    public Jamela(){ 
        Dimension tela=Toolkit.getDefaultToolkit().getScreenSize();
        int largaraTel=tela.width;
        int altTel=tela.height;
        int larJ=largaraTel/2;
        int altJ=altTel/2;
        setSize(larJ,altJ);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo( null );
        setVisible(true);
    }
    
}