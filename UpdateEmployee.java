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
public class UpdateEmployee extends JFrame{
    JLabel l1 , l2;
    JTextField t1 , t2;
    JButton b1,b2;
    
    UpdateEmployee()
    {
        setSize(400,400);
        setLayout(new GridLayout(3,2));
        
        l1= new JLabel("Enter the name of Employee to be Updated");
        t1 = new JTextField (20);
        t1.addActionListener(new MyActionListener());
        
        
        l2= new JLabel("Enter the new name");
        t2 = new JTextField (20);
        t2.addActionListener(new MyActionListener());
        
        
        
        
        
        b1 = new JButton("Update");
        b1.setBackground(Color.ORANGE);
        b2 = new JButton("Return");
        b2.setBackground(Color.RED);
        
        
        MyActionListener m = new MyActionListener();
        b1.addActionListener(m);
        b2.addActionListener(m);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        setVisible(true);
    }
    
   
    
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "Update")
            {
             Employee.updateEmployee(t1.getText(),t2.getText());
             JOptionPane.showMessageDialog(null, "Record Updated");
                      
            }
            if (e.getActionCommand() == "Return")
            {
                dispose();
                EmployeeMain c=new EmployeeMain();
            }
        }
    }
    
}
