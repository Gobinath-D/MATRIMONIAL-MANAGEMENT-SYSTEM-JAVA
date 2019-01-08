package all;
import javax.swing.*; 
import java.io.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Admin 
{  int i;
String a;
	Admin()
	{
		int j = 0;
		String[] aa=new String[10];
	 i=Integer.parseInt(JOptionPane.showInputDialog(null,"If you want to login press 1 want see candidate details press 2"));
	if(i==1)
	{
	JFrame f=new JFrame("Admin");
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
		                public void actionPerformed(ActionEvent e) {       
		                   String data =text.getText();  
		                   String pass=text.getText(); 
		                  // System.out.println(data+pass);
		                  // label.setText(data);
		                   f.dispose();
		                   if(data.equals("gobi")&&pass.equals("gobi"))
		                   {
	                	   JOptionPane.showMessageDialog(null,"You Are Admin");
		                   }
		                   else
		                   {
		                	   JOptionPane.showMessageDialog(null,"You Not A Admin"); 
		                   }
		                 // b.sleep(500);
		                 
		                   
		                }
		               
		                });
	       
	                     
	} 

	          
	if(i==2)
	{
		String filepath="D:\\boot\\";
		a=JOptionPane.showInputDialog(null,"Enter candidate mobile number");
		filepath=filepath+a;
		filepath=filepath+".txt";
		//File file = new File(filepath);
		//System.out.println(filepath);
		 try(BufferedReader br = new BufferedReader(new FileReader(filepath))) 
		 {
			 String sCurrentLine;
	         while ((sCurrentLine = br.readLine()) != null) {
				//	System.out.println(sCurrentLine);
					 aa[j]= sCurrentLine;
						j++; 
		 }
		 }
	         catch (IOException e) {
	             e.printStackTrace();}
		 JOptionPane.showMessageDialog(null,aa[0]+"\n"+aa[1]+"\n"+aa[2]+"\n"+aa[3]+"\n"+aa[4]+"\n"+aa[5]+"\n"+aa[6]+"\n"+aa[7]+"\n"+aa[8]+"\n");
		 
		   //JOptionPane.showMessageDialog(null, "Candidate Detail are display in Output screen");
		 }
	}
}	  

