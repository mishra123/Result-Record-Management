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
 class MECH1 extends JPanel
{
 //semester1
  JTextField combo1_1;
  JTextField combo1_2;
  JTextField combo1_3;
  JTextField combo1_4;
  JTextField combo1_5;
  JTextField combo1_6;
  JTextField combo1_7;
  JTextField combo1_8;

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
  JTextField combo2_1;
  JTextField combo2_2;
  JTextField combo2_3;
  JTextField combo2_4;
  JTextField combo2_5;
  JTextField combo2_6;
  JTextField combo2_7;
  JTextField combo2_8;
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
  JTextField combo3_1;
  JTextField combo3_2;
  JTextField combo3_3;
  JTextField combo3_4;
  JTextField combo3_5;
  JTextField combo3_6;
  JTextField combo3_7;
  JTextField combo3_8;
  JTextField combo3_9;
  JTextField combo3_10;
  JTextField combo3_11;
  JTextField combo3_12;
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
  JTextField combo4_1;
  JTextField combo4_2;
  JTextField combo4_3;
  JTextField combo4_4;
  JTextField combo4_5;
  JTextField combo4_6;
  JTextField combo4_7;
  JTextField combo4_8;
  JTextField combo4_9;
  JTextField combo4_10;
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
  JTextField combo5_1;
  JTextField combo5_2;
  JTextField combo5_3;
  JTextField combo5_4;
  JTextField combo5_5;
  JTextField combo5_6;
  JTextField combo5_7;
  JTextField combo5_8;
  JTextField combo5_9;
  JTextField combo5_10;
  JTextField combo5_11;
  JTextField combo5_12;
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
  JTextField combo6_1;
  JTextField combo6_2;
  JTextField combo6_3;
  JTextField combo6_4;
  JTextField combo6_5;
  JTextField combo6_6;
  JTextField combo6_7;
  JTextField combo6_8;
  JTextField combo6_9;
  JTextField combo6_10;
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
  JTextField combo7_1;
  JTextField combo7_2;
  JTextField combo7_3;
  JTextField combo7_4;
  JTextField combo7_5;
  JTextField combo7_6;
  JTextField combo7_7;
  JTextField combo7_8;
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
  JScrollPane jsp1;
  JButton submit;
  public MECH1()
  {//semester1
setLayout(null);
	  //JFrame f=new JFrame;
	  JButton submit=new JButton();
	  submit.setText("SUBMIT");
	  submit.setBounds(120,1010,700,40);
	  add(submit);
	  setPreferredSize(new Dimension(1500,1500));
	  
	  String a1[] = {"Physics","RP PH-101","RT PH-101","RTI PH-101"};
	  String a2[] ={"Math","RP AM-101","RT AM-101","RTI AM-101"};
	  String a3[]={"BEEE","RP EE-101","RT EE-101","RTI EE-101"};
	  String a4[] ={"CS","RP HU-101","RT HU-101","RTI HU-101"};
	  String a5[] ={"Phy.Lab","RP PH-103","RT PH-103","RTI PH-103"};
	  String a6[] ={"CS.LAB","RP HU-103","RT HU-103","RTI HU-103"};
	  String a7[] ={"BEEE-Lab","RP","RT","RTI"};
	  String a8[]={"ME","RP ME-104","RT ME-104","RTI ME-104"};
	  JLabel label1=new JLabel();
	  JLabel label1_1=new JLabel();
	  JLabel label1_2=new JLabel();


	  combo1_1 = new JTextField();
	    combo1_2 = new JTextField();
	    combo1_3 = new JTextField();
	    combo1_4 = new JTextField();
	    combo1_5 = new JTextField();
	    combo1_6 = new JTextField();
	    combo1_7= new JTextField();
	    combo1_8= new JTextField();

	    JLabel lab1_1=new JLabel();
	    JLabel lab1_2=new JLabel();
	    JLabel lab1_3=new JLabel();
	    JLabel lab1_4=new JLabel();
	    JLabel lab1_5=new JLabel();
	    JLabel lab1_6=new JLabel();
	    JLabel lab1_7=new JLabel();
	    JLabel lab1_8=new JLabel();
	   
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
	    lab1_1.setBounds(20,50,70,20);
	    lab1_2.setBounds(120,50,70,20);
	    lab1_3.setBounds(220,50,70,20);
	    lab1_4.setBounds(320,50,70,20);
	    lab1_5.setBounds(420,50,70,20);
	    lab1_6.setBounds(520,50,70,20);
	    lab1_7.setBounds(620,50,70,20);
	    lab1_8.setBounds(720,50,70,20);

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
		   label1_2.setBounds(520,30,70,20);
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
	  //JFrame frame = new JFrame();
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
    lab1_1.setText("MATH-II");
    lab1_2.setText("FCPIT");
    lab1_3.setText("CHEMISTRY");
    lab1_4.setText("EME");
    lab1_5.setText("ED");
    lab1_6.setText("FCPIT LAB");
    lab1_7.setText("CHE LAB");
    lab1_8.setText("CG LAB");
    setBackground(new Color(75,163,230));
	    combo2_1 = new JTextField();
	    combo2_2 = new JTextField();
	    combo2_3 = new JTextField();
	    combo2_4 = new JTextField();
	    combo2_5 = new JTextField();
	    combo2_6 = new JTextField();
	    combo2_7= new JTextField();
	    combo2_8= new JTextField();
	   label2.setBounds(20,155,70,20);
	   label2_1.setBounds(20,170,70,20);
	   label2_2.setBounds(620,170,70,20);
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
	    add(lab2_1);
	    add(lab2_2);
	    add(lab2_3);
	    add(lab2_4);
	    add(lab2_5);
	    add(lab2_6);
	    add(lab2_7);
	    add(lab2_8);
	    

	    add(label2);
	    //semester3
	    String c1[]={"SOM-I","RP ME-201","RT ME-201","RTI ME-201"};
	    String c2[]={"TOM-I","RP ME-203","RT ME-203","RTI ME-203"};
	    String c3[]={"EMM","RP ME-205","RT ME-205","RTI ME-205"};
	    String c4[]={"MD","RP ME-207","RT ME-207","RTI ME-207"};
	    String c5[]={"ATH-I","RP ME-209","RT ME-209","RTI ME-209"};
	    String c6[]={"MP-I","RP PE-209","RT PE-209","RTI PE-209"};
	    String c7[]={"SOM LAB","RP MP-211","RT MP-211","RTI CS-211"};
	    String c8[]={"EMM LAB","RP MP-213","RT MP-213","RTI MP-213"};
	    String c9[]={"WS TRAINING","RP ME-215","RT ME-215","RTI ME-215"};
	    String c10[]={"MP-I LAB","RP PE217-","RT ME-217","RTI ME-207"};
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
	    label3.setText("Semester-3:");
	    label3_1.setText("Theory");
	    label3_2.setText("Labs");
        lab3_1.setText("SOM-I");
        lab3_2.setText("TOM-I");
        lab3_3.setText("EMM");
        lab3_4.setText("MD");
        lab3_5.setText("ATH-I");
        lab3_6.setText("MP-I");
        lab3_7.setText("SOM LAB");
        lab3_8.setText("EMM LAB");
        lab3_9.setText("WS TRAINING");
        lab3_10.setText("MP-I LAB");

	 
		    combo3_1 = new JTextField();
		    combo3_2 = new JTextField();
		    combo3_3 = new JTextField();
		    combo3_4 = new JTextField();
		    combo3_5 = new JTextField();
		    combo3_6 = new JTextField();
		    combo3_7= new JTextField();
		    combo3_8= new JTextField();
		    combo3_9= new JTextField();
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



		    add(label3);
		    add(label3_1);
		    add(label3_2);
		    //sem4
                        String d1[]={"MATH-III","RP AM-201","RT AM-201","RTI AM-202"};
		    String d2[]={"SOM-II","RP ME-202","RT ME-202","RTI ME-202"};
		    String d3[]={"TOM-II","RP ME-204","RT ME-204","RTI ME-204"};
		    String d4[]={"FM-I","RP ME-206","RT ME-206","RTI ME-206"};
		    String d5[]={"ATH-II","RP ME-208","RT ME-208","RTI ME-208"};
		    String d6[]={"MP-II","RP ME-210","RT ME-210","RTI ME-210"};
		    String d7[]={"TOM LAB","RP ME-212","RT ME-212","RTI ME-212"};
		    String d8[]={"FM-I LAB","RP ME-214","RT ME-214","RTI ME-214"};
		    String d9[]={"ATH LAB","RP ME-216","RT ME-216","RTI ME-216"};
		    String d10[]={"MP-II LAB","RP ME-218","RT ME-218","RTI ME-218"};
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
		    lab4_2.setText("SOM-II");
		    lab4_3.setText("TOM-II");
		    lab4_4.setText("FM-I");
		    lab4_5.setText("ATH-II");
		    lab4_6.setText("MP-II");
		    lab4_7.setText("TOM LAB");
		    lab4_8.setText("FM-I LAB");
		    lab4_9.setText("ATH LAB");
		    lab4_10.setText("MP-II LAB");


		   
			    combo4_1 = new JTextField();
			    combo4_2 = new JTextField();
			    combo4_3 = new JTextField();
			    combo4_4 = new JTextField();
			    combo4_5 = new JTextField();
			    combo4_6 = new JTextField();
			    combo4_7= new JTextField();
			    combo4_8= new JTextField();
			    combo4_9= new JTextField();
                                combo4_10= new JTextField();

			   label4.setBounds(20,430,70,20);
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
			    String e1[]={"MD-I","RP ME-301","RT ME-301","RTI ME-301"};
			    String e2[]={"HT","RP ME-303","RT ME-303","RTI ME-303"};
			    String e3[]={"AE","RP ME-305","RT ME-305","RTI ME-305"};
			    String e4[]={"MMM","RP ME-307","RT ME-307","RTI ME-307"};
			    String e5[]={"NM","RP ME-309","RT ME-309","RTI ME-309"};
			    String e6[]={"MD-I LAB","RP ME-311","RT ME-311","RTI ME-311"};
			    String e7[]={"HT LAB","RP ME-313","RT ME-313","RTI ME-313"};
			    String e8[]={"AE LAB","RP ME-315","RT ME-315","RTI ME-315"};
                                String e9[]={"MMM LAB","RP ME-317","RT ME-317","RTI ME-317"};
                                String e10[]={"NM LAB","RP ME-319","RT ME-319","RTI ME-319"};
                                String e11[]={"CAD","RP ME-321","RT ME-321","RTI ME-321"};
                                String e12[]={"INDUSTRIAL TRAINING","RP ME-323","RT ME-323","RTI ME-323"};





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
                lab5_1.setText("MD-I");
                lab5_2.setText("HT");
                lab5_3.setText("AE");
                lab5_4.setText("MMM");
                lab5_5.setText("NM");
                lab5_6.setText("MD-I LAB");
                lab5_7.setText("HT LAB");
                lab5_8.setText("AE LAB");
                lab5_9.setText("MMM LAB");
                lab5_10.setText("NM LAB");
                lab5_11.setText("CAD");
                lab5_12.setText("TRAINING");

			   
				    combo5_1 = new JTextField();
				    combo5_2 = new JTextField();
				    combo5_3 = new JTextField();
				    combo5_4 = new JTextField();
				    combo5_5 = new JTextField();
				    combo5_6 = new JTextField();
				    combo5_7= new JTextField();
				    combo5_8= new JTextField();
				    combo5_9= new JTextField();
                                        combo5_10= new JTextField();
                                        combo5_11= new JTextField();
                                        combo5_12= new JTextField();
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
                                String f1[]={"MD-II","RP ME-302","RT ME-302","RTI ME-302"};
			    String f2[]={"RAC","RP ME-304","RT ME-304","RTI ME-304"};
			    String f3[]={"FM","RP ME-306","RT ME-306","RTI ME-306"};
			    String f4[]={"IAR","RP PE-408","RT PE-408","RTI PE-408"};
			    String f5[]={"EVS","RP CE-216","RT CE-216","RTI CE-216"};
			    String f6[]={"MD-II LAB","RP ME-310","RT ME-310","RTI ME-310"};
			    String f7[]={"RAC LAB","RP ME-312","RT ME-312","RTI ME-312"};
			    String f8[]={"FM LAB","RP ME-314","RT ME-314","RTI ME-314"};
                                String f9[]={"IAR LAB","RP PE-414","RT PE-414","RTI PE-414"};
                                String f10[]={"ELECTIVE-I","RP PE-414","RT PE-414","RTI PE-414"};

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
			   
                lab6_1.setText("MD-II");
                lab6_2.setText("RAC");
                lab6_3.setText("FM");
                lab6_4.setText("IAR");
                lab6_5.setText("EVS");
                lab6_6.setText("MD-II LAB");
                lab6_7.setText("RAC LAB");
                lab6_8.setText("FM LAB");
                lab6_9.setText("IAR LAB");
                lab6_10.setText("ELECTIVE-I");

			  
				    combo6_1 = new JTextField();
				    combo6_2 = new JTextField();
				    combo6_3 = new JTextField();
				    combo6_4 = new JTextField();
				    combo6_5 = new JTextField();
				    combo6_6 = new JTextField();
				    combo6_7= new JTextField();
				    combo6_8= new JTextField();
				    combo6_9= new JTextField();
                                        combo6_10= new JTextField();

				   label6.setBounds(20,715,70,20);
				   label6_1.setBounds(20,730,70,20);
				   label6_2.setBounds(520,730,70,20);
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
                                String g1[]={"ISE","RP ME-402","RT ME-402","RTI ME-402"};
			    String g2[]={"CAD/CAM","RP ME-404","RT ME-404","RTI ME-404"};
			    String g3[]={"OS","RP ME-406","RT ME-406","RTI ME-406"};
			    String g4[]={"MV","RP ME-408","RT ME-408","RTI ME-408"};
			    String g5[]={"OPEN ELECTIVE-III","RP IT-412","RT IT-412","RTI IT-412"};
			    String g6[]={"CAD/CAM LAB","RP ME-410","RT ME-410","RTI ME-410"};
			    String g7[]={"MV LAB","RP ME-412","RT ME-412","RTI ME-412"};
			    
			    String g8[]={"PROJECT","RP ME-414","RT ME-414","RTI ME-414"};
                               

			    JLabel label7=new JLabel();
			    JLabel label7_1=new JLabel();
			    JLabel label7_2=new JLabel();
			    label7.setText("Semester-7 OR 8:");
			    label7_1.setText("Theory");
			    label7_2.setText("Labs");
			    JLabel lab7_1=new JLabel();
			    JLabel lab7_2=new JLabel();
			    JLabel lab7_3=new JLabel();
			    JLabel lab7_4=new JLabel();
			    JLabel lab7_5=new JLabel();
			    JLabel lab7_6=new JLabel();
			    JLabel lab7_7=new JLabel();
			    JLabel lab7_8=new JLabel();
				    combo7_1 = new JTextField();
				    combo7_2 = new JTextField();
				    combo7_3 = new JTextField();
				    combo7_4 = new JTextField();
				    combo7_5 = new JTextField();
				    combo7_6 = new JTextField();
				    combo7_7= new JTextField();
                                        combo7_8= new JTextField();

				   label7.setBounds(20,835,100,20);
				   label7_1.setBounds(20,850,70,20);
				   label7_2.setBounds(520,850,70,20);
				   lab7_1.setText("ISE");
				   lab7_2.setText("CAD/CAM");
				   lab7_3.setText("OS");
				   lab7_4.setText("MV");
				   lab7_5.setText("OPEN ELECTIVE-III");
				   lab7_6.setText("CAD/CAM lab");
				   lab7_7.setText("MV lab");
				   lab7_8.setText("PROJECT");


				   combo7_1.setBounds(20,890,70,20);
				   combo7_2.setBounds(120,890,70,20);
				   combo7_3.setBounds(220,890,70,20);
				   combo7_4.setBounds(320,890,70,20);
				   combo7_5.setBounds(420,890,70,20);
				   combo7_6.setBounds(520,890,70,20);
				   combo7_7.setBounds(620,890,70,20);
                                       combo7_8.setBounds(720,890,70,20);
                                       lab7_1.setBounds(20,870,70,20);
                                       lab7_2.setBounds(120,870,70,20);
                                       lab7_3.setBounds(220,870,70,20);
                                       lab7_4.setBounds(320,870,70,20);
                                       lab7_5.setBounds(420,870,70,20);
                                       lab7_6.setBounds(520,870,70,20);
                                       lab7_7.setBounds(620,870,70,20);
                                       lab7_8.setBounds(720,870,70,20);

				    add(combo7_1);
				    add(combo7_2);
				    add(combo7_3);
				    add(combo7_4);
				    add(combo7_5);
				    add(combo7_6);
				    add(combo7_7);
                                        add(combo7_8);
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
"' , l1 = '"+combo5_6.getText()+
"' , l2 = '"+combo5_7.getText()+
"' , l3 = '"+combo5_8.getText()+
"' , l4 = '"+combo5_9.getText()+
"' , l5 = '"+combo5_10.getText()+
"' , l6 = '"+combo5_11.getText()+
"' , l7 = '"+combo5_12.getText()+
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
"' , li = '"+combo6_6.getText()+
"' , l2 = '"+combo6_7.getText()+
"' , l3 = '"+combo6_8.getText()+
"' , l4 = '"+combo6_9.getText()+
"' , l5 = '"+combo6_10.getText()+
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
"' , l1 = '"+combo7_6.getText()+
"' , l2 = '"+combo7_7.getText()+
"' , l3 = '"+combo7_7.getText()+
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




