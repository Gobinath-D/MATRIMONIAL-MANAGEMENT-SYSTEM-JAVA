package all;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Match {
	public JFrame f;
	public JTextField textField_1;
	String phoneno;
	 String sCurrentLine;
	Match()
	{
		JFrame f=new JFrame("Match");  
		f.setBounds(150, 150, 730, 589);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//help to create group of object in screen 
		Container co=f.getContentPane();
		co.setLayout(null);
		co.setBackground(Color.GRAY);
		//frame.setForeground(Color.GREEN);
		f.setVisible(true);
	    final JLabel label = new JLabel();            
	  // label.setBounds(20,150, 210,50);
	   JLabel lblPhone = new JLabel("phone no"); 
		lblPhone.setBounds(65, 68, 56, 14);
		f.getContentPane();
		f.add(lblPhone);
		textField_1 = new JTextField();
		textField_1.setBounds(128, 65, 86, 20);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	    //JLabel l1=new JLabel("Username:");    
	      // l1.setBounds(20,20, 80,30);    
	       JButton b = new JButton("Login");
	       b.setBackground(Color.BLUE);
	       b.setBounds(100,120, 80,30); 
	       final JTextField text = new JTextField();  
	      // text.setBounds(100,20, 100,30);    
	               f.add(lblPhone); f.add(label); f.add(b); f.add(text);  
	               f.setSize(300,300);    
	               f.setLayout(null);    
	               f.setVisible(true); 
	               b.addActionListener(new ActionListener() {  
	                 

	public void actionPerformed(ActionEvent e)
	{ 
	phoneno=textField_1.getText();
	String filepath="D:\\boot\\";
	filepath=filepath+phoneno;
	filepath=filepath+".txt";
	//System.out.println(filepath);
		                		
	//find payed person
	 // System.out.println(searchString);
	File file = new File(filepath);
	int i=1;
	char[] l=new char[10];
	int len= 4;
	String numbers = "0123456789";
	Random rndm_method = new Random(); 
	char[] otp1 = new char[len];
	for (int i1 = 0; i1 < len; i1++) 
	{ 
		otp1[i1] = numbers.charAt(rndm_method.nextInt(numbers.length())); 
	}
	String otp=String.copyValueOf(otp1);
	JOptionPane.showMessageDialog(null,otp);	
	String k=JOptionPane.showInputDialog(null,"Enter OTP"); 
//	System.out.println(k+"\n"+otp);
	if(k.equals(otp))
	{
	try {
	Scanner inputFile;
	String searchString ="paid";
	inputFile = new Scanner (file);
	inputFile.useDelimiter("[\\r,]");
	while(inputFile.hasNext())
	{
		String capital = inputFile.next(); 
		// System.out.println(capital);
		if(searchString.equals(capital))
		{
			//  System.out.println(capital);
			JOptionPane.showMessageDialog(null, "Your paid user");
			i=Integer.parseInt(JOptionPane.showInputDialog(null,"if you want go match macking process press 1"));  
			if(i==1)
			{
				match();
				break;
			}
			
			
			}
		else
		{
			JOptionPane.showMessageDialog(null, "Your Not paid user");
			f.dispose();
			break;
		}
		
	}
	//else
//	{
//
		
	//}
	
	inputFile.close();
	}
	catch (FileNotFoundException e1) {
										
		e1.printStackTrace();
	}						
	}
	else
	{

		JOptionPane.showMessageDialog(null,"OTP is incorrect");	
	}
	
	}

private void match()
{f.dispose();
	int a;
	int i = 0;
	String[] aa=new String[10];
	a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter if you search groom press 1 or bride press 2..."));
	if(a==1)
	{
		String filepath="D:\\boot\\9999999999.txt";
		//File file = new File(filepath);
		//System.out.println(filepath);
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))) 
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				
				aa[i]= sCurrentLine;
				i++;
				
			}
			//JOptionPane.showMessageDialog(null,textDatas);
		}
		catch (IOException e) {
			e.printStackTrace();}
		JOptionPane.showMessageDialog(null,aa[1]+"\n"+aa[2]+"\n"+aa[3]+"\n"+aa[4]+"\n"+aa[5]+"\n"+aa[6]+"\n"+aa[7]+"\n"+aa[8]+"\n");
		JOptionPane.showMessageDialog(null,"This is your matching profile");
		JOptionPane.showInputDialog(null,"Enter Your Feedback");
		JOptionPane.showMessageDialog(null,"Thank you");
		
	}
	if(a==2)
	{
		String filepath="D:\\boot\\9159494642.txt";
		//File file = new File(filepath);
		//System.out.println(filepath);
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))) 
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				aa[i]= sCurrentLine;
				i++; 
				
			}
						         
		}
     	catch (IOException e) {
     		e.printStackTrace();}
		JOptionPane.showMessageDialog(null,aa[1]+"\n"+aa[2]+"\n"+aa[3]+"\n"+aa[4]+"\n"+aa[5]+"\n"+aa[6]+"\n"+aa[7]+"\n"+aa[8]+"\n");
		JOptionPane.showMessageDialog(null,"This is your matching profile");
		JOptionPane.showInputDialog(null,"Enter Your Feedback");
		JOptionPane.showMessageDialog(null,"Thank you");
	}
	

}

});

				
	               
	}
}