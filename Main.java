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
public class Main extends JFrame{
    JButton b1, b2, b3,b4;
    Main()
    {
        setSize(400,500);
        setLayout(new GridLayout(4,1));
        
        b1= new JButton("Employee Management");
       
        b1.setBackground(Color.CYAN);
        b2= new JButton("Customer Management");
        b2.setBackground(Color.CYAN);
        b3= new JButton("Room Management");
        b3.setBackground(Color.CYAN);
        b4= new JButton("Exit");
        b4.setBackground(Color.red);
        
        
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
            if (e.getActionCommand() == "Employee Management")
            {
                dispose();
                EmployeeMain c = new EmployeeMain();
            }
             if (e.getActionCommand() == "Customer Management")
            {
                dispose();
                CustomerMain c = new CustomerMain();
            }
             
            if (e.getActionCommand() == "Room Management")
            {
                dispose();
                RoomMain c = new RoomMain();
            }
            if (e.getActionCommand() == "Exit")
            {
                dispose();
                System.exit(0);
            }
            
            
        }
    }
}
