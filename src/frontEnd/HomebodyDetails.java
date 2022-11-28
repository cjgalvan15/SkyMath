package frontEnd;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomebodyDetails {

	public static JPanel homebodypanel = new JPanel();
	public static JLabel welcomeTo, skymath, sentence1, sentence2, sentence3, 
	sentence4, sentence5, sentence6;
	HomebodyDetails()
	{
		try {
			homebodypanel.setPreferredSize(new Dimension(850,400));
			homebodypanel.setBackground(new Color(61,61,61));
			homebodypanel.setLayout(null);
			homebodypanel.add(welcomeTo());
			homebodypanel.add(skymath());	
			homebodypanel.add(paragraph());
		}catch(Exception ee)
		{
			
		}
		
	}
	static Component welcomeTo() 
	{
		welcomeTo = new JLabel("Welcome to");
		welcomeTo.setBounds(10, 10, 200,60);
		welcomeTo.setFont(new Font("TimesRoman BOLD", Font.BOLD,35));
		welcomeTo.setForeground(Color.white);
		welcomeTo.setBackground(new Color(61,61,61));
		welcomeTo.setOpaque(true);
		return welcomeTo;	
	}
	static Component skymath()
	{
		skymath = new JLabel("SkyMath");
		skymath.setBounds(210, 10, 150,60);
		skymath.setFont(new Font("TimesRoman BOLD", Font.BOLD,35));
		skymath.setForeground(new Color(52,145,255));
		skymath.setBackground(new Color(61,61,61));
		skymath.setOpaque(true);
		return skymath;
	}
	static Component paragraph()
	{
		sentence1 = new JLabel();
		sentence1.setBounds(10, 65,850, 260);
		sentence1.setBackground(new Color(61,61,61));
		sentence1.setForeground(Color.white);
		sentence1.setFont(new Font("TimesRoman BOLD", Font.PLAIN,20));
		sentence1.setOpaque(true);	
		sentence1.setText("<html>This is an easy multiple-user toolkit that is designed for mathematical virtual <br/>environment."
				+ "<br/><br/>This project is created by the two-twin brothers \"Carl John Galvan\" and \"Carl Kevin Galvan\"; which is officially released in April 2022.\r\n"
				+ "<br/><br/>Through the use of this project, users can now interact with each other and maintain friendly <br/>environment.</html>");
		return sentence1;
	}
	
}
