/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
        
public class List extends JPanel{
    public List(){
        GridLayout Layout = new GridLayout(10,1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        
    }
    public void indexnum(){
        Component[] listcomp = this.getComponents();
        for (int i=0;i<listcomp.length;i++){
            if(listcomp[i] instanceof Task){
                ((Task)listcomp[i]).writeindexjl(i+1);
            }
        }
        
    }
    
}
