import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
 class AUTO1 extends JPanel
{
 //semester1
  static JTextField combo1_1;
  static JTextField combo1_2;
  static JTextField combo1_3;
  static JTextField combo1_4;
  static JTextField combo1_5;
  static JTextField combo1_6;
  static JTextField combo1_7;
  static JTextField combo1_8;

  JLabel label1;
  JLabel label1_1;
  JLabel label1_2;
  JLabel lab1_1;
  JLabel lab1_2;
  JLabel lab1_3;
  JLabel lab1_4;
  JLabel lab1_5;
  JLabel lab1_6;
  JLabel lab1_7;
  JLabel lab1_8;
  //semester2
  static JTextField combo2_1;
  static JTextField combo2_2;
  static JTextField combo2_3;
  static JTextField combo2_4;
  static JTextField combo2_5;
  static JTextField combo2_6;
  static JTextField combo2_7;
  static JTextField combo2_8;
  JLabel label2;
  JLabel label2_1;
  JLabel label2_2;
  JLabel lab2_1;
  JLabel lab2_2;
  JLabel lab2_3;
  JLabel lab2_4;
  JLabel lab2_5;
  JLabel lab2_6;
  JLabel lab2_7;
  JLabel lab2_8;
  //sem3
  static JTextField combo3_1;
  static JTextField combo3_2;
  static JTextField combo3_3;
  static JTextField combo3_4;
  static JTextField combo3_5;
  static JTextField combo3_6;
  static JTextField combo3_7;
  static JTextField combo3_8;
  static JTextField combo3_9;
  static JTextField combo3_10;
  static JTextField combo3_11;
  static JTextField combo3_12;
  JLabel label3;
  JLabel label3_1;
  JLabel label3_2;
  JLabel lab3_1;
  JLabel lab3_2;
  JLabel lab3_3;
  JLabel lab3_4;
  JLabel lab3_5;
  JLabel lab3_6;
  JLabel lab3_7;
  JLabel lab3_8;
  JLabel lab3_9;
  JLabel lab3_10;
  JLabel lab3_11;
  JLabel lab3_12;

  //sem4
  static JTextField combo4_1;
  static JTextField combo4_2;
  static JTextField combo4_3;
  static JTextField combo4_4;
  static JTextField combo4_5;
  static JTextField combo4_6;
  static JTextField combo4_7;
  static JTextField combo4_8;
  static JTextField combo4_9;
  static JTextField combo4_10;
  JLabel label4;
  JLabel label4_1;
  JLabel label4_2;
  JLabel lab4_1;
  JLabel lab4_2;
  JLabel lab4_3;
  JLabel lab4_4;
  JLabel lab4_5;
  JLabel lab4_6;
  JLabel lab4_7;
  JLabel lab4_8;
  JLabel lab4_9;
  JLabel lab4_10;



  //sem5
  static JTextField combo5_1;
  static JTextField combo5_2;
  static JTextField combo5_3;
  static JTextField combo5_4;
  static JTextField combo5_5;
  static JTextField combo5_6;
  static JTextField combo5_7;
  static JTextField combo5_8;
  static JTextField combo5_9;
  static JTextField combo5_10;
  static JTextField combo5_11;
  static JTextField combo5_12;
  JLabel label5;
  JLabel label5_1;
  JLabel label5_2;
  JLabel lab5_1;
  JLabel lab5_2;
  JLabel lab5_3;
  JLabel lab5_4;
  JLabel lab5_5;
  JLabel lab5_6;
  JLabel lab5_7;
  JLabel lab5_8;
  JLabel lab5_9;
  JLabel lab5_10;
  JLabel lab5_11;
  JLabel lab5_12;
 //sem 6
  static JTextField combo6_1;
  static JTextField combo6_2;
  static JTextField combo6_3;
  static JTextField combo6_4;
  static JTextField combo6_5;
  static JTextField combo6_6;
  static JTextField combo6_7;
  static JTextField combo6_8;
  static JTextField combo6_9;
  static JTextField combo6_10;
  JLabel label6;
  JLabel label6_1;
  JLabel label6_2;
  JLabel lab6_1;
  JLabel lab6_2;
  JLabel lab6_3;
  JLabel lab6_4;
  JLabel lab6_5;
  JLabel lab6_6;
  JLabel lab6_7;
  JLabel lab6_8;
  JLabel lab6_9;
  JLabel lab6_10;
// sem-7
  static JTextField combo7_1;
  static JTextField combo7_2;
  static JTextField combo7_3;
  static JTextField combo7_4;
  static JTextField combo7_5;
  static JTextField combo7_6;
  static JTextField combo7_7;
  static JTextField combo7_8;
  static JTextField combo7_9;
  static JTextField combo7_10;
  JLabel label7;
  JLabel label7_1;
  JLabel label7_2;
  JLabel lab7_1;
  JLabel lab7_2;
  JLabel lab7_3;
  JLabel lab7_4;
  JLabel lab7_5;
  JLabel lab7_6;
  JLabel lab7_7;
  JLabel lab7_8;
  JLabel lab7_9;
  JLabel lab7_10;
  JScrollPane jsp;
  JButton submit;

