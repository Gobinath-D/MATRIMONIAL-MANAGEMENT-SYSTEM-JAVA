package all;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Color;
public class Front extends JFrame implements ActionListener
{
	
	    JLabel l;  
	    JCheckBox cb1,cb2,cb3,cb4,cb5;  
	    JButton b;
	    JFrame f;
	 Front()
	 {  
	    	JFrame f=new JFrame("Front page");  
	    	f.setVisible(true);
	    	f.setBounds(700,700,551,451);
	    	Container con=f.getContentPane();
	    	con.setLayout(null);
	    	con.setBackground(Color.BLACK);
	    	l=new JLabel("Matrimonial management System");
	    	l.setForeground(Color.black);
	        l.setBounds(100,30,500,30);  
	        f.add(l);
	    	ImageIcon icon=new ImageIcon("D:\\out1.jpg");
			   JLabel label1=new JLabel(icon);
			   f.add(label1);
			   label1.setBounds(8,20,icon.getIconWidth(),icon.getIconHeight());
	    	 b=new JButton("Start");
			   b.setBounds(50,350,160,30);
			   b.setLayout(null);
			   //b.setSize(80,80);
			   b.setVisible(true);
			   f.add(b);
			   b.addActionListener(new ActionListener()
	   		{
	   	public void actionPerformed(ActionEvent e)
	   	{
	    	
	   	new Mat();
	   	f.dispose();
	    	
	   	}
	   });
	    	
	 }
	  

	    	
	    /*    l=new JLabel("Matrimonial management System");
	    	l.setForeground(Color.black);
	        l.setBounds(250,30,500,30);  
	        f.add(l);
	        cb1=new JCheckBox("Admin");  
	        cb1.setBounds(100,100,150,20);  
	        cb2=new JCheckBox("New user");  
	        cb2.setBounds(100,150,150,20);  
	        cb3=new JCheckBox("Exsisting user");  
	        cb3.setBounds(100,200,150,20);
	        cb4=new JCheckBox("Fogot password");
	        cb4.setBounds(100,250,150,20);
	        cb5=new JCheckBox("Match Macking");
	        cb5.setBounds(100,300,150,20);
	        b=new JButton("Click"); 
	        b.setBounds(100,350,80,30);  
	        b.addActionListener(this);  
	       f.add(l);f.add(cb1);f.add(cb2);f.add(cb3);f.add(b); f.add(cb4);f.add(cb5); 
	       // setSize(400,400);  
	        //setLayout(null);  
	        //setVisible(true);  
	      
	        setDefaultCloseOperation(EXIT_ON_CLOSE);  
	    }  
	    public void actionPerformed(ActionEvent e){   
	        if(cb1.isSelected())
	        {
	        	  new Admin();
	        	
	        	  
	        	
	        }  
	        if(cb2.isSelected())
	        {  	
	     //new JAVASwingFormExample1();
	       	new New();
	        }  
	        if(cb3.isSelected())
	        {  
	          new Exsistinguser();  
	        }
	        if(cb4.isSelected())
	        {
	        	new Forgot();
	        }
	        if(cb5.isSelected())
	        {
	        	new Match();
	        }
	        
	    } */
	    
	public static void main(String aa[])
	{
		new Front();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
				
			

	

	



