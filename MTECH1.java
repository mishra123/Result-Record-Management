import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
public class MTECH1 extends JPanel
{//SEM 1
	JTextField combo1_1;
	  JTextField combo1_2;
	  JTextField combo1_3;
	  JTextField combo1_4;
	  JTextField combo1_5;
	  JTextField combo1_6;
	  JLabel label1;
	  JLabel label1_1;
	  JLabel label1_2;
	  JLabel lab1_1;
	  JLabel lab1_2;
	  JLabel lab1_3;
	  JLabel lab1_4;
	  JLabel lab1_5;
	  JLabel lab1_6;
	  
	  //SEM2
	  JTextField combo2_1;
	  JTextField combo2_2;
	  JTextField combo2_3;
	  JTextField combo2_4;
	  JTextField combo2_5;
	  JTextField combo2_6;
	  JLabel label2;
	  JLabel label2_1;
	  JLabel label2_2;
	  JLabel lab2_1;
	  JLabel lab2_2;
	  JLabel lab2_3;
	  JLabel lab2_4;
	  JLabel lab2_5;
	  JLabel lab2_6;
	  
	 //SEM 3
	  JTextField combo3_1;
	  JTextField combo3_2;
	  JTextField combo3_3;
	  JTextField combo3_4;
	  JLabel label3;
	  JLabel label3_1;
	  JLabel label3_2;
	  JLabel lab3_1;
	  JLabel lab3_2;
	  JLabel lab3_3;
	  JLabel lab3_4;
	  //SEM 4
	  JTextField combo4_1;
	  JLabel label4;
	  JLabel label4_1;
	  JLabel lab4_1;
	  JScrollPane jsp;
	  JButton submit;
	  

