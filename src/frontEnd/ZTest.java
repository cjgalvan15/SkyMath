package frontEnd;
import backEnd.*;
//package Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ZTest implements ActionListener
{
	public static JPanel zTest = new JPanel();
	public static JPanel top, bottom, topBottom,backButCenTit,ztestpanel,inputData
	, hO, answers, signi, deg, tab, ztV, ztC,bodyBottom,inputs,testType;
	public static JLabel centralTenTitle, takeNote,inputdata, hOlabel,signilabel,deglabel
	,tablabel,ztVlabel,ztCLabel,testTypeLabel;
	public JButton back;
	public static JButton showTable;
	public JTextArea inputDataArea, hOarea, signiArea,degArea,tabArea,ztVArea,ztCArea, testTypeArea;
	public static JScrollPane inputdatapane, hOpane,signipane,degpane,tabpane,ztVpane,
	ztCpane, testTypePane;
	public JButton start;
	public int i=0;
	public int id_ztr=0;
	public static ArrayList<ZTableResults> zTableResultsList = new ArrayList<ZTableResults>();
	private int once=0, index=0;
	ZTest()
	{
		zTest= new JPanel();
		zTest.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
		zTest.setBackground(new Color(0,255,0));
		zTest.setLayout(new BorderLayout());
		zTest.setPreferredSize(new Dimension(900,900));
		zTest.add(top(), BorderLayout.NORTH);
		//zTest.add(body(), BorderLayout.CENTER);
		zTest.add(bottom(), BorderLayout.CENTER);
		
	}
//string image1 = "resources/image1.png"
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
		backButCenTit = new JPanel();
		backButCenTit.setPreferredSize(new Dimension(900,64));
		backButCenTit.setBackground(Color.green);
		backButCenTit.setLayout(null);
		backButCenTit.add(centralTenTitle());
		backButCenTit.add(back());
		return backButCenTit;
	}
	static Component centralTenTitle()
	{
		centralTenTitle = new JLabel();
		centralTenTitle.setBounds(330,1,200,44);//(376,44)
		centralTenTitle.setBackground(new Color(39,48,82));
		centralTenTitle.setOpaque(true);
		centralTenTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		centralTenTitle.setText("Z-TEST");
		centralTenTitle.setForeground(Color.white);
		centralTenTitle.setVerticalTextPosition(JLabel.CENTER);
		centralTenTitle.setHorizontalAlignment(JLabel.CENTER);
		return centralTenTitle;
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
		bodyBottom.add(ztestpanel());
		return bodyBottom;
	}
	 Component ztestpanel()
	{
		ztestpanel = new JPanel();
		ztestpanel.setPreferredSize(new Dimension(873,700));//(873,634)
		ztestpanel.setBackground(new Color(196,196,196));
		ztestpanel.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 35, false));
		ztestpanel.setLayout(null);
		ztestpanel.add(takeNote());
		ztestpanel.add(inputs());
		ztestpanel.add(start());
		ztestpanel.add(answers());
		ztestpanel.add(showTable());
		return ztestpanel;
	}
	Component showTable()
	{
		showTable = new JButton("Show Table");
		showTable.setBackground(new Color(196,196,196));//new Color(196,196,196)
		showTable.setBounds(330,580,200,40);
		showTable.setFont(new Font("Arial",Font.PLAIN,20));
		showTable.setFocusable(false);
		showTable.addActionListener(this);
		return showTable;
	}
	Component answers()
	{
		answers = new JPanel();
		answers.setBounds(60, 337, 737, 220);//(60, 337, 737, 180)
		answers.setBackground(new Color(61,61,61));
		answers.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 15, false));
		answers.setLayout(new GridLayout(4,1,20,20));
		answers.add(tab());
		answers.add(ztV());
		answers.add(ztC());
		answers.add(testType());
		
		return answers;
	}

	Component testType()
	{
		testType = new JPanel();
		testType.setPreferredSize(new Dimension(134,63));
		testType.setBackground(Color.white);

		testType.setLayout(null);
		testType.add(testTypeLabel());
		testType.add(testTypeArea());
		
		return testType;
	}
	Component testTypeArea()
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
	 Component hO()
	{
		hO = new JPanel();
		hO.setPreferredSize(new Dimension(749,58));
		hO.setBackground(Color.white);

		hO.setLayout(null);
		hO.add(hOLabel());
		hO.add(hOArea());
		
		return hO;
	}
	Component hOArea()
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
	Component inputs()
	{
		inputs = new JPanel();
		inputs.setBounds(60,70,735,180);
		inputs.setLayout(new GridLayout(3,1,20,20));
		inputs.add(inputData());
		inputs.add(signi());
		inputs.add(hO());
		inputs.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 20, false));
		inputs.setBackground(new Color(61,61,61));
		return inputs;
	}
	Component inputData()
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
	Component inputDataArea()
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
	Component signi()
	{
		signi = new JPanel();
		signi.setPreferredSize(new Dimension(124,63));
		signi.setBackground(Color.white);
		signi.setLayout(null);
		signi.add(signilabel());
		signi.add(signiArea());
		return signi;
	}
	Component signiArea()
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
	Component tab()
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
	
	Component tabArea()
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
	Component ztV()
	{
		ztV = new JPanel();
		ztV.setPreferredSize(new Dimension(134,63));
		ztV.setBackground(Color.white);
		ztV.setLayout(null);
		ztV.add(ztVlabel());
		ztV.add(ztVArea());
		return ztV;
	}
	static Component ztVlabel()
	{
		ztVlabel = new JLabel();
		ztVlabel.setText("<html>Z-Test Value</html>");
		ztVlabel.setBounds(0, 0,134,40);
		ztVlabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ztVlabel.setForeground(Color.black);
		ztVlabel.setVerticalAlignment(JLabel.CENTER);
		ztVlabel.setHorizontalAlignment(JLabel.CENTER);
		ztVlabel.setBackground(new Color(196,196,196));
		ztVlabel.setOpaque(true);
		return ztVlabel;
	}
	
	Component ztVArea()
	{
		ztVArea = new JTextArea();
		ztVArea.setSize(1000, 30);//613
		ztVArea.setBackground(Color.white);
		ztVArea.setLineWrap(true);
		ztVArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ztVArea.setForeground(Color.black);
		
		ztVpane = new JScrollPane(ztVArea);
		ztVpane.setBounds(134,0,575,40);
		ztVpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return ztVpane;
	}
	Component ztC()
	{
		ztC = new JPanel();
		ztC.setPreferredSize(new Dimension(134,63));
		ztC.setBackground(Color.white);
		ztC.setLayout(null);
		ztC.add(ztCLabel());
		ztC.add(ztCArea());
		return ztC;
	}
	static Component ztCLabel()
	{
		ztCLabel = new JLabel();
		ztCLabel.setText("<html> Z-Test Conclusion</html>");
		ztCLabel.setBounds(0, 0,134,40);
		ztCLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ztCLabel.setForeground(Color.black);
		ztCLabel.setVerticalAlignment(JLabel.CENTER);
		ztCLabel.setHorizontalAlignment(JLabel.CENTER);
		ztCLabel.setBackground(new Color(196,196,196));
		ztCLabel.setOpaque(true);
		return ztCLabel;
	}
	
	Component ztCArea()
	{
		ztCArea = new JTextArea();
		ztCArea.setSize(1000, 30);//613
		ztCArea.setBackground(Color.white);
		ztCArea.setLineWrap(true);
		ztCArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ztCArea.setForeground(Color.black);
		
		ztCpane = new JScrollPane(ztCArea);
		ztCpane.setBounds(134,0,575,40);
		ztCpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return ztCpane;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==showTable)		
		{
			
			//results = new ZTableResults();
			
			
			once++;
			if(once==1)
			{
				try {
					zTableResultsList.add(new ZTableResults());
					
					zTableResultsList.get(0).getZTableResults().setVisible(true);

					Home.home.setVisible(false);

					GenerateFormula.generateFormula.setVisible(false);	

					Statistics.statistics.setVisible(false);
				
					
					
					CentralTendency.centralTendency.setVisible(false);
					
					ZTest.zTest.setVisible(false);
			
					
					TTest.tTest.setVisible(false);
					
					ZTable zTable = new ZTable(); //comment 3
				
				
					//ZTableResults.changeComponentColor(ZTestB.getLevelOfSignificance(), ZTestB.getTail(), ZTableResults.getZTableResults());
					//zTableResultsList.get(0).changeComponentColor(ZTestB.getLevelOfSignificance(), ZTestB.getTail(), zTableResultsList.get(0));// comment 4
					
					//results.get_pN1Point281()).setOpaque(true);
					
					//FTest fTest = new FTest();
					FTest.fTest.setVisible(false);	
					Home.frame.add(zTableResultsList.get(0).getZTableResults());
				}catch(Exception ee)
				{
					System.out.println("There is an error");
				}
				
				
			}

				//Home.frame.add(new ZTableResults().zTableResults);
			
			/*else if(once==1)
			{
				Home.frame.add(zTableResultsList.get(0).getZTableResults());

			}*/
			
			
			else {
				
				try {
					zTableResultsList.get(0).getZTableResults().setVisible(true);
					
					Home.home.setVisible(false);

					GenerateFormula.generateFormula.setVisible(false);	

					Statistics.statistics.setVisible(false);

					CentralTendency.centralTendency.setVisible(false);
					
					ZTest.zTest.setVisible(false);
			
					
					TTest.tTest.setVisible(false);
					
					//ZTable zTable = new ZTable();// comment 1
				
					
					//ZTableResults.changeComponentColor(ZTestB.getLevelOfSignificance(), ZTestB.getTail(), ZTableResults.getZTableResults());
					//zTableResultsList.get(0).changeComponentColor(ZTestB.getLevelOfSignificance(), ZTestB.getTail(), zTableResultsList.get(0));// comment 2
					
					//results.get_pN1Point281()).setOpaque(true);
					
					//FTest fTest = new FTest();
					FTest.fTest.setVisible(false);	
					//zTableResultsList.get(0).getZTableResults().setVisible(true);
					
				}catch(Exception ee)
				{
					System.out.println("There is an error");
				}
				
				
			}
		}
		
		if(e.getSource()==back)		
		{
			//Home.frame.remove(results.getZTableResults());
			//results=null;
			
			//if there is an object within zTableResultsList
			//remove the object
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
			System.out.println("There is an error");
		}
				
			
		}
		if(e.getSource()==start)
		{
			//store the input, nullHypothesis, levelOfSignificance
			try {
				String tempInput = inputDataArea.getText();
				
				String tempNullHypothesis = hOarea.getText();
			
				System.out.println("h0: "+tempNullHypothesis);
				double tempLvlOfSignificance = Double.valueOf(signiArea.getText());
				
				ZTestB test = new ZTestB(tempInput, tempNullHypothesis, tempLvlOfSignificance);
				
				System.out.println("Tabular Value: "+String.valueOf(test.getTabularValue()));
				System.out.println("ZScore: "+String.valueOf(test.getZScore()));
				System.out.println("Conclusion: "+String.valueOf(test.getConclusion()));
				System.out.println("Tail: "+String.valueOf(test.getTail()));
				//tabularValue, zTest Value, Conclusion 
				tabArea.setText(String.valueOf(test.getTabularValue()));
				
				ztVArea.setText(String.valueOf(test.getZScore()));
				
				ztCArea.setText(String.valueOf(test.getConclusion()));
				
				testTypeArea.setText(String.valueOf(test.getTail()));
			}catch(Exception ee)
			{
				System.out.println("There is an error");
			}
			
	
				//ZTableResults.setRenew(zTableResultsList.get(index));
	
		}
		
		
	}
	

}
