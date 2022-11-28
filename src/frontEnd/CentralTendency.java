package frontEnd;

import backEnd.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CentralTendency implements ActionListener{

	public static JPanel centralTendency = new JPanel();
	public static JPanel home,top, body, bottom, topBottom, bodyBottom,backButCenTit
	,centenPanel, inputData, meanMedianMode, mean, median, mode ;
	public static JLabel centralTenTitle, takeNote,inputdata, mean1, median1, mode1;
	public JButton back, start;
	public static  JTextArea inputdataarea,meanarea, medianarea, modearea;
	public static JScrollPane inputdatapane, meanpane, medianpane, modepane;
	//public static int ba=0;
	//public static String dataStr;
	
	CentralTendency()
	{	
		try {
			centralTendency= new JPanel();
			centralTendency.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
			centralTendency.setBackground(new Color(0,255,0));
			centralTendency.setLayout(new BorderLayout());
			centralTendency.setPreferredSize(new Dimension(900,900));
			centralTendency.add(top(), BorderLayout.NORTH);
			//centralTendency.add(body(), BorderLayout.CENTER);
			centralTendency.add(bottom(), BorderLayout.CENTER);
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
	Component bodyBottom()
	{
		bodyBottom = new JPanel();
		bodyBottom.setPreferredSize(new Dimension(400,700));
		bodyBottom.setBackground(new Color(61,61,61));//ew Color(61,61,61
		bodyBottom.setLayout(new FlowLayout());
		bodyBottom.add(centenPanel());
		return bodyBottom;
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
		centralTenTitle.setBounds(250,1,376,44);//(376,44)
		centralTenTitle.setBackground(new Color(39,48,82));
		centralTenTitle.setOpaque(true);
		centralTenTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		centralTenTitle.setText("CENTRAL TENDENCY");
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
	Component centenPanel()
	{
		centenPanel = new JPanel();
		centenPanel.setPreferredSize(new Dimension(873,634));
		centenPanel.setBackground(new Color(196,196,196));
		centenPanel.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 35, false));
		centenPanel.setLayout(null);
		centenPanel.add(takeNote());
		centenPanel.add(inputData());
		centenPanel.add(start());
		centenPanel.add(meanMedianMode());
		return centenPanel;
	}
	static Component takeNote()
	{
		takeNote = new JLabel();
		takeNote.setText("Take note: Use comma delimiter “,”; e.g. 1,2,3,4,5...");
		takeNote.setFont(new Font("Times New Roman", Font.BOLD, 20));
		takeNote.setBounds(60, 60, 500, 25);
		takeNote.setBackground(new Color(196,196,196));
		takeNote.setForeground(Color.gray);
		takeNote.setOpaque(true);
		return takeNote;
	}
	static Component inputData()
	{
		inputData = new JPanel();
		inputData.setBounds(60,100,747,117);
		inputData.setBackground(Color.white);
		inputData.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 20, false));
		inputData.setLayout(null);
		inputData.add(inputDataLabel());
		inputData.add(inputDataArea());
		
		return inputData;
	}
	static Component inputDataArea()
	{
		inputdataarea = new JTextArea();
		inputdataarea.setSize(1000, 77);//613
		inputdataarea.setBackground(Color.white);
		inputdataarea.setLineWrap(true);
		inputdataarea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		inputdataarea.setForeground(Color.black);
		
		inputdatapane = new JScrollPane(inputdataarea);
		inputdatapane.setBounds(154,20,580,77);
		inputdatapane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return inputdatapane;
	}
	static Component inputDataLabel()
	{
		inputdata = new JLabel();
		inputdata.setBounds(20,20,134,77);
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
		start.setBounds(350,230,158,39);
		start.setForeground(Color.white);
		start.setFont(new Font("Times New Roman", Font.BOLD, 20));
		start.setBackground(new Color(109,66,0));
		start.setOpaque(true);
		start.setFocusable(false);
		return start;
	}
	static Component  meanMedianMode()
	{
		meanMedianMode = new JPanel();
		meanMedianMode.setBounds(60, 289, 737, 289);
		meanMedianMode.setBackground(new Color(61,61,61));
		meanMedianMode.setBorder(BorderFactory.createLineBorder(new Color(61,61,61), 20, false));
		meanMedianMode.setLayout(new GridLayout(3,1,20,20));
		meanMedianMode.add(mean());
		meanMedianMode.add(median());
		meanMedianMode.add(mode());
		
		return meanMedianMode;
	}
	static Component mean()
	{
		mean = new JPanel();
		mean.setPreferredSize(new Dimension(134,63));
		mean.setBackground(Color.white);
		mean.setLayout(null);
		mean.add(meanlabel());
		mean.add(meanArea());
		return mean;
	}
	static Component meanArea()
	{
		meanarea = new JTextArea();
		meanarea.setSize(1000, 77);//613
		meanarea.setBackground(Color.white);
		meanarea.setLineWrap(true);
		meanarea.setFont(new Font("Times New Roman", Font.BOLD, 40));
		meanarea.setForeground(Color.black);
		
		meanpane = new JScrollPane(meanarea);
		meanpane.setBounds(134,0,565,77);
		meanpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return meanpane;
	}
	static Component meanlabel()
	{
		mean1 = new JLabel();
		mean1.setText("Mean");
		mean1.setBounds(0, 0,134,69);
		mean1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mean1.setForeground(Color.black);
		mean1.setVerticalAlignment(JLabel.CENTER);
		mean1.setHorizontalAlignment(JLabel.CENTER);
		mean1.setBackground(new Color(196,196,196));
		mean1.setOpaque(true);
		return mean1;
	}
	static Component median()
	{
		median = new JPanel();
		median.setPreferredSize(new Dimension(134,63));
		median.setBackground(Color.white);
		median.setLayout(null);
		median.add(medianlabel());
		median.add(medianArea());
		return median;
	}
	static Component medianArea()
	{
		medianarea = new JTextArea();
		medianarea.setSize(1000, 77);//613
		medianarea.setBackground(Color.white);
		medianarea.setLineWrap(true);
		medianarea.setFont(new Font("Times New Roman", Font.BOLD, 40));
		medianarea.setForeground(Color.black);
		
		medianpane = new JScrollPane(medianarea);
		medianpane.setBounds(134,0,565,77);
		medianpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return medianpane;
	}
	static Component medianlabel()
	{
		median1 = new JLabel();
		median1.setText("Median");
		median1.setBounds(0, 0,134,69);
		median1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		median1.setForeground(Color.black);
		median1.setVerticalAlignment(JLabel.CENTER);
		median1.setHorizontalAlignment(JLabel.CENTER);
		median1.setBackground(new Color(196,196,196));
		median1.setOpaque(true);
		return median1;
	}
	static Component mode()
	{
		mode = new JPanel();
		mode.setPreferredSize(new Dimension(134,63));
		mode.setBackground(Color.white);
		mode.setLayout(null);
		mode.add(modelabel());
		mode.add(modeArea());
		return mode;
	}
	static Component modeArea()
	{
		modearea = new JTextArea();
		modearea.setSize(1000, 77);//613
		modearea.setBackground(Color.white);
		modearea.setLineWrap(true);
		modearea.setFont(new Font("Times New Roman", Font.BOLD, 40));
		modearea.setForeground(Color.black);
		
		modepane = new JScrollPane(modearea);
		modepane.setBounds(134,0,565,77);
		modepane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		return modepane;
	}
	static Component modelabel()
	{
		mode1 = new JLabel();
		mode1.setText("Mode");
		mode1.setBounds(0, 0,134,69);
		mode1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mode1.setForeground(Color.black);
		mode1.setVerticalAlignment(JLabel.CENTER);
		mode1.setHorizontalAlignment(JLabel.CENTER);
		mode1.setBackground(new Color(196,196,196));
		mode1.setOpaque(true);
		return mode1;
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
		
		if(e.getSource()==start)
		{
			String dataStr;
			
			try {
				dataStr = inputdataarea.getText();
				
				//ArrayList<Double> list = CentralTendencyB.stringToList(dataStr);//debugged 1
				
				//get the result of the mean 
				//String mean = String.valueOf(CentralTendencyB.mean(list));//debugged 2
				
				//store the listToDouble
				//double[] list2 = CentralTendencyB.listToArray(list);//debugged 3
				
				//get the median
				//String median = String.valueOf(CentralTendencyB.median(list2)); //debugged 4
				
				//get the mode
				//String mode = String.valueOf(CentralTendencyB.mode(list2)); //debugged 5
				CentralTendencyB centralTendencyB = new CentralTendencyB(dataStr);
				
				meanarea.setText(String.valueOf(centralTendencyB.getMean()));
				medianarea.setText(String.valueOf(centralTendencyB.getMedian()));
				
				if(mode.equals("[]"))
				{
					modearea.setText("none");
				}
				else
				{
					modearea.setText(String.valueOf(centralTendencyB.getMode()));
				}
			}catch(Exception ee)
			{
				
			}
			
		
		}
		
	}
}
