/****************************************************************/
/*                      logo                            */
/*                                                              */
/****************************************************************/
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/**
 * Summary description for logo
 *
 */
public class logo extends JFrame
{
	// Variables declaration
	 JLabel jLabel1;
	 JLabel jLabel2;
	 JLabel jLabel3;
	 JButton jLabel4;
	 JButton jLabel5;
	 JLabel jLabel6;
	 JLabel jLabel7;
	 JLabel jLabel8;
	 JLabel jLabel9;
	 JTextField jTextField1;
	 JTextField jTextField2;
	 JPasswordField jPasswordField1;
	 JPanel contentPane;
	// End of variables declaration


	public logo()
	{
		super();
		initializeComponent();

		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */
       void initializeComponent()
	{
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel8 = new JLabel();
		jLabel9 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JButton();
		jLabel5 = new JButton();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jTextField1 = new JTextField();
		jTextField2 = new JTextField();
		jPasswordField1 = new JPasswordField();
		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setIcon(new ImageIcon("C:\\Documents and Settings\\Manish\\workspace\\college\\logo1.jpg"));
		jLabel1.setText("  ");
		//
		// jLabel2
		//
		jLabel2.setText("Username :");
 		 jLabel2.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//
		// jLabel3
		//
		jLabel3.setText("Password :");
		 jLabel3.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//
		// jLabel4
		//
		jLabel4.setText("SUBMIT");
		 jLabel4.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//

		// jLabel5
		//
		jLabel5.setText("RESET");
		 jLabel5.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//
		// jLabel6
		//
		jLabel6.setIcon(new ImageIcon("C:\\Documents and Settings\\Manish\\workspace\\1.jpg"));
		jLabel6.setText("  ");
		//
		jLabel7.setText("LUDHIANA COLLEGE OF ENGINEERING & TECHNOLOGY");
		jLabel7.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		// jTextField1
		jLabel8.setText("KATANI KALAN,LUDHIANA");
		jLabel8.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//
		jLabel9.setText("Contact No. 0161-2834750");
		jLabel9.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 15));
		//
		contentPane.setBackground(new Color(0,0,0));
        //jLabel1.setForeground(new Color(16,4,140));
        jLabel2.setForeground(new Color(51, 204, 255));
        jLabel3.setForeground(new Color(51, 204, 255));
        jLabel7.setForeground(new Color(51, 204, 255));
        jLabel8.setForeground(new Color(51, 204, 255));
        jLabel9.setForeground(new Color(51, 204, 255));
        jLabel4.setForeground(new Color(16,4,140));
        jLabel5.setForeground(new Color(16,4,140));
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jTextField2
		//
		jTextField2.setText("jTextField2");
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField2_actionPerformed(e);
			}

		});

		//
		// jPasswordField1
		//
		jLabel4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				 String value1= jTextField1.getText();
				 String value2= jTextField2.getText();

				 if(value1.equals("lcet")&& value2.equals("engineer"));
				 {
					 HRM page=new HRM();
					 page.setVisible(true);

				 }

				 {
					 setVisible(false);
				 }
				 /*else
				 {
					 JOptionPane.showInputDialog(null,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);

				 }*/
			}

		});

		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, jLabel1, 40,0,950,110);
		addComponent(contentPane, jLabel2, 760,205,120,20);
		addComponent(contentPane, jLabel3, 762,245,120,20);
		addComponent(contentPane, jLabel4, 780,305,95,20);
		addComponent(contentPane, jLabel5, 890,305,95,20);
		addComponent(contentPane, jLabel6, 250,160,330,140);
		addComponent(contentPane, jLabel7, 190,275,500,100);
		addComponent(contentPane, jLabel8, 297,300,500,100);
		addComponent(contentPane, jLabel9, 295,325,500,100);
		addComponent(contentPane, jTextField1, 850,205,150,20);
		//addComponent(contentPane, jTextField2, 700,222,150,22);
		addComponent(contentPane, jPasswordField1,850,245,150,20);

		//
		// logo
		//
		this.setTitle("WELCOME TO :-");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(1500,800 ));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//
	// TODO: Add any appropriate code in the following Event Handling Methods
	//
	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void jTextField2_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField2_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void jPasswordField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njPasswordField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here


	         }


	//
	// TODO: Add any method code to meet your needs in the following area
	//
































//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new logo();
	}
//= End of Testing =


}


