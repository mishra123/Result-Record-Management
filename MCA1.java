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
 class MCA1 extends JPanel
{
	  

	JTextField combo1_1;
	  JTextField combo1_2;
	  JTextField combo1_3;
	  JTextField combo1_4;
	  JTextField combo1_5;
	  JTextField combo1_6;
	  JTextField combo1_7;
	  JLabel label1;
	  JLabel label1_1;
	  JLabel label1_2;
	  //sem 2
	  JTextField combo2_1;
	  JTextField combo2_2;
	  JTextField combo2_3;
	  JTextField combo2_4;
	  JTextField combo2_5;
	  JTextField combo2_6;
	  JTextField combo2_7;
	  JLabel label2;
	  JLabel label2_1;
	  JLabel label2_2;
	  //sem 3
	  JTextField combo3_1;
	  JTextField combo3_2;
	  JTextField combo3_3;
	  JTextField combo3_4;
	  JTextField combo3_5;
	  JTextField combo3_6;
	  JTextField combo3_7;
	  JLabel label3;
	  JLabel label3_1;
	  JLabel label3_2;
	  // sem 4
	  JTextField combo4_1;
	  JTextField combo4_2;
	  JTextField combo4_3;
	  JTextField combo4_4;
	  JTextField combo4_5;
	  JTextField combo4_6;
	  JTextField combo4_7;
	  JLabel label4;
	  JLabel label4_1;
	  JLabel label4_2;
	  JLabel labelEL;

	 //sem 5
	  JTextField combo5_1;
	  JTextField combo5_2;
	  JTextField combo5_3;
	  JTextField combo5_4;
	  JTextField combo5_5;
	  JTextField combo5_6;
	  JTextField combo5_7;
	  JLabel label5;
	  JLabel label5_1;
	  JLabel label5_2;
	  JLabel labelEL1;
	  JLabel labelEL2;
	  //sem 6
	  JTextField combo6_1;
	  JLabel label6;
	  JScrollPane jsp;
	  JButton submit;
	  