	  public MTECH1()
	  {//semester1
	     setLayout(null);
		 //JFrame f=new JFrame;
		   JButton submit=new JButton();
		  submit.setText("SUBMIT");
		  submit.setBounds(120,610,700,40);
		 add(submit);
		 setPreferredSize(new Dimension(1500,1500));
		 setBackground(new Color(75,163,230));
		 String a1[]={" ","RP EC-501","RT EC-501","RTI EC-501"};
		 String a2[]={" ","RP EC-502","RT EC-502","RTI EC-502"};
		 String a3[]={" ","RP EC-503","RT EC-503","RTI EC-503"};
		 String a4[]={" ","RP EC-504","RT EC-504","RTI EC-504"};
		 String a5[]={" ","RP EC-505","RT EC-505","RTI EC-505"};
		 String a6[]={" ","RP EC-506","RT EC-506","RTI EC-506"};

		  JLabel label1=new JLabel();
		  JLabel label1_1=new JLabel();
		  JLabel label1_2=new JLabel();
		  JLabel lab1_1=new JLabel();
		  JLabel lab1_2=new JLabel();
		  JLabel lab1_3=new JLabel();
		  JLabel lab1_4=new JLabel();
		  JLabel lab1_5=new JLabel();
		  JLabel lab1_6=new JLabel();



		  combo1_1 = new JTextField();
		    combo1_2 = new JTextField();
		    combo1_3 = new JTextField();
		    combo1_4 = new JTextField();
		    combo1_5 = new JTextField();
		    combo1_6 = new JTextField();
		    label1.setText("Semester-1:");
		    label1_1.setText("Theory");
		    label1_2.setText("Labs");
		    lab1_1.setText("AME");
		    lab1_2.setText("ESD");
		    lab1_3.setText("DCN");
		    lab1_4.setText("ACS");
		    lab1_5.setText("NNFL");
		    lab1_6.setText("LAB");

		    combo1_1.setBounds(20,70,70,20);
			   combo1_2.setBounds(120,70,70,20);
			   combo1_3.setBounds(220,70,70,20);
			   combo1_4.setBounds(320,70,70,20);
			   combo1_5.setBounds(420,70,70,20);
			   combo1_6.setBounds(520,70,70,20);
			   label1.setBounds(20,15,70,20);
			   label1_1.setBounds(20,30,70,20);
			   label1_2.setBounds(520,30,70,20);
			   lab1_1.setBounds(20,50,70,20);
			   lab1_2.setBounds(120,50,70,20);
			   lab1_3.setBounds(220,50,70,20);
			   lab1_4.setBounds(320,50,70,20);
			   lab1_5.setBounds(420,50,70,20);
			   lab1_6.setBounds(520,50,70,20);

			   add(combo1_1);
			   add(combo1_2);
			   add(combo1_3);
			   add(combo1_4);
			   add(combo1_5);
			   add(combo1_6);
			   add(label1);
			   add(label1_1);
			    add(label1_2);
			    add(lab1_1);
			    add(lab1_2);
			    add(lab1_3);
			    add(lab1_4);
			    add(lab1_5);
			    add(lab1_6);

				    //SEM 2
				    String b1[]={" ","RP EC-507","RT EC-507","RTI EC-507"};
				    String b2[]={" ","RP EC-508","RT EC-508","RTI EC-508"};
				    String b3[]={" ","RP EC-509","RT EC-509","RTI EC-509"};
				    String b4[]={" ","RP EC-510","RT EC-510","RTI EC-510","-------","VLSI DESIGN","RP EC-511","RT EC-511","RTI EC-511","-------","RECS","RP EC-512","RT EC-512","RTI EC-512"};
				    String b5[]={" ","RP EC-513","RT EC-513","RTI EC-513","-------","PP","RP EC-514","RT EC-514","RTI EC-514","-------","PSDI","RP EC-515","RT EC-515","RTI EC-515"};
				    String b6[]={" ","RP EC-516","RT EC-516","RTI EC-516"};
				    JLabel label2=new JLabel();
					  JLabel label2_1=new JLabel();
					  JLabel label2_2=new JLabel();
					    JLabel lab2_1=new JLabel();
					    JLabel lab2_2=new JLabel();
					    JLabel lab2_3=new JLabel();
					    JLabel lab2_4=new JLabel();
					    JLabel lab2_5=new JLabel();
					    JLabel lab2_6=new JLabel();

					  combo2_1 = new JTextField();
					    combo2_2 = new JTextField();
					    combo2_3 = new JTextField();
					    combo2_4 = new JTextField();
					    combo2_5 = new JTextField();
					    combo2_6 = new JTextField();
					    label2.setText("Semester-2:");
					    label2_1.setText("Theory");
					    label2_2.setText("Labs");
					    lab2_1.setText("OCS");
					    lab2_2.setText("DSIP");
					    lab2_3.setText("ITC");
					    lab2_4.setText("AMES");
					    lab2_5.setText("MCS");
					    lab2_6.setText("LAB-II");

					    combo2_1.setBounds(20,210,70,20);
						   combo2_2.setBounds(120,210,70,20);
						   combo2_3.setBounds(220,210,70,20);
						   combo2_4.setBounds(320,210,70,20);
						   combo2_5.setBounds(420,210,70,20);
						   combo2_6.setBounds(520,210,70,20);
						   label2.setBounds(20,155,70,20);
						   label2_1.setBounds(20,170,70,20);
						   label2_2.setBounds(520,170,70,20);
						   lab2_1.setBounds(20,190,70,20);
						   lab2_2.setBounds(120,190,70,20);
						   lab2_3.setBounds(220,190,70,20);
						   lab2_4.setBounds(320,190,70,20);
						   lab2_5.setBounds(420,190,70,20);
						   lab2_6.setBounds(520,190,70,20);

						    add(combo2_1);
						    add(combo2_2);
						    add(combo2_3);
						   add(combo2_4);
						   add(combo2_5);
						    add(combo2_6);
						    add(label2);
						     add(label2_1);
						    add(label2_2);
						    add(lab2_1);
						    add(lab2_2);
						    add(lab2_3);
						    add(lab2_4);
						    add(lab2_5);
						    add(lab2_6);

						    //SEM 3
						    String c1[]={" ","RP EC-517","RT EC-517","RTI EC-517","-------","MTT","RP EC-518","RT EC-518","RTI EC-518","-------","DET","RP EC-519","RT EC-519","RTI EC-519","-------","WMC","RP EC-520","RT EC-520","RTI EC-520"};
						    String c2[]={" ","RP EC-521","RT EC-521","RTI EC-521","-------","IIP","RP EC-522","RT EC-522","RTI EC-522","-------","RFMAT","RP EC-523","RT EC-523","RTI EC-523","-------","CT","RP EC-524","RT EC-524","RTI EC-524"};

						     String c3[]={" ","RP EC-580","RT EC-580","RTI EC-580"};
						     String c4[]={" ","RP EC-590","RT EC-590","RTI EC-590"};
						     JLabel label3=new JLabel();
							  JLabel label3_1=new JLabel();
							    JLabel lab3_1=new JLabel();
							    JLabel lab3_2=new JLabel();
							    JLabel lab3_3=new JLabel();
							    JLabel lab3_4=new JLabel();

							  combo3_1 = new JTextField();
							    combo3_2 = new JTextField();
							    combo3_3 = new JTextField();
							    combo3_4 = new JTextField();
							    label3.setText("Semester-3:");
							    label3_1.setText("Theory");
							    lab3_1.setText("MSCS");
							    lab3_2.setText("MT");
							    lab3_3.setText("PROJECT");
							    lab3_4.setText("SEMINAR");

							    combo3_1.setBounds(20,350,70,20);
								   combo3_2.setBounds(120,350,70,20);
								   combo3_3.setBounds(220,350,70,20);
								   combo3_4.setBounds(320,350,70,20);
								   label3.setBounds(20,295,70,20);
								   label3_1.setBounds(20,310,70,20);
								   lab3_1.setBounds(20,330,70,20);
								   lab3_2.setBounds(120,330,70,20);
								   lab3_3.setBounds(220,330,70,20);
								   lab3_4.setBounds(320,330,70,20);

								    add(combo3_1);
								    add(combo3_2);
								   add(combo3_3);
								   add(combo3_4);
								    add(label3);
								   add(label3_1);
								    add(lab3_1);
								    add(lab3_2);
								    add(lab3_3);
								    add(lab3_4);

								   //SEM 4
								   String d[]={" ","RP EC-500","RT EC-500","RTI EC-500"};
								   JLabel label4=new JLabel();
									  JLabel label4_1=new JLabel();
									  JLabel lab4_1=new JLabel();
									  combo4_1 = new JTextField();
									  label4.setText("Semester-4:");
									  lab4_1.setText("Dissertion");
									  combo4_1.setBounds(20,490,70,20);
									  label4.setBounds(20,435,70,20);
									  lab4_1.setBounds(20,470,70,20);
									   add(combo4_1);
									   add(label4);
									   add(lab4_1);
									 

								

									

		    submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					submit_actionPerformed(e);
				}

			});

	  }
