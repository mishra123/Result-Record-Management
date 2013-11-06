import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class EmpForm extends JPanel
{	nextpage1 p1=new nextpage1();
	JScrollPane page1=new JScrollPane(
		p1,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
	);
	AUTO1 p2=new AUTO1();
	JScrollPane page2=new JScrollPane(
		p2,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
	);
	ECE1 p3=new ECE1();
	JScrollPane page3=new JScrollPane(
		p3,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	IT1 p4=new IT1();
	JScrollPane page4=new JScrollPane(
		p4,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	cse1 p5=new cse1();
	JScrollPane page5=new JScrollPane(
		p5,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MECH1 p6=new MECH1();
	JScrollPane page6=new JScrollPane(
		p6,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MTECH1 p7=new MTECH1();
	JScrollPane page7=new JScrollPane(
		p7,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MCA1 p8=new MCA1();
	JScrollPane page8=new JScrollPane(
		p8,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	  
			public EmpForm()
  	{
				setLayout(new BorderLayout());
				JTabbedPane tb=new JTabbedPane();
				tb.addTab("UPDATE/MODIFY",page1);
				tb.addTab("AE",page2);
				tb.addTab("CSE",page3);
				tb.addTab("ECE",page4);
				tb.addTab("IT",page5);
				tb.addTab("ME",page6);
				tb.addTab("MCA",page7);
				tb.addTab("MTECH",page8);
				add(tb, BorderLayout.CENTER);
		  		setSize(800,600);
  	}
}



