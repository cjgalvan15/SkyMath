package frontEnd;

import backEnd.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Calculator implements ActionListener{
	
	public static JPanel calculatorTitle= new JPanel();
	public static JPanel calculator = new JPanel();
	public static JLabel calculatorTitle1 = new JLabel();
	public static JLabel newtonTitle1 = new JLabel();
	public static JLabel inptxt = new JLabel();
	public static JLabel inptxt1 = new JLabel();
	public static JLabel result1 = new JLabel();
	public static JTextArea inputdatafield = new JTextArea();

	public static JLabel start1;
	public static JPanel newtonTitle = new JPanel();
	public static JPanel newton = new JPanel();
	public static JPanel result = new JPanel();
	public static JPanel resultfieldpanel = new JPanel();
	public static JTextArea resultfield;
	public static JButton[] numberButtons = new JButton[10];
	
	public static JPanel calTextArea,calButtons,calButtons1, calButton2, inputData,inputdata;
	public static JTextArea calTextArea1;
	public static JScrollPane scrollText, scrollresult;
	public  JButton button1, button2, button3,buttonplus, button4, button5, button6, buttonminus,button7
	,button8, button9, buttonmultiply,button0,buttondot, buttoneq, buttondiv, buttonclr,buttondel, start;
	
	public static String operation="";
	public static double number1=0, number2=0;
	Calculator()
	{
		calculatorTitle.setBounds(10,40,313,87);
		calculatorTitle.setBorder(BorderFactory.createLineBorder(Color.black, 10, false));
		calculatorTitle.setBackground(new Color(39,48,82));
		calculatorTitle.setLayout(null);
		calculatorTitle.add(calculatorTitle1());
		
		calculator.setBounds(10,160,313, 416);
		calculator.setBackground(new Color(195,157,112));
		//calculator.setOpaque(true);
		calculator.setLayout(null);
		calculator.add(calTextArea());
		calculator.add(calbuttons());
		
		newtonTitle.setBounds(333,40,486,87);
		newtonTitle.setBorder(BorderFactory.createLineBorder(Color.black, 10, false));
		newtonTitle.setBackground(new Color(39,48,82));
		newtonTitle.setLayout(null);
		newtonTitle.add(newtonTitle1());
		
		newton.setBounds(333,160,486,416);
		newton.setBackground(new Color(160,160,160));
		newton.setLayout(null);
		newton.add(start());
		newton.add(inputData());
		newton.add(result());
		
		//add action listener to number buttons
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttondot.addActionListener(this);
		
		//add action listerner to function buttons
		buttonplus.addActionListener(this);
		buttonminus.addActionListener(this);
		buttonmultiply.addActionListener(this);
		buttondiv.addActionListener(this);
		buttonclr.addActionListener(this);
		buttondel.addActionListener(this);
		buttoneq.addActionListener(this);
		
		
	
	
	}
	static Component resultfield()
	{
		resultfield = new JTextArea(); 
		
		resultfieldpanel = new JPanel();
		resultfieldpanel.setBounds(124, 15, 330, 59);
		resultfieldpanel.setLayout(new FlowLayout());
		resultfieldpanel.setBackground(Color.white);
			
		resultfield.setSize(1000, 59);
		resultfield.setBackground(Color.white);
		resultfield.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		resultfield.setEditable(false);
			
		scrollresult = new JScrollPane(resultfield);
		scrollresult.setPreferredSize(new Dimension(330, 50));
		scrollresult.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		resultfieldpanel.add(scrollresult);
		return resultfieldpanel;
		
	}
	 Component result()
	{
		result.setBounds(10,280,465,89);
		result.setBackground(Color.white);
		result.setBorder(BorderFactory.createLineBorder(new Color(55,55,55), 15, false));
		result.setLayout(null);
		result.add(result1());
		result.add(resultfield());
		return result;
	}
	 Component result1()
	{
		result1.setBounds(15,15,109,59);
		result1.setBackground(new Color(196,196,196));
		result1.setText("Result");
		result1.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		result1.setForeground(Color.black);
		result1.setOpaque(true);
		
		return result1;		
	}
	 Component start()
	{
		start = new JButton();
		start.setBackground(new Color(109,66,0));
		start.setBounds(150,223,158,39);
		start.setLayout(null);
		start.add(start1());
		start.setFocusable(false);
		start.addActionListener(this);
		
		return start;
	}
	static Component start1()
	{	
		start1 = new JLabel();
		start1.setBounds(30,5,100,30);
		start1.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		start1.setText("START");		
		start1.setForeground(Color.white);
		start1.setBackground(new Color(109,66,0));
		start1.setOpaque(true);
		
			
		return start1;
	}
	static Component inputData()
	{
		inputData = new JPanel();
		inputData.setBounds(10,25,465,178);
		inputData.setBackground(Color.white);
		inputData.setBorder(BorderFactory.createLineBorder(new Color(55,55,55), 15, false));	
		inputData.add(inputdata());
		inputData.add(inputdatafield());
		inputData.setLayout(null);
		return inputData;
	}
	static Component inputdatafield()
	{
		inputdatafield.setBounds(124, 15, 325, 149);
		inputdatafield.setBackground(Color.white);
		inputdatafield.setWrapStyleWord(true);
		inputdatafield.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		inputdatafield.setLineWrap(true);
		return inputdatafield;
	}
	static Component inputdata()
	{
		inputdata = new JPanel();
		inputdata.setFocusable(false);	
		inputdata.setBounds(15,15,109,148);
		inputdata.setBackground(new Color(196,196,196));
		inputdata.setLayout(null);
		inputdata.add(inputtext());
		inputdata.add(inputtext1());
		
		return inputdata;
	}
	static Component inputtext()
	{
		inptxt = new JLabel();
		inptxt.setText("Input");
		inptxt.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		inptxt.setForeground(Color.black);
		inptxt.setBounds(20, 30, 80, 40);
		inptxt.setBackground(new Color(196,196,196));//new Color(196,196,196)
		inptxt.setOpaque(true);
		return inptxt;	
	}
	static Component inputtext1()
	{
		inptxt1 = new JLabel();
		inptxt1.setText("Data");
		inptxt1.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		inptxt1.setForeground(Color.black);
		inptxt1.setBounds(20, 70, 80, 40);
		inptxt1.setBackground(new Color(196,196,196));//new Color(196,196,196)
		inptxt1.setOpaque(true);
		return inptxt1;	
	}
	
	static Component newtonTitle1()
	{
		newtonTitle1.setText("Newton’s Difference");
		newtonTitle1.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		newtonTitle1.setForeground(Color.white);
		newtonTitle1.setBounds(100, 25, 350, 30);
		newtonTitle1.setBackground(new Color(39,48,82));
		newtonTitle1.setOpaque(true);
		return newtonTitle1;
	}
	static Component calculatorTitle1()
	{
		calculatorTitle1.setText("Calculator");
		calculatorTitle1.setFont(new Font("TimesRoman BOLD",Font.BOLD,30));
		calculatorTitle1.setForeground(Color.white);
		calculatorTitle1.setBounds(80, 25, 150, 30);
		calculatorTitle1.setBackground(new Color(39,48,82));
		calculatorTitle1.setOpaque(true);
		return calculatorTitle1;
	}
	static Component calTextArea()
	{
		calTextArea = new JPanel();
		calTextArea.setBounds(20,20,266, 72);
		calTextArea.setBackground(new Color(0,0,0));
		//calTextArea.setOpaque(true);
		//calTextArea.setLayout(new FlowLayout());
		calTextArea.setLayout(null);
		calTextArea.add(calTextArea1());	
		
		return calTextArea;
		
	}
	static Component calTextArea1()
	{
		calTextArea1 = new JTextArea();
		calTextArea1.setSize(1000,30);
		calTextArea1.setBackground(new Color(238,238,238));	
		calTextArea1.setLineWrap(true);
		//calTextArea1.isEditable();
		
		//calTextArea1.setLineWrap(true);
		//calTextArea1.setWrapStyleWord(true);
		calTextArea1.setFont(new Font("Arial", Font.PLAIN,30));
		
		scrollText =  new JScrollPane(calTextArea1);
		//scrollText.setPreferredSize(new Dimension(250,60));
		scrollText.setBounds(7,7,250,60);
		scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		return scrollText;	
	}
	 Component calbuttons()
	{
		calButtons = new JPanel();
		calButtons.setBounds(20,100,266, 291);
		calButtons.setBackground(Color.black);
		calButtons.setLayout(null);
		calButtons.add(calbuttons1());
		calButtons.add(calbutton2());
		return calButtons;
	}
	 Component calbuttons1()
	{
		/*button1, button2, buttonplus, button4, button5, button6, buttonminus,button7
	,button8, button9, buttonmultiply,button0,buttondot, buttoneq, buttondiv*/
		button1 = new JButton("1");
		button1.setFocusable(false);
		button2 = new JButton("2");
		button2.setFocusable(false);
		button3 = new JButton("3");	
		button3.setFocusable(false);
		buttonplus = new JButton("+");
		buttonplus.setFocusable(false);
		button4 = new JButton("4");
		button4.setFocusable(false);
		button5 = new JButton("5");
		button5.setFocusable(false);
		button6 = new JButton("6");
		button6.setFocusable(false);
		buttonminus = new JButton("-");
		buttonminus.setFocusable(false);
		button7 = new JButton("7");
		button7.setFocusable(false);
		button8 = new JButton("8");
		button8.setFocusable(false);
		button9 = new JButton("9");
		button9.setFocusable(false);
		buttonmultiply = new JButton("*");
		buttonmultiply.setFocusable(false);
		button0 = new JButton("0");
		button0.setFocusable(false);
		buttondot = new JButton(".");
		buttondot.setFocusable(false);
		buttoneq = new JButton("=");
		buttoneq.setFocusable(false);
		buttondiv = new JButton("/");
		buttondiv.setFocusable(false);
			
		calButtons1 = new JPanel();
		calButtons1.setBounds(10, 10, 244, 188);
		calButtons1.setBackground(Color.black);
		calButtons1.setLayout(new GridLayout(4,4,7,7));//(int rows, int columns, int hgap, int vgap)
		calButtons1.add(button1);
		calButtons1.add(button2);
		calButtons1.add(button3);
		calButtons1.add(buttonplus);
		calButtons1.add(button4);
		calButtons1.add(button5);
		calButtons1.add(button6);
		calButtons1.add(buttonminus);
		calButtons1.add(button7);
		calButtons1.add(button8);
		calButtons1.add(button9);
		calButtons1.add(buttonmultiply);
		calButtons1.add(button0);
		calButtons1.add(buttondot);
		calButtons1.add(buttoneq);
		calButtons1.add(buttondiv);
		
		
		return calButtons1;
	}
	 Component calbutton2()
	{
		/* buttonclr,buttondel*/
		calButton2 = new JPanel();
		buttonclr = new JButton("clr");
		buttondel = new JButton("del");
		calButton2.setBounds(40, 200, 184, 38);
		calButton2.setBackground(Color.black);
		calButton2.setLayout(new GridLayout(1,2,7,7));
		calButton2.add(buttonclr);
		calButton2.add(buttondel);
		return calButton2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button0)
		{
			calTextArea1.setText(calTextArea1.getText().concat("0"));
		}
		if(e.getSource()==button1)
		{
			calTextArea1.setText(calTextArea1.getText().concat("1"));
		}
		if(e.getSource()==button2)
		{
			calTextArea1.setText(calTextArea1.getText().concat("2"));
		}
		if(e.getSource()==button3)
		{
			calTextArea1.setText(calTextArea1.getText().concat("3"));
		}
		if(e.getSource()==button4)
		{
			calTextArea1.setText(calTextArea1.getText().concat("4"));
		}
		if(e.getSource()==button5)
		{
			calTextArea1.setText(calTextArea1.getText().concat("5"));
		}
		if(e.getSource()==button6)
		{
			calTextArea1.setText(calTextArea1.getText().concat("6"));
		}
		if(e.getSource()==button7)
		{
			calTextArea1.setText(calTextArea1.getText().concat("7"));
		}
		if(e.getSource()==button8)
		{
			calTextArea1.setText(calTextArea1.getText().concat("8"));
		}
		if(e.getSource()==button9)
		{
			calTextArea1.setText(calTextArea1.getText().concat("9"));
		}
		if(e.getSource()==buttondot)
		{
			calTextArea1.setText(calTextArea1.getText().concat("."));
		}
		
		//function buttons
		if(e.getSource()==buttonplus)
		{
			number1 = Double.valueOf(calTextArea1.getText());
			calTextArea1.setText("");
			operation="+";
			
		}
		if(e.getSource()==buttonminus)
		{
			number1 = Double.valueOf(calTextArea1.getText());
			calTextArea1.setText("");
			operation="-";
		}
		if(e.getSource()==buttonmultiply)
		{
			number1 = Double.valueOf(calTextArea1.getText());
			calTextArea1.setText("");
			operation="*";
		}
		if(e.getSource()==buttondiv)
		{
			number1 = Double.valueOf(calTextArea1.getText());
			calTextArea1.setText("");
			operation="/";
		}
		if(e.getSource()==buttoneq)
		{
			try {
				number2 = Double.valueOf(calTextArea1.getText());
				
				
				switch(operation)
				{
				case "+": calTextArea1.setText(String.valueOf(number1+number2));break;
				case "-": calTextArea1.setText(String.valueOf(number1-number2));break;
				case "*": calTextArea1.setText(String.valueOf(number1*number2));break;
				case "/": calTextArea1.setText(String.valueOf(number1/number2));break;
				}
			}catch(Exception ee)
			{
				
			}
			
		}
		if(e.getSource()==buttonclr)
		{
			calTextArea1.setText("");
		}
		if(e.getSource()==buttondel)
		{
			try {

				String text = calTextArea1.getText();
				String result="";
				for(int i=0; i<text.length()-1;i++)
				{
					result+=String.valueOf(text.charAt(i));
				}
				calTextArea1.setText(result);
			}catch(Exception ee)
			{
				
			}
			
		}
		
		
		if(e.getSource()==start)
		{
			try {
				String input = inputdatafield.getText();
				resultfield.setText("f(x)= "+new NewtonDifferenceB(input).getNewtonDiff());
			}catch(Exception ee)
			{
				
			}
			
		}
		
		
		
	}
	

}
