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
public class cse extends JPanel
{
 //semester1
  JComboBox combo1_1;
  JComboBox combo1_2;
  JComboBox combo1_3;
  JComboBox combo1_4;
  JComboBox combo1_5;
  JComboBox combo1_6;
  JComboBox combo1_7;
  JComboBox combo1_8;

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
  JComboBox combo2_1;
  JComboBox combo2_2;
  JComboBox combo2_3;
  JComboBox combo2_4;
  JComboBox combo2_5;
  JComboBox combo2_6;
  JComboBox combo2_7;
  JComboBox combo2_8;
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
  JComboBox combo3_1;
  JComboBox combo3_2;
  JComboBox combo3_3;
  JComboBox combo3_4;
  JComboBox combo3_5;
  JComboBox combo3_6;
  JComboBox combo3_7;
  JComboBox combo3_8;
  JComboBox combo3_9;
  JComboBox combo3_10;
  JComboBox combo3_11;
  JComboBox combo3_12;
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
  JComboBox combo4_1;
  JComboBox combo4_2;
  JComboBox combo4_3;
  JComboBox combo4_4;
  JComboBox combo4_5;
  JComboBox combo4_6;
  JComboBox combo4_7;
  JComboBox combo4_8;
  JComboBox combo4_9;
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
  
  //sem5
  JComboBox combo5_1;
  JComboBox combo5_2;
  JComboBox combo5_3;
  JComboBox combo5_4;
  JComboBox combo5_5;
  JComboBox combo5_6;
  JComboBox combo5_7;
  JComboBox combo5_8;
  JComboBox combo5_9;
  JComboBox combo5_10;
  JComboBox combo5_11;
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
//sem6
JComboBox combo6_1;
JComboBox combo6_2;
JComboBox combo6_3;
JComboBox combo6_4;
JComboBox combo6_5;
JComboBox combo6_6;
JComboBox combo6_7;
JComboBox combo6_8;
JComboBox combo6_9;
JComboBox combo6_10;
JLabel label6;
JLabel label6_1;
JLabel label6_2;
//sem 7/8

JComboBox combo7_1;
JComboBox combo7_2;
JComboBox combo7_3;
JComboBox combo7_4;
JComboBox combo7_5;
JComboBox combo7_6;
JLabel label7;
JLabel label7_1;
JLabel label7_2;









  JScrollPane jsp;
  JButton submit;
  