void submit_actionPerformed(java.awt.event.ActionEvent evt)
{
System.out.println("sucess...");


nextpage p=null;
print r=new print();
Object o = p.sem.getSelectedItem();
	System.out.println(o);
	if(o.equals("1"))
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
	Statement stmt=con.createStatement();

	String query="update project set "+
	" s_name = '"+p.sname.getText()+
	"' , uni_roll = '"+p.uni_rol.getText()+
	"' , f_name = '" + p.f_name.getText()+
	"' , branch = '"+p.branch.getSelectedItem()+
	"' , batch = '"+p.batch.getSelectedItem()+
	"' , sem = '"+p.sem.getSelectedItem()+
	"' , s1 = '"+combo1_1.getText()+
	"' , s2 = '"+combo1_2.getText()+
	"' , s3 = '"+combo1_3.getText()+
	"' , s4 = '"+combo1_4.getText()+
	"' , s5 = '"+combo1_5.getText()+
	"' , l1 = '"+combo1_6.getText()+
	"' where c_roll='"+p.clsrol.getText()+"'";
	stmt.executeUpdate(query);
	   con.close();
	System.out.println("record enter sucessfully");

	}
	catch(Exception ex)
	{
	System.out.println("Error - "+ex);
	}
	remove(this);
	setVisible(true);
	}
	if(o.equals("2"))
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
	Statement stmt=con.createStatement();

	String query="update project set "+
	" s_name = '"+p.sname.getText()+
	"' , uni_roll = '"+p.uni_rol.getText()+
	"' , f_name = '" + p.f_name.getText()+
	"' , branch = '"+p.branch.getSelectedItem()+
	"' , batch = '"+p.batch.getSelectedItem()+
	"' , sem = '"+p.sem.getSelectedItem()+
	"' , s1 = '"+combo2_1.getText()+
	"' , s2 = '"+combo2_2.getText()+
	"' , s3 = '"+combo2_3.getText()+
	"' , s4 = '"+combo2_4.getText()+
	"' , s5 = '"+combo2_5.getText()+
	"' , l1 = '"+combo2_6.getText()+
	"' where c_roll='"+p.clsrol.getText()+"'";
	stmt.executeUpdate(query);
	   con.close();
	System.out.println("record enter sucessfully");

	}
	catch(Exception ex)
	{
	System.out.println("Error - "+ex);
	}
	remove(this);
	setVisible(true);
	}
	if(o.equals("3"))
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
	Statement stmt=con.createStatement();

	String query="update project set "+
	" s_name = '"+p.sname.getText()+
	"' , uni_roll = '"+p.uni_rol.getText()+
	"' , f_name = '" + p.f_name.getText()+
	"' , branch = '"+p.branch.getSelectedItem()+
	"' , batch = '"+p.batch.getSelectedItem()+
	"' , sem = '"+p.sem.getSelectedItem()+
	"' , s1 = '"+combo3_1.getText()+
	"' , s2 = '"+combo3_2.getText()+
	"' , s3 = '"+combo3_3.getText()+
	"' , s4 = '"+combo3_4.getText()+
	"' where c_roll='"+p.clsrol.getText()+"'";
	stmt.executeUpdate(query);
	   con.close();
	System.out.println("record enter sucessfully");

	}
	catch(Exception ex)
	{
	System.out.println("Error - "+ex);
	}
	remove(this);
	setVisible(true);
	}
	if(o.equals("4"))
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
	Statement stmt=con.createStatement();

	String query="update project set "+
	" s_name = '"+p.sname.getText()+
	"' , uni_roll = '"+p.uni_rol.getText()+
	"' , f_name = '" + p.f_name.getText()+
	"' , branch = '"+p.branch.getSelectedItem()+
	"' , batch = '"+p.batch.getSelectedItem()+
	"' , sem = '"+p.sem.getSelectedItem()+
	"' , s1 = '"+combo4_1.getText()+
	"' where c_roll='"+p.clsrol.getText()+"'";
	stmt.executeUpdate(query);
	   con.close();
	System.out.println("record enter sucessfully");

	}
	catch(Exception ex)
	{
	System.out.println("Error - "+ex);
	}
	remove(this);
	setVisible(true);

	}
}
}







