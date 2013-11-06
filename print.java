import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class print extends JFrame {
  public static void main(String[] args) {
    new print();
  }

  private PageFormat mPageFormat;

  public print() {
    super("RECIPT TO SUBMIT");
    createUI();
    PrinterJob pj = PrinterJob.getPrinterJob();
    mPageFormat = pj.defaultPage();
    setVisible(true);
  }

  protected void createUI() {
    setSize(300, 300);
    center();

    // Add the menu bar.
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File", true);
    file.add(new FilePrintAction()).setAccelerator(
        KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK));
    file.add(new FilePageSetupAction()).setAccelerator(
        KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK
            | Event.SHIFT_MASK));
    file.addSeparator();
    file.add(new FileQuitAction()).setAccelerator(
        KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
    mb.add(file);
    setJMenuBar(mb);

    // Add the contents of the window.
    getContentPane().add(new PatchworkComponent());

    // Exit the application when the window is closed.
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  protected void center() {
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension us = getSize();
    int x = (screen.width - us.width) / 2;
    int y = (screen.height - us.height) / 2;
    setLocation(x, y);
  }

  public class FilePrintAction extends AbstractAction {
    public FilePrintAction() {
      super("Print");
    }

    public void actionPerformed(ActionEvent ae) {
      PrinterJob pj = PrinterJob.getPrinterJob();
      ComponentPrintable cp = new ComponentPrintable(getContentPane());
      pj.setPrintable(cp, mPageFormat);
      if (pj.printDialog()) {
        try {
          pj.print();
        } catch (PrinterException e) {
          System.out.println(e);
        }
      }
    }
  }

  public class FilePageSetupAction extends AbstractAction {
    public FilePageSetupAction() {
      super("Page setup...");
    }

    public void actionPerformed(ActionEvent ae) {
      PrinterJob pj = PrinterJob.getPrinterJob();
      mPageFormat = pj.pageDialog(mPageFormat);
    }
  }

  public class FileQuitAction extends AbstractAction {
    public FileQuitAction() {
      super("Quit");
    }

    public void actionPerformed(ActionEvent ae) {
      System.exit(0);
    }
  }
}
class PatchworkComponent extends JComponent implements Printable {
	JLabel jLabel;
	 JLabel jLabel1;
	 JLabel jLabel2;
	 JLabel jLabel3;
	 JLabel jLabel4;
	 JLabel jLabel5;
	 JLabel jLabel6;
	 //JButton submit;
	// JButton jLabel8;
	 JLabel jLabel9;
	 JLabel jLabel10;
	 JLabel jLabel11;
	 JLabel jLabel12;
	 JLabel jLabel13;
	 JLabel jLabel14;
	 static JTextField sname;
	 static JTextField clsrol;
	 static JTextField branch;
	 JTextField jTextField4;
      JTextField date;
     JTextField jTextField6;
    static  JTextField f_name;
     static JTextField uni_rol;
     static JTextField sem;
     static JTextField batch;
     JComboBox jTextField11;
     JComboBox amt;
       public PatchworkComponent() {
	    jLabel = new JLabel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		//submit = new JButton();
		//jLabel8 = new JButton();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jLabel11= new JLabel();
		jLabel12= new JLabel();
		jLabel13= new JLabel();
		jLabel14= new JLabel();
		sname = new JTextField();
		clsrol = new JTextField();
		branch = new JTextField();
		jTextField4 = new JTextField();
		date=new JTextField();
		jTextField6=new JTextField();
		f_name=new JTextField();
		uni_rol=new JTextField();
		sem=new JTextField();
		batch=new JTextField();
		jTextField11=new JComboBox();
		//contentPane = (JPanel)this.getContentPane();
		  String a1[] = {" ","500","550"};
          amt=new JComboBox(a1);
		jLabel.setText("LUDHIANA COLLEGE OF ENGINEERING & TECHNOLOGY");
		jLabel.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD,15));
		//
		// jLabel1
		//
		jLabel1.setText("Date/Time :");
		jLabel1.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
		// jLabel2
		//
		jLabel2.setText("Receipt No. :");
		jLabel2.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
		// jLabel3
		//
		jLabel3.setText("Student Name :");
		jLabel3.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
		// jLabel4
		//
		jLabel4.setText("Class Roll. No. :");
		jLabel4.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
	
		//
		jLabel5.setText("Branch :");
		jLabel5.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
		// jLabel6
		//
		jLabel6.setText("Amount :");
		jLabel6.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		//
		//
	     /*submit.setText("SUBMIT");
		submit.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 7));*/
		//
		//

		//jLabel7.setBackground(new Color(51, 51, 51));
		//
		/*jLabel8.setText("RESET");
		jLabel8.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 7));*/
		// jTextField1
		jLabel9.setText("Father Name :");
		jLabel9.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		jLabel10.setText("Uni. Roll. No. :");
		jLabel10.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		jLabel11.setText("Semester :");
		jLabel11.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		jLabel12.setText("Batch :");
		jLabel12.setFont(new java.awt.Font("Foundry RockWell MS", Font.BOLD, 9));
		jLabel13.setIcon(new ImageIcon("C:\\Documents and Settings\\Owner\\workspace\\college\\logo.jpg"));
		jLabel13.setText("  ");
		jLabel14.setText("KATANI KALAN,LUDHIANA");
		jLabel14.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 15));
		
		
			//contentPane
			this.setLayout(null);
		//contentPane.setBackground(new Color(113,233,120));
			this.setLayout(null);
			add (jLabel);
			jLabel.setBounds(60,20,480,20);
			add (jLabel1);
			jLabel1.setBounds(300,90,80,18);
			add( jLabel2);
			jLabel2.setBounds(300,120,80,18);
			add( jLabel3);
			jLabel3.setBounds(20,150,90,24);
			add( jLabel4);
			jLabel4.setBounds(20,200,90,24);
			add( jLabel5);
			jLabel5.setBounds(20,250,90,24);
			add( jLabel6);
			jLabel6.setBounds(20,300,90,24);
			/*add( submit);
			submit.setBounds(360,520,90,25);
			add( jLabel8);
			jLabel8.setBounds(500,520,90,25);*/
			add( jLabel9);
			jLabel9.setBounds(230,150,90,24);
		    add( jLabel10);
		    jLabel10.setBounds(230,200,90,24);
			add( jLabel11);
			jLabel11.setBounds(230,250,90,24);
			add( jLabel12);
			jLabel12.setBounds(230,300,90,24);
		    add( jLabel13);
		    jLabel13.setBounds(70,5,100,100);
	        add( jLabel14);
	        jLabel14.setBounds(160,50,250,20);
			add( sname);
			sname.setBounds(120,150,60,17);
			add( clsrol);
			clsrol.setBounds(120,200,60,17);
			add( branch);
			branch.setBounds(120,250,60,17);
			add(amt);
			amt.setBounds(120,300,60,17);
			add( date);
			date.setBounds(400,90,80,15);
		 Date time=new Date(System.currentTimeMillis());
		  Calendar cal=new GregorianCalendar();
		  int month=cal.get(Calendar.MONTH);
		  int year=cal.get(Calendar.YEAR);
		  int day=cal.get(Calendar.DAY_OF_MONTH);
		  int hour=cal.get(Calendar.HOUR_OF_DAY);
		  int min=cal.get(Calendar.MINUTE);
		  String s1=Integer.toString(day);
		  String s2=Integer.toString(month+1);
		  String s3=Integer.toString(year);
		  String s4=Integer.toString(hour);
		  String s5=Integer.toString(min);
		  date.setText(s1+"/"+s2+"/"+s3+" ,"+s4+":"+s5);
		  date.setEditable(false);

		  add( jTextField6);
			jTextField6.setBounds(400,120,80,15);
			add( f_name);
			f_name.setBounds(300,150,60,17);
			add( uni_rol);
			uni_rol.setBounds(300,200,60,17);
			add( sem);
			sem.setBounds(300,250,60,17);
			add( batch);
			batch.setBounds(300,300,60,17);
		 nextpage p=null;
	      
			sname.setText((p.sname.getText()));
			clsrol.setText((p.clsrol.getText()));
			branch.setText((String)(p.branch.getSelectedItem()));
			batch.setText((String)(p.batch.getSelectedItem()));
		    uni_rol.setText((p.uni_rol.getText()));
			sem.setText((String)(p.sem.getSelectedItem()));
			f_name.setText((p.f_name.getText()));

       }

  public PatchworkComponent(String s) {
    this();
   // mString = s;
  }

  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex != 0)
      return NO_SUCH_PAGE;
    paintComponent(g);
    return PAGE_EXISTS;
  }
}
class ComponentPrintable implements Printable {
  private Component mComponent;

  public ComponentPrintable(Component c) {
    mComponent = c;
  }

  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex > 0)
      return NO_SUCH_PAGE;
    Graphics2D g2 = (Graphics2D) g;
    g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    boolean wasBuffered = disableDoubleBuffering(mComponent);
    mComponent.paint(g2);
    restoreDoubleBuffering(mComponent, wasBuffered);
    return PAGE_EXISTS;
  }

  private boolean disableDoubleBuffering(Component c) {
    if (c instanceof JComponent == false)
      return false;
    JComponent jc = (JComponent) c;
    boolean wasBuffered = jc.isDoubleBuffered();
    jc.setDoubleBuffered(false);
    return wasBuffered;
  }

  private void restoreDoubleBuffering(Component c, boolean wasBuffered) {
    if (c instanceof JComponent)
      ((JComponent) c).setDoubleBuffered(wasBuffered);
  }
} 