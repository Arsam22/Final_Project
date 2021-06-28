/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
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
public class DeletCustomer extends JFrame {
    JLabel l1;
    JTextField t1;
    JButton b1,b2; 
	
	DeletCustomer() {
		setSize(200,200);
		setLayout(new GridLayout(2,2));
		l1 = new JLabel("Enter Name of the Customer to Delete Record");
		t1 = new JTextField(20);
		b1 = new JButton("DELETE");
                b1.setBackground(Color.ORANGE);
		b2 = new JButton("Return");
                b2.setBackground(Color.RED);
		
		MyActionListener m = new MyActionListener();
		b1.addActionListener(m);
		b2.addActionListener(m);
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		setVisible(true);
	}
	
	
	public class MyActionListener implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			
			ArrayList<Customer> cus = Customer.readFromFile();

			if(e.getActionCommand()== "DELETE") {
				
				
				if (Customer.searchCustomer(t1.getText())) {
					JOptionPane.showMessageDialog(null, "Customer FOUND");
					
					for (int i=0; i<cus.size(); i++) {
						if (cus.get(i).getName().equalsIgnoreCase(t1.getText())) {
							Customer.deleteCustomer(cus.get(i));	
							JOptionPane.showMessageDialog(null, "Customer Deleted Successfully");
						}	
				}
				}
					
				else {
					JOptionPane.showMessageDialog(null, "Customer NOT FOUND");
				}		
			}
			
			if (e.getActionCommand()=="Return") {
				dispose();
				CustomerMain c=new CustomerMain();
				
			}
			
	}
    
}}
