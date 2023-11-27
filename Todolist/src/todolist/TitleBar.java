/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;

public class TitleBar extends JPanel {
    
    JLabel TitleText = new JLabel("To Do List App");
    public TitleBar(){
        
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(90,143,123));
        
        TitleText.setPreferredSize(new Dimension(200,80));
        TitleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.TitleText);
    }
}
