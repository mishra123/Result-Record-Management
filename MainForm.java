import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class MainForm extends JPanel
{
	static JTabbedPane tb;
	nextpage p1=new nextpage();
	JScrollPane page1=new JScrollPane(
		p1,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
	);
	AUTO p2=new AUTO();
	JScrollPane page2=new JScrollPane(
		p2,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
	);
	ECE p3=new ECE();
	JScrollPane page3=new JScrollPane(
		p3,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	IT p4=new IT();
	JScrollPane page4=new JScrollPane(
		p4,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	cse p5=new cse();
	JScrollPane page5=new JScrollPane(
		p5,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MECH p6=new MECH();
	JScrollPane page6=new JScrollPane(
		p6,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MTECH p7=new MTECH();
	JScrollPane page7=new JScrollPane(
		p7,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	MCA p8=new MCA();
	JScrollPane page8=new JScrollPane(
		p8,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
	);
	  
	public MainForm()
  	{
		setLayout(new BorderLayout());
		JTabbedPane tb=new JTabbedPane();
		tb.addTab("Info",page1);
		tb.addTab("AE",page2);
		tb.addTab("ECE",page3);
		tb.addTab("IT",page4);
		tb.addTab("CSE",page5);
		tb.addTab("ME",page6);
		tb.addTab("MTECH",page7);
		tb.addTab("MCA",page8);
		
		//tb.addTab("Candidate Services",page4);
		add(tb, BorderLayout.CENTER);
  		setSize(800,600);
   	}
}



