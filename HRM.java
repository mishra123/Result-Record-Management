import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class HRM extends JFrame
{
	public static void main(String str[])
	{
		new HRM();
	}
	MainForm form1=new MainForm();
	EmpForm form2=new EmpForm();
	public HRM()
  	{
		setTitle("Result record Management System");
		JTabbedPane jtab=new JTabbedPane();
		//jtab.addTab("Introduction",new Intro());
		jtab.addTab("New Record",form1);
		jtab.addTab("Update/Modify Record",form2);

		//jtab.addTab("Employee",form2);
		this.getContentPane().add(jtab);
		setSize(1000,1000);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}