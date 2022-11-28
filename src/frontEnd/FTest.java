package frontEnd;

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

import backEnd.FTestB;

public class FTest implements ActionListener
{
	public static JPanel fTest = new JPanel();
	public static  JPanel top, fTestBody, topBottom,backButFTestTit,fTestPanel,inputData
	, hO, answers, signi, deg, tab,ftV, ftC,bodyBottom, inputs;
	public static  JLabel fTestTitle, takeNote,inputData1, hOlabel,signilabel,deglabel
	,tablabel,ftVlabel,ftCLabel;
	public JButton back;
	public static  JTextArea inputDataArea, hOArea, signiArea,degArea,tabArea,fTestValueArea,conclusionArea;
	public static  JScrollPane inputDataPane, hOpane,signiPane,degpPane,tabularValuePane,fTestPane,conclusionPane;
	public  JButton start;
	
	FTest()
	{
		try {
			fTest= new JPanel();
			fTest.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
			fTest.setBackground(new Color(0,255,0));
			fTest.setLayout(new BorderLayout());
			fTest.setPreferredSize(new Dimension(900,900));
			fTest.add(top(), BorderLayout.NORTH);
			//fTest.add(body(), BorderLayout.CENTER);
			fTest.add(getFTestBody(), BorderLayout.CENTER);
			start.addActionListener(this);
		}catch(Exception ee)
		{
			
		}
		
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
	 JButton getStart()
	 {
		 return start;
	 }
	Component getFTestBody()
	{
		fTestBody = new JPanel();
		fTestBody.setPreferredSize(new Dimension(873,834));
		fTestBody.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		fTestBody.setBackground(new Color(61,61,61));
		fTestBody.setLayout(new BorderLayout());
		fTestBody.add(getTopBottom(), BorderLayout.NORTH);
		fTestBody.add(getBodyBottom(), BorderLayout.CENTER);		
		return fTestBody;
	}
	 Component getTopBottom()
	{
		topBottom = new JPanel();
		topBottom.setPreferredSize(new Dimension(400,64));
		topBottom.setBackground(Color.green);//Color.green
		topBottom.setLayout(new FlowLayout());
		topBottom.add(getBackButCenTit());
		return topBottom;
	}
	Component getBackButCenTit()
	{
		backButFTestTit = new JPanel();
		backButFTestTit.setPreferredSize(new Dimension(900,64));
		backButFTestTit.setBackground(Color.green);
		backButFTestTit.setLayout(null);
		backButFTestTit.add(getTTestTitle());
		backButFTestTit.add(getBack());
		return backButFTestTit;
		
	}
	 static  Component getTTestTitle()
	{
		fTestTitle = new JLabel();
		fTestTitle.setBounds(330,1,200,44);//(376,44)
		fTestTitle.setBackground(new Color(39,48,82));
		fTestTitle.setOpaque(true);
		fTestTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		fTestTitle.setText("F-TEST");
		fTestTitle.setForeground(Color.white);
		fTestTitle.setVerticalTextPosition(JLabel.CENTER);
		fTestTitle.setHorizontalAlignment(JLabel.CENTER);
		return fTestTitle;
	}
	 Component getBack()
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
	 Component getBodyBottom()
	{
		bodyBottom = new JPanel();
		bodyBottom.setPreferredSize(new Dimension(400,700));
		bodyBottom.setBackground(new Color(61,61,61));//ew Color(61,61,61
		bodyBottom.setLayout(new FlowLayout());
		bodyBottom.add(getFTestpanel());
		return bodyBottom;
	}
	Component getFTestpanel()
	{
		fTestPanel = new JPanel();
		fTestPanel.setPreferredSize(new Dimension(873,634));
		fTestPanel.setBackground(new Color(196,196,196));
		fTestPanel.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 35, false));
		fTestPanel.setLayout(null);
		fTestPanel.add(takeNote());
		fTestPanel.add(getInputs());
		fTestPanel.add(start());
		fTestPanel.add(getAnswers());
		return fTestPanel;
	}
	static Component getAnswers()
	{
		answers = new JPanel();
		answers.setBounds(60, 337, 737, 180);//289
		answers.setBackground(new Color(61,61,61));
		answers.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 15, false));
		answers.setLayout(new GridLayout(3,1,20,20));
		answers.add(tab());
		answers.add(ftV());
		answers.add(getConclusion());
		
		return answers;
	}
	 static Component getHO()
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
		hOArea= new JTextArea();
		hOArea.setSize(1000, 38);//613
		hOArea.setBackground(Color.white);
		hOArea.setLineWrap(true);
		hOArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		hOArea.setForeground(Color.black);
		
		hOpane = new JScrollPane(hOArea);
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
	 static Component getInputs()
	{
		inputs = new JPanel();
		inputs.setBounds(60,70,735,180);
		inputs.setLayout(new GridLayout(3,1,20,20));
		inputs.add(getInputData());
		inputs.add(signi());
		inputs.add(getHO());
		inputs.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 20, false));
		inputs.setBackground(new Color(61,61,61));
		return inputs;
	}
	 static  Component getInputData()
	{
		inputData = new JPanel();
		inputData.setPreferredSize(new Dimension(725,38));
		inputData.setBackground(Color.white);
		//inputData.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 10, false));
		inputData.setLayout(null);
		inputData.add(inputDataLabel());
		inputData.add(getInputDataArea());
		
		return inputData;
	}
	 static Component getInputDataArea()
	{
		inputDataArea = new JTextArea();
		inputDataArea.setSize(1000, 38);//613
		inputDataArea.setBackground(Color.white);
		inputDataArea.setLineWrap(true);
		inputDataArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		inputDataArea.setForeground(Color.black);
		
		inputDataPane = new JScrollPane(inputDataArea);
		inputDataPane.setBounds(145,0,555,40);
		inputDataPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return inputDataPane;
	}
	 static Component inputDataLabel()
	{
		inputData1 = new JLabel();
		inputData1.setBounds(0,0,144,38);
		inputData1.setText("Input Data");
		inputData1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		inputData1.setForeground(Color.black);
		inputData1.setVerticalAlignment(JLabel.CENTER);
		inputData1.setHorizontalAlignment(JLabel.CENTER);
		inputData1.setBackground(new Color(196,196,196));
		inputData1.setOpaque(true);
		return inputData1;
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
		
		signiPane = new JScrollPane(signiArea);
		signiPane.setBounds(145,0,555,40);
		signiPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return signiPane;
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
		
		tabularValuePane = new JScrollPane(tabArea);
		tabularValuePane.setBounds(134,0,575,40);
		tabularValuePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return tabularValuePane;
	}
	 static Component ftV()
	{
		ftV= new JPanel();
		ftV.setPreferredSize(new Dimension(134,63));
		ftV.setBackground(Color.white);
		ftV.setLayout(null);
		ftV.add(ftVlabel());
		ftV.add(ftVArea());
		return ftV;
	}
	 static Component ftVlabel()
	{
		ftVlabel = new JLabel();
		ftVlabel.setText("<html>F-Test Value</html>");
		ftVlabel.setBounds(0, 0,134,40);
		ftVlabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ftVlabel.setForeground(Color.black);
		ftVlabel.setVerticalAlignment(JLabel.CENTER);
		ftVlabel.setHorizontalAlignment(JLabel.CENTER);
		ftVlabel.setBackground(new Color(196,196,196));
		ftVlabel.setOpaque(true);
		return ftVlabel;
	}
	
	 static Component ftVArea()
	{
		fTestValueArea = new JTextArea();
		fTestValueArea.setSize(1000, 30);//613
		fTestValueArea.setBackground(Color.white);
		fTestValueArea.setLineWrap(true);
		fTestValueArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		fTestValueArea.setForeground(Color.black);
		
		fTestPane= new JScrollPane(fTestValueArea);
		fTestPane.setBounds(134,0,575,40);
		fTestPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return fTestPane;
	}
	 static Component getConclusion()
	{
		ftC = new JPanel();
		ftC.setPreferredSize(new Dimension(134,63));
		ftC.setBackground(Color.white);
		ftC.setLayout(null);
		ftC.add(getConclusionLabel());
		ftC.add(getConclusionPane());
		return ftC;
	}
	 static Component getConclusionLabel()
	{
		ftCLabel = new JLabel();
		ftCLabel.setText("<html> F-Test Conclusion</html>");
		ftCLabel.setBounds(0, 0,134,40);
		ftCLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ftCLabel.setForeground(Color.black);
		ftCLabel.setVerticalAlignment(JLabel.CENTER);
		ftCLabel.setHorizontalAlignment(JLabel.CENTER);
		ftCLabel.setBackground(new Color(196,196,196));
		ftCLabel.setOpaque(true);
		return ftCLabel;
	}
	
	 static Component getConclusionPane()
	{
		conclusionArea = new JTextArea();
		conclusionArea.setSize(1000, 30);//613
		conclusionArea.setBackground(Color.white);
		conclusionArea.setLineWrap(true);
		conclusionArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		conclusionArea.setForeground(Color.black);
		
		conclusionPane = new JScrollPane(conclusionArea);
		conclusionPane.setBounds(134,0,575,40);
		conclusionPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return conclusionPane;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==back)		
		{
			try {
				Home.home.setVisible(false);
				GenerateFormula.generateFormula.setVisible(false);	
				Statistics.statistics.setVisible(true);
				CentralTendency.centralTendency.setVisible(false);
				ZTest.zTest.setVisible(false);
				TTest.tTest.setVisible(false);
				//FTest fTest = new FTest();
				FTest.fTest.setVisible(false);	
			}catch(Exception ee)
			{
				
			}
			
		}
		
		if(e.getSource()==getStart())
		{
			try {
				FTestB testB;
				String getInputData = inputDataArea.getText();
				String nullHypothesis = hOArea.getText();
				double lvlOfSignificance = Double.valueOf(signiArea.getText());
				testB = new FTestB(getInputData,nullHypothesis,lvlOfSignificance);
				
				//System.out.println("Tabular Value: "+String.valueOf(testB.getTabularValue()));
				//System.out.println("FScore: "+String.valueOf(testB.getFScore()));
				//System.out.println("Conclusion: "+String.valueOf(testB.getConclusion()));
				
				//display tabular value, ftest value, and conclusion
				tabArea.setText(String.valueOf(testB.getTabularValue()));
				fTestValueArea.setText(String.valueOf(testB.getFScore()));
				conclusionArea.setText(String.valueOf(testB.getConclusion()));
			}catch(Exception ee)
			{
				
			}
			
			
			
			
		}
		
	}


}