	  public MCA1()
	  {//semester1
	setLayout(null);
		 //JFrame f=new JFrame;
		  JButton submit=new JButton();
		  submit.setText("SUBMIT");
		  submit.setBounds(120,810,700,40);
		  add(submit);
		  setPreferredSize(new Dimension(1500,1500));
           setBackground(new Color(75,163,230));



//sem-1
		 String a1[]={" ","RP MCA-101","RT MCA-101","RTI MCA-101"};
		  String a2[]={" ","RP MCA-102","RT MCA-102","RTI MCA-102"};
		  String a3[]={" ","RP MCA-103","RT MCA-103","RTI MCA-103"};
		  String a4[]={" ","RP MCA-104","RT MCA-104","RTI MCA-104"};
		  String a5[]={" ","RP MCA-105","RT MCA-105","RTI MCA-105"};
		  String a6[]={" ","RP MCA-106","RT MCA-106","RTI MCA-106"};
		  String a7[]={" ","RP MCA-107","RT MCA-107","RTI MCA-107"};

		  JLabel label1=new JLabel();
		  JLabel label1_1=new JLabel();
		  JLabel label1_2=new JLabel();
		  JLabel lab1_1=new JLabel();
		  JLabel lab1_2=new JLabel();
		  JLabel lab1_3=new JLabel();
		  JLabel lab1_4=new JLabel();
		  JLabel lab1_5=new JLabel();
		  JLabel lab1_6=new JLabel();
		  JLabel lab1_7=new JLabel();


		  combo1_1 = new JTextField();
		    combo1_2 = new JTextField();
		    combo1_3 = new JTextField();
		    combo1_4 = new JTextField();
		    combo1_5 = new JTextField();
		    combo1_6 = new JTextField();
		    combo1_7= new JTextField();



		    label1.setText("Semester-1:");
		    label1_1.setText("Theory");
		    label1_2.setText("Labs");

		    lab1_1.setText("IIT");
		    lab1_2.setText("C");
		    lab1_3.setText("AFM");
		    lab1_4.setText("CMF");
		    lab1_5.setText("SAD");
		    lab1_6.setText("IIT lab");
		    lab1_7.setText("C lab");




		    combo1_1.setBounds(20,70,70,20);
			   combo1_2.setBounds(120,70,70,20);
			   combo1_3.setBounds(220,70,70,20);
			   combo1_4.setBounds(320,70,70,20);
			   combo1_5.setBounds(420,70,70,20);
			   combo1_6.setBounds(520,70,70,20);
			   combo1_7.setBounds(620,70,70,20);
			   label1.setBounds(20,15,70,20);
			   label1_1.setBounds(20,30,70,20);
			   label1_2.setBounds(520,30,70,20);
			   lab1_1.setBounds(20,50,70,20);
			   lab1_2.setBounds(120,50,70,20);
			   lab1_3.setBounds(220,50,70,20);
			   lab1_4.setBounds(320,50,70,20);
			   lab1_5.setBounds(420,50,70,20);
			   lab1_6.setBounds(520,50,70,20);
			   lab1_7.setBounds(620,50,70,20);

			  add(combo1_1);
			   add(combo1_2);
			   add(combo1_3);
			  add(combo1_4);
			  add(combo1_5);
			  add(combo1_6);
			   add(combo1_7);
			   add(label1);
			  add(label1_1);
			   add(label1_2);
			    add(lab1_1);
			    add(lab1_2);
			    add(lab1_3);
			    add(lab1_4);
			    add(lab1_5);
			    add(lab1_6);
			    add(lab1_7);

			    //sem2
			    String b1[]={" ","RP MCA-201","RT MCA-201","RTI MCA-201"};
			    String b2[]={" ","RP MCA-202","RT MCA-202","RTI MCA-202"};
			    String b3[]={" ","RP MCA-203","RT MCA-203","RTI MCA-203"};
			    String b4[]={" ","RP MCA-204","RT MCA-204","RTI MCA-204"};
			    String b5[]={" ","RP MCA-205","RT MCA-205","RTI MCA-205"};
			    String b6[]={" ","RP MCA-206","RT MCA-206","RTI MCA-206"};
			    String b7[]={" ","RP MCA-207","RT MCA-207","RTI MCA-207"};
			    JLabel label2=new JLabel();
				  JLabel label2_1=new JLabel();
				  JLabel label2_2=new JLabel();
				    JLabel lab2_1=new JLabel();
				    JLabel lab2_2=new JLabel();
				    JLabel lab2_3=new JLabel();
				    JLabel lab2_4=new JLabel();
				    JLabel lab2_5=new JLabel();
				    JLabel lab2_6=new JLabel();
				    JLabel lab2_7=new JLabel();

				  combo2_1 = new JTextField();
				    combo2_2 = new JTextField();
				    combo2_3 = new JTextField();
				    combo2_4 = new JTextField();
				    combo2_5 = new JTextField();
				    combo2_6 = new JTextField();
				    combo2_7= new JTextField();



				    label2.setText("Semester-2:");
				    label2_1.setText("Theory");
				    label2_2.setText("Labs");
				    lab2_1.setText("MIS");
				    lab2_2.setText("OOP's");
				    lab2_3.setText("DCN");
				    lab2_4.setText("POM");
				    lab2_5.setText("MP");
				    lab2_6.setText("OOP's lab");
				    lab2_7.setText("MP lab");

				    combo2_1.setBounds(20,210,70,20);
					   combo2_2.setBounds(120,210,70,20);
					   combo2_3.setBounds(220,210,70,20);
					   combo2_4.setBounds(320,210,70,20);
					   combo2_5.setBounds(420,210,70,20);
					   combo2_6.setBounds(520,210,70,20);
					   combo2_7.setBounds(620,210,70,20);
					   label2.setBounds(20,155,70,20);
					   label2_1.setBounds(20,170,70,20);
					   label2_2.setBounds(520,170,70,20);
					   lab2_1.setBounds(20,190,70,20);
					   lab2_2.setBounds(120,190,70,20);
					   lab2_3.setBounds(220,190,70,20);
					   lab2_4.setBounds(320,190,70,20);
					   lab2_5.setBounds(420,190,70,20);
					   lab2_6.setBounds(520,190,70,20);
					   lab2_7.setBounds(620,190,70,20);

		   
					   add(combo2_1);
					  add(combo2_2);
					  add(combo2_3);
					  add(combo2_4);
					  add(combo2_5);
					   add(combo2_6);
					   add(combo2_7);
					  add(label2);
					   add(label2_1);
					   add(label2_2);
					    add(lab2_1);
					    add(lab2_2);
					    add(lab2_3);
					    add(lab2_4);
					    add(lab2_5);
					    add(lab2_6);
					    add(lab2_7);

					    //semester 3
					   String c1[]={" ","RP MCA-301","RT MCA-301","RTI MCA-301"};
					   String c2[]={" ","RP MCA-302","RT MCA-302","RTI MCA-302"};
					   String c3[]={" ","RP MCA-303","RT MCA-303","RTI MCA-303"};
					   String c4[]={" ","RP MCA-304","RT MCA-304","RTI MCA-304"};
					   String c5[]={" ","RP MCA-402","RT MCA-402","RTI MCA-402"};
					   String c6[]={" ","RP MCA-306","RT MCA-306","RTI MCA-306"};
					   String c7[]={" ","RP MCA-307","RT MCA-307","RTI MCA-307"};
					    JLabel label3=new JLabel();
						  JLabel label3_1=new JLabel();
						  JLabel label3_2=new JLabel();
						    JLabel lab3_1=new JLabel();
						    JLabel lab3_2=new JLabel();
						    JLabel lab3_3=new JLabel();
						    JLabel lab3_4=new JLabel();
						    JLabel lab3_5=new JLabel();
						    JLabel lab3_6=new JLabel();
						    JLabel lab3_7=new JLabel();


						  combo3_1 = new JTextField();
						    combo3_2 = new JTextField();
						    combo3_3 = new JTextField();
						    combo3_4 = new JTextField();
						    combo3_5 = new JTextField();
						    combo3_6 = new JTextField();
						    combo3_7= new JTextField();



						    label3.setText("Semester-3:");
						    label3_1.setText("Theory");
						    label3_2.setText("Labs");
						    lab3_1.setText("CSA");
						    lab3_2.setText("DS");
						    lab3_3.setText("VB");
						    lab3_4.setText("RDBMS-I");
						    lab3_5.setText("SE");
						    lab3_6.setText("DS lab");
						    lab3_7.setText("RDBMS-I lab");

						    combo3_1.setBounds(20,350,70,20);
							   combo3_2.setBounds(120,350,70,20);
							   combo3_3.setBounds(220,350,70,20);
							   combo3_4.setBounds(320,350,70,20);
							   combo3_5.setBounds(420,350,70,20);
							   combo3_6.setBounds(520,350,70,20);
							   combo3_7.setBounds(620,350,70,20);
							   label3.setBounds(20,295,70,20);
							   label3_1.setBounds(20,310,70,20);
							   label3_2.setBounds(520,310,70,20);
							   lab3_1.setBounds(20,330,70,20);
							   lab3_2.setBounds(120,330,70,20);
							   lab3_3.setBounds(220,330,70,20);
							   lab3_4.setBounds(320,330,70,20);
							   lab3_5.setBounds(420,330,70,20);
							   lab3_6.setBounds(520,330,70,20);
							   lab3_7.setBounds(620,330,70,20);

							    add(combo3_1);
							   add(combo3_2);
							   add(combo3_3);
							   add(combo3_4);
							   add(combo3_5);
							   add(combo3_6);
							   add(combo3_7);
							    add(label3);
							    add(label3_1);
							   add(label3_2);
							    add(lab3_1);
							    add(lab3_2);
							    add(lab3_3);
							    add(lab3_4);
							    add(lab3_5);
							    add(lab3_6);
							    add(lab3_7);


//semester 4
							    String d1[]={" ","RP MCA-401","RT MCA-401","RTI MCA-401"};
							    String d2[]={" ","RP MCA-305","RT MCA-305","RTI MCA-305"};
							    String d3[]={" ","RP MCA-403","RT MCA-403","RTI MCA-403"};
							    String d4[]={" ","RP MCA-404","RT MCA-404","RTI MCA-404"};
							    String d5[]={" ","RP MCA-405-A","RT MCA-405-A","RTI MCA-405-A","-------","RE","RP MCA-405-B","RT MCA-405-B","RTI MCA-405-B","-------","OOAD","RP MCA-405-C","RT MCA-405-C","RTI MCA-405-C"};
							    String d6[]={" ","RP MCA-406","RT MCA-406","RTI MCA-406"};
							    String d7[]={" ","RP MCA-407","RT MCA-407","RTI MCA-407"};
							    JLabel label4=new JLabel();
								  JLabel label4_1=new JLabel();
								  JLabel label4_2=new JLabel();
								  JLabel labelEL=new JLabel();
								  JLabel lab4_1=new JLabel();
								    JLabel lab4_2=new JLabel();
								    JLabel lab4_3=new JLabel();
								    JLabel lab4_4=new JLabel();
								    JLabel lab4_5=new JLabel();
								    JLabel lab4_6=new JLabel();
								    JLabel lab4_7=new JLabel();
								    


								  combo4_1 = new JTextField();
								    combo4_2 = new JTextField();
								    combo4_3 = new JTextField();
								    combo4_4 = new JTextField();
								    combo4_5 = new JTextField();
								    combo4_6 = new JTextField();
								    combo4_7= new JTextField();



								    label4.setText("Semester-4:");
								    label4_1.setText("Theory");
								    label4_2.setText("Labs");
								    //labelEL.setText("Elective-I");
								    lab4_1.setText("RDBMS-II");
								    lab4_2.setText("CBOM");
								    lab4_3.setText("SS");
								    lab4_4.setText("OS");
								    lab4_5.setText("ELECTIVE-I");
								    lab4_6.setText("RDBMS-II lab");
								    lab4_7.setText("OS lab");
								    

								    combo4_1.setBounds(20,490,70,20);
								    combo4_2.setBounds(120,490,70,20);
									   combo4_3.setBounds(220,490,70,20);
									   combo4_4.setBounds(320,490,70,20);
									   combo4_5.setBounds(420,490,70,20);
									   combo4_6.setBounds(520,490,70,20);
									   combo4_7.setBounds(620,490,70,20);
									   label4.setBounds(20,435,70,20);
									   label4_1.setBounds(20,450,70,20);
									   label4_2.setBounds(520,450,70,20);
									   labelEL.setBounds(420,470,70,20);
									   lab4_1.setBounds(20,470,70,20);
									   lab4_2.setBounds(120,470,70,20);
									   lab4_3.setBounds(220,470,70,20);
									   lab4_4.setBounds(320,470,70,20);
									   lab4_5.setBounds(420,470,70,20);
									   lab4_6.setBounds(520,470,70,20);
									   lab4_7.setBounds(620,470,70,20);
									

									    add(combo4_1);
									    add(combo4_2);
									    add(combo4_3);
									    add(combo4_4);
									    add(combo4_5);
									    add(combo4_6);
									    add(combo4_7);
									    add(label4);
									    add(label4_1);
									    add(label4_2);
									    add(labelEL);
									    add(lab4_1);
									    add(lab4_2);
									    add(lab4_3);
									    add(lab4_4);
									    add(lab4_5);
									    add(lab4_6);
									    add(lab4_7);

//sem 5
									    String e1[]={" ","RP MCA-501","RT MCA-501","RTI MCA-501"};
									    String e2[]={" ","RP MCA-502","RT MCA-502","RTI MCA-502"};
									    String e3[]={" ","RP MCA-503-A","RT MCA-503-A","RTI MCA-503-A","--------","CD","RP MCA-503-B","RT MCA-503-B","RTI MCA-503-B"};
									    String e4[]={" ","RP MCA-504-A","RT MCA-504-A","RTI MCA-504-A","--------","AMS","RP MCA-504-B","RT MCA-504-B","RTI MCA-504-B"};
									    String e5[]={" ","RP MCA-505","RT MCA-505","RTI MCA-505"};
									    String e6[]={" ","RP MCA-506","RT MCA-506","RTI MCA-506"};
									    String e7[]={" ","RP MCA-507","RT MCA-507","RTI MCA-507"};
									    JLabel label5=new JLabel();
										  JLabel label5_1=new JLabel();
										  JLabel label5_2=new JLabel();
										  JLabel labelEL1=new JLabel();
										  JLabel labelEL2=new JLabel();
										    JLabel lab5_1=new JLabel();
										    JLabel lab5_2=new JLabel();
										    JLabel lab5_3=new JLabel();
										    JLabel lab5_4=new JLabel();
										    JLabel lab5_5=new JLabel();
										    JLabel lab5_6=new JLabel();
										    JLabel lab5_7=new JLabel();
										

										  combo5_1 = new JTextField();
										    combo5_2 = new JTextField();
										    combo5_3 = new JTextField();
										    combo5_4 = new JTextField();
										    combo5_5 = new JTextField();
										    combo5_6 = new JTextField();
										    combo5_7= new JTextField();



										    label5.setText("Semester-5:");
										    label5_1.setText("Theory");
										    label5_2.setText("Labs");
										    //labelEL1.setText("Elective-II");
										    //labelEL2.setText("Elective-II");
										    lab5_1.setText("CG");
										    lab5_2.setText("IPJ");
										    lab5_3.setText("ELECTIVE-II");
										    lab5_4.setText("ELECTIVE-III");
										    lab5_5.setText("CG lab");
										    lab5_6.setText("JAVA lab");
										    lab5_7.setText("VIVA");


										    combo5_1.setBounds(20,630,70,20);
										    combo5_2.setBounds(120,630,70,20);
											   combo5_3.setBounds(220,630,70,20);
											   combo5_4.setBounds(320,630,70,20);
											   combo5_5.setBounds(420,630,70,20);
											   combo5_6.setBounds(520,630,70,20);
											   combo5_7.setBounds(620,630,70,20);
											   label5.setBounds(20,575,70,20);
											   label5_1.setBounds(20,590,70,20);
											   label5_2.setBounds(520,590,70,20);
											   labelEL1.setBounds(320,590,70,20);
											   labelEL2.setBounds(420,590,70,20);
											   lab5_1.setBounds(20,610,70,20);
											   lab5_2.setBounds(120,610,70,20);
											   lab5_3.setBounds(220,610,70,20);
											   lab5_4.setBounds(320,610,70,20);
											   lab5_5.setBounds(420,610,70,20);
											   lab5_6.setBounds(520,610,70,20);
											   lab5_7.setBounds(620,610,70,20);



											   add(combo5_1);
											    add(combo5_2);
											    add(combo5_3);
											    add(combo5_4);
											     add(combo5_5);
											     add(combo5_6);
											     add(combo5_7);
											     add(label5);
											      add(label5_1);
											      add(label5_2);
											     add(labelEL1);
											     add(labelEL2);
												    add(lab5_1);
												    add(lab5_2);
												    add(lab5_3);
												    add(lab5_4);
												    add(lab5_5);
												    add(lab5_6);
												    add(lab5_7);

//semester 6
	String f[]={" ","RP MCA(N2)-601","RT MCA)(N2)-601","RTI MCA(N2)-601"};
				JLabel label6=new JLabel();
				 combo6_1 = new JTextField();
					JLabel lab6_1=new JLabel();

				  label6.setText("Semester-6:");
				  combo6_1.setBounds(20,770,70,20);
				   label6.setBounds(20,715,70,20);
					  lab6_1.setText("PROJECT");
					  lab6_1.setBounds(20,730,70,20);

				    add(combo6_1);
				    add(label6);

				    add(lab6_1);
					 

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
			"' , l2 = '"+combo1_7.getText()+
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
			"' , l2 = '"+combo2_7.getText()+
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
			"' , s5 = '"+combo3_5.getText()+
			"' , l1 = '"+combo3_6.getText()+
			"' , l2 = '"+combo3_7.getText()+
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
			"' , s2 = '"+combo4_2.getText()+
			"' , s3 = '"+combo4_3.getText()+
			"' , s4 = '"+combo4_4.getText()+
			"' , s5 = '"+combo4_5.getText()+
			"' , l1 = '"+combo4_6.getText()+
			"' , l2 = '"+combo4_7.getText()+
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
			if(o.equals("5"))
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
			"' , s1 = '"+combo5_1.getText()+
			"' , s2 = '"+combo5_2.getText()+
			"' , s3 = '"+combo5_3.getText()+
			"' , s4 = '"+combo5_4.getText()+
			"' , l1 = '"+combo5_5.getText()+
			"' , l2 = '"+combo5_6.getText()+
			"' , l3 = '"+combo5_7.getText()+
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
			if(o.equals("6"))
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
			"' , s1 = '"+combo6_1.getText()+
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