  public cse()
  {//semester1
	 setLayout(null);
	   JButton submit=new JButton();
	  submit.setText("SUBMIT");
	  submit.setBounds(250,1010,700,40);
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




	  combo1_1 = new JComboBox(a1);
	    combo1_2 = new JComboBox(a2);
	    combo1_3 = new JComboBox(a3);
	    combo1_4 = new JComboBox(a4);
	    combo1_5 = new JComboBox(a5);
	    combo1_6 = new JComboBox(a6);
	    combo1_7= new JComboBox(a7);
	    combo1_8= new JComboBox(a7);


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


		   label1.setBounds(20,15,70,20);
		   label1_1.setBounds(20,30,70,20);
		   label1_2.setBounds(420,30,70,20);
		   lab1_1.setBounds(20,50,70,20);
		   lab1_2.setBounds(120,50,70,20);
		   lab1_3.setBounds(220,50,70,20);
		   lab1_4.setBounds(320,50,70,20);
		   lab1_5.setBounds(420,50,70,20);
		   lab1_6.setBounds(520,50,70,20);
		   lab1_7.setBounds(620,50,70,20);
		   lab1_8.setBounds(720,50,70,20);

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
	  String b5[]={" ","RP ME-102","RT ME-102","RTI ME-102"};
	  String b6[]={" ","RP CS-103","RT CS-103","RTI CS-103"};
	  String b7[]={" ","RP CH-103","RT CH-103","RTI CH-103"};
	  String b8[]={" ","RP ME-105","RT ME-105","RTI ME-105"};
	  JFrame frame = new JFrame();
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
    lab2_1.setText("M-II");
    lab2_2.setText("FCPIT");
    lab2_3.setText("CHEMISTRY");
    lab2_4.setText("EME");
    lab2_5.setText("ED");
    lab2_6.setText("FCPIT lab");
    lab2_7.setText("CHE.lab");
    lab2_8.setText("CG lab");

   setBackground(new Color(75,163,230));
	    combo2_1 = new JComboBox(b1);
	    combo2_2 = new JComboBox(b2);
	    combo2_3 = new JComboBox(b3);
	    combo2_4 = new JComboBox(b4);
	    combo2_5 = new JComboBox(b5);
	    combo2_6 = new JComboBox(b6);
	    combo2_7= new JComboBox(b7);
	    combo2_8= new JComboBox(b8);
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
	   lab2_8.setBounds(720,190,70,20);

	   combo2_1.setBounds(20,210,70,20);
	   combo2_2.setBounds(120,210,70,20);
	   combo2_3.setBounds(220,210,70,20);
	   combo2_4.setBounds(320,210,70,20);
	   combo2_5.setBounds(420,210,70,20);
	   combo2_6.setBounds(520,210,70,20);
	   combo2_7.setBounds(620,210,70,20);
	   combo2_8.setBounds(720,210,70,20);
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
	    String c1[]={" ","RP CS-201","RT CS-201","RTI CS-201"};
	    String c2[]={" ","RP CS-203","RT CS-203","RTI CS-203"};
	    String c3[]={" ","RP CS-205","RT CS-205","RTI CS-205"};
	    String c4[]={" ","RP CS-207","RT CS-207","RTI CS-207"};
	    String c5[]={" ","RP CS-209","RT CS-209","RTI CS-209"};
	    String c6[]={" ","RP CS-211","RT CS-211","RTI CS-211"};
	    String c7[]={" ","RP CS-252","RT CS-252","RTI CS-252"};
	    String c8[]={" ","RP CS-213","RT CS-213","RTI CS-213"};
	    String c9[]={" ","RP CS-215","RT CS-215","RTI CS-215"};
	    String c10[]={" ","RP","RT ","RTI "};
	    String c11[]={" ","RP CS-217","RT CS-217","RTI CS-217"};
	    String c12[]={" ","RP CS-219","RT CS-219","RTI CS-219"};
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

	    lab3_1.setText("CA");
	    lab3_2.setText("DS");
	    lab3_3.setText("DCLD");
	    lab3_4.setText("DSPM");
	    lab3_5.setText("WOTC");
	    lab3_6.setText("PL");
	    lab3_7.setText("OOP's");
	    lab3_8.setText("DSPM lab");
	    lab3_9.setText("INDUS.TRAINING");
	    lab3_10.setText("OOP's lab");
	    lab3_11.setText("DCLD lab");
	    lab3_12.setText("PL lab");

	   
		    combo3_1 = new JComboBox(c1);
		    combo3_2 = new JComboBox(c2);
		    combo3_3 = new JComboBox(c3);
		    combo3_4 = new JComboBox(c4);
		    combo3_5 = new JComboBox(c5);
		    combo3_6 = new JComboBox(c6);
		    combo3_7= new JComboBox(c7);
		    combo3_8= new JComboBox(c8);
		    combo3_9= new JComboBox(c9);
		    combo3_10= new JComboBox(c10);
		    combo3_11= new JComboBox(c11);
		    combo3_12= new JComboBox(c12);
		   label3.setBounds(20,295,70,20);
		   label3_1.setBounds(20,310,70,20);
		   label3_2.setBounds(720,310,70,20);
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
		   lab3_11.setBounds(1020,330,70,20);
		   lab3_12.setBounds(1120,330,70,20);

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
		   combo3_11.setBounds(1020,350,70,20);
		   combo3_12.setBounds(1120,350,70,20);
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
		    add(combo3_11);
		    add(combo3_12);



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
		    add(lab3_11);
		    add(lab3_12);

		    //sem4
		    String d1[]={" ","RP CS-202","RT CS-202","RTI CS-202"};
		    String d2[]={" ","RP CS-204","RT CS-204","RTI CS-204"};
		    String d3[]={" ","RP CS-206","RT CS-206","RTI CS-206"};
		    String d4[]={" ","RP CS-208","RT CS-208","RTI CS-208"};
		    String d5[]={" ","RP CS-210","RT CS-210","RTI CS-210"};
		    String d6[]={" ","RP CS-212","RT CS-212","RTI CS-212"};
		    String d7[]={" ","RP CS-214","RT CS-214","RTI CS-214"};
		    String d8[]={" ","RP CS-216","RT CS-216","RTI CS-216"};
		    String d9[]={" ","RP CS-218","RT CS-218","RTI CS-218"};
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

		    label4.setText("Semester-4:");
		    label4_1.setText("Theory");
		    label4_2.setText("Labs");
		    lab4_1.setText("OS");
		    lab4_2.setText("Math-III");
		    lab4_3.setText("DC");
		    lab4_4.setText("MP");
		    lab4_5.setText("SP");
		    lab4_6.setText("OS lab");
		    lab4_7.setText("DC lab");
		    lab4_8.setText("MP lab");
		    lab4_9.setText("SP lab");



		  
			    combo4_1 = new JComboBox(d1);
			    combo4_2 = new JComboBox(d2);
			    combo4_3 = new JComboBox(d3);
			    combo4_4 = new JComboBox(d4);
			    combo4_5 = new JComboBox(d5);
			    combo4_6 = new JComboBox(d6);
			    combo4_7= new JComboBox(d7);
			    combo4_8= new JComboBox(d8);
			    combo4_9= new JComboBox(d9);

			   label4.setBounds(20,435,70,20);
			   label4_1.setBounds(20,450,70,20);
			   label4_2.setBounds(520,450,70,20);
			   lab4_1.setBounds(20,470,70,20);
			   lab4_2.setBounds(120,470,70,20);
			   lab4_3.setBounds(220,470,70,20);
			   lab4_4.setBounds(320,470,70,20);
			   lab4_5.setBounds(420,470,70,20);
			   lab4_6.setBounds(520,470,70,20);
			   lab4_7.setBounds(620,470,70,20);
			   lab4_8.setBounds(720,470,70,20);
			   lab4_9.setBounds(820,470,70,20);


			   combo4_1.setBounds(20,490,70,20);
			   combo4_2.setBounds(120,490,70,20);
			   combo4_3.setBounds(220,490,70,20);
			   combo4_4.setBounds(320,490,70,20);
			   combo4_5.setBounds(420,490,70,20);
			   combo4_6.setBounds(520,490,70,20);
			   combo4_7.setBounds(620,490,70,20);
			   combo4_8.setBounds(720,490,70,20);
			   combo4_9.setBounds(820,490,70,20);

			    add(combo4_1);
			    add(combo4_2);
			    add(combo4_3);
			    add(combo4_4);
			    add(combo4_5);
			    add(combo4_6);
			    add(combo4_7);
			    add(combo4_8);
			    add(combo4_9);

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

//sem5
			    String e1[]={" ","RP CS-301","RT CS-301","RTI CS-301"};
			    String e2[]={" ","RP CS-303","RT CS-303","RTI CS-303"};
			    String e3[]={" ","RP CS-305","RT CS-305","RTI CS-305"};
			    String e4[]={" ","RP CS-307","RT CS-307","RTI CS-307"};
			    String e5[]={" ","RP CS-309","RT CS-309","RTI CS-309"};
			    String e6[]={" ","RP CS-311","RT CS-311","RTI CS-311"};
			    String e7[]={" ","RP CS-313","RT CS-313","RTI CS-313"};
			    String e8[]={" ","RP CS-315","RT CS-315","RTI CS-315"};
			    String e9[]={" ","RP CS-317","RT CS-317","RTI CS-317"};
			    String e10[]={" ","RP CS-319","RT CS-319","RTI CS-319"};
			    String e11[]={" ","RP","RT","RTI"};


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

			    label5.setText("Semester-5:");
			    label5_1.setText("Theory");
			    label5_2.setText("Labs");
			    lab5_1.setText("SAD");
			    lab5_2.setText("CN");
			    lab5_3.setText("DBMS");
			    lab5_4.setText("DAA");
			    lab5_5.setText("CG");
			    lab5_6.setText("CPI");
			    lab5_7.setText("DBMS lab");
			    lab5_8.setText("CN lab");
			    lab5_9.setText("DAA lab");
			    lab5_10.setText("CG lab");
                  lab5_11.setText("Traning");

			  
				    combo5_1 = new JComboBox(e1);
				    combo5_2 = new JComboBox(e2);
				    combo5_3 = new JComboBox(e3);
				    combo5_4 = new JComboBox(e4);
				    combo5_5 = new JComboBox(e5);
				    combo5_6 = new JComboBox(e6);
				    combo5_7= new JComboBox(e7);
				    combo5_8= new JComboBox(e8);
				    combo5_9= new JComboBox(e9);
				    combo5_10= new JComboBox(e10);
combo5_11=new JComboBox(e11);
				   label5.setBounds(20,575,70,20);
				   label5_1.setBounds(20,590,70,20);
				   label5_2.setBounds(520,590,70,20);
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
				    
//sem 6
				    String f1[]={" ","RP CS-302","RT CS-302","RTI CS-302"};
				    String f2[]={" ","RP CS-304","RT CS-304","RTI CS-304"};
				    String f3[]={" ","RP CS-306","RT CS-306","RTI CS-306"};
				    String f4[]={" ","RP CS-308","RT CS-308","RTI CS-308"};
				    String f5[]={" ","CV","RP CS-310","RT CS-310","RTI CS-310","SHD","RP CS-322","RT CS-322","RTI CS-322","RTS","RP CS-324","RT CS-324","RTI CS-324","OR","RP CS-326","RT CS-326","RTI CS-326","LP","RP CS-328","RT CS-328","RTI CS-328","NLP","RP CS-330","RT CS-330","RTI CS-330"};
				    String f6[]={" ","RP CS-312","RT CS-312","RTI CS-312"};
				    String f7[]={" ","RP CS-314","RT CS-314","RTI CS-314"};
				    String f8[]={" ","RP CS-316","RT CS-316","RTI CS-316"};
				    String f9[]={" ","RP CS-318","RT CS-318","RTI CS-318"};
				    String f10[]={" ","RP CS-320","RT CS-320","RTI CS-320"};
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
				    lab6_1.setText("RDBMS");
				    lab6_2.setText("IBS");
				    lab6_3.setText("ATM");
				    lab6_4.setText("SE");
				    lab6_5.setText("OPEN ELECTIVE");
				    lab6_6.setText("ELECTIVE");
				    lab6_7.setText("ATM lab");
				    lab6_8.setText("RDBMS lab");
				    lab6_9.setText("SE lab");
				    lab6_10.setText("IBS lab");




					    combo6_1 = new JComboBox(f1);
					    combo6_2 = new JComboBox(f2);
					    combo6_3 = new JComboBox(f3);
					    combo6_4 = new JComboBox(f4);
					    combo6_5 = new JComboBox(f5);
					    combo6_6 = new JComboBox(f6);
					    combo6_7= new JComboBox(f7);
					    combo6_8= new JComboBox(f8);
					    combo6_9= new JComboBox(f9);
combo6_10=new JComboBox(f10);
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
				


			//semester 7
					    String g1[]={" ","RP CS-402","RT CS-402","RTI CS-402"};
					    String g2[]={" ","RP CS-404","RT CS-404","RTI CS-404"};
					    String g3[]={" ","RP CS-406","RT CS-406","RTI CS-406"};
					    String g4[]={" ","RP CS-408","RT CS-408","RTI CS-408"};
					    String g5[]={" ","RP CE-216","RT CE-216","RTI CE-216"};
					    String g6[]={" ","RP CS-416","RT CS-416","RTI CS-416"};

					    JLabel label7=new JLabel();
					    JLabel label7_1=new JLabel();
					    JLabel label7_2=new JLabel();
					    JLabel lab7_1=new JLabel();
					    JLabel lab7_2=new JLabel();
					    JLabel lab7_3=new JLabel();
					    JLabel lab7_4=new JLabel();
					    JLabel lab7_5=new JLabel();
					    JLabel lab7_6=new JLabel();
					   
					    label7.setText("Semester-7/8:");
					    label7_1.setText("Theory");
					    label7_2.setText("Labs");

					    lab7_1.setText("SLLP");
					    lab7_2.setText("FLAT");
					    lab7_3.setText("PROJECT");
					    lab7_4.setText("PEEMT");
					    lab7_5.setText("ES");
					    lab7_6.setText("S/W lab");
					  

						    combo7_1 = new JComboBox(g1);
						    combo7_2 = new JComboBox(g2);
						    combo7_3 = new JComboBox(g3);
						    combo7_4 = new JComboBox(g4);
						    combo7_5 = new JComboBox(g5);
						    combo7_6 = new JComboBox(g6);

						   label7.setBounds(20,855,100,20);
						   label7_1.setBounds(20,870,70,20);
						   label7_2.setBounds(620,870,70,20);
						   lab7_1.setBounds(20,890,70,20);
						   lab7_2.setBounds(120,890,70,20);
						   lab7_3.setBounds(220,890,70,20);
						   lab7_4.setBounds(320,890,70,20);
						   lab7_5.setBounds(420,890,70,20);
						   lab7_6.setBounds(620,890,70,20);
						   
						  add(label7);
						  add(label7_1);
						    add(label7_2);
						    add(lab7_1);
						    add(lab7_2);
						    add(lab7_3);
						    add(lab7_4);
						    add(lab7_5);
						    add(lab7_6);
						   
						   combo7_1.setBounds(20,910,70,20);
						   combo7_2.setBounds(120,910,70,20);
						   combo7_3.setBounds(220,910,70,20);
						   combo7_4.setBounds(320,910,70,20);
						   combo7_5.setBounds(420,910,70,20);
						   combo7_6.setBounds(620,910,70,20);

						    add(combo7_1);
						    add(combo7_2);
						    add(combo7_3);
						    add(combo7_4);
						    add(combo7_5);
						    add(combo7_6);




		   /*add(label1);
		    add(label2);
		    add(label3);
		    add(label4);
		    add(label5);
		    add(label6);
		    add(label7);*/
		    //frame.add(panel);
		


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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String)p.sem.getSelectedItem());


