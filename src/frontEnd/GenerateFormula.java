package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class GenerateFormula {

	public static JPanel generateFormula = new JPanel();
	public static JPanel body = new JPanel();
	public static JPanel body1 = new JPanel();
	public static JPanel top = new JPanel();
	GenerateFormula()
	{
		try {
			generateFormula.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
			generateFormula.setBackground(new Color(0,255,0));
			generateFormula.setLayout(new BorderLayout());
			generateFormula.setPreferredSize(new Dimension(900,900));
			generateFormula.add(top(), BorderLayout.NORTH);
			generateFormula.add(body(), BorderLayout.CENTER);
		}catch(Exception ee)
		{
			
		}
		
	}
	static Component body()
	{
		body = new JPanel();
		body.setPreferredSize(new Dimension(400,501));
		body.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		body.setBackground(new Color(61,61,61));
		body.setLayout(new FlowLayout());
		
		body1 = new JPanel();
		body1.setPreferredSize(new Dimension(850,690));
		//body1.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		body1.setBackground(new Color(61,61,61));//new Color(61,61,61)
		body1.setLayout(null);
		body1.add(new Calculator().calculatorTitle);
		body1.add(new Calculator().calculator);
		body1.add(new Calculator().newtonTitle);
		body1.add(new Calculator().newton);
		body.add(body1);
		return body;
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
	
	
	
	
}
