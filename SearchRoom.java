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
public class SearchRoom extends JFrame {
    JLabel l1;
    JTextField t1;
    JButton b1,b2;
    
    SearchRoom()
    {
        setSize(400,400);
        setLayout(new GridLayout(2,2));
        
        l1= new JLabel("Enter the Room to be searched");
        t1 = new JTextField (20);
        b1 = new JButton("SEARCH");
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
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "SEARCH")
            {
              if (  Room.searchRoom(Integer.parseInt(t1.getText()))  )
                  JOptionPane.showMessageDialog(null, "Room Available");
              else
                  JOptionPane.showMessageDialog(null, "Room NOT Available");
                      
            }
            if (e.getActionCommand() == "Return")
            {
                dispose();
                RoomMain c=new RoomMain();
            }
        }
    }
    
}