st.setString(8,(String) combo1_1.getSelectedItem());
st.setString(9,(String) combo1_2.getSelectedItem());
st.setString(10,(String) combo1_3.getSelectedItem());
st.setString(11,(String) combo1_4.getSelectedItem());

st.setString(12,null);
st.setString(13,null);
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo1_5.getSelectedItem());

st.setString(17,(String) combo1_6.getSelectedItem());
st.setString(18,(String) combo1_7.getSelectedItem());
st.setString(19,(String) combo1_8.getSelectedItem());

st.setString(20,null);
st.setString(21,null);

// st.setString(6,s6.getText());

st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo2_1.getSelectedItem());
st.setString(9,(String) combo2_2.getSelectedItem());
st.setString(10,(String) combo2_3.getSelectedItem());
st.setString(11,(String) combo2_4.getSelectedItem());

st.setString(12,(String) combo2_5.getSelectedItem());
st.setString(13,null);
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo2_6.getSelectedItem());

st.setString(17,(String)combo2_7.getSelectedItem());
st.setString(18,(String) combo2_8.getSelectedItem());
st.setString(19,null);

st.setString(20,null);
st.setString(21,null);

//st.setString(6,s6.getText());

st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo3_1.getSelectedItem());
st.setString(9,(String) combo3_2.getSelectedItem());
st.setString(10,(String) combo3_3.getSelectedItem());
st.setString(11,(String) combo3_4.getSelectedItem());

