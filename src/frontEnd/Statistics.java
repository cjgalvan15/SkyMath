package frontEnd;

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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Statistics implements ActionListener{

	public static JPanel statistics = new JPanel();
	public static JPanel body = new JPanel();
	public static JPanel body1 = new JPanel();
	public static JPanel top = new JPanel();
	public JButton centralTendency,zTest, tTest, fTest; 
	public JLabel centralTendency1, zTest1, tTest1, fTest1 ;
	public Font aclonica;
	public static int a=0, b=0, c=0, d=0;
	Statistics()
	{	
		statistics.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
		statistics.setBackground(new Color(0,255,0));
		statistics.setLayout(new BorderLayout());
		statistics.setPreferredSize(new Dimension(900,900));
		statistics.add(top(), BorderLayout.NORTH);
		statistics.add(body(), BorderLayout.CENTER);
	}
	static Component top()
	{
		top = new JPanel();
		top.setPreferredSize(new Dimension(400,146));
		top.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		top.setBackground(Color.black);
		top.setLayout(new FlowLayout(FlowLayout.CENTER));
		top.add(new TopDetails().skyMath);
		return top;	
	}
	Component body()
	{
		body = new JPanel();
		body.setPreferredSize(new Dimension(400,501));
		body.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		body.setBackground(new Color(61,61,61));
		body.setLayout(new FlowLayout(FlowLayout.CENTER,0,60));
		
		body1 = new JPanel();
		body1.setPreferredSize(new Dimension(635,559));//w:635|h:559
		body1.setBackground(new Color(196,196,196));//new Color(196,196,196)
		body1.setLayout(new GridLayout(4,1,100,20));
		body1.setBorder(BorderFactory.createLineBorder(new Color(196,196,196),20,false));
		
		//centralTendency,zTest, tTest, fTest; 
		centralTendency = new JButton();
		centralTendency.setFocusable(false);
		centralTendency.setBackground(new Color(39,48,82));
		centralTendency.setText("Central Tendency");
		centralTendency.setForeground(Color.white);
		centralTendency.setFont(aclonica1());
		centralTendency.addActionListener(this);
		
		zTest = new JButton();
		zTest.setFocusable(false);
		zTest.setBackground(new Color(39,48,82));
		zTest.setText("Z-Test");
		zTest.setForeground(Color.white);
		zTest.setFont(aclonica());
		zTest.addActionListener(this);
		
		tTest = new JButton();
		tTest.setFocusable(false);
		tTest.setBackground(new Color(39,48,82));
		tTest.setText("T-Test");
		tTest.setForeground(Color.white);
		tTest.setFont(aclonica());
		tTest.addActionListener(this);
		
		fTest = new JButton();
		fTest.setFocusable(false);
		fTest.setBackground(new Color(39,48,82));
		fTest.setText("F-Test");
		fTest.setForeground(Color.white);
		fTest.setFont(aclonica());
		fTest.addActionListener(this);
	
		body1.add(centralTendency);
		body1.add(zTest);
		body1.add(tTest);
		body1.add(fTest);
		body.add(body1);
		return body;
	}
	Font aclonica()
	{
		try { 
			
			aclonica = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/Aclonica.ttf")).deriveFont(75f);
			
		} catch (Exception e) { 
		    e.printStackTrace();
		}
		return aclonica;
	}
	Font aclonica1()
	{
		try { 
			
			aclonica = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/Aclonica.ttf")).deriveFont(50f);
			
		} catch (Exception e) { 
		    e.printStackTrace();
		}
		return aclonica;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==centralTendency)
		{
			try {
				Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);
				Statistics.statistics.setVisible(false);
				CentralTendency.centralTendency.setVisible(true);
				ZTest.zTest.setVisible(false);
				TTest.tTest.setVisible(false);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);

				
				if(a==0)
				{
					Home.frame.add(new CentralTendency().centralTendency);
					a++;
				}
			}catch(Exception ee)
			{
				
			}
			
			
		}
		if(e.getSource()==tTest)
		{
			
			try {
				Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);
				Statistics.statistics.setVisible(false);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(false);
				TTest.tTest.setVisible(true);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);
				if(b==0)
				{
					Home.frame.add(new TTest().tTest);
					b++;
				}
			}catch(Exception ee)
			{
						System.out.println("There is an error");
			}
						
		}
		if(e.getSource()==zTest)
		{
			//Home.home.setVisible(false);
			//GenerateFormula.generateFormula.setVisible(false);
			
			try {
				Statistics.statistics.setVisible(false);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(true);
				TTest.tTest.setVisible(false);

				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);
				if(c==0)
				{
					Home.frame.add(new ZTest().zTest);
					c++;
				}
			}catch(Exception ee)
			{
						System.out.println("There is an error");
			}
						
		}
		if(e.getSource()==fTest)
		{
			try {
				Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);
				Statistics.statistics.setVisible(false);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(false);
				TTest.tTest.setVisible(false);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(true);
				if(d==0)
				{
					System.out.println("Hi");
					Home.frame.add(new FTest().fTest);
					d++;				
				}
			}catch(Exception ee)
			{
						System.out.println("There is an error");
			}
			
			
						
		}	
	}
}
