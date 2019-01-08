package all;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
//import java.io.*;    
import java.awt.event.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

public class Forgot {
  JFrame frame;
	
	Forgot()
	{
	JFrame f=new JFrame("Forgot Password"); 
	f.setBounds(150, 150, 730, 589);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//help to create group of object in screen 
	Container co=f.getContentPane();
	co.setLayout(null);
	co.setBackground(Color.GRAY);
	//frame.setForeground(Color.GREEN);
	f.setVisible(true);
	//co.setBackground(Color.GRAY);
    final JLabel label = new JLabel();            
    label.setBounds(20,150, 210,50);  
    final JPasswordField value = new JPasswordField();   
    value.setBounds(130,85,150,20);   
    JLabel l1=new JLabel("Username:");    
       l1.setBounds(20,20, 80,30);
       JLabel l2=new JLabel("New Password");    
       l2.setBounds(10,75,120,35);    
       JButton b = new JButton("Login");  
       b.setBackground(Color.BLUE);
       b.setBounds(100,120, 80,30); 
       //b.setLayout(null);
       final JTextField text = new JTextField();  
       text.setBounds(100,20, 100,30);    
               f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
               f.setSize(300,300);    
               f.setLayout(null);    
               f.setVisible(true); 
               b.addActionListener(new ActionListener() {  
                   public void actionPerformed(ActionEvent e) { 
                	   JOptionPane.showMessageDialog(null, "Your Passworld Changed");
                	   f.dispose();
                	   
                	   
               		
       			}
       		});
                   }
           
	}

