package frontEnd;

import backEnd.ZTable;
import backEnd.ZTestB;
import backEnd.ValueHandler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ZTableResults implements ActionListener
{
	private static JPanel zTableResults = new JPanel();
	private static JPanel top= new JPanel();
	private static JPanel bottom= new JPanel();
	private static JPanel topBottom= new JPanel();
	private static JPanel backButCenTit= new JPanel();
	private static JPanel bodyBottom= new JPanel();
	//public static JLabel centralTenTitle, takeNote,inputdata, hOlabel,signilabel,deglabel
	private JButton back;
	private static JPanel ztableVal = new JPanel();
	private static JPanel values = new JPanel();
	private static JPanel testType= new JPanel();
	private static JPanel sigLe= new JPanel();
	private static JPanel cerVal= new JPanel();
	private static JPanel sigLevels= new JPanel();
	public static JLabel signiLevel,oneTail, twoTail, _point10, _point05,_point025,_point01,_pN1Point281,_pN1Point6451, 
	_pN1Point961, _pN2Point3, _pN1Point645, _pN1Point96, _pN2Point33, _pN2Point38, 
	t, e,s,t1,t2,y,p,e2,oneTwoTailed,oneTailed, twoTailed,s1,i,g,n1,i1,f,i2,c,a,n,c1,e1,
	blank,l,e3,v1,e4,l1, zTable;
	private Font kawoszeh;
	private static int i4=0;
	private int identity;
	
	public static void setRenew(ZTableResults obj_zTableResults)
	{
		ArrayList<Component> list = new ArrayList<Component>();
		list.add(zTableResults);
		list.add(top);
		list.add(bottom);
		list.add(topBottom);
		list.add(backButCenTit);
		list.add(bodyBottom);
		list.add(ztableVal);
		list.add(values);
		list.add(testType);
		list.add(sigLe);
		list.add(cerVal);
		list.add(sigLevels);
		list.add(signiLevel);
		list.add(oneTail);
		list.add(twoTail);
		list.add(_point10);
		list.add(_point05);
		list.add(_point025);
		list.add(_point01);
		list.add(_pN1Point281);
		list.add(_pN1Point6451);
		list.add(_pN1Point961);
		list.add(_pN2Point3);
		list.add(_pN1Point645);
		list.add(_pN1Point96);
		list.add(_pN2Point33);
		list.add(_pN2Point38);
		list.add(t);
		list.add(e);
		list.add(s);
		list.add(t1);
		list.add(t2);
		list.add(y);
		list.add(p);
		list.add(e2);
		list.add(oneTwoTailed);
		list.add(oneTailed);
		list.add(twoTailed);
		list.add(s1);
		list.add(i);
		list.add(g);
		list.add(n1);
		list.add(i1);
		list.add(f);
		list.add(i2);
		list.add(c);
		list.add(a);
		list.add(n);
		list.add(c1);
		list.add(e1);
		list.add(blank);
		list.add(l);
		list.add(e3);
		list.add(v1);
		list.add(e4);
		list.add(l1);
		list.add(zTable);
		
		for(Component c:list)
		{
			obj_zTableResults.getZTableResults().remove(c);
		}
		obj_zTableResults.getZTableResults().revalidate();
		obj_zTableResults.getZTableResults().repaint();
		
	}
	
	 public ZTableResults()
	 {
		
			zTableResults.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));
			
			zTableResults.setBackground(new Color(0,255,0));
			
			zTableResults.setLayout(new BorderLayout());
			
			zTableResults.setPreferredSize(new Dimension(900,900));
			
			
		 
		 	setTop();
		 	
		 	setBack();//debug
		 	setBackButCenTit();
		 	setTopBottom();
		 	setBodyBottom();
			setBottom();
			
			zTableResults.add(getTop(), BorderLayout.NORTH);
			//zTableResults.add(setBody(), BorderLayout.CENTER);
			
			zTableResults.add(getBottom(), BorderLayout.CENTER);
			
			
			setT();
			setE();
			setS();
			setT1();
			setT2();
			setY();
			setP();
			setE2();
			
			setTestType();
			
			
			 setOneTailed();
			 setTwoTailed();
			 
			setOneTwoTailed();
			
			
			  setS1();
			  setI();
			  setG();
			  setN1();
			  setI1();
			  setF();
			  setI2();
			  setC2();
			  setA();
			  setN();
			  setC1();
			  setE1();
			  setBlank();
			  setL();
			 setE3();
			  setV1();
			  setE4();
			  setL1();
			  
			  setSigLe();
			
			  
			set_point10();
			set_point05();
			set_point025();
			set_point01();
			
			setSigLevels();
			
			
			
			set_pN1Point281();
			set_pN1Point6451();
			set_pN1Point961();
			set_pN2Point3();
			set_pN1Point645();
			set_pN1Point96();
			set_pN2Point33();
			set_pN2Point38();
			 
			setCerVal();
			setZTable(); 
			
			setZtableVal();
			
			
			
			
			
			
	 }
	 
	 public static Component getTop()
		{
			
			return top;	
		}
	 
	 public static void setTop()
	 {
		 //top = new JPanel();
			top.setPreferredSize(new Dimension(400,146));
			top.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
			top.setBackground(Color.black);
			top.setLayout(new FlowLayout(FlowLayout.CENTER));
			top.add(new TopDetails().skyMath);
	 }
	 public JPanel getZTableResults()
	 {
		 return zTableResults;
	 }
	 
	 public Component getBottom()
		{
			
			return bottom;
		}
	 public void setBottom()
	 {
		 	
		 	//bottom = new JPanel();
		 	
			bottom.setPreferredSize(new Dimension(873,834));
			
			bottom.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
			
			bottom.setBackground(new Color(61,61,61));
			
			bottom.setLayout(new BorderLayout());
			
			
			
			bottom.add(getTopBottom(), BorderLayout.NORTH);
			
			
			bottom.add(getBodyBottom(), BorderLayout.CENTER);		
		
	 }
	 public void setTopBottom()
	 {
		 
		 	//topBottom = new JPanel();
		 	
			topBottom.setPreferredSize(new Dimension(400,64));
			
			topBottom.setBackground(Color.green);//Color.green
			
			topBottom.setLayout(new FlowLayout(FlowLayout.LEADING));
			
			
			
			topBottom.add(getBackButCenTit());
			
	 }
	 public Component getTopBottom()
		{
			
			return topBottom;
		}
	 public void setBackButCenTit()
	 {
		
			//backButCenTit = new JPanel();
			
			 
			backButCenTit.setPreferredSize(new Dimension(900,64));
			
			
			backButCenTit.setBackground(Color.green);
			
			 
			//backButCenTit.setLayout(null);
			backButCenTit.setLayout(new FlowLayout(FlowLayout.LEADING));
			//backButCenTit.add(centralTenTitle());
			 
			 
			
			
			backButCenTit.add(getBack());
			
	 }
	 public Component getBackButCenTit()
	{
			return backButCenTit;
	}
		
	 public void setBack()
		{
		 
			back = new JButton();
			//back.setBounds(0,0,124,43);
			back.setPreferredSize(new Dimension(124,43));
			back.setBackground(new Color(112,29,29));
			back.setText("Back");
			back.setForeground(Color.white);
			back.setFont(new Font("Times New Roman", Font.BOLD, 20));
			back.setFocusable(false);
			back.addActionListener(this);
			
		}
	 public Component getBack()
		{
			
			return back;
		}
	 public void setBodyBottom()
		{
			//bodyBottom = new JPanel();
			bodyBottom.setPreferredSize(new Dimension(400,700));
			bodyBottom.setBackground(new Color(61,61,61));//ew Color(61,61,61
			bodyBottom.setLayout(new FlowLayout(FlowLayout.LEADING));
			bodyBottom.add(getZtableVal());
		}
	 public Component getBodyBottom()
		{
			return bodyBottom;
		}
	 public void setZtableVal()
		{
	
			ztableVal.setPreferredSize(new Dimension(500,366));
			
			ztableVal.setBackground(Color.black);
			
			ztableVal.setLayout(null);
			
			
			
			ztableVal.add(getTestType());
			
			
			ztableVal.add(getOneTwoTailed());
			
			
			ztableVal.add(getSigLe());
			
			
			ztableVal.add(getSigLevels());
			
			
			ztableVal.add(getCerVal());
			
			
			ztableVal.add(getZTable());
			
		}
	 public Component getZtableVal()
		{		
			return ztableVal;
		}
	 public void setZTable()
		{
			zTable = new JLabel("Z-table",SwingConstants.CENTER);
			zTable.setBounds(0,0,166,132);
			zTable.setBackground(Color.black);
			zTable.setOpaque(true);
			zTable.setForeground(Color.white);
			zTable.setFont(kawoszeh());
		}
	 public Component getZTable()
		{

			return zTable;
		}
	 public Font kawoszeh()
		{
			/*try 
			{
				kawoszeh = Font.createFont(Font.TRUETYPE_FONT, new File("kawoszeh.ttf")).deriveFont(45f);
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("kawoszeh.ttf")));		
			}
			catch(IOException | FontFormatException e)
			{
				
			}
			return kawoszeh;*/
		 
		 try { 
				
				//akronim = Font.createFont(Font.TRUETYPE_FONT,
	              //      new FileInputStream("./Fonts/Akronim-Regular.ttf")).deriveFont(75f);
				kawoszeh = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/kawoszeh.ttf")).deriveFont(45f);
				
			} catch (Exception e) { 
			    e.printStackTrace();
			}
			return kawoszeh;
			
			
		}
	 public void setCerVal()
		{
		
			cerVal.setBackground(Color.white);//new Color(0,0,0)
			
			cerVal.setBounds(166, 133, 334,234);
			
			cerVal.setLayout(new GridLayout(2,4,5,5));
			
			cerVal.setBorder(BorderFactory.createLineBorder(Color.white,5));
			
			
			cerVal.add(get_pN1Point281());
			
			
			cerVal.add(get_pN1Point6451());//debug
			
			
			cerVal.add(get_pN1Point961());
		
			
			cerVal.add(get_pN2Point3());
			
			
			cerVal.add(get_pN1Point645());
			
			
			cerVal.add(get_pN1Point96());
			
			
			cerVal.add(get_pN2Point33());
			
			
			cerVal.add(get_pN2Point38());
			
		}
	 public Component getCerVal()
		{
			return cerVal;
		}
	 
	 public static void set_pN1Point281()
		{
			_pN1Point281=new JLabel("+-1.281", SwingConstants.CENTER);
			_pN1Point281.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN1Point281.setBackground(new Color(112,254,224));
			_pN1Point281.setOpaque(true);
		}
	 public static Component get_pN1Point281()
		{
			return _pN1Point281;
		}

	 public static void set_pN1Point6451()
		{
			_pN1Point6451=new JLabel("+-1.6451", SwingConstants.CENTER);
			_pN1Point6451.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN1Point6451.setBackground(new Color(112,254,224));
			_pN1Point6451.setOpaque(true);
		}
	 public static Component get_pN1Point6451()
		{
			return _pN1Point6451;
		}
	 
	 
	 public static void set_pN1Point961()
		{
			_pN1Point961=new JLabel("+-1.961", SwingConstants.CENTER);
			_pN1Point961.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN1Point961.setBackground(new Color(112,254,224));
			_pN1Point961.setOpaque(true);
		}
	 public static Component get_pN1Point961()
		{
			return _pN1Point961;
		}
	 public static void set_pN2Point3()
		{
			_pN2Point3=new JLabel("+-2.3", SwingConstants.CENTER);
			_pN2Point3.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN2Point3.setBackground(new Color(112,254,224));
			_pN2Point3.setOpaque(true);
		}
	 public static Component get_pN2Point3()
		{
			return _pN2Point3;
		}
	 public static void set_pN1Point645()
		{
			_pN1Point645=new JLabel("+-1.645", SwingConstants.CENTER);
			_pN1Point645.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN1Point645.setBackground(new Color(112,254,224));
			_pN1Point645.setOpaque(true);
		}
	 public static Component get_pN1Point645()
		{
			return _pN1Point645;
		}
	 public static void set_pN1Point96()
		{
			_pN1Point96=new JLabel("+-1.96", SwingConstants.CENTER);
			_pN1Point96.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN1Point96.setBackground(new Color(112,254,224));
			_pN1Point96.setOpaque(true);
		}
	 public static Component get_pN1Point96()
		{
			return _pN1Point96;
		}
	 public static void set_pN2Point33()
		{
			_pN2Point33=new JLabel("+-2.33", SwingConstants.CENTER);
			_pN2Point33.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN2Point33.setBackground(new Color(112,254,224));
			_pN2Point33.setOpaque(true);
		}
	 public static Component get_pN2Point33()
		{

			return _pN2Point33;
		}
	 public static void set_pN2Point38()
		{
			_pN2Point38=new JLabel("+-2.38", SwingConstants.CENTER);
			_pN2Point38.setFont(new Font("Helvetica BOLD", Font.BOLD, 15));
			_pN2Point38.setBackground(new Color(112,254,224));
			_pN2Point38.setOpaque(true);
		}
	 public static Component get_pN2Point38()
		{
			return _pN2Point38;
		}
	 public void setSigLevels()
		{

			sigLevels.setBackground(Color.white);//new Color(0,0,0)
			
			sigLevels.setBounds(166, 67, 334, 66);
			
			sigLevels.setLayout(new GridLayout(1,4,5,5));
			
			
			sigLevels.add(get_point10());
			
			
			sigLevels.add(get_point05());
			
			
			sigLevels.add(get_point025());
			
			
			sigLevels.add(get_point01());
			
		}
	 public Component getSigLevels()
		{	
			return sigLevels;
		}
	 public static void set_point10()
		{
			_point10=new JLabel("0.10", SwingConstants.CENTER);
			_point10.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			_point10.setBackground(new Color(212,175,55));
			_point10.setOpaque(true);

		}
	 public static Component get_point10()
		{
			return _point10;
		}
	 public  static void set_point05()
		{
			_point05=new JLabel("0.05", SwingConstants.CENTER);
			_point05.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			_point05.setBackground(new Color(212,175,55));
			_point05.setOpaque(true);
		}
	 public static Component get_point05()
		{
			return _point05;
		}
	 public static void set_point025()
		{
			_point025=new JLabel("0.025", SwingConstants.CENTER);
			_point025.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			_point025.setBackground(new Color(212,175,55));
			_point025.setOpaque(true);
		}
	 public static Component get_point025()
		{
			return _point025;
		}
	 public static void set_point01()
		{
			_point01=new JLabel("0.01", SwingConstants.CENTER);
			_point01.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			_point01.setBackground(new Color(212,175,55));
			_point01.setOpaque(true);
		}	
	 public static Component get_point01()
		{
			return _point01;
		}	
	 public void setSigLe()
		{
	
			sigLe.setBackground(new Color(212,115,212));
			
			sigLe.setBounds(166,0,334,66);
			
			sigLe.setLayout(new GridLayout(1,18,0,0));
			
			
			sigLe.add(getS1());
			
			 
			sigLe.add(getI());
			
		
			sigLe.add(getG());
			
			 
			sigLe.add(getN1());
			
			 
			sigLe.add(getI1());
			
			 
			sigLe.add(getF());
			
			
			sigLe.add(getI2());
			
			 
			sigLe.add(getC2());
			
			 
			sigLe.add(getA());
			
			 
			sigLe.add(getN());
			
			 
			sigLe.add(getC1());
			
			 
			sigLe.add(getE1());
			
			 
			sigLe.add(getBlank());
			
			 
			sigLe.add(getL());
			
			 
			sigLe.add(getE3());
			
			 
			sigLe.add(getV1());
			
			 
			sigLe.add(getE4());
			
			 
			sigLe.add(getL1());
			
		}
	 public Component getSigLe()
		{
			return sigLe;
		}
	 public void setTestType()
		{
		
			testType.setBounds(0,132,83,234);
			
			testType.setBackground(Color.white);
			
			testType.setLayout(new GridLayout(8,1,0,0));
			
			
			testType.add(getT());
			
			
			testType.add(getE());
			
			
			testType.add(getS());
			
			
			testType.add(getT1());
			
			
			testType.add(getT2());
			
			
			testType.add(getY());
			
			
			testType.add(getP());
			
			
			testType.add(getE2());		
			
			
		}
	 public Component getTestType()
		{
			return testType;
		}
	 public void setOneTwoTailed()
		{
		/*
		 * setOneTailed();
		 * setTwoTailed();//debug
		 */
		 
			oneTwoTailed = new JLabel();
			
			oneTwoTailed.setBounds(83,132,83,234);
			
			oneTwoTailed.setBackground(Color.white);
			
			oneTwoTailed.setOpaque(true);
			
			oneTwoTailed.setLayout(new GridLayout(2,1,0,5));
			
			
			oneTwoTailed.add(getOneTailed());
			
			
			oneTwoTailed.add(getTwoTailed());
			
		}
	 public Component getOneTwoTailed()
		{
			return oneTwoTailed;
		}
	 public void setOneTailed()
		{
		 	
			oneTailed= new JLabel("<html>One<br/>tailed</html>",SwingConstants.CENTER);
			
			oneTailed.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			
			oneTailed.setBackground(new Color(255,165,0));
			
			oneTailed.setOpaque(true);
		}
	 public static  Component getOneTailed()
		{
			return oneTailed;
		}
	 public void setTwoTailed()
		{
			twoTailed= new JLabel("<html>Two<br/>tailed</html>",SwingConstants.CENTER);
			twoTailed.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			twoTailed.setBackground(new Color(255,165,0));
			twoTailed.setOpaque(true);
		}
	 public static Component getTwoTailed()
		{
			return twoTailed;
		}
	 public void setS1()
		{
			s1=new JLabel("S", SwingConstants.CENTER);
			s1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			s1.setBackground(new Color(212,115,212));
			s1.setOpaque(true);
		}
	 public Component getS1()
	 	{
			return s1;
		}
	 public void setI()
		{
			i=new JLabel("I", SwingConstants.CENTER);
			i.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			i.setBackground(new Color(212,115,212));
			i.setOpaque(true);
		}
	 public Component getI()
		{
			return i;
		}
	 public void setG()
		{
			g=new JLabel("G", SwingConstants.CENTER);
			g.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			g.setBackground(new Color(212,115,212));
			g.setOpaque(true);
		}
	 public Component getG()
		{
			return g;
		}
	 public void setN1()
		{
			n1=new JLabel("N", SwingConstants.CENTER);
			n1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			n1.setBackground(new Color(212,115,212));
		}
	 public Component getN1()
		{
			return n1;
		}
	 public void setI1()
		{
			i1=new JLabel("I", SwingConstants.CENTER);
			i1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			i1.setBackground(new Color(212,115,212));
			i1.setOpaque(true);
		}
	 public Component getI1()
		{
			return i1;
		}
	 public void setF()
		{
			f=new JLabel("F", SwingConstants.CENTER);
			f.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			f.setBackground(new Color(212,115,212));
			f.setOpaque(true);
		}
	 public Component getF()
		{
			return f;
		}
	 public void setI2()
		{
			i2=new JLabel("I", SwingConstants.CENTER);
			i2.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			i2.setBackground(new Color(212,115,212));
			i2.setOpaque(true);
		}
	 public Component getI2()
		{
			return i2;
		}
	 public void setC2()
		{
			c=new JLabel("C", SwingConstants.CENTER);
			c.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			c.setBackground(new Color(212,115,212));
			c.setOpaque(true);
		}
	 public Component getC2()
		{
			return c;
		}
	 public void setA()
		{
			a=new JLabel("A", SwingConstants.CENTER);
			a.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			a.setBackground(new Color(212,115,212));
			a.setOpaque(true);
		}
	 public Component getA()
		{
			return a;
		}
	 public void setN()
		{
			n=new JLabel("N", SwingConstants.CENTER);
			n.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			n.setBackground(new Color(212,115,212));
			n.setOpaque(true);
		}
	 public Component getN()
		{
			return n;
		}
	 public void setC1()
		{
			c1=new JLabel("C", SwingConstants.CENTER);
			c1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			c1.setBackground(new Color(212,115,212));
			c1.setOpaque(true);
		}
	 public Component getC1()
		{
			return c1;
		}
	 public void setE1()
		{
			e1=new JLabel("E", SwingConstants.CENTER);
			e1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			e1.setBackground(new Color(212,115,212));
			e1.setOpaque(true);
		}
	 public Component getE1()
		{
			return e1;
		}
	 public void setBlank()
		{
			blank=new JLabel(" ", SwingConstants.CENTER);
			blank.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			blank.setBackground(new Color(212,115,212));
			blank.setOpaque(true);
		}
	 public Component getBlank()
		{
			return blank;
		}
	 public void setL()
		{
			l=new JLabel("L", SwingConstants.CENTER);
			l.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			l.setBackground(new Color(212,115,212));
			l.setOpaque(true);
		}
	 public Component getL()
	 {
			return l;
		}
	 public void setE3()
		{
			e3=new JLabel("E", SwingConstants.CENTER);
			e3.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			e3.setBackground(new Color(212,115,212));
			e3.setOpaque(true);
		}
	 public Component getE3()
		{
			return e3;
		}
	 public void setV1()
		{
			v1=new JLabel("V", SwingConstants.CENTER);
			v1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			v1.setBackground(new Color(212,115,212));
			v1.setOpaque(true);

		}
	 public Component getV1()
		{

			return v1;
		}
	 public void setE4()
		{
			e4=new JLabel("E", SwingConstants.CENTER);
			e4.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			e4.setBackground(new Color(212,115,212));
			e4.setOpaque(true);
		}
	 public Component getE4()
		{

			return e4;
		}
	 public void setL1()
		{
			l1=new JLabel("L", SwingConstants.CENTER);
			l1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			l1.setBackground(new Color(212,115,212));
			l1.setOpaque(true);
		}
	 public Component getL1()
		{
			return l1;
		}
	 public void setT()
		{
			t=new JLabel("T", SwingConstants.CENTER);
			t.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			t.setBackground(Color.white);
			t.setOpaque(true);
		}
	 public Component getT()
		{
			return t;
		}
	 
	 public void setE()
		{
			e=new JLabel("E", SwingConstants.CENTER);
			e.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			e.setBackground(Color.white);
			e.setOpaque(true);
		}
	 public Component getE()
		{
			return e;
		}
	 public void setS()
		{
			s=new JLabel("S", SwingConstants.CENTER);
			s.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			s.setBackground(Color.white);
			s.setOpaque(true);
		}
	 public Component getS()
		{
			return s;
		}
	 public void setT1()
		{
			t1=new JLabel("T", SwingConstants.CENTER);
			t1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			t1.setBackground(Color.white);
			t1.setOpaque(true);
		}
	 public Component getT1()
		{
			return t1;
		}
	 public void setT2()
		{
			t2=new JLabel("T", SwingConstants.CENTER);
			t2.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			t2.setBackground(Color.white);
			t2.setOpaque(true);
		}
	 public Component getT2()
		{

			return t2;
		}
	 public void setY()
		{
			y=new JLabel("Y", SwingConstants.CENTER);
			y.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			y.setBackground(Color.white);
			y.setOpaque(true);
		}
	 public Component getY()
		{
			return y;
		}
	 public void setP()
		{
			p=new JLabel("P", SwingConstants.CENTER);
			p.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			p.setBackground(Color.white);
			p.setOpaque(true);
		}
	 public Component getP()
		{
			return p;
		}
	 public void setE2()
		{
			e2=new JLabel("E", SwingConstants.CENTER);
			e2.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
			e2.setBackground(Color.white);
			e2.setOpaque(true);
		}
	 public Component getE2()
		{
			return e2;
		} 
	 public static void changeComponentColor(double significanceLvl, int tail, ZTableResults results)
	 {
		//identify which signifanceLvl 
		 for(int i=0;i<ZTable.getTable().size();i++)
		 {
			 //System.out.println("tail: "+tail+ "ZScore: "+ ZTestB.getTabularValue());
			
			 //if(value==significance level)
			 if(ZTable.getTable().get(i).getKey()==significanceLvl)
			 {
				 //change the component's color
				 ZTable.getTable().get(i).getComponent().setBackground(Color.red);
				 
				 if(tail==2)
				 {
					// System.out.println("hey");
					 //System.out.println("ZTable.getTable().get(i).getVerticalValues().get(1): "+ZTable.getTable().get(i).getVerticalValues().get(1).getValue());
					 ZTable.getTable().get(i).getVerticalValues().get(1).getComponent().setBackground(Color.red);
					 i=ZTable.getTable().size();
				 }
					 
						// ZTable.getTable().get(i).getVerticalValues().get(j).getValue()
				 else
				 {
					// System.out.println("hey2");
					 ZTable.getTable().get(i).getVerticalValues().get(0).getComponent().setBackground(Color.red);
					 i=ZTable.getTable().size();
				 }
				 
			 }
		 }
		 if(tail==2)
		 {
			results.getTwoTailed().setBackground(Color.red);
		 }
		 else if(tail==1)
		 {
			results.getOneTailed().setBackground(Color.red);
		 }
		 else
		 {
			 
		 }
	 }
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==back)
			{
				/*Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);	
				Statistics.statistics.setVisible(false);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(true);
				TTest.tTest.setVisible(false);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);
				this.zTableResults.setVisible(false);*/
				
				
				System.out.println("size2: "+ZTest.zTableResultsList.size());
				if(ZTest.zTableResultsList.get(0)!=null)
				{
					System.out.println("there is an object!");
					//ZTest.zTableResultsList.clear();
					Home.home.setVisible(false);
					GenerateFormula.generateFormula.setVisible(false);	
					Statistics.statistics.setVisible(false);
					CentralTendency.centralTendency.setVisible(false);
					ZTest.zTest.setVisible(true);
					TTest.tTest.setVisible(false);
					//FTest fTest = new FTest();
					FTest.fTest.setVisible(false);
					this.zTableResults.setVisible(false);
				}
				
				
			}
		
			
		}

		
}

