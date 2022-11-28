package frontEnd;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TopDetails implements ActionListener
{
	

	URL imageURL = TopDetails.class.getResource("/resources/skymath icon.png");
	public ImageIcon skyMathIcon = new ImageIcon(new ImageIcon(imageURL).getImage()
			.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	public JPanel skyMath = new JPanel();
	public JLabel upperTop = new JLabel();
	public Font akronim, timesRomanBold;	
	public  JPanel topButtons;
	public JButton homeButton,generateFormula,statistics; 
	public static int i=0, o=0;
	
	
	
	TopDetails()
	{
		skyMath.setPreferredSize(new Dimension(750,115));
		skyMath.setBackground(Color.black);
		skyMath.setLayout(null);
		skyMath.add(title());	
		skyMath.add(topButtons());
	}	
	ImageIcon skyMathIcon()
	{
		return skyMathIcon;
	}
	 Component title()
	{
		upperTop.setBounds(0,0,750,100);
		upperTop.setBackground(Color.red);
		upperTop.setOpaque(false);
		upperTop.setFont(akronim());
		upperTop.setIcon(skyMathIcon());
		upperTop.setText("SKYMATH");	
		upperTop.setIconTextGap(50);
		upperTop.setForeground(Color.white);
		return upperTop;
	}
	Font akronim()
	{
		try { 
			
			//akronim = Font.createFont(Font.TRUETYPE_FONT,
              //      new FileInputStream("./Fonts/Akronim-Regular.ttf")).deriveFont(75f);
			akronim = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/Akronim-Regular.ttf")).deriveFont(75f);
			
		} catch (Exception e) { 
		    e.printStackTrace();
		}
		return akronim;
	}
	Component topButtons() 
	{
		topButtons = new JPanel();
		topButtons.setBounds(120, 85, 600, 33);
		topButtons.setBackground(new Color(131,183,244));
		topButtons.setLayout(new GridLayout(1,3,10,0));//int rw, int cl, int hgap, int vgap
		topButtons.add(homeButton());
		topButtons.add(generateFormula());
		topButtons.add(statistics());
		return topButtons;
	}
	Component homeButton()
	{
		homeButton = new JButton("Home");
		homeButton.setFocusable(false);
		homeButton.setForeground(new Color(37,33,206));
		homeButton.setBackground(new Color(182,179,179));
		homeButton.setFont(new Font("TimesRoman BOLD", Font.BOLD,16));
		homeButton.addActionListener(this);
		return homeButton;
	}
	Component generateFormula()
	{
		generateFormula = new JButton("Generate Formula");
		generateFormula.setFocusable(false);
		generateFormula.setForeground(new Color(37,33,206));
		generateFormula.setFont(new Font("TimesRoman BOLD", Font.BOLD,16));
		generateFormula.setBackground(new Color(182,179,179));
		generateFormula.addActionListener(this);
		return generateFormula;
	}
	Component statistics()
	{
		statistics = new JButton("Statistics");
		statistics.setFocusable(false);
		statistics.setForeground(new Color(37,33,206));
		statistics.setFont(new Font("TimesRoman BOLD", Font.BOLD,16));
		statistics.setBackground(new Color(182,179,179));
		statistics.addActionListener(this);
		return statistics;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==homeButton)
		{
			GenerateFormula.generateFormula.setVisible(false);
			Statistics.statistics.setVisible(false);
			CentralTendency.centralTendency.setVisible(false);
			Home.home.setVisible(true);		
			ZTest.zTest.setVisible(false);
			TTest.tTest.setVisible(false);
			/*FTest fTest = new FTest();
			fTest.getFTest().setVisible(false);*/
			FTest.fTest.setVisible(false);
		}
		if(e.getSource()==generateFormula)
		{
			Home.home.setVisible(false);
			Statistics.statistics.setVisible(false);
			CentralTendency.centralTendency.setVisible(false);
			ZTest.zTest.setVisible(false);
			TTest.tTest.setVisible(false);
			/*FTest fTest = new FTest();
			fTest.getFTest().setVisible(false);*/
			FTest.fTest.setVisible(false);
			GenerateFormula.generateFormula.setVisible(true);	
			if(i==0)
			{			
				Home.frame.add(new GenerateFormula().generateFormula);
				i++;
			}								
		}
		if(e.getSource()==statistics)
		{
			Home.home.setVisible(false);
			GenerateFormula.generateFormula.setVisible(false);	
			Statistics.statistics.setVisible(true);
			CentralTendency.centralTendency.setVisible(false);
			ZTest.zTest.setVisible(false);
			TTest.tTest.setVisible(false);
			/*FTest fTest = new FTest();
			fTest.getFTest().setVisible(false);*/
			FTest.fTest.setVisible(false);
			//fTest.getFTestBody().setVisible(false);
			if(o==0)
			{
				Home.frame.add(new Statistics().statistics);
				o++;
			}								
		}
		
		
		
		

	}
	
}
