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
public class EmployeeMain  extends JFrame{
    JButton b1, b2, b3,b4, b5,b6;
    EmployeeMain()
    {
        setSize(400,500);
        setLayout(new GridLayout(6,1));
        
        b1= new JButton("Enter Employee");
        b1.setBackground(Color.GREEN);
        b2= new JButton("Search Employe");
        b2.setBackground(Color.GREEN);
        b3= new JButton("Update Employe");
        b3.setBackground(Color.GREEN);
        b4= new JButton("Delete Employe");
        b4.setBackground(Color.GREEN);
        b5= new JButton("Display Employe");
        b5.setBackground(Color.GREEN);
        b6= new JButton("Home");
        b6.setBackground(Color.RED);
        
        MyActionListener m = new MyActionListener();
        
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);
        b5.addActionListener(m);
        b6.addActionListener(m);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setVisible(true);
       
    }
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "Enter Employee")
            {
                dispose();
                AddEmployee e1 = new AddEmployee();
            }
             if (e.getActionCommand() == "Search Employe")
            {
                dispose();
                SearchEmployee s=new SearchEmployee();
                
                        }
             
            if (e.getActionCommand() == "Update Employe")
            {
                dispose();
                UpdateEmployee u=new UpdateEmployee();
            }
            if (e.getActionCommand() == "Display Employe")
            {
                dispose();
                DisplayEmployee u=new DisplayEmployee();
            }
            if (e.getActionCommand() == "Delete Employe")
            {
                dispose();
                DeletEmployee d=new DeletEmployee();
            }
            if (e.getActionCommand() == "Home")
            {
                dispose();
                Main d=new Main();
            }
        }
    }
    
}
