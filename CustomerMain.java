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
public class CustomerMain extends JFrame {
    JButton b1, b2, b3,b4, b5,b6;
    CustomerMain()
    {
        setSize(400,500);
        setLayout(new GridLayout(6,1));
        
        b1= new JButton("Enter Customer");
        b1.setBackground(Color.GREEN);
        b2= new JButton("Search Customer");
        b2.setBackground(Color.GREEN);
        b3= new JButton("Update Customer");
        b3.setBackground(Color.GREEN);
        b4= new JButton("Delete Customer");
        b4.setBackground(Color.GREEN);
        b5= new JButton("Display Customer");
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
            if (e.getActionCommand() == "Enter Customer")
            {
                dispose();
                AddCustomer c = new AddCustomer();
            }
             if (e.getActionCommand() == "Search Customer")
            {
                dispose();
                SearchCustomer c = new SearchCustomer();
            }
             
            if (e.getActionCommand() == "Update Customer")
            {
                dispose();
                UpdateCustomer c = new UpdateCustomer();
            }
            if (e.getActionCommand() == "Delete Customer")
            {
                dispose();
                DeletCustomer c = new DeletCustomer();
            }
            if (e.getActionCommand() == "Display Customer")
            {
                dispose();
                DisplayCustomer c = new DisplayCustomer();
            }
            if (e.getActionCommand() == "Home")
            {
                dispose();
                Main d=new Main();
            }
            
        }
    }
}
