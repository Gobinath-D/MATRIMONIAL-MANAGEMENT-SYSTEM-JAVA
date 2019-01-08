package all;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
class JAVASwingFormExample1 {
	
	JAVASwingFormExample1()
	{
		 aa();
	}
public void aa() {
	JFrame frame;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;

	String age,name,phoneno,gender,DOB,Qualification, Mtongue,caste,salary;
	//create instance
		frame = new JFrame();
		frame.setBounds(150, 150, 730, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//help to create group of object in screen 
		Container co=frame.getContentPane();
		co.setLayout(null);
		co.setBackground(Color.GRAY);
		//frame.setForeground(Color.GREEN);
		frame.setVisible(true);
		//name field
		textField = new JTextField();
		textField.setBounds(128, 28, 86, 20);
		frame.getContentPane();
		frame.add(textField);
		textField.setColumns(10);
		
		JLabel lblPhone = new JLabel("phone no"); 
		lblPhone.setBounds(65, 68, 56, 14);
		frame.getContentPane();
		frame.add(lblPhone);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(65, 31, 46, 14);
		frame.getContentPane().add(lblName);
		//phone no field
		textField_1 = new JTextField();
		textField_1.setBounds(128, 65, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDOB = new JLabel("DOB");
		lblDOB.setBounds(65, 115, 46, 20);
		frame.getContentPane().add(lblDOB);
		//dob
		textField_2 = new JTextField();
		textField_2.setBounds(128, 112, 147, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(65, 161, 46, 14);
		frame.getContentPane().add(lblAge);
		//age 		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(130, 165, 86, 20);
		frame.getContentPane().add(textArea_1);
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(312, 487, 89, 23);
		btnClear.setBackground(Color.BLUE);
		btnClear.setForeground(Color.GREEN);
		frame.getContentPane().add(btnClear);
		
		JLabel lblgender = new JLabel("Gender");
		lblgender.setBounds(65, 228, 46, 14);
		frame.getContentPane().add(lblgender);
		//gender
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(145,220, 56, 20);
		frame.getContentPane().add(textArea_3);
		
		JLabel lblQualification= new JLabel("Qualification");
		lblQualification.setBounds(65, 288, 87, 14);
		frame.getContentPane().add(lblQualification);
		
		//Qualification
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(145,285, 90, 20);
		frame.getContentPane().add(textArea_4);	
		
		
		JLabel lblMtongue= new JLabel("Mother tongue");
		lblMtongue.setBounds(65, 340, 87, 14);
		frame.getContentPane().add(lblMtongue);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(155,340, 90, 20);
		frame.getContentPane().add(textArea_5);
		
		JLabel lblcaste= new JLabel("caste");
		lblcaste.setBounds(65, 390, 87, 14);
		frame.getContentPane().add(lblcaste);
		//caste
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(155,390, 90, 20);
		frame.getContentPane().add(textArea_6);	
		
		
		JLabel lblsalary= new JLabel("salary");
		lblsalary.setBounds(65, 430, 87, 14);
		frame.getContentPane().add(lblsalary);
		//salary
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(155,430, 90, 20);
		frame.getContentPane().add(textArea_7);	
		
		JButton btnSubmit = new JButton("submit");
		
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.GREEN);
		btnSubmit.setBounds(65, 487, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
	JButton btnnext = new JButton("Prime");
		
		btnnext.setBackground(Color.BLUE);
		btnnext.setForeground(Color.GREEN);
		btnnext.setBounds(170, 490, 110, 23);
		frame.getContentPane().add(btnnext);
		
		btnSubmit.addActionListener(new ActionListener() {
			//frame.dispose();
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(textArea_3.getText().isEmpty())||(textArea_4.getText().isEmpty())||(textArea_5.getText().isEmpty())||(textArea_6.getText().isEmpty())||(textArea_7.getText().isEmpty())||(textArea_1.getText().isEmpty()))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else		
				JOptionPane.showMessageDialog(null, "Data Submitted");
			}
		});
	
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textArea_1.setText(null);
				textArea_3.setText(null);
				textArea_4.setText(null);
				textArea_5.setText(null);
				textArea_6.setText(null);
				textArea_7.setText(null); 
			
				
				
			}
		});
		btnnext.addActionListener(new ActionListener() {  
			
             public void actionPerformed(ActionEvent e) { 
            		frame.dispose();
                String name= "Name=" +textField.getText();  
                String phoneno=textField_1.getText();
                String DOB="DOB="+textField_2.getText();
                String age="age="+textArea_1.getText();
                String gender="gender="+textArea_3.getText();
                String Qualification="Qualification="+textArea_4.getText();
                String Mtongue="mother tongue="+textArea_5.getText();
                String caste="Caste="+textArea_6.getText();
                String salary="salary="+textArea_7.getText();
                String filepath="D:\\boot\\";
                filepath=filepath+phoneno;
        		filepath=filepath+".txt"; 
        		//System.out.println(filepath);
        		 File file = new File(filepath);
        		  FileWriter fw;
        		  int k=1;
				try {
					fw = new FileWriter(file.getAbsoluteFile());
					k=Integer.parseInt(JOptionPane.showInputDialog(null,"if you want join prime press1")); 
					if(k==1)
					{
					BufferedWriter bw = new BufferedWriter(fw);
					 JOptionPane.showInputDialog(null,"Enter card number");
					  JOptionPane.showInputDialog(null,"Enter cvv");
					  JOptionPane.showInputDialog(null,"Enter valid Date");
					 bw.write("paid");
					 bw.newLine();
						bw.write(name);
					 bw.newLine();
					 	bw.write("phone no="+phoneno);
					 bw.newLine();
						bw.write(DOB);
					 bw.newLine();
						bw.write(gender);
					 bw.newLine();
						bw.write(Qualification);
					 bw.newLine();
					 	bw.write(Mtongue);
					 bw.newLine();
					 	bw.write(caste);
					 bw.newLine();
					 	bw.write(salary);
					 bw.newLine();
					   JOptionPane.showMessageDialog(null, "payment succesfully!!!");
					bw.close();
					}
					else {	
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(name);
						 bw.newLine();
						 	bw.write("phone no="+phoneno);
						 bw.newLine();
							bw.write(DOB);
						 bw.newLine();
							bw.write(gender);
						 bw.newLine();
							bw.write(Qualification);
						 bw.newLine();
						 	bw.write(Mtongue);
						 bw.newLine();
						 	bw.write(caste);
						 bw.newLine();
						 	bw.write(salary);
						 bw.newLine();
						   JOptionPane.showMessageDialog(null, "your are not a prime user");
						
					}
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}  
                 // System.out.println(name);
                //System.out.println(phoneno);
                //System.out.println(age);
                //System.out.println(gender);
               // System.out.println( Qualification);
               // System.out.println(Mtongue);
                //System.out.println(caste);
                //System.out.println(salary);
                
             }  
          });

		
		
	}



}

