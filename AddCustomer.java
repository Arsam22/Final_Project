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
public class AddCustomer extends JFrame {
    JLabel l1,l2, l3, l4;
    JTextField t1, t2, t3, t4 ;
    JButton b1, b2;
    JPanel p1, p2;
    AddCustomer()
    {
        setSize(400,800);
        setLayout (new BorderLayout());
        l1 = new JLabel (" Enter NAme");
         l2 = new JLabel (" Enter id");
          l3 = new JLabel (" Enter cnic");
           l4 = new JLabel (" Enter phone");
            
            
              
         t1 = new JTextField(20);
          t2 = new JTextField(20);
           t3 = new JTextField(20);
            t4 = new JTextField(20);
             
             
        
              b1 = new JButton("Submit");
              b1.setBackground(Color.ORANGE);
              b2 = new JButton("Return");
              b2.setBackground(Color.red);
              p1 = new JPanel();
              p1.setLayout(new GridLayout(4,2));
         
      p2 = new JPanel();
              p2.setLayout(new FlowLayout());
              
              p1.add(l1);
              p1.add( t1);
               p1.add(l2);
              p1.add( t2);
         
               p1.add(l3);
              p1.add( t3);
         
               p1.add(l4);
              p1.add( t4);
         
         
             
              
              p2.add(b1);
              p2.add(b2);
              
              add(p1,BorderLayout.CENTER);
              add(p2, BorderLayout.SOUTH);
              
              b1.addActionListener(new MyListener());
               b2.addActionListener(new MyListener());
              setVisible(true);
         
         
    }
    
    public class MyListener implements ActionListener
            
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "Submit")
            {
            Customer c= new Customer(t1.getText(), Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()));
          //Student s1 = new Student ()  
          
          Customer.writeToFile(c);
          JOptionPane.showMessageDialog(null, "Submitted");
            }
            if (e.getActionCommand() == "Return")
            {
                dispose();
                CustomerMain c=new CustomerMain();
        }
           
        }
    }
    
}
