/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;

public class BtnPanel extends JPanel {
    private JButton addtask;
    private JButton clear;
    
    Border emptyborder = BorderFactory.createEmptyBorder();
    
    public BtnPanel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(Color.YELLOW);
        
        addtask = new JButton("add Task");
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(addtask);
        
        this.add(Box.createHorizontalStrut(20));
        
        clear = new JButton("Clear All Task");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(clear);
        
        
        
    }
    public JButton getaddtaskbtn(){
        return addtask;
    }
    public JButton getclearbtn(){
        return clear;
    }
    
}
