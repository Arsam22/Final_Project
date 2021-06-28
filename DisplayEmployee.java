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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Kashif Ahmad
 */
public class DisplayEmployee extends JFrame{
    JButton b1,b2;
	
	DisplayEmployee() {
		setSize(200,200);
		setLayout(new GridLayout(2,2));
		
		b1 = new JButton("Display");
                b1.setBackground(Color.ORANGE);
		b2 = new JButton("Return");
                b2.setBackground(Color.RED);
		
		MyActionListener m = new MyActionListener();
		b1.addActionListener(m);
		b2.addActionListener(m);
		
		add(b1);
		add(b2);
		setVisible(true);
	}
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
		ArrayList<Employee> emp = Employee.readFromFile();
           
            if (e.getActionCommand() == "Display")
            {
                
		for (int i=0; i<emp.size(); i++) {
                    		
                    JOptionPane.showMessageDialog(null, ("Name =" +emp.get(i).getName()+"    ID="+emp.get(i).getID()+"    Designation=" +emp.get(i).getDesignation()+"    CNIC=" +emp.get(i).getCnic()+"     Phone No=" +emp.get(i).getPhoneNo()+"    Pay=" +emp.get(i).getPay()));
               
	}}
             
            if (e.getActionCommand() == "Return")
            {
                dispose();
                EmployeeMain empl=new EmployeeMain();
            }
        }
    }
    
    
}
