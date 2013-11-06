/****************************************************************/
/*                      nextpage	                            */
/*                                                              */
/****************************************************************/
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

public class nextpage1 extends JPanel
{
	// Variables declaration
       JLabel jLabel;
	 JLabel jLabel1;
	 JLabel jLabel2;
	 JLabel jLabel3;
	 JLabel jLabel4;
	 JLabel jLabel5;
	 JLabel jLabel6;
	 JButton submit;
	 JButton jLabel8;
	 JLabel jLabel9;
	 JLabel jLabel10;
	 JLabel jLabel11;
	 JLabel jLabel12;
	 JLabel jLabel13;
	 JLabel jLabel14;
	 static JTextField sname;
	 static JTextField clsrol;
	 static JComboBox branch;
	 static JTextField marks;
       JTextField date;
      JTextField jTextField6;
     static  JTextField f_name;
      static JTextField uni_rol;
      static JComboBox sem;
      static JComboBox batch;
      JComboBox jTextField11;
	 JPanel contentPane;
	 Object o1[]={"BRANCH","CSE","IT","AE","ECE","ME","-----","MCA","-----","M.TECH"};
	 Object o2[]={"BATCH","2002","2003","2004","2005","2006","2007","2008","2009"};
	 Object o3[]={"SEM","1","2","3","4","5","6","7","8"};
	 //jTextField.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
	// End of variables declaration
	public nextpage1()
	{
		super();
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
	}
	void initializeComponent()
	{
            jLabel = new JLabel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		submit = new JButton();
		jLabel8 = new JButton();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jLabel11= new JLabel();
		jLabel12= new JLabel();
		jLabel13= new JLabel();
		jLabel14= new JLabel();
		sname = new JTextField();
		clsrol = new JTextField();
		branch = new JComboBox(o1);
		marks = new JTextField();
		date=new JTextField();
		jTextField6=new JTextField();
		f_name=new JTextField();
		uni_rol=new JTextField();
		sem=new JComboBox(o3);
		batch=new JComboBox(o2);
		jTextField11=new JComboBox();

		jLabel.setText("LUDHIANA COLLEGE OF ENGINEERING & TECHNOLOGY");
		jLabel.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,20));
		//
		// jLabel1
		//
		jLabel1.setText("Date/Time :");
		jLabel1.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		// jLabel2
		//
		jLabel2.setText("Receipt No. :");
		jLabel2.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		// jLabel3
		//
		jLabel3.setText("Student Name :");
		jLabel3.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		// jLabel4
		//
		jLabel4.setText("Class Roll. No. :");
		jLabel4.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		// jLabel5
		//
		jLabel5.setText("Branch :");
		jLabel5.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		// jLabel6
		//
		jLabel6.setText("Total marks :");
		jLabel6.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		//
	     submit.setText("FETCH");
		submit.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		//
		//

		//jLabel7.setBackground(new Color(51, 51, 51));
		//
		jLabel8.setText("RESET");
		jLabel8.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		// jTextField1
		jLabel9.setText("Father Name :");
		jLabel9.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		jLabel10.setText("Uni. Roll. No. :");
		jLabel10.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		jLabel11.setText("Semester :");
		jLabel11.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		jLabel12.setText("Batch :");
		jLabel12.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 12));
		jLabel13.setIcon(new ImageIcon("C:\\Documents and Settings\\Owner\\workspace\\college\\logo.jpg"));
		jLabel13.setText("  ");
		jLabel14.setText("KATANI KALAN,LUDHIANA");
		jLabel14.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 20));
		//
		//sname.setVisible(false);
		//clsrol.setVisible(false);
		//branch.setVisible(false);
		//jTextField4.setVisible(false);
		//jTextField6.setVisible(false);
		//f_name.setVisible(false);
		//uni_rol.setVisible(false);
		//sem.setVisible(false);
		//batch.setVisible(false);
		//jTextField11.setVisible(false);


