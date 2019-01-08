package all;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exsistinguser 
{
	Exsistinguser()
	{
		
		JFrame f=new JFrame("Exsisting user");  

		f.setBounds(150, 150, 730, 589);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//help to create group of object in screen 
		Container co=f.getContentPane();
		co.setLayout(null);
		co.setBackground(Color.GRAY);
		//frame.setForeground(Color.GREEN);
		f.setVisible(true);
		co.setBackground(Color.GRAY);
	     final JLabel label = new JLabel();            
	     label.setBounds(20,150, 200,50);  
	     final JPasswordField value = new JPasswordField();   
	     value.setBounds(100,75,100,30);   
	     JLabel l1=new JLabel("Username:");    
	        l1.setBounds(20,20, 80,30);
	        JLabel l2=new JLabel("Password:");    
	        l2.setBounds(20,75, 80,30);    
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
		                public void actionPerformed(ActionEvent e) 
		                {
		                int b= Integer.parseInt(JOptionPane.showInputDialog(null,"if you want to go match macking process press 1"));
		                if(b==1)
		                {
		                	new Match();
		                	f.dispose();
		                }
		                else
		                {
		                	f.dispose();
		                }
		                }
		                  
		             });
    }
}