st.setString(12,(String) combo3_5.getSelectedItem());
st.setString(13,(String) combo3_6.getSelectedItem());
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo3_7.getSelectedItem());

st.setString(17,(String) combo3_8.getSelectedItem());
st.setString(18,(String) combo3_9.getSelectedItem());
st.setString(19,(String) combo3_10.getSelectedItem());

st.setString(20,null);
st.setString(21,null);

//st.setString(6,s6.getText());

st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo4_1.getSelectedItem());
st.setString(9,(String) combo4_2.getSelectedItem());
st.setString(10,(String) combo4_3.getSelectedItem());
st.setString(11,(String) combo4_4.getSelectedItem());

st.setString(12,(String) combo4_5.getSelectedItem());
st.setString(13,(String) combo4_6.getSelectedItem());
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo4_7.getSelectedItem());

st.setString(17,(String) combo4_8.getSelectedItem());
st.setString(18,(String) combo4_9.getSelectedItem());
//st.setString(19,(String) combo4_10.getSelectedItem());

st.setString(20,null);
st.setString(21,null);


st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo2_1.getSelectedItem());
st.setString(9,(String) combo2_2.getSelectedItem());
st.setString(10,(String) combo2_3.getSelectedItem());
st.setString(11,(String) combo2_4.getSelectedItem());