this.setLayout(null);
		add (jLabel);
		jLabel.setBounds(200,30,580,20);
		add (jLabel1);
		jLabel1.setBounds(815,110,80,18);
		add( jLabel2);
		jLabel2.setBounds(815,140,80,18);
		add( jLabel3);
		jLabel3.setBounds(60,210,90,24);
		add( jLabel4);
		jLabel4.setBounds(60,260,90,24);
		add( jLabel5);
		jLabel5.setBounds(60,310,60,24);
		add( jLabel6);
		jLabel6.setBounds(60,360,75,24);
		add( submit);
		submit.setBounds(360,520,90,25);
		add( jLabel8);
		jLabel8.setBounds(500,520,90,25);
		add( jLabel9);
		jLabel9.setBounds(630,210,120,24);
	    add( jLabel10);
	    jLabel10.setBounds(630,260,120,24);
		add( jLabel11);
		jLabel11.setBounds(630,310,120,24);
		add( jLabel12);
		jLabel12.setBounds(630,360,120,24);
	    add( jLabel13);
	    jLabel13.setBounds(70,5,100,100);
        add( jLabel14);
        jLabel14.setBounds(330,60,300,20);
		add( sname);
		sname.setBounds(200,210,120,22);
		add( clsrol);
		clsrol.setBounds(200,260,120,22);
		add( branch);
		branch.setBounds(200,310,120,22);
		add( marks);
		marks.setBounds(200,360,120,22);
		add( date);
		date.setBounds(900,110,100,15);

		 Date time=new Date(System.currentTimeMillis());
		  Calendar cal=new GregorianCalendar();
		  int month=cal.get(Calendar.MONTH);
		  int year=cal.get(Calendar.YEAR);
		  int day=cal.get(Calendar.DAY_OF_MONTH);
		  int hour=cal.get(Calendar.HOUR_OF_DAY);
		  int min=cal.get(Calendar.MINUTE);
		  String t1=Integer.toString(day);
		  String t2=Integer.toString(month+1);
		  String t3=Integer.toString(year);
		  String t4=Integer.toString(hour);
		  String t5=Integer.toString(min);
		  date.setText(t1+"/"+t2+"/"+t3+" ,"+t4+":"+t5);
		  date.setEditable(false);


		add( jTextField6);
		jTextField6.setBounds(900,140,100,15);
		add( f_name);
		f_name.setBounds(750,210,130,22);
		add( uni_rol);
		uni_rol.setBounds(750,260,130,22);
		add( sem);
		sem.setBounds(750,310,130,22);
		add( batch);
		batch.setBounds(750,360,130,22);
		//
		// nextpage
		//
	//	sname=
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				submit_actionPerformed(e);
			}

		});


		this.setPreferredSize(new Dimension(1150,900));

	}
		 void submit_actionPerformed(java.awt.event.ActionEvent evt)
	      {
			 System.out.println("sucess...");
				try
				    {
				        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			            Connection con=DriverManager.getConnection("jdbc:odbc:office","","");
				        Statement st=con.createStatement();
				        ResultSet rs=st.executeQuery("select * from project where c_roll='"+clsrol.getText()+"'");
				        if(rs.next())
				        {
				        	System.out.println("sfsddddddddd");
							 sname.setText(rs.getString("s_name"));
							 uni_rol.setText(""+rs.getString("uni_roll"));
							 f_name.setText(""+rs.getString("f_name"));
							 branch.setSelectedItem(""+rs.getString("branch"));
							 batch.setSelectedItem(rs.getString("batch"));
							 sem.setSelectedItem(rs.getString("sem"));
							 Object o = sem.getSelectedItem();
							 Object a1 = branch.getSelectedItem();
							 System.out.println(o);
						 	 if(o.equals("1")&&a1.equals("AE"))
						 		 {
								AUTO1 a=null;
							 System.out.println("mmmmmmmmm");
					    	a.combo1_1.setText(rs.getString("s1"));
					    	a.combo1_2.setText(""+rs.getString("s2"));
					    	a.combo1_3.setText(rs.getString("s3"));
					    	a.combo1_4.setText(rs.getString("s4"));
					    	a.combo1_5.setText(rs.getString("l1"));
					    	a.combo1_6.setText(rs.getString("l2"));
					    	a.combo1_7.setText(rs.getString("l3"));
					    	a.combo1_8.setText(rs.getString("l4"));
						 	}
						 	if(o.equals("2")&&a1.equals("AE"))
					 		 {
							AUTO1 a=null;
						 System.out.println("mmmmmmmmm");
				    	a.combo2_1.setText(rs.getString("s1"));
				    	a.combo2_2.setText(""+rs.getString("s2"));
				    	a.combo2_3.setText(rs.getString("s3"));
				    	a.combo2_4.setText(rs.getString("s4"));
				    	a.combo2_5.setText(rs.getString("l1"));
				    	a.combo2_6.setText(rs.getString("l2"));
				    	a.combo2_7.setText(rs.getString("l3"));
				    	a.combo2_8.setText(rs.getString("l4"));
					 	}
						 	if(o.equals("3")&&a1.equals("AE"))
					 		 {
							AUTO1 a=null;

						 System.out.println("mmmmmmmmm");
				    	a.combo3_1.setText(rs.getString("s1"));
				    	a.combo3_2.setText(""+rs.getString("s2"));
				    	a.combo3_3.setText(rs.getString("s3"));
				    	a.combo3_4.setText(rs.getString("s4"));
				    	a.combo3_5.setText(rs.getString("s5"));
				    	a.combo3_6.setText(rs.getString("s6"));
				    	a.combo3_7.setText(rs.getString("l1"));
				    	a.combo3_8.setText(rs.getString("l2"));
				    	a.combo3_9.setText(rs.getString("l3"));
				    	a.combo3_10.setText(rs.getString("l4"));
					 	}
							if(o.equals("4")&&a1.equals("AE"))
							 {
							AUTO1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("s6"));
						a.combo4_7.setText(rs.getString("l1"));

						a.combo4_8.setText(rs.getString("l2"));
						a.combo4_9.setText(rs.getString("l3"));
						a.combo4_10.setText(rs.getString("l4"));
						}
							if(o.equals("5")&&a1.equals("AE"))
							 {
							AUTO1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("s5"));
						a.combo5_6.setText(rs.getString("s6"));
						a.combo5_7.setText(rs.getString("l1"));
						a.combo5_8.setText(rs.getString("l2"));
						a.combo5_9.setText(rs.getString("l3"));
						a.combo5_10.setText(rs.getString("l4"));
						a.combo5_10.setText(rs.getString("l5"));
						a.combo5_10.setText(rs.getString("l6"));
						}

							if(o.equals("6")&&a1.equals("AE"))
							 {
							AUTO1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						a.combo6_2.setText(""+rs.getString("s2"));
						a.combo6_3.setText(rs.getString("s3"));
						a.combo6_4.setText(rs.getString("s4"));
						a.combo6_5.setText(rs.getString("s5"));
						a.combo6_6.setText(rs.getString("s6"));
						a.combo6_7.setText(rs.getString("l1"));
						a.combo6_8.setText(rs.getString("l2"));
						a.combo6_9.setText(rs.getString("l3"));
						a.combo6_10.setText(rs.getString("l4"));
						}

							if(o.equals("7")&&a1.equals("AE"))
							 {
							AUTO1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo7_1.setText(rs.getString("s1"));
						a.combo7_2.setText(""+rs.getString("s2"));
						a.combo7_3.setText(rs.getString("s3"));
						a.combo7_4.setText(rs.getString("s4"));
						a.combo7_5.setText(rs.getString("s5"));
						a.combo7_6.setText(rs.getString("s6"));
						a.combo7_7.setText(rs.getString("l1"));
						a.combo7_8.setText(rs.getString("l2"));
						a.combo7_9.setText(rs.getString("l3"));
						a.combo7_10.setText(rs.getString("l4"));

							 }
							if(o.equals("1")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo1_1.setText(rs.getString("s1"));
						a.combo1_2.setText(""+rs.getString("s2"));
						a.combo1_3.setText(rs.getString("s3"));
						a.combo1_4.setText(rs.getString("s4"));
						a.combo1_5.setText(rs.getString("l1"));
						a.combo1_6.setText(rs.getString("l2"));
						a.combo1_7.setText(rs.getString("l3"));
						a.combo1_8.setText(rs.getString("l4"));

							 }
							if(o.equals("2")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo2_1.setText(rs.getString("s1"));
						a.combo2_2.setText(""+rs.getString("s2"));
						a.combo2_3.setText(rs.getString("s3"));
						a.combo2_4.setText(rs.getString("s4"));
						a.combo2_5.setText(rs.getString("s5"));
						a.combo2_6.setText(rs.getString("l1"));
						a.combo2_7.setText(rs.getString("l2"));
						a.combo2_8.setText(rs.getString("l3"));

							 }
							if(o.equals("3")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo3_1.setText(rs.getString("s1"));
						a.combo3_2.setText(""+rs.getString("s2"));
						a.combo3_3.setText(rs.getString("s3"));
						a.combo3_4.setText(rs.getString("s4"));
						a.combo3_5.setText(rs.getString("s5"));
						a.combo3_6.setText(rs.getString("s6"));
						a.combo3_7.setText(rs.getString("s7"));
						a.combo3_8.setText(rs.getString("l1"));
						a.combo3_9.setText(rs.getString("l2"));
						a.combo3_10.setText(rs.getString("l3"));
						a.combo3_10.setText(rs.getString("l4"));
						a.combo3_10.setText(rs.getString("l5"));
							 }
							if(o.equals("4")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("l1"));
						a.combo4_7.setText(rs.getString("l2"));
						a.combo4_8.setText(rs.getString("l3"));
						a.combo4_9.setText(rs.getString("l4"));
							 }
							if(o.equals("5")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("s5"));
						a.combo5_6.setText(rs.getString("s6"));
						a.combo5_7.setText(rs.getString("l1"));
						a.combo5_8.setText(rs.getString("l2"));
						a.combo5_9.setText(rs.getString("l3"));
						a.combo5_10.setText(rs.getString("l4"));
						a.combo5_11.setText(rs.getString("l5"));
							 }
							if(o.equals("6")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						a.combo6_2.setText(""+rs.getString("s2"));
						a.combo6_3.setText(rs.getString("s3"));
						a.combo6_4.setText(rs.getString("s4"));
						a.combo6_5.setText(rs.getString("s5"));
						a.combo6_6.setText(rs.getString("s6"));
						a.combo6_7.setText(rs.getString("l1"));
						a.combo6_8.setText(rs.getString("l2"));
						a.combo6_9.setText(rs.getString("l3"));
						a.combo6_10.setText(rs.getString("l4"));
							 }
							if(o.equals("7")&&a1.equals("CSE"))
							 {
							cse1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo7_1.setText(rs.getString("s1"));
						a.combo7_2.setText(""+rs.getString("s2"));
						a.combo7_3.setText(rs.getString("s3"));
						a.combo7_4.setText(rs.getString("s4"));
						a.combo7_5.setText(rs.getString("s5"));
						a.combo7_6.setText(rs.getString("l1"));
							 }

							if(o.equals("1")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo1_1.setText(rs.getString("s1"));
						a.combo1_2.setText(""+rs.getString("s2"));
						a.combo1_3.setText(rs.getString("s3"));
						a.combo1_4.setText(rs.getString("s4"));
						a.combo1_5.setText(rs.getString("l1"));
						a.combo1_6.setText(rs.getString("l2"));
						a.combo1_7.setText(rs.getString("l3"));
						a.combo1_8.setText(rs.getString("l4"));
							 }
							if(o.equals("2")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo2_1.setText(rs.getString("s1"));
						a.combo2_2.setText(""+rs.getString("s2"));
						a.combo2_3.setText(rs.getString("s3"));
						a.combo2_4.setText(rs.getString("s4"));
						a.combo2_5.setText(rs.getString("s5"));
						a.combo2_6.setText(rs.getString("l1"));
						a.combo2_7.setText(rs.getString("l2"));
						a.combo2_8.setText(rs.getString("l3"));
							 }
							if(o.equals("3")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo3_1.setText(rs.getString("s1"));
						a.combo3_2.setText(""+rs.getString("s2"));
						a.combo3_3.setText(rs.getString("s3"));
						a.combo3_4.setText(rs.getString("s4"));
						a.combo3_5.setText(rs.getString("s5"));
						a.combo3_6.setText(rs.getString("l1"));
						a.combo3_7.setText(rs.getString("l2"));
						a.combo3_8.setText(rs.getString("l3"));
						a.combo3_9.setText(rs.getString("l4"));
							 }
							if(o.equals("4")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("l1"));
						a.combo4_7.setText(rs.getString("l2"));
						a.combo4_8.setText(rs.getString("l3"));
							 }
							if(o.equals("5")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("s5"));
						a.combo5_6.setText(rs.getString("s6"));
						a.combo5_7.setText(rs.getString("l1"));
						a.combo5_8.setText(rs.getString("l2"));
						a.combo5_9.setText(rs.getString("l3"));
						a.combo5_10.setText(rs.getString("l4"));
							 }
							if(o.equals("6")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						a.combo6_2.setText(""+rs.getString("s2"));
						a.combo6_3.setText(rs.getString("s3"));
						a.combo6_4.setText(rs.getString("s4"));
						a.combo6_5.setText(rs.getString("s5"));
						a.combo6_6.setText(rs.getString("s6"));
						a.combo6_7.setText(rs.getString("l1"));
						a.combo6_8.setText(rs.getString("l2"));
						a.combo6_9.setText(rs.getString("l3"));
						a.combo6_10.setText(rs.getString("l4"));
							 }
							if(o.equals("7")&&a1.equals("ECE"))
							 {
							ECE1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo7_1.setText(rs.getString("s1"));
						a.combo7_2.setText(""+rs.getString("s2"));
						a.combo7_3.setText(rs.getString("s3"));
						a.combo7_4.setText(rs.getString("s4"));
						a.combo7_5.setText(rs.getString("s5"));
						a.combo7_6.setText(rs.getString("s6"));
						a.combo7_7.setText(rs.getString("l1"));
							 }
							if(o.equals("1")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo1_1.setText(rs.getString("s1"));
						a.combo1_2.setText(""+rs.getString("s2"));
						a.combo1_3.setText(rs.getString("s3"));
						a.combo1_4.setText(rs.getString("s4"));
						a.combo1_5.setText(rs.getString("l1"));
						a.combo1_6.setText(rs.getString("l2"));
						a.combo1_7.setText(rs.getString("l3"));
						a.combo1_8.setText(rs.getString("l4"));
							 }
							if(o.equals("2")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo2_1.setText(rs.getString("s1"));
						a.combo2_2.setText(""+rs.getString("s2"));
						a.combo2_3.setText(rs.getString("s3"));
						a.combo2_4.setText(rs.getString("s4"));
						a.combo2_5.setText(rs.getString("s5"));
						a.combo2_6.setText(rs.getString("l1"));
						a.combo2_7.setText(rs.getString("l2"));
						a.combo2_8.setText(rs.getString("l3"));
							 }

							if(o.equals("3")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo3_1.setText(rs.getString("s1"));
						a.combo3_2.setText(""+rs.getString("s2"));
						a.combo3_3.setText(rs.getString("s3"));
						a.combo3_4.setText(rs.getString("s4"));
						a.combo3_5.setText(rs.getString("s5"));
						a.combo3_6.setText(rs.getString("s6"));
						a.combo3_7.setText(rs.getString("s7"));
						a.combo3_8.setText(rs.getString("l1"));
						a.combo3_9.setText(rs.getString("l2"));
						a.combo3_10.setText(rs.getString("l3"));
						a.combo3_11.setText(rs.getString("l4"));
						a.combo3_12.setText(rs.getString("l5"));
							 }
							if(o.equals("4")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("l1"));
						a.combo4_7.setText(rs.getString("l2"));
						a.combo4_8.setText(rs.getString("l3"));
						a.combo4_9.setText(rs.getString("l4"));
							 }
							if(o.equals("5")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("s5"));
						a.combo5_6.setText(rs.getString("l1"));
						a.combo5_7.setText(rs.getString("l2"));
						a.combo5_8.setText(rs.getString("l3"));
						a.combo5_9.setText(rs.getString("l4"));
							 }
							if(o.equals("6")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						a.combo6_2.setText(""+rs.getString("s2"));
						a.combo6_3.setText(rs.getString("s3"));
						a.combo6_4.setText(rs.getString("s4"));
						a.combo6_5.setText(rs.getString("s5"));
						a.combo6_6.setText(rs.getString("s6"));
						a.combo6_7.setText(rs.getString("l1"));
						a.combo6_8.setText(rs.getString("l2"));
						a.combo6_9.setText(rs.getString("l3"));
							 }
							if(o.equals("7")&&a1.equals("IT"))
							 {
							IT1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo7_1.setText(rs.getString("s1"));
						a.combo7_2.setText(""+rs.getString("s2"));
						a.combo7_3.setText(rs.getString("s3"));
						a.combo7_4.setText(rs.getString("s4"));
						a.combo7_5.setText(rs.getString("s5"));
						a.combo7_6.setText(rs.getString("s6"));
						a.combo7_7.setText(rs.getString("l1"));
							 }
							if(o.equals("1")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo1_1.setText(rs.getString("s1"));
						a.combo1_2.setText(""+rs.getString("s2"));
						a.combo1_3.setText(rs.getString("s3"));
						a.combo1_4.setText(rs.getString("s4"));
						a.combo1_5.setText(rs.getString("l1"));
						a.combo1_6.setText(rs.getString("l2"));
						a.combo1_7.setText(rs.getString("l3"));
						a.combo1_8.setText(rs.getString("l4"));
						 }
							if(o.equals("2")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo2_1.setText(rs.getString("s1"));
						a.combo2_2.setText(""+rs.getString("s2"));
						a.combo2_3.setText(rs.getString("s3"));
						a.combo2_4.setText(rs.getString("s4"));
						a.combo2_5.setText(rs.getString("s5"));
						a.combo2_6.setText(rs.getString("l1"));
						a.combo2_7.setText(rs.getString("l2"));
						a.combo2_8.setText(rs.getString("l3"));
						 }

							if(o.equals("3")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo3_1.setText(rs.getString("s1"));
						a.combo3_2.setText(""+rs.getString("s2"));
						a.combo3_3.setText(rs.getString("s3"));
						a.combo3_4.setText(rs.getString("s4"));
						a.combo3_5.setText(rs.getString("s5"));
						a.combo3_6.setText(rs.getString("s6"));
						a.combo3_7.setText(rs.getString("l1"));
						a.combo3_8.setText(rs.getString("l2"));
						a.combo3_9.setText(rs.getString("l3"));
						a.combo3_10.setText(rs.getString("l4"));
						 }
							if(o.equals("4")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("s6"));
						a.combo4_7.setText(rs.getString("l1"));
						a.combo4_8.setText(rs.getString("l2"));
						a.combo4_9.setText(rs.getString("l3"));
						a.combo4_10.setText(rs.getString("l4"));
						 }
							if(o.equals("5")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("s5"));
						a.combo5_6.setText(rs.getString("s6"));
						a.combo5_7.setText(rs.getString("l1"));
						a.combo5_8.setText(rs.getString("l2"));
						a.combo5_9.setText(rs.getString("l3"));
						a.combo5_10.setText(rs.getString("l4"));
						a.combo5_11.setText(rs.getString("l5"));
						a.combo5_12.setText(rs.getString("l6"));
						 }
							if(o.equals("6")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						a.combo6_2.setText(""+rs.getString("s2"));
						a.combo6_3.setText(rs.getString("s3"));
						a.combo6_4.setText(rs.getString("s4"));
						a.combo6_5.setText(rs.getString("s5"));
						a.combo6_6.setText(rs.getString("l1"));
						a.combo6_7.setText(rs.getString("l2"));
						a.combo6_8.setText(rs.getString("l3"));
						a.combo6_9.setText(rs.getString("l4"));
						a.combo6_10.setText(rs.getString("l5"));
						 }

							if(o.equals("7")&&a1.equals("ME"))
							 {
							MECH1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo7_1.setText(rs.getString("s1"));
						a.combo7_2.setText(""+rs.getString("s2"));
						a.combo7_3.setText(rs.getString("s3"));
						a.combo7_4.setText(rs.getString("s4"));
						a.combo7_5.setText(rs.getString("s5"));
						a.combo7_6.setText(rs.getString("l1"));
						a.combo7_7.setText(rs.getString("l2"));
						a.combo7_8.setText(rs.getString("l3"));
						 }
							if(o.equals("1")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo1_1.setText(rs.getString("s1"));
						a.combo1_2.setText(""+rs.getString("s2"));
						a.combo1_3.setText(rs.getString("s3"));
						a.combo1_4.setText(rs.getString("s4"));
						a.combo1_5.setText(rs.getString("s5"));
						a.combo1_6.setText(rs.getString("l1"));
						a.combo1_7.setText(rs.getString("l2"));
						 }

							if(o.equals("2")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo2_1.setText(rs.getString("s1"));
						a.combo2_2.setText(""+rs.getString("s2"));
						a.combo2_3.setText(rs.getString("s3"));
						a.combo2_4.setText(rs.getString("s4"));
						a.combo2_5.setText(rs.getString("s5"));
						a.combo2_6.setText(rs.getString("l1"));
						a.combo2_7.setText(rs.getString("l2"));
						 }

							if(o.equals("3")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo3_1.setText(rs.getString("s1"));
						a.combo3_2.setText(""+rs.getString("s2"));
						a.combo3_3.setText(rs.getString("s3"));
						a.combo3_4.setText(rs.getString("s4"));
						a.combo3_5.setText(rs.getString("s5"));
						a.combo3_6.setText(rs.getString("l1"));
						a.combo3_7.setText(rs.getString("l2"));
						 }
							if(o.equals("4")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo4_1.setText(rs.getString("s1"));
						a.combo4_2.setText(""+rs.getString("s2"));
						a.combo4_3.setText(rs.getString("s3"));
						a.combo4_4.setText(rs.getString("s4"));
						a.combo4_5.setText(rs.getString("s5"));
						a.combo4_6.setText(rs.getString("l1"));
						a.combo4_7.setText(rs.getString("l2"));
						 }

							if(o.equals("5")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("l1"));
						a.combo5_6.setText(rs.getString("l2"));
						a.combo5_7.setText(rs.getString("l3"));
						 }

							if(o.equals("6")&&a1.equals("MCA"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo6_1.setText(rs.getString("s1"));
						 }
							if(o.equals("1")&&a1.equals("MT"))
							 {
							MCA1 a=null;

						System.out.println("mmmmmmmmm");
						a.combo5_1.setText(rs.getString("s1"));
						a.combo5_2.setText(""+rs.getString("s2"));
						a.combo5_3.setText(rs.getString("s3"));
						a.combo5_4.setText(rs.getString("s4"));
						a.combo5_5.setText(rs.getString("l1"));
						a.combo5_6.setText(rs.getString("l2"));
						a.combo5_7.setText(rs.getString("l3"));
						 }
							con.close();

				        }



				    }
				    catch(Exception ex)
				    {
				        System.out.println(ex.getMessage());
				    }



				}
}