	  public AUTO1()
	  {//semester1
		  setLayout(null);
		   JButton submit=new JButton();
		  submit.setText("SUBMIT");
		  submit.setBounds(120,1010,700,40);
		  add(submit);

		 setPreferredSize(new Dimension(1500,1500));


		  String a1[] = {" ","RP PH-101","RT PH-101","RTI PH-101"};
		  String a2[] ={" ","RP AM-101","RT AM-101","RTI AM-101"};
		  String a3[]={" ","RP EE-101","RT EE-101","RTI EE-101"};
		  String a4[] ={" ","RP HU-101","RT HU-101","RTI HU-101"};
		  String a5[] ={" ","RP PH-103","RT PH-103","RTI PH-103"};
		  String a6[] ={" ","RP HU-103","RT HU-103","RTI HU-103"};
		  String a7[] ={" ","RP","RT","RTI"};
		  String a8[]={" ","RP ME-104","RT ME-104","RTI ME-104"};
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
JLabel lab1_8=new JLabel();

		  combo1_1 = new JTextField();
		    combo1_2 = new JTextField();
		    combo1_3 = new JTextField();
		    combo1_4 = new JTextField();
		    combo1_5 = new JTextField();
		    combo1_6 = new JTextField();
		    combo1_7= new JTextField();
		    combo1_8= new JTextField();


		    label1.setText("Semester-1:");
		    label1_1.setText("Theory");
		    label1_2.setText("Labs");
lab1_1.setText("Physics");
lab1_2.setText("Math");
lab1_3.setText("BEEE");
lab1_4.setText("CS");
lab1_5.setText("Phy.lab");
lab1_6.setText("CS lab");
lab1_7.setText("BEEE lab");
lab1_8.setText("ME");
		    combo1_1.setBounds(20,70,70,20);
			   combo1_2.setBounds(120,70,70,20);
			   combo1_3.setBounds(220,70,70,20);
			   combo1_4.setBounds(320,70,70,20);
			   combo1_5.setBounds(420,70,70,20);
			   combo1_6.setBounds(520,70,70,20);
			   combo1_7.setBounds(620,70,70,20);
			   combo1_8.setBounds(720,70,70,20);
lab1_1.setBounds(20,50,70,20);
lab1_2.setBounds(120,50,70,20);
lab1_3.setBounds(220,50,70,20);
lab1_4.setBounds(320,50,70,20);
lab1_5.setBounds(420,50,70,20);
lab1_6.setBounds(520,50,70,20);
lab1_7.setBounds(620,50,70,20);
lab1_8.setBounds(720,50,70,20);


			   label1.setBounds(20,15,70,20);
			   label1_1.setBounds(20,30,70,20);
			   label1_2.setBounds(420,30,70,20);
			   add(combo1_1);
			    add(combo1_2);
			    add(combo1_3);
			    add(combo1_4);
			    add(combo1_5);
			    add(combo1_6);
			    add(combo1_7);
			    add(combo1_8);
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
			    add(lab1_8);

		  //semester2
		  String b1[]={" ","RP AM-102","RT AM-102","RTI AM-102"};
		  String b2[]={" ","RP CS-101","RT CS-101","RTI CS-101"};
		  String b3[]={" ","RP CH-101","RT CH-101","RTI CH-101"};
		  String b4[]={" ","RP ME-101","RT ME-101","RTI ME-101"};
		  String b5[]={"","RP ME-102","RT ME-102","RTI ME-102"};
		  String b6[]={" ","RP CS-103","RT CS-103","RTI CS-103"};
		  String b7[]={" ","RP CH-103","RT CH-103","RTI CH-103"};
		  String b8[]={" ","RP ME-105","RT ME-105","RTI ME-105"};
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
	    JLabel lab2_8=new JLabel();
	    label2.setText("Semester-2:");
	    label2_1.setText("Theory");
	    label2_2.setText("Labs");
	   setBackground(new Color(75,163,230));
		    combo2_1 = new  JTextField();
		    combo2_2 = new JTextField();
		    combo2_3 = new  JTextField();
		    combo2_4 = new  JTextField();
		    combo2_5 = new  JTextField();
		    combo2_6 = new  JTextField();
		    combo2_7= new  JTextField();
		    combo2_8= new  JTextField();
		   label2.setBounds(20,155,70,20);
		   label2_1.setBounds(20,170,70,20);
		   label2_2.setBounds(520,170,70,20);
lab2_1.setText("M-II");
lab2_2.setText("FCPIT");
lab2_3.setText("CHEMISTRY");
lab2_4.setText("EME");
lab2_5.setText("ED");
lab2_6.setText("FCPIT lab");
lab2_7.setText("CHE.lab");
lab2_8.setText("CG lab");
		   combo2_1.setBounds(20,210,70,20);
		   combo2_2.setBounds(120,210,70,20);
		   combo2_3.setBounds(220,210,70,20);
		   combo2_4.setBounds(320,210,70,20);
		   combo2_5.setBounds(420,210,70,20);
		   combo2_6.setBounds(520,210,70,20);
		   combo2_7.setBounds(620,210,70,20);
		   combo2_8.setBounds(720,210,70,20);
		   lab2_1.setBounds(20,190,70,20);
		   lab2_2.setBounds(120,190,70,20);
		   lab2_3.setBounds(220,190,70,20);
		   lab2_4.setBounds(320,190,70,20);
		   lab2_5.setBounds(420,190,70,20);
		   lab2_6.setBounds(520,190,70,20);
		   lab2_7.setBounds(620,190,70,20);
		   lab2_8.setBounds(720,190,70,20);
		    add(combo2_1);
		    add(combo2_2);
		    add(combo2_3);
		    add(combo2_4);
		    add(combo2_5);
		    add(combo2_6);
		    add(combo2_7);
		    add(combo2_8);
		    add(label2_1);
		    add(label2_2);


		    add(label2);
		    add(lab2_1);
		    add(lab2_2);
		    add(lab2_3);
		    add(lab2_4);
		    add(lab2_5);
		    add(lab2_6);
		    add(lab2_7);
		    add(lab2_8);
		    //semester3
		    String c1[]={" ","RP AE-201","RT AE-201","RTI AE-201"};
		    String c2[]={" ","RP ME-203","RT ME-203","RTI ME-203"};
		    String c3[]={" ","RP AE-203","RT AE-203","RTI AE-203"};
		    String c4[]={" ","RP AE-205","RT AE-205","RTI AE-205"};
		    String c5[]={" ","RP AE-207","RT AE-207","RTI AE-207"};
		    String c6[]={" ","RP ME-207","RT ME-207","RTI ME-207"};
		    String c7[]={" ","RP AE-209","RT AE-209","RTI AE-209"};
		    String c8[]={" ","RP AE-211","RT AE-211","RTI AE-211"};
		    String c9[]={" ","RP AE-213","RT AE-213","RTI AE-213"};
		    String c10[]={" ","RP ME-215","RT ME-215","RTI ME-215"};
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
		    JLabel lab3_8=new JLabel();
		    JLabel lab3_9=new JLabel();
		    JLabel lab3_10=new JLabel();
		    JLabel lab3_11=new JLabel();
		    JLabel lab3_12=new JLabel();


		    label3.setText("Semester-3:");
		    label3_1.setText("Theory");

		    label3_2.setText("Labs");

		    lab3_1.setText("MOM");
		    lab3_2.setText("TOM-I");
		    lab3_3.setText("ACC");
		    lab3_4.setText("ATH");
		    lab3_5.setText("AMM");
		    lab3_6.setText("MD");
		    lab3_7.setText("MOM lab");
		    lab3_8.setText("ACC lab");
		    lab3_9.setText("AMM lab");
		    lab3_10.setText("WS Training");


			    combo3_1 = new  JTextField();
			    combo3_2 = new  JTextField();
			    combo3_3 = new  JTextField();
			    combo3_4 = new  JTextField();
			    combo3_5 = new  JTextField();
			    combo3_6 = new  JTextField();
			    combo3_7= new  JTextField();
			    combo3_8= new  JTextField();
			    combo3_9= new  JTextField();
			    combo3_10= new JTextField();
			   label3.setBounds(20,295,70,20);
			   label3_1.setBounds(20,310,70,20);

			   label3_2.setBounds(620,310,70,20);
			   lab3_1.setBounds(20,330,70,20);
			   lab3_2.setBounds(120,330,70,20);
			   lab3_3.setBounds(220,330,70,20);
			   lab3_4.setBounds(320,330,70,20);
			   lab3_5.setBounds(420,330,70,20);
			   lab3_6.setBounds(520,330,70,20);
			   lab3_7.setBounds(620,330,70,20);
			   lab3_8.setBounds(720,330,70,20);
			   lab3_9.setBounds(820,330,70,20);
			   lab3_10.setBounds(920,330,70,20);


			   combo3_1.setBounds(20,350,70,20);
			   combo3_2.setBounds(120,350,70,20);
			   combo3_3.setBounds(220,350,70,20);
			   combo3_4.setBounds(320,350,70,20);
			   combo3_5.setBounds(420,350,70,20);
			   combo3_6.setBounds(520,350,70,20);
			   combo3_7.setBounds(620,350,70,20);
			   combo3_8.setBounds(720,350,70,20);
			   combo3_9.setBounds(820,350,70,20);
			   combo3_10.setBounds(920,350,70,20);
			    add(combo3_1);
			    add(combo3_2);
			    add(combo3_3);
			    add(combo3_4);
			    add(combo3_5);
			    add(combo3_6);
			    add(combo3_7);
			    add(combo3_8);
			    add(combo3_9);
			    add(combo3_10);



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
			    add(lab3_8);
			    add(lab3_9);
			    add(lab3_10);
			    //sem4
                            String d1[]={" ","RP AM-201","RT AM-201","RTI AM-202"};
			    String d2[]={" ","RP AE-202","RT AE-202","RTI AE-202"};
			    String d3[]={" ","RP ME-204","RT ME-204","RTI ME-204"};
			    String d4[]={" ","RP AE-204","RT AE-204","RTI AE-204"};
			    String d5[]={" ","RP AE-206","RT AE-206","RTI AE-206"};
			    String d6[]={" ","RP AE-208","RT AE-208","RTI AE-208"};
			    String d7[]={" ","RP AE-210","RT AE-210","RTI AE-210"};
			    String d8[]={" ","RP ME-212","RT ME-212","RTI ME-212"};
			    String d9[]={" ","RP AE-212","RT AE-212","RTI AE-212"};
			    String d10[]={" ","RP AE-214","RT AE-214","RTI AE-214"};
			    JLabel label4=new JLabel();
			    JLabel label4_1=new JLabel();
			    JLabel label4_2=new JLabel();
			    JLabel lab4_1=new JLabel();
			    JLabel lab4_2=new JLabel();
			    JLabel lab4_3=new JLabel();
			    JLabel lab4_4=new JLabel();
			    JLabel lab4_5=new JLabel();
			    JLabel lab4_6=new JLabel();
			    JLabel lab4_7=new JLabel();
			    JLabel lab4_8=new JLabel();
			    JLabel lab4_9=new JLabel();
			    JLabel lab4_10=new JLabel();
			    label4.setText("Semester-4:");
			    label4_1.setText("Theory");
			    label4_2.setText("Labs");
			    lab4_1.setText("MATH-III");
			    lab4_2.setText("ICE");
			    lab4_3.setText("TOM-II");
			    lab4_4.setText("MP");
			    lab4_5.setText("FMM");
			    lab4_6.setText("APC");
			    lab4_7.setText("ICE lab");
			    lab4_8.setText("TOM lab");
			    lab4_9.setText("MP lab");
			    lab4_10.setText("FMM lab");




				    combo4_1 = new  JTextField();
				    combo4_2 = new  JTextField();
				    combo4_3 = new  JTextField();
				    combo4_4 = new  JTextField();
				    combo4_5 = new JTextField();
				    combo4_6 = new JTextField();
				    combo4_7= new  JTextField();
				    combo4_8= new  JTextField();
				    combo4_9= new  JTextField();
                                    combo4_10= new  JTextField();

				   label4.setBounds(20,435,70,20);
				   label4_1.setBounds(20,450,70,20);
				   label4_2.setBounds(620,450,70,20);
				   lab4_1.setBounds(20,470,70,20);
				   lab4_2.setBounds(120,470,70,20);
				   lab4_3.setBounds(220,470,70,20);
				   lab4_4.setBounds(320,470,70,20);
				   lab4_5.setBounds(420,470,70,20);
				   lab4_6.setBounds(520,470,70,20);
				   lab4_7.setBounds(620,470,70,20);
				   lab4_8.setBounds(720,470,70,20);
				   lab4_9.setBounds(820,470,70,20);
				   lab4_10.setBounds(920,470,70,20);
				   combo4_1.setBounds(20,490,70,20);
				   combo4_2.setBounds(120,490,70,20);
				   combo4_3.setBounds(220,490,70,20);
				   combo4_4.setBounds(320,490,70,20);
				   combo4_5.setBounds(420,490,70,20);
				   combo4_6.setBounds(520,490,70,20);
				   combo4_7.setBounds(620,490,70,20);
				   combo4_8.setBounds(720,490,70,20);
				   combo4_9.setBounds(820,490,70,20);
                                   combo4_10.setBounds(920,490,70,20);
				    add(combo4_1);
				    add(combo4_2);
				    add(combo4_3);
				    add(combo4_4);
				    add(combo4_5);
				    add(combo4_6);
				    add(combo4_7);
				    add(combo4_8);
				    add(combo4_9);
                                    add(combo4_10);
				    add(label4);
				    add(label4_1);
				    add(label4_2);
				    add(lab4_1);
				    add(lab4_2);
				    add(lab4_3);
				    add(lab4_4);
				    add(lab4_5);
				    add(lab4_6);
				    add(lab4_7);
				    add(lab4_8);
				    add(lab4_9);
				    add(lab4_10);
//sem5
				    String e1[]={" ","RP AE-301","RT AE-301","RTI AE-301"};
				    String e2[]={" ","RP AE-303","RT AE-303","RTI AE-303"};
				    String e3[]={" ","RP AE-305","RT AE-305","RTI AE-305"};
				    String e4[]={" ","RP AE-307","RT AE-307","RTI AE-307"};
				    String e5[]={" ","RP AE-309","RT AE-309","RTI AE-309"};
				    String e6[]={" ","RP CE-216","RT CE-216","RTI CE-216"};
				    String e7[]={" ","RP AE-311","RT AE-311","RTI AE-311"};
				    String e8[]={" ","RP AE-313","RT AE-313","RTI AE-313"};
                                    String e9[]={" ","RP AE-315","RT AE-315","RTI AE-315"};
                                    String e10[]={" ","RP AE-317","RT AE-317","RTI AE-317"};
                                    String e11[]={" ","RP AE-319","RT AE-319","RTI AE-319"};
                                    String e12[]={" ","RP ME-323","RT ME-323","RTI ME-323"};





				    JLabel label5=new JLabel();
				    JLabel label5_1=new JLabel();
				    JLabel label5_2=new JLabel();
				    JLabel lab5_1=new JLabel();
				    JLabel lab5_2=new JLabel();
				    JLabel lab5_3=new JLabel();
				    JLabel lab5_4=new JLabel();
				    JLabel lab5_5=new JLabel();
				    JLabel lab5_6=new JLabel();
				    JLabel lab5_7=new JLabel();
				    JLabel lab5_8=new JLabel();
				    JLabel lab5_9=new JLabel();
				    JLabel lab5_10=new JLabel();
				    JLabel lab5_11=new JLabel();
				    JLabel lab5_12=new JLabel();
				    label5.setText("Semester-5:");
				    label5_1.setText("Theory");
				    label5_2.setText("Labs");
lab5_1.setText("AD-I");
lab5_2.setText("AT");
lab5_3.setText("AE");
lab5_4.setText("HEAC");
lab5_5.setText("NM");
lab5_6.setText("EVS");
lab5_7.setText("CAD lab");
lab5_8.setText("AT lab");
lab5_9.setText("AE lab");
lab5_10.setText("HEAC lab");
lab5_11.setText("NM lab");
lab5_12.setText("Indus.Traning");


					    combo5_1 = new  JTextField();
					    combo5_2 = new  JTextField();
					    combo5_3 = new  JTextField();
					    combo5_4 = new  JTextField();
					    combo5_5 = new  JTextField();
					    combo5_6 = new JTextField();
					    combo5_7= new  JTextField();
					    combo5_8= new  JTextField();
					    combo5_9= new  JTextField();
                                            combo5_10= new JTextField();
                                            combo5_11= new  JTextField();
                                            combo5_12= new  JTextField();
       					   label5.setBounds(20,575,70,20);
					   label5_1.setBounds(20,590,70,20);
					   label5_2.setBounds(620,590,70,20);
lab5_1.setBounds(20,610,70,20);
lab5_2.setBounds(120,610,70,20);
lab5_3.setBounds(220,610,70,20);
lab5_4.setBounds(320,610,70,20);
lab5_5.setBounds(420,610,70,20);
lab5_6.setBounds(520,610,70,20);
lab5_7.setBounds(620,610,70,20);
lab5_8.setBounds(720,610,70,20);
lab5_9.setBounds(820,610,70,20);
lab5_10.setBounds(920,610,70,20);
lab5_11.setBounds(1020,610,70,20);
lab5_12.setBounds(1120,610,70,20);
					   combo5_1.setBounds(20,630,70,20);
					   combo5_2.setBounds(120,630,70,20);
					   combo5_3.setBounds(220,630,70,20);
					   combo5_4.setBounds(320,630,70,20);
					   combo5_5.setBounds(420,630,70,20);
					   combo5_6.setBounds(520,630,70,20);
					   combo5_7.setBounds(620,630,70,20);
					   combo5_8.setBounds(720,630,70,20);
					   combo5_9.setBounds(820,630,70,20);
                                           combo5_10.setBounds(920,630,70,20);
                                           combo5_11.setBounds(1020,630,70,20);
                                           combo5_12.setBounds(1120,630,70,20);
					    add(combo5_1);
					    add(combo5_2);
					    add(combo5_3);
					    add(combo5_4);
					    add(combo5_5);
					    add(combo5_6);
					    add(combo5_7);
					    add(combo5_8);
					    add(combo5_9);
                                            add(combo5_10);
                                            add(combo5_11);
                                            add(combo5_12);
					    add(label5);
					    add(label5_1);
					    add(label5_2);
					    add(lab5_1);
					    add(lab5_2);
					    add(lab5_3);
					    add(lab5_4);
					    add(lab5_5);
					    add(lab5_6);
					    add(lab5_7);
					    add(lab5_8);
					    add(lab5_9);
					    add(lab5_10);
					    add(lab5_11);
					    add(lab5_12);
 // sem-6
                                    String f1[]={" ","RP AE-302","RT AE-302","RTI AE-302"};
				    String f2[]={" ","RP AE-304","RT AE-304","RTI AE-304"};
				    String f3[]={" ","RP AE-306","RT AE-306","RTI AE-306"};
				    String f4[]={" ","RP AE-308","RT AE-308","RTI AE-308"};
				    String f5[]={" ","RP AE-310","RT AE-310","RTI AE-310"};
				    String f6[]={" ","RP ME-","RT ME-","RTI ME-"};
				    String f7[]={" ","RP AE-320","RT AE-320","RTI AE-320"};
				    String f8[]={" ","RP AE-322","RT AE-322","RTI AE-322"};
                                    String f9[]={" ","RP AE-324","RT AE-324","RTI AE-324"};
                                    String f10[]={" ","RP AE-326","RT AE-326","RTI AE-326"};

				    JLabel label6=new JLabel();
				    JLabel label6_1=new JLabel();
				    JLabel label6_2=new JLabel();

				    JLabel lab6_1=new JLabel();
				    JLabel lab6_2=new JLabel();
				    JLabel lab6_3=new JLabel();
				    JLabel lab6_4=new JLabel();
				    JLabel lab6_5=new JLabel();
				    JLabel lab6_6=new JLabel();
				    JLabel lab6_7=new JLabel();
				    JLabel lab6_8=new JLabel();
				    JLabel lab6_9=new JLabel();
				    JLabel lab6_10=new JLabel();


				    label6.setText("Semester-6:");
				    label6_1.setText("Theory");
				    label6_2.setText("Labs");
lab6_1.setText("AD-II");
lab6_2.setText("VBE");
lab6_3.setText("MI");
lab6_4.setText("VD");
lab6_5.setText("AEM");
lab6_6.setText("ELECTIVE-I");
lab6_7.setText("CAD lab");
lab6_8.setText("VBE lab");
lab6_9.setText("MI lab");
lab6_10.setText("AEM lab");


					    combo6_1 = new  JTextField();
					    combo6_2 = new  JTextField();
					    combo6_3 = new  JTextField();
					    combo6_4 = new  JTextField();
					    combo6_5 = new JTextField();
					    combo6_6 = new JTextField();
				    combo6_7= new  JTextField();
					    combo6_8= new  JTextField();
					    combo6_9= new  JTextField();
                                            combo6_10= new JTextField();

					   label6.setBounds(20,715,70,20);
					   label6_1.setBounds(20,730,70,20);
					   label6_2.setBounds(620,730,70,20);
lab6_1.setBounds(20,750,70,20);
lab6_2.setBounds(120,750,70,20);
lab6_3.setBounds(220,750,70,20);
lab6_4.setBounds(320,750,70,20);
lab6_5.setBounds(420,750,70,20);
lab6_6.setBounds(520,750,70,20);
lab6_7.setBounds(620,750,70,20);
lab6_8.setBounds(720,750,70,20);
lab6_9.setBounds(820,750,70,20);
lab6_10.setBounds(920,750,70,20);
					   combo6_1.setBounds(20,770,70,20);
					   combo6_2.setBounds(120,770,70,20);
					   combo6_3.setBounds(220,770,70,20);
					   combo6_4.setBounds(320,770,70,20);
					   combo6_5.setBounds(420,770,70,20);
					   combo6_6.setBounds(520,770,70,20);
					   combo6_7.setBounds(620,770,70,20);
					   combo6_8.setBounds(720,770,70,20);
					   combo6_9.setBounds(820,770,70,20);
                                           combo6_10.setBounds(920,770,70,20);
					    add(combo6_1);
					    add(combo6_2);
					    add(combo6_3);
					    add(combo6_4);
					    add(combo6_5);
					    add(combo6_6);
					    add(combo6_7);
					    add(combo6_8);
					    add(combo6_9);
                                            add(combo6_10);
					    add(label6);
					    add(label6_1);
					    add(label6_2);
					    add(lab6_1);
					    add(lab6_2);
					    add(lab6_3);
					    add(lab6_4);
					    add(lab6_5);
					    add(lab6_6);
					    add(lab6_7);
					    add(lab6_8);
					    add(lab6_9);
					    add(lab6_10);
 // sem-7 OR 8
                                    String g1[]={" ","RP AUE-402","RT AUE-402","RTI AUE-402"};
				    String g2[]={" ","RP AUE-406","RT AUE-406","RTI AUE-406"};
				    String g3[]={" ","RP AUE-408","RT AUE-408","RTI AUE-408"};
				    String g4[]={" ","RP AUE-410","RT AUE-410","RTI AUE-410"};
				    String g5[]={" ","RP AUE-412","RT AUE-412","RTI AUE-412"};
				    String g6[]={" ","RP AUE-414","RT AUE-414","RTI AUE-414"};
				    String g7[]={" ","RP AUE-418","RT AUE-418","RTI AUE-418"};
                                    String g8[]={" ","RP AUE-420","RT AUE-420","RTI AUE-420"};
                                    String g9[]={" ","RP AUE-422","RT AUE-422","RTI AUE-422"};
                                    String g10[]={" ","RP AUE-416","RT AUE-416","RTI AUE-416"};
				    JLabel label7=new JLabel();
				    JLabel label7_1=new JLabel();
				    JLabel label7_2=new JLabel();
				    JLabel lab7_1=new JLabel();
				    JLabel lab7_2=new JLabel();
				    JLabel lab7_3=new JLabel();
				    JLabel lab7_4=new JLabel();
				    JLabel lab7_5=new JLabel();
				    JLabel lab7_6=new JLabel();
				    JLabel lab7_7=new JLabel();
				    JLabel lab7_8=new JLabel();
				    JLabel lab7_9=new JLabel();
				    JLabel lab7_10=new JLabel();
				    label7.setText("Semester-7/8:");
				    label7_1.setText("Theory");
				    label7_2.setText("Labs");

lab7_1.setText("AM");
lab7_2.setText("VMIS");
lab7_3.setText("FEA");
lab7_4.setText("SPV");
lab7_5.setText("ELECTIVE-II");
lab7_6.setText("Open Elective");
lab7_7.setText("AM lab");
lab7_8.setText("VMIS lab");
lab7_9.setText("FEA lab");
lab7_10.setText("Project");


					    combo7_1 = new JTextField();
					    combo7_2 = new JTextField();
					    combo7_3 = new JTextField();
					    combo7_4 = new JTextField();
					    combo7_5 = new JTextField();
					    combo7_6 = new JTextField();
					    combo7_7= new  JTextField();
                                            combo7_8= new  JTextField();
                                            combo7_9= new  JTextField();
                                            combo7_10= new  JTextField();
					   label7.setBounds(20,855,100,20);
					   label7_1.setBounds(20,870,70,20);
					   label7_2.setBounds(620,870,70,20);
lab7_1.setBounds(20,890,70,20);
lab7_2.setBounds(120,890,70,20);
lab7_3.setBounds(220,890,70,20);
lab7_4.setBounds(320,890,70,20);
lab7_5.setBounds(420,890,70,20);
lab7_6.setBounds(520,890,70,20);
lab7_7.setBounds(620,890,70,20);
lab7_8.setBounds(720,890,70,20);
lab7_9.setBounds(820,890,70,20);
lab7_10.setBounds(920,890,70,20);
					   combo7_1.setBounds(20,910,70,20);
					   combo7_2.setBounds(120,910,70,20);
					   combo7_3.setBounds(220,910,70,20);
					   combo7_4.setBounds(320,910,70,20);
					   combo7_5.setBounds(420,910,70,20);
					   combo7_6.setBounds(520,910,70,20);
					   combo7_7.setBounds(620,910,70,20);
                                           combo7_8.setBounds(720,910,70,20);
                                           combo7_9.setBounds(820,910,70,20);
                                           combo7_10.setBounds(920,910,70,20);
					    add(combo7_1);
					    add(combo7_2);
					    add(combo7_3);
					    add(combo7_4);
					    add(combo7_5);
					    add(combo7_6);
					    add(combo7_7);
                                            add(combo7_8);
                                            add(combo7_9);
                                            add(combo7_10);
					    add(label7);
					    add(label7_1);
					    add(label7_2);
add(lab7_1);
add(lab7_2);
add(lab7_3);
add(lab7_4);
add(lab7_5);
add(lab7_6);
add(lab7_7);
add(lab7_8);
add(lab7_9);
add(lab7_10);
/*try
{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
    Statement st=con.createStatement();

	 nextpage p=null;

    ResultSet rs=st.executeQuery("select * from project where c_roll='"+p.clsrol.getText()+"'");
    if(rs.next())
    {
		 Object o = p.sem.getSelectedItem();
	 		System.out.println(o);
	 		 if(o.equals("1"))
	 		 {
	 		 	combo1_1.setText(rs.getString("s1"));
		    	combo1_2.setText(""+rs.getString("s2"));
		    	combo1_3.setText(rs.getString("s3"));
		    	combo1_4.setText(rs.getString("s4"));
		    	combo1_5.setText(rs.getString("l1"));
		    	combo1_6.setText(rs.getString("l2"));
		    	combo1_7.setText(rs.getString("l3"));
		    	combo1_8.setText(rs.getString("l4"));
			
	 		 }
    }   con.close();

}catch(Exception ex)
{
    System.out.println(ex.getMessage());
}





		   /*panel.add(label1);
		    panel.add(label2);
		    panel.add(label3);
		    panel.add(label4);
		    panel.add(label5);
		    panel.add(label6);
		    panel.add(label7);*/
					    //contentPane.setBackground(new Color(51, 204, 255));

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
		 int result=JOptionPane.showConfirmDialog(null,"Are you sure you want to save changes"
    				, "Save Confirmation", JOptionPane.YES_NO_OPTION);
    			if(result==JOptionPane.NO_OPTION)
    			{
    				return;
    			}
    			

		 nextpage1 p=null;
         print1 r=new print1();
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
				"' , l1 = '"+combo1_5.getText()+
				"' , l2 = '"+combo1_6.getText()+
				"' , l3 = '"+combo1_7.getText()+
				"' , l4 = '"+combo1_8.getText()+
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
//////////////// update data from second semester///////////////
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
	"' , l3 = '"+combo2_8.getText()+
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
"' , s6 = '"+combo3_6.getText()+
"' , l1 = '"+combo3_7.getText()+
"' , l2 = '"+combo3_8.getText()+
"' , l3 = '"+combo3_9.getText()+
"' , l4 = '"+combo3_10.getText()+
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
"' , s6 = '"+combo4_6.getText()+
"' , l1 = '"+combo4_7.getText()+
"' , l2 = '"+combo4_8.getText()+
"' , l3 = '"+combo4_9.getText()+
"' , l4 = '"+combo4_10.getText()+
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
		 "' , s5 = '"+combo5_5.getText()+
		 "' , s6 = '"+combo5_6.getText()+
		 "' , l1 = '"+combo5_7.getText()+
		 "' , l2 = '"+combo5_8.getText()+
		 "' , l3 = '"+combo5_9.getText()+
		 "' , l4 = '"+combo5_10.getText()+
		 "' , l5 = '"+combo5_11.getText()+
		 "' , l6 = '"+combo5_12.getText()+
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
		 "' , s2 = '"+combo6_2.getText()+
		 "' , s3 = '"+combo6_3.getText()+
		 "' , s4 = '"+combo6_4.getText()+
		 "' , s5 = '"+combo6_5.getText()+
		 "' , s6 = '"+combo6_6.getText()+
		 "' , l1 = '"+combo6_7.getText()+
		 "' , l2 = '"+combo6_8.getText()+
		 "' , l3 = '"+combo6_7.getText()+
		 "' , l4 = '"+combo6_7.getText()+
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
		 	 if(o.equals("7")||o.equals("8"))
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

"' , s1 = '"+combo7_1.getText()+
"' , s2 = '"+combo7_2.getText()+
"' , s3 = '"+combo7_3.getText()+
"' , s4 = '"+combo7_4.getText()+
"' , s5 = '"+combo7_5.getText()+
"' , s6 = '"+combo7_6.getText()+
"' , l1 = '"+combo7_7.getText()+
"' , l2 = '"+combo7_8.getText()+
"' , l3 = '"+combo7_7.getText()+
"' , l4 = '"+combo7_7.getText()+
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




























