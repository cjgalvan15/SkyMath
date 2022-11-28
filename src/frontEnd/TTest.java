package frontEnd;

import backEnd.TTestB;

import java.awt.BorderLayout;
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


import java.awt.BorderLayout;
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

import java.awt.BorderLayout;
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

public class TTest implements ActionListener
{
	public static JPanel tTest = new JPanel();
	public static JPanel top, bottom, topBottom,backButTTestTit,ttestpanel,inputData
	, hO, answers, signi, deg, tab,ttV, ttC,bodyBottom, inputs, df, testType;
	public static JLabel TTestTitle, takeNote,inputdata, hOlabel,signilabel,deglabel
	,tablabel,ttVlabel,ttCLabel, dfLabel, testTypeLabel;
	public JButton back,showTable;
	public static JTextArea inputDataArea, hOarea, signiArea,degArea,tabArea,TTestValue
	,TTestConclusion, dfArea, testTypeArea;
	public static JScrollPane inputdatapane, hOpane,signipane,degpane,tabpane,
	ttVpane,ttCpane, dfPane, testTypePane;
	public static JButton start;
	public static int i=0;
	TTest()
	{
		tTest= new JPanel();
		tTest.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
		tTest.setBackground(new Color(0,255,0));
		tTest.setLayout(new BorderLayout());
		tTest.setPreferredSize(new Dimension(900,900));
		tTest.add(top(), BorderLayout.NORTH);
		//tTest.add(body(), BorderLayout.CENTER);
		tTest.add(bottom(), BorderLayout.CENTER);
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
	Component bottom()
	{
		bottom = new JPanel();
		bottom.setPreferredSize(new Dimension(873,834));
		bottom.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		bottom.setBackground(new Color(61,61,61));
		bottom.setLayout(new BorderLayout());
		bottom.add(topBottom(), BorderLayout.NORTH);
		bottom.add(bodyBottom(), BorderLayout.CENTER);		
		return bottom;
	}
	Component topBottom()
	{
		topBottom = new JPanel();
		topBottom.setPreferredSize(new Dimension(400,64));
		topBottom.setBackground(Color.green);//Color.green
		topBottom.setLayout(new FlowLayout());
		topBottom.add(backButCenTit());
		return topBottom;
	}
	
	Component backButCenTit()
	{
		backButTTestTit = new JPanel();
		backButTTestTit.setPreferredSize(new Dimension(900,64));
		backButTTestTit.setBackground(Color.green);
		backButTTestTit.setLayout(null);
		backButTTestTit.add(TTestTitle());
		backButTTestTit.add(back());
		return backButTTestTit;
		
	}
	static Component TTestTitle()
	{
		TTestTitle = new JLabel();
		TTestTitle.setBounds(330,1,200,44);//(376,44)
		TTestTitle.setBackground(new Color(39,48,82));
		TTestTitle.setOpaque(true);
		TTestTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		TTestTitle.setText("T-TEST");
		TTestTitle.setForeground(Color.white);
		TTestTitle.setVerticalTextPosition(JLabel.CENTER);
		TTestTitle.setHorizontalAlignment(JLabel.CENTER);
		return TTestTitle;
	}
	Component back()
	{
		back = new JButton();
		back.setBounds(0,0,124,43);
		back.setBackground(new Color(112,29,29));
		back.setText("Back");
		back.setForeground(Color.white);
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setFocusable(false);
		back.addActionListener(this);
		return back;
	}
	 Component bodyBottom()
	{
		bodyBottom = new JPanel();
		bodyBottom.setPreferredSize(new Dimension(400,700));
		bodyBottom.setBackground(new Color(61,61,61));//ew Color(61,61,61
		bodyBottom.setLayout(new FlowLayout());
		bodyBottom.add(ttestpanel());
		return bodyBottom;
	}
	 Component ttestpanel()
	{
		ttestpanel = new JPanel();
		ttestpanel.setPreferredSize(new Dimension(873,700));
		ttestpanel.setBackground(new Color(196,196,196));
		ttestpanel.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 35, false));
		ttestpanel.setLayout(null);
		ttestpanel.add(takeNote());
		ttestpanel.add(inputs());
		ttestpanel.add(start());
		ttestpanel.add(answers());
		ttestpanel.add(showTable());
		return ttestpanel;
	}
	 Component showTable()
		{
			showTable = new JButton("Show Table");
			showTable.setBackground(new Color(196,196,196));//new Color(196,196,196)
			showTable.setBounds(330,615,200,40);
			showTable.setFont(new Font("Arial",Font.PLAIN,20));
			showTable.setFocusable(false);
			showTable.addActionListener(this);
			return showTable;
		}
	static Component answers()
	{
		answers = new JPanel();
		answers.setBounds(60, 325, 737, 280);//(60, 337, 737, 180)
		answers.setBackground(new Color(61,61,61));
		answers.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 15, false));
		answers.setLayout(new GridLayout(5,1,20,20));
		answers.add(tab());
		answers.add(ttV());
		answers.add(ttC());
		answers.add(df());
		answers.add(testType());
		
		return answers;
	}
	static Component testType()
	{
		testType = new JPanel();
		testType.setPreferredSize(new Dimension(134,63));
		testType.setBackground(Color.white);

		testType.setLayout(null);
		testType.add(testTypeLabel());
		testType.add(testTypeArea());
		
		return testType;
	}
	static Component testTypeArea()
	{
		testTypeArea= new JTextArea();
		testTypeArea.setSize(1000, 30);//613
		testTypeArea.setBackground(Color.white);
		testTypeArea.setLineWrap(true);
		testTypeArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		testTypeArea.setForeground(Color.black);
		
		testTypePane = new JScrollPane(testTypeArea);
		testTypePane.setBounds(134,0,575,40);
		testTypePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return testTypePane;
	}
	static Component testTypeLabel()
	{
		testTypeLabel = new JLabel();
		testTypeLabel.setBounds(0, 0,134,40);
		testTypeLabel.setText("Test Type");
		testTypeLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		testTypeLabel.setForeground(Color.black);
		testTypeLabel.setVerticalAlignment(JLabel.CENTER);
		testTypeLabel.setHorizontalAlignment(JLabel.CENTER);
		testTypeLabel.setBackground(new Color(196,196,196));
		testTypeLabel.setOpaque(true);
		return testTypeLabel;
	}
	static Component df()
	{
		df = new JPanel();
		df.setPreferredSize(new Dimension(134,63));
		df.setBackground(Color.white);
		df.setLayout(null);
		df.add(dfLabel());
		df.add(dfArea());
		return df;
	}
	static Component dfLabel()
	{
		dfLabel = new JLabel();
		dfLabel.setText("<html>df</html>");
		dfLabel.setBounds(0, 0,134,40);
		dfLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dfLabel.setForeground(Color.black);
		dfLabel.setVerticalAlignment(JLabel.CENTER);
		dfLabel.setHorizontalAlignment(JLabel.CENTER);
		dfLabel.setBackground(new Color(196,196,196));
		dfLabel.setOpaque(true);
		return dfLabel;
	}
	
	static Component dfArea()
	{
		dfArea = new JTextArea();
		dfArea.setSize(1000, 30);//613
		dfArea.setBackground(Color.white);
		dfArea.setLineWrap(true);
		dfArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		dfArea.setForeground(Color.black);
		
		dfPane = new JScrollPane(dfArea);
		dfPane.setBounds(134,0,575,40);
		dfPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return dfPane;
	}
	static Component tab()
	{
		tab = new JPanel();
		tab.setPreferredSize(new Dimension(134,63));
		tab.setBackground(Color.white);
		tab.setLayout(null);
		tab.add(tablabel());
		tab.add(tabArea());
		return tab;
	}
	static Component tablabel()
	{
		tablabel = new JLabel();
		tablabel.setText("<html>Tabular Value</html>");
		tablabel.setBounds(0, 0,134,40);
		tablabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tablabel.setForeground(Color.black);
		tablabel.setVerticalAlignment(JLabel.CENTER);
		tablabel.setHorizontalAlignment(JLabel.CENTER);
		tablabel.setBackground(new Color(196,196,196));
		tablabel.setOpaque(true);
		return tablabel;
	}
	
	static Component tabArea()
	{
		tabArea = new JTextArea();
		tabArea.setSize(1000, 30);//613
		tabArea.setBackground(Color.white);
		tabArea.setLineWrap(true);
		tabArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		tabArea.setForeground(Color.black);
		
		tabpane = new JScrollPane(tabArea);
		tabpane.setBounds(134,0,575,40);
		tabpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return tabpane;
	}
	static Component ttV()
	{
		ttV= new JPanel();
		ttV.setPreferredSize(new Dimension(134,63));
		ttV.setBackground(Color.white);
		ttV.setLayout(null);
		ttV.add(ttVlabel());
		ttV.add(ttVArea());
		return ttV;
	}
	static Component ttVlabel()
	{
		ttVlabel = new JLabel();
		ttVlabel.setText("<html>T-Test Value</html>");
		ttVlabel.setBounds(0, 0,134,40);
		ttVlabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ttVlabel.setForeground(Color.black);
		ttVlabel.setVerticalAlignment(JLabel.CENTER);
		ttVlabel.setHorizontalAlignment(JLabel.CENTER);
		ttVlabel.setBackground(new Color(196,196,196));
		ttVlabel.setOpaque(true);
		return ttVlabel;
	}
	
	static Component ttVArea()
	{
		TTestValue = new JTextArea();
		TTestValue.setSize(1000, 30);//613
		TTestValue.setBackground(Color.white);
		TTestValue.setLineWrap(true);
		TTestValue.setFont(new Font("Times New Roman", Font.BOLD, 25));
		TTestValue.setForeground(Color.black);
		
		ttVpane = new JScrollPane(TTestValue);
		ttVpane.setBounds(134,0,575,40);
		ttVpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return ttVpane;
	}
	static Component ttC()
	{
		ttC = new JPanel();
		ttC.setPreferredSize(new Dimension(134,63));
		ttC.setBackground(Color.white);
		ttC.setLayout(null);
		ttC.add(ttCLabel());
		ttC.add(ttCArea());
		return ttC;
	}
	static Component ttCLabel()
	{
		ttCLabel = new JLabel();
		ttCLabel.setText("<html> T-Test Conclusion</html>");
		ttCLabel.setBounds(0, 0,134,40);
		ttCLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ttCLabel.setForeground(Color.black);
		ttCLabel.setVerticalAlignment(JLabel.CENTER);
		ttCLabel.setHorizontalAlignment(JLabel.CENTER);
		ttCLabel.setBackground(new Color(196,196,196));
		ttCLabel.setOpaque(true);
		return ttCLabel;
	}
	
	static Component ttCArea()
	{
		TTestConclusion = new JTextArea();
		TTestConclusion.setSize(1000, 30);//613
		TTestConclusion.setBackground(Color.white);
		TTestConclusion.setLineWrap(true);
		TTestConclusion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		TTestConclusion.setForeground(Color.black);
		
		ttCpane = new JScrollPane(TTestConclusion);
		ttCpane.setBounds(134,0,575,40);
		ttCpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return ttCpane;
	}
	static Component hO()
	{
		hO = new JPanel();
		hO.setPreferredSize(new Dimension(749,58));
		hO.setBackground(Color.white);

		hO.setLayout(null);
		hO.add(hOLabel());
		hO.add(hOArea());
		
		return hO;
	}
	static Component hOArea()
	{
		hOarea= new JTextArea();
		hOarea.setSize(1000, 38);//613
		hOarea.setBackground(Color.white);
		hOarea.setLineWrap(true);
		hOarea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		hOarea.setForeground(Color.black);
		
		hOpane = new JScrollPane(hOarea);
		hOpane.setBounds(145,0,555,40);
		hOpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return hOpane;
	}
	static Component hOLabel()
	{
		hOlabel = new JLabel();
		hOlabel.setBounds(0,0,144,37);
		hOlabel.setText("H(O)");
		hOlabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		hOlabel.setForeground(Color.black);
		hOlabel.setVerticalAlignment(JLabel.CENTER);
		hOlabel.setHorizontalAlignment(JLabel.CENTER);
		hOlabel.setBackground(new Color(196,196,196));
		hOlabel.setOpaque(true);
		return hOlabel;
	}
	
	static Component takeNote()
	{
		takeNote = new JLabel();
		takeNote.setText("Take note: Use comma delimiter “,”; e.g. 1,2,3,4,5... <method1>|<method2>");
		takeNote.setFont(new Font("Times New Roman", Font.BOLD, 20));
		takeNote.setBounds(60, 40, 700, 25);
		takeNote.setBackground(new Color(196,196,196));//new Color(196,196,196)
		takeNote.setForeground(Color.gray);
		takeNote.setOpaque(true);
		return takeNote;
	}
	static Component inputs()
	{
		inputs = new JPanel();
		inputs.setBounds(60,80,735,180);
		inputs.setLayout(new GridLayout(3,1,20,20));
		inputs.add(inputData());
		inputs.add(signi());
		inputs.add(hO());
		inputs.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 20, false));
		inputs.setBackground(new Color(61,61,61));
		return inputs;
	}
	static Component inputData()
	{
		inputData = new JPanel();
		inputData.setPreferredSize(new Dimension(725,38));
		inputData.setBackground(Color.white);
		//inputData.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 10, false));
		inputData.setLayout(null);
		inputData.add(inputDataLabel());
		inputData.add(inputDataArea());
		
		return inputData;
	}
	static Component inputDataArea()
	{
		inputDataArea = new JTextArea();
		inputDataArea.setSize(1000, 38);//613
		inputDataArea.setBackground(Color.white);
		inputDataArea.setLineWrap(true);
		inputDataArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		inputDataArea.setForeground(Color.black);
		
		inputdatapane = new JScrollPane(inputDataArea);
		inputdatapane.setBounds(145,0,555,40);
		inputdatapane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return inputdatapane;
	}
	static Component inputDataLabel()
	{
		inputdata = new JLabel();
		inputdata.setBounds(0,0,144,38);
		inputdata.setText("Input Data");
		inputdata.setFont(new Font("Times New Roman", Font.BOLD, 20));
		inputdata.setForeground(Color.black);
		inputdata.setVerticalAlignment(JLabel.CENTER);
		inputdata.setHorizontalAlignment(JLabel.CENTER);
		inputdata.setBackground(new Color(196,196,196));
		inputdata.setOpaque(true);
		return inputdata;
	}
	 Component start()
	{
		start = new JButton("START");
		start.setBounds(350,275,158,39);
		start.setForeground(Color.white);
		start.setFont(new Font("Times New Roman", Font.BOLD, 20));
		start.setBackground(new Color(109,66,0));
		start.setOpaque(true);
		start.setFocusable(false);
		start.addActionListener(this);
		return start;
	}
	// signi, deg, ztV, ztV, ztC;
	static Component signi()
	{
		signi = new JPanel();
		signi.setPreferredSize(new Dimension(124,63));
		signi.setBackground(Color.white);
		signi.setLayout(null);
		signi.add(signilabel());
		signi.add(signiArea());
		return signi;
	}
	static Component signiArea()
	{
		signiArea = new JTextArea();
		signiArea.setSize(1000, 30);//613
		signiArea.setBackground(Color.white);
		signiArea.setLineWrap(true);
		signiArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		signiArea.setForeground(Color.black);
		
		signipane = new JScrollPane(signiArea);
		signipane.setBounds(145,0,555,40);
		signipane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return signipane;
	}
	static Component signilabel()
	{
		signilabel = new JLabel();
		signilabel.setText("<html>Level of Significance</html>");
		signilabel.setBounds(0, 0,143,40);
		signilabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		signilabel.setForeground(Color.black);
		signilabel.setVerticalAlignment(JLabel.CENTER);
		signilabel.setHorizontalAlignment(JLabel.CENTER);
		signilabel.setBackground(new Color(196,196,196));
		signilabel.setOpaque(true);
		return signilabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==showTable)		
		{
			//ZTableResults results = new ZTableResults();
			Home.home.setVisible(false);
			
			GenerateFormula.generateFormula.setVisible(false);	
			
			Statistics.statistics.setVisible(false);
			
			CentralTendency.centralTendency.setVisible(false);
			
			ZTest.zTest.setVisible(false);
			
			TTest.tTest.setVisible(false);
			

			//FTest fTest = new FTest();
			FTest.fTest.setVisible(false);	
			
			if(ZTest.zTableResultsList.size()!=0)
			{
				//System.out.println("zTableResultsList.size(): "+ZTest.zTableResultsList.size());
				ZTest.zTableResultsList.get(0).getZTableResults().setVisible(false);
				
				TTableResults.tTableResults.setVisible(true);
				
				if(i==0)
				{	
					Home.frame.add(new TTableResults().tTableResults);
					i++;
				}
			}
			else
			{
				
				TTableResults.tTableResults.setVisible(true);
				
				if(i==0)
				{	
					Home.frame.add(new TTableResults().tTableResults);
					i++;
				}
			}
			
			
		}
		if(e.getSource()==back)		
		{
			try {
				Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);	
				Statistics.statistics.setVisible(true);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(false);
				TTest.tTest.setVisible(false);
				TTableResults.tTableResults.setVisible(false);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);	
			}catch(Exception ee)
			{
				
			}
			
		}
		if(e.getSource()==start)
		{
			//System.out.println("hi");
			try {
				TTestB test = new TTestB(inputDataArea.getText(),hOarea.getText(),Double.valueOf(signiArea.getText()));
				
				tabArea.setText(String.valueOf(test.getTabularValue()));
				TTestValue.setText(String.valueOf(test.getTScore()));
				TTestConclusion.setText(String.valueOf(test.getConclusion()));
				dfArea.setText(String.valueOf(test.getDegreeOfFreedom()));
				testTypeArea.setText(String.valueOf(test.getTail()));
			}catch(Exception ee)
			{
				
			}
			
			
			
		}
		
	}
}