st.setString(12,null);
st.setString(13,null);
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo2_5.getSelectedItem());

st.setString(17,(String) combo2_6.getSelectedItem());
st.setString(18,(String) combo2_7.getSelectedItem());
st.setString(19,(String) combo2_8.getSelectedItem());

st.setString(20,null);
st.setString(21,null);

//st.setString(6,s6.getText());

st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo2_1.getSelectedItem());
st.setString(9,(String) combo2_2.getSelectedItem());
st.setString(10,(String) combo2_3.getSelectedItem());
st.setString(11,(String) combo2_4.getSelectedItem());

st.setString(12,null);
st.setString(13,null);
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo2_5.getSelectedItem());

st.setString(17,(String) combo2_6.getSelectedItem());
st.setString(18,(String) combo2_7.getSelectedItem());
st.setString(19,(String) combo2_8.getSelectedItem());

st.setString(20,null);
st.setString(21,null);

//st.setString(6,s6.getText());

st.executeUpdate();
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
PreparedStatement st=con.prepareStatement("insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
st.setString(1,p.clsrol.getText());
st.setString(2,p.sname.getText());
st.setString(3,p.uni_rol.getText());
st.setString(4,p.f_name.getText());
st.setString(5,(String) p.branch.getSelectedItem());
st.setString(6,(String) p.batch.getSelectedItem());
st.setString(7,(String) p.sem.getSelectedItem());


st.setString(8,(String) combo2_1.getSelectedItem());
st.setString(9,(String) combo2_2.getSelectedItem());
st.setString(10,(String) combo2_3.getSelectedItem());
st.setString(11,(String) combo2_4.getSelectedItem());

st.setString(12,null);
st.setString(13,null);
st.setString(14,null);
st.setString(15,null);

st.setString(16,(String) combo2_5.getSelectedItem());

st.setString(17,(String) combo2_6.getSelectedItem());
st.setString(18,(String) combo2_7.getSelectedItem());
st.setString(19,(String) combo2_8.getSelectedItem());

st.setString(20,null);
st.setString(21,null);

//st.setString(6,s6.getText());

st.executeUpdate();
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




