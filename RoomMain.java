/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Kashif Ahmad
 */
public class RoomMain extends JFrame{
    JButton b1, b2,b3,b4;
    RoomMain()
    {
        setSize(400,500);
        setLayout(new GridLayout(4,1));
        
        b1= new JButton("Enter Room");
        b1.setBackground(Color.GREEN);
        b2= new JButton("Search Room");
        b2.setBackground(Color.GREEN);
        b3= new JButton("Display Room");
        b3.setBackground(Color.GREEN);
        b4= new JButton("Home");
        b4.setBackground(Color.RED);
        
        
        
        MyActionListener m = new MyActionListener();
        
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);
        
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setVisible(true);
       
    }
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "Enter Room")
            {
                dispose();
                AddRoom c = new AddRoom();
            }
             if (e.getActionCommand() == "Search Room")
            {
                dispose();
                SearchRoom c = new SearchRoom();
            }
            
            if (e.getActionCommand() == "Display Room")
            {
                dispose();
                DisplayRoom c = new DisplayRoom();
            }
            if (e.getActionCommand() == "Home")
            {
                dispose();
                Main d=new Main();
            }
            
        }
    }
    
}
