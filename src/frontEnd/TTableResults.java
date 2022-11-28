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
import javax.swing.SwingConstants;

public class TTableResults implements ActionListener
{
	public static JPanel tTableResults = new JPanel();
	public static JPanel tTableVal;
	public static JPanel top, bottom, topBottom,backButCenTit,bodyBottom;
	//public static JLabel centralTenTitle, takeNote,inputdata, hOlabel,signilabel,deglabel
	public JButton back;
	public JLabel tTableTit,oneTwoTail,oneTail,twoTail,df,_0P5,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,
	_11,_12,_13,_14,_15,_16,_17,_18,_19,_20,_21,_22,_23,_24,_25,_26,_27,_28,_29,_30,
	_40,_60,_80,_100,_1000,Z,df1,tailValues, specificValues;
	public JLabel P5,_0P25,_0P2,_0P15,_0P1,_0P051,_0P025,_0P011,_0P005,_0P0011,_0P0005,_1P00,
	_0P50,_0P40,_0P30,_0P20,_0P10,_0P05,_0P02,_0P01,_0P002,_0P001;
	public JLabel blank,blank1, blank2, blank3, blank4,blank5,blank6,blank7,blank8,blank9,blank10; 
	public JLabel _0P000, _1P000, _1P376, _1P963,_3P078,_6P314,_12P71,_31P82,_63P66,_318P31,_636P62;
	//_0P816,_1P061,_1P386,_1P886,_2P920,_4P303,_6P965,_9P925,_22P357,_31P599
	public JLabel _0P816,_1P061,_1P386,_1P886,_2P920,_4P303,_6P965,_9P925,_22P357,_31P599;
	//_0P765,_1P978,_1P250,_1P638,_2P353,_3P182,_4P541,_5P841,_10P215,_12P924
	public JLabel _0P765,_1P978,_1P250,_1P638,_2P353,_3P182,_4P541,_5P841,_10P215,_12P924;
	//_0P741,_0P941,_1P190,_1P533,_2P132,_2P776,_3P747,_4P604,_7P173,_8P610
	public JLabel _0P741,_0P941,_1P190,_1P533,_2P132,_2P776,_3P747,_4P604,_7P173,_8P610;
	//_0P727,_0P920,_1P156,_1P476,_2P015,_2P571,_3P365,_4P032,_5P893,_6P869
	public JLabel _0P727,_0P920,_1P156,_1P476,_2P015,_2P571,_3P365,_4P032,_5P893,_6P869;
	//_0P718,_0P906,_1P134,_1P440,_1P943,_2P447,_3P143,_3P707,_5P208,_5P959
	public JLabel _0P718,_0P906,_1P134,_1P440,_1P943,_2P447,_3P143,_3P707,_5P208,_5P959;
	//_0P711,_0P896,_1P119,_1P415,_1P895,_2P365,_2P998,_3P499,_4P501,_5P408
	public JLabel _0P711,_0P896,_1P119,_1P415,_1P895,_2P365,_2P998,_3P499,_4P501,_5P408;
	//_0P706,_0P889,_1P108,_1P397,_1P860,_2P306,_2P896,_3P355,_4P501,_5P041
	public JLabel _0P706,_0P889,_1P108,_1P397,_1P860,_2P306,_2P896,_3P355,_4P5011,_5P041;
	//_0P703,_0P883,_1P100,_1P383,_1P833,_2P262,_2P821,_3P250,_4P297,_4P781
	public JLabel _0P703,_0P883,_1P100,_1P383,_1P833,_2P262,_2P821,_3P250,_4P297,_4P781;
	//_0P700,_0P879,_1P093,_1P372,_1P812,_2P228,_2P764,_3P106,_4P144,_4P587
	public JLabel _0P700,_0P879,_1P093,_1P372,_1P812,_2P228,_2P764,_3P106,_4P144,_4P587;
	//_0P697,_0P876,_1P088,_1P363,_1P796,_2P201,_2P718,_3P106,_4P025,_4P437
	public JLabel _0P697,_0P876,_1P088,_1P363,_1P796,_2P201,_2P718,_3P1061,_4P025,_4P437;
	//_0P695,_0P873,_1P083,_1P356,_1P782,_2P179,_2P681,_3P055,_3P930,_4P318
	public JLabel _0P695,_0P873,_1P083,_1P356,_1P782,_2P179,_2P681,_3P055,_3P930,_4P318;	
	//_0P697,_0P876,_1P088,_1P363,_1P796,_2P201,_2P718,_3P106,_4P025,_4P437
	public JLabel _0P694,_0P870,_1P079,_1P350,_1P771,_2P160,_2P650,_3P012,_3P852,_4P221;
	//_0P692,_0P868,_1P076,_1P345,_1P761,_2P145,_2P624,_2P977,_3P787,_4P140
	public JLabel _0P692,_0P868,_1P076,_1P345,_1P761,_2P145,_2P624,_2P977,_3P787,_4P140;
	//_0P691,_0P866,_1P074,_1P341,_1P753,_2P131,_2P602,_2P947,_3P733,_4P073
	public JLabel _0P691,_0P866,_1P074,_1P341,_1P753,_2P131,_2P602,_2P947,_3P733,_4P073;
	//_0P690,_0P865,_1P071,_1P337,_1P746,_2P120,_2P583,_2P921,_3P686,_4P015
	public JLabel _0P690,_0P865,_1P071,_1P337,_1P746,_2P120,_2P583,_2P921,_3P686,_4P015;
	//_0P689,_0P863,_1P069,_1P333,_1P740,_2P110,_2P567,_2P898,_3P646,_4P965
	public JLabel _0P689,_0P863,_1P069,_1P333,_1P740,_2P110,_2P567,_2P898,_3P646,_4P965;
	//_0P688,_0P862,_1P067,_1P330,_1P734,_2P101,_2P552,_2P878,_3P610,_4P922
	public JLabel _0P688,_0P862,_1P067,_1P330,_1P734,_2P101,_2P552,_2P878,_3P610,_4P922;
	//_0P688,_0P861,_1P066,_1P328,_1P729,_2P093,_2P539,_2P861,_3P579,_4P883
	public JLabel _0P6881,_0P861,_1P066,_1P328,_1P729,_2P093,_2P539,_2P861,_3P579,_4P883;
	//_0P687,_0P860,_1P064,_1P325,_1P725,_2P086,_2P528,_2P845,_3P552,_4P850
	public JLabel _0P687,_0P860,_1P064,_1P325,_1P725,_2P086,_2P528,_2P845,_3P552,_4P850;
	//_0P686,_0P859,_1P063,_1P323,_1P721,_2P080,_2P518,_2P831,_3P527,_4P819
	public JLabel _0P686,_0P859,_1P063,_1P323,_1P721,_2P080,_2P518,_2P831,_3P527,_4P819;
	//_0P686,_0P858,_1P061,_1P321,_1P717,_2P074,_2P508,_2P819,_3P505,_4P792
	public JLabel _0P6861,_0P858,_1P0611,_1P321,_1P717,_2P074,_2P508,_2P819,_3P505,_4P792;
	//_0P685,_0P858,_1P060,_1P319,_1P714,_2P069,_2P500,_2P807,_3P485,_3P768
	public JLabel _0P685,_0P8581,_1P060,_1P319,_1P714,_2P069,_2P500,_2P807,_3P485,_3P768;
	//_0P685,_0P857,_1P059,_1P318,_1P711,_2P064,_2P492,_2P797,_3P467,_3P745
	public JLabel _0P6851,_0P857,_1P059,_1P318,_1P711,_2P064,_2P492,_2P797,_3P467,_3P745;
	//_0P684,_0P856,_1P058,_1P316,_1P708,_2P060,_2P485,_2P787,_3P450,_3P725
	public JLabel _0P684,_0P856,_1P058,_1P316,_1P708,_2P060,_2P485,_2P787,_3P450,_3P725;
	//_0P684,_0P856,_1P058,_1P315,_1P706,_2P056,_2P479,_2P771,_3P435,_3P707
	public JLabel _0P68411,_0P8561,_1P0581,_1P315,_1P706,_2P056,_2P479,_2P779,_3P435,_3P7071;
	//_0P684,_0P855,_1P057,_1P314,_1P703,_2P052,_2P473,_2P771,_3P421,_3P690
	public JLabel _0P6841,_0P855,_1P057,_1P314,_1P703,_2P052,_2P473,_2P771,_3P421,_3P690;
	//_0P683,_0P855,_1P056,_1P313,_1P701,_2P048,_2P467,_2P763,_3P408,_3P674
	public JLabel _0P683,_0P8551,_1P056,_1P313,_1P701,_2P048,_2P467,_2P763,_3P408,_3P674;
	//_0P683,_0P854,_1P055,_1P311,_1P699,_2P045,_2P462,_2P756,_3P396,_3P659
	public JLabel _0P6831,_0P854,_1P055,_1P311,_1P699,_2P045,_2P462,_2P756,_3P396,_3P659;
	//_0P683,_0P854,_1P055,_1P310,_1P697,_2P042,_2P457,_2P750,_3P385,_3P646
	public JLabel _0P68311,_0P8541,_1P0551,_1P310,_1P697,_2P042,_2P457,_2P750,_3P385,_3P6461;
	//_0P681,_0P851,_1P050,_1P303,_1P684,_2P021,_2P423,_2P704,_3P307,_3P551
	public JLabel _0P681,_0P851,_1P050,_1P303,_1P684,_2P021,_2P423,_2P704,_3P307,_3P551;
	//_0P679,_0P848,_1P045,_1P296,_1P671,_2P000,_2P390,_2P660,_3P232,_3P460
	public JLabel _0P679,_0P848,_1P045,_1P296,_1P671,_2P000,_2P390,_2P660,_3P232,_3P460;
	//_0P678,_0P846,_1P043,_1P292,_1P664,_1P990,_2P374,_2P639,_3P195,_3P416
	public JLabel _0P678,_0P846,_1P043,_1P292,_1P664,_1P990,_2P374,_2P639,_3P195,_3P416;
	//_0P677,_0P845,_1P042,_1P290,_1P660,_1P984,_2P364,_2P626,_3P174,_3P390
	public JLabel _0P677,_0P845,_1P042,_1P290,_1P660,_1P984,_2P364,_2P626,_3P174,_3P390;
	//_0P675,_0P842,_1P037,_1P282,_1P646,_1P962,_2P330,_2P581,_3P098,_3P300
	public JLabel _0P675,_0P842,_1P037,_1P282,_1P646,_1P962,_2P330,_2P581,_3P098,_3P300;
	//_0P674,_0P842,_1P036,_1P282,_1P645,_1P960,_2P326,_2P576,_3P090,_3P291	
	public JLabel _0P674,_0P8421,_1P036,_1P2821,_1P645,_1P960,_2P326,_2P576,_3P090,_3P291;
	/*zeroPer,fiftyPer, sixtyPer, seventyPer, eightyPer,ninetyPer,ninetyFivePer, 
	 * ninetyEightPer, ninetyNinePer,ninetyNinePEightPer, ninetyNinePninePer;*/
	public JLabel zeroPer,fiftyPer, sixtyPer, seventyPer, eightyPer,ninetyPer,ninetyFivePer, 
	ninetyEightPer, ninetyNinePer,ninetyNinePEightPer, ninetyNinePninePer, confidenceLevel;
	Font kawoszeh;
	public TTableResults()
	{
		tTableResults= new JPanel();
		tTableResults.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
		tTableResults.setBackground(new Color(0,255,0));
		tTableResults.setLayout(new BorderLayout());
		tTableResults.setPreferredSize(new Dimension(900,900));
		tTableResults.add(top(), BorderLayout.NORTH);
		//tTableResults.add(body(), BorderLayout.CENTER);
		tTableResults.add(bottom(), BorderLayout.CENTER);
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
		topBottom.setLayout(new FlowLayout(FlowLayout.LEADING));
		topBottom.add(backButCenTit());
		return topBottom;
	}
	Component backButCenTit()
	{
		backButCenTit = new JPanel();
		backButCenTit.setPreferredSize(new Dimension(900,64));
		backButCenTit.setBackground(Color.green);
		//backButCenTit.setLayout(null);
		backButCenTit.setLayout(new FlowLayout(FlowLayout.LEADING));
		//backButCenTit.add(centralTenTitle());
		backButCenTit.add(back());
		return backButCenTit;
	}
	
	Component back()
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
		return back;
	}
	Component bodyBottom()
	{
		bodyBottom = new JPanel();
		bodyBottom.setPreferredSize(new Dimension(400,700));
		bodyBottom.setBackground(new Color(61,61,61));//new Color(61,61,61
		bodyBottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		bodyBottom.add(tTableVal());
		return bodyBottom;
	}
	Component tTableVal()
	{
		tTableVal = new JPanel();
		tTableVal.setBackground(new Color(232,231,110));
		tTableVal.setPreferredSize(new Dimension(840,700));
		tTableVal.setLayout(null);
		tTableVal.add(tTableTit());
		tTableVal.add(oneTwoTail());
		tTableVal.add(df());
		tTableVal.add(tailValues());
		tTableVal.add(specificValues());
		tTableVal.add(confidenceLevel());
		return tTableVal;
	}
	/*confidenceLevel*/
	Component confidenceLevel()
	{
		confidenceLevel = new JLabel("CONFIDENCE LEVEL",SwingConstants.CENTER);
		confidenceLevel.setBounds(100,675,740,25);
		confidenceLevel.setBackground(new Color(161,113,136));
		confidenceLevel.setForeground(Color.white);
		confidenceLevel.setOpaque(true);
		return confidenceLevel;
	}
	/**********specificValues**********/
	Component specificValues()
	{
		specificValues = new JLabel();
		specificValues.setBackground(Color.black);
		specificValues.setOpaque(true);
		specificValues.setLayout(new GridLayout(38,11,5,2));
		specificValues.setBounds(100,90,740,585);//setBounds(100,90,740,570)
		specificValues.add(blank());
		specificValues.add(blank1());
		specificValues.add(blank2());
		specificValues.add(blank3());
		specificValues.add(blank4());
		specificValues.add(blank5());
		specificValues.add(blank6());
		specificValues.add(blank7());
		specificValues.add(blank8());
		specificValues.add(blank9());
		specificValues.add(blank10());
		specificValues.add(_0P000());
		specificValues.add(_1P000());
		specificValues.add(_1P376());
		specificValues.add(_1P963());
		specificValues.add(_3P078());
		specificValues.add(_6P314());
		specificValues.add(_12P71());
		specificValues.add(_31P82());
		specificValues.add(_63P66());
		specificValues.add(_318P31());
		specificValues.add(_636P62());
		specificValues.add(_0P000());
		specificValues.add(_0P816());
		specificValues.add(_1P0611());
		specificValues.add(_1P386());
		specificValues.add(_1P886());
		specificValues.add(_2P920());
		specificValues.add(_4P303());
		specificValues.add(_6P965());
		specificValues.add(_9P925());
		specificValues.add(_22P357());
		specificValues.add(_31P599());
		specificValues.add(_0P000());
		specificValues.add(_0P765());
		specificValues.add(_1P978());
		specificValues.add(_1P250());
		specificValues.add(_1P638());
		specificValues.add(_2P353());
		specificValues.add(_3P182());
		specificValues.add(_4P541());
		specificValues.add(_5P841());
		specificValues.add(_10P215());
		specificValues.add(_12P924());
		specificValues.add(_0P000());
		specificValues.add(_0P741());
		specificValues.add(_0P941());
		specificValues.add(_1P190());
		specificValues.add(_1P533());
		specificValues.add(_2P132());
		specificValues.add(_2P776());
		specificValues.add(_3P747());
		specificValues.add(_4P604());
		specificValues.add(_7P173());
		specificValues.add(_8P610());
		specificValues.add(_0P000());
		specificValues.add(_0P727());
		specificValues.add(_0P920());
		specificValues.add(_1P156());
		specificValues.add(_1P476());
		specificValues.add(_2P015());
		specificValues.add(puta());
		specificValues.add(_3P365());
		specificValues.add(_4P032());
		specificValues.add(_5P893());
		specificValues.add(_6P869());
		specificValues.add(_0P000());
		specificValues.add(_0P718());
		specificValues.add(_0P906());
		specificValues.add(_1P134());
		specificValues.add(_1P440());
		specificValues.add(_1P943());
		specificValues.add(_2P447());
		specificValues.add(_3P143());
		specificValues.add(_3P7071());
		specificValues.add(_5P208());
		specificValues.add(_5P959());
		specificValues.add(_0P000());
		specificValues.add(_0P711());
		specificValues.add(_0P896());
		specificValues.add(_1P119());
		specificValues.add(_1P415());
		specificValues.add(_1P895());
		specificValues.add(_2P365());
		specificValues.add(_2P998());
		specificValues.add(_3P499());
		specificValues.add(_4P501());
		specificValues.add(_5P408());
		specificValues.add(_0P000());
		specificValues.add(_0P706());
		specificValues.add(_0P889());
		specificValues.add(_1P108());
		specificValues.add(_1P397());
		specificValues.add(_1P860());
		specificValues.add(_2P306());
		specificValues.add(_2P896());
		specificValues.add(_3P355());
		specificValues.add(_4P501());
		specificValues.add(_5P041());
		specificValues.add(_0P000());
		specificValues.add(_0P703());
		specificValues.add(_0P883());
		specificValues.add(_1P100());
		specificValues.add(_1P383());
		specificValues.add(_1P833());
		specificValues.add(_2P262());
		specificValues.add(_2P821());
		specificValues.add(_3P250());
		specificValues.add(_4P297());
		specificValues.add(_4P781());
		specificValues.add(_0P000());
		specificValues.add(_0P700());
		specificValues.add(_0P879());
		specificValues.add(_1P093());
		specificValues.add(_1P372());
		specificValues.add(_1P812());
		specificValues.add(_2P228());
		specificValues.add(_2P764());
		specificValues.add(_3P106());
		specificValues.add(_4P144());
		specificValues.add(_4P587());
		//_0P697,_0P876,_1P088,_1P363,_1P796,_2P201,_2P718,_3P106,_4P025,_4P437
		specificValues.add(_0P000());
		specificValues.add(_0P697());
		specificValues.add(_0P876());
		specificValues.add(_1P088());
		specificValues.add(_1P363());
		specificValues.add(_1P796());
		specificValues.add(_2P201());
		specificValues.add(_2P718());
		specificValues.add(_3P106());
		specificValues.add(_4P025());
		specificValues.add(_4P437());
		//_0P695,_0P873,_1P083,_1P356,_1P782,_2P179,_2P681,_3P055,_3P930,_4P318
		specificValues.add(_0P000());
		specificValues.add(_0P695());
		specificValues.add(_0P873());
		specificValues.add(_1P083());
		specificValues.add(_1P356());
		specificValues.add(_1P782());
		specificValues.add(_2P179());
		specificValues.add(_2P681());
		specificValues.add(_3P055());
		specificValues.add(_3P930());
		specificValues.add(_4P318());	
		//_0P694,_0P870,_1P079,_1P350,_1P771,_2P160,_2P650,_3P012,_3P852,_4P221
		specificValues.add(_0P000());
		specificValues.add(_0P694());
		specificValues.add(_0P870());
		specificValues.add(_1P079());
		specificValues.add(_1P350());
		specificValues.add(_1P771());
		specificValues.add(_2P160());
		specificValues.add(_2P650());
		specificValues.add(_3P012());
		specificValues.add(_3P852());
		specificValues.add(_4P221());	
		//_0P692,_0P868,_1P076,_1P345,_1P761,_2P145,_2P624,_2P977,_3P787,_4P140
		specificValues.add(_0P000());
		specificValues.add(_0P692());
		specificValues.add(_0P868());
		specificValues.add(_1P076());
		specificValues.add(_1P345());
		specificValues.add(_1P761());
		specificValues.add(_2P145());
		specificValues.add(_2P624());
		specificValues.add(_2P977());
		specificValues.add(_3P787());
		specificValues.add(_4P140());
		//_0P691,_0P866,_1P074,_1P341,_1P753,_2P131,_2P602,_2P947,_3P733,_4P073
		specificValues.add(_0P000());
		specificValues.add(_0P691());
		specificValues.add(_0P866());
		specificValues.add(_1P074());
		specificValues.add(_1P341());
		specificValues.add(_1P753());
		specificValues.add(_2P131());
		specificValues.add(_2P602());
		specificValues.add(_2P947());
		specificValues.add(_3P733());
		specificValues.add(_4P073());
		//_0P690,_0P865,_1P071,_1P337,_1P746,_2P120,_2P583,_2P921,_3P686,_4P015
		specificValues.add(_0P000());
		specificValues.add(_0P690());
		specificValues.add(_0P865());
		specificValues.add(_1P071());
		specificValues.add(_1P337());
		specificValues.add(_1P746());
		specificValues.add(_2P120());
		specificValues.add(_2P583());
		specificValues.add(_2P921());
		specificValues.add(_3P686());
		specificValues.add(_4P015());
		//_0P689,_0P863,_1P069,_1P333,_1P740,_2P110,_2P567,_2P898,_3P646,_4P965
		specificValues.add(_0P000());
		specificValues.add(_0P689());
		specificValues.add(_0P863());
		specificValues.add(_1P069());
		specificValues.add(_1P333());
		specificValues.add(_1P740());
		specificValues.add(_2P110());
		specificValues.add(_2P567());
		specificValues.add(_2P898());
		specificValues.add(_3P646());
		specificValues.add(_4P965());
		//_0P688,_0P862,_1P067,_1P330,_1P734,_2P101,_2P552,_2P878,_3P610,_4P922
		specificValues.add(_0P000());
		specificValues.add(_0P688());
		specificValues.add(_0P862());
		specificValues.add(_1P067());
		specificValues.add(_1P330());
		specificValues.add(_1P734());
		specificValues.add(_2P101());
		specificValues.add(_2P552());
		specificValues.add(_2P878());
		specificValues.add(_3P610());
		specificValues.add(_4P922());
		//_0P688,_0P861,_1P066,_1P328,_1P729,_2P093,_2P539,_2P861,_3P579,_4P883
		specificValues.add(_0P000());
		specificValues.add(_0P688());
		specificValues.add(_0P861());
		specificValues.add(_1P066());
		specificValues.add(_1P328());
		specificValues.add(_1P729());
		specificValues.add(_2P093());
		specificValues.add(_2P539());
		specificValues.add(_2P861());
		specificValues.add(_3P579());
		specificValues.add(_4P883());
		//_0P687,_0P860,_1P064,_1P325,_1P725,_2P086,_2P528,_2P845,_3P552,_4P850
		specificValues.add(_0P000());
		specificValues.add(_0P687());
		specificValues.add(_0P860());
		specificValues.add(_1P064());
		specificValues.add(_1P325());
		specificValues.add(_1P725());
		specificValues.add(_2P086());
		specificValues.add(_2P528());
		specificValues.add(_2P845());
		specificValues.add(_3P552());
		specificValues.add(_4P850());
		//_0P686,_0P859,_1P063,_1P323,_1P721,_2P080,_2P518,_2P831,_3P527,_4P819
		specificValues.add(_0P000());
		specificValues.add(_0P6861());
		specificValues.add(_0P859());
		specificValues.add(_1P063());
		specificValues.add(_1P323());
		specificValues.add(_1P721());
		specificValues.add(_2P080());
		specificValues.add(_2P518());
		specificValues.add(_2P831());
		specificValues.add(_3P527());
		specificValues.add(_4P819());
		//_0P686,_0P858,_1P061,_1P321,_1P717,_2P074,_2P508,_2P819,_3P505,_4P792
		specificValues.add(_0P000());
		specificValues.add(_0P686());
		specificValues.add(_0P858());
		specificValues.add(_1P061());
		specificValues.add(_1P321());
		specificValues.add(_1P717());
		specificValues.add(_2P074());
		specificValues.add(_2P508());
		specificValues.add(_2P819());
		specificValues.add(_3P505());
		specificValues.add(_4P792());
		//_0P685,_0P858,_1P060,_1P319,_1P714,_2P069,_2P500,_2P807,_3P485,_3P768
		specificValues.add(_0P000());
		specificValues.add(_0P685());
		specificValues.add(_0P858());
		specificValues.add(_1P060());
		specificValues.add(_1P319());
		specificValues.add(_1P714());
		specificValues.add(_2P069());
		specificValues.add(_2P500());
		specificValues.add(_2P807());
		specificValues.add(_3P485());
		specificValues.add(_3P768());
		//_0P685,_0P857,_1P059,_1P318,_1P711,_2P064,_2P492,_2P797,_3P467,_3P745
		specificValues.add(_0P000());
		specificValues.add(_0P685());
		specificValues.add(_0P857());
		specificValues.add(_1P059());
		specificValues.add(_1P318());
		specificValues.add(_1P711());
		specificValues.add(_2P064());
		specificValues.add(_2P492());
		specificValues.add(_2P797());
		specificValues.add(_3P467());
		specificValues.add(_3P745());
		//_0P684,_0P856,_1P058,_1P316,_1P708,_2P060,_2P485,_2P787,_3P450,_3P725
		specificValues.add(_0P000());
		specificValues.add(_0P684());
		specificValues.add(_0P856());
		specificValues.add(_1P058());
		specificValues.add(_1P316());
		specificValues.add(_1P708());
		specificValues.add(_2P060());
		specificValues.add(_2P485());
		specificValues.add(_2P787());
		specificValues.add(_3P450());
		specificValues.add(_3P745());
		//_0P684,_0P856,_1P058,_1P315,_1P706,_2P056,_2P479,_2P771,_3P435,_3P707
		specificValues.add(_0P000());
		specificValues.add(_0P684());
		specificValues.add(_0P856());
		specificValues.add(_1P058());
		specificValues.add(_1P315());
		specificValues.add(_1P706());
		specificValues.add(_2P056());
		specificValues.add(_2P479());
		specificValues.add(_2P771());
		specificValues.add(_3P435());
		specificValues.add(_3P7071());
		//_0P684,_0P855,_1P057,_1P314,_1P703,_2P052,_2P473,_2P771,_3P421,_3P690
		specificValues.add(_0P000());
		specificValues.add(_0P684());
		specificValues.add(_0P8551());
		specificValues.add(_1P057());
		specificValues.add(_1P314());
		specificValues.add(_1P703());
		specificValues.add(_2P052());
		specificValues.add(_2P473());
		specificValues.add(_2P771());
		specificValues.add(_3P421());
		specificValues.add(_3P690());
		//_0P683,_0P855,_1P056,_1P313,_1P701,_2P048,_2P467,_2P763,_3P408,_3P674
		specificValues.add(_0P000());
		specificValues.add(_0P683());
		specificValues.add(_0P855());
		specificValues.add(_1P056());
		specificValues.add(_1P313());
		specificValues.add(_1P701());
		specificValues.add(_2P048());
		specificValues.add(_2P467());
		specificValues.add(_2P763());
		specificValues.add(_3P408());
		specificValues.add(_3P674());
		//_0P683,_0P854,_1P055,_1P311,_1P699,_2P045,_2P462,_2P756,_3P396,_3P659
		specificValues.add(_0P000());
		specificValues.add(_0P683());
		specificValues.add(_0P854());
		specificValues.add(_1P055());
		specificValues.add(_1P311());
		specificValues.add(_1P699());
		specificValues.add(_2P045());
		specificValues.add(_2P462());
		specificValues.add(_2P756());
		specificValues.add(_3P396());
		specificValues.add(_3P659());
		//_0P683,_0P854,_1P055,_1P310,_1P697,_2P042,_2P457,_2P750,_3P385,_3P646
		specificValues.add(_0P000());
		specificValues.add(_0P683());
		specificValues.add(_0P854());
		specificValues.add(_1P055());
		specificValues.add(_1P310());
		specificValues.add(_1P697());
		specificValues.add(_2P042());
		specificValues.add(_2P457());
		specificValues.add(_2P750());
		specificValues.add(_3P385());
		specificValues.add(_3P646());
		//_0P681,_0P851,_1P050,_1P303,_1P684,_2P021,_2P423,_2P704,_3P307,_3P551
		specificValues.add(_0P000());
		specificValues.add(_0P681());
		specificValues.add(_0P851());
		specificValues.add(_1P050());
		specificValues.add(_1P303());
		specificValues.add(_1P684());
		specificValues.add(_2P021());
		specificValues.add(_2P423());
		specificValues.add(_2P704());
		specificValues.add(_3P307());
		specificValues.add(_3P551());
		//_0P679,_0P848,_1P045,_1P296,_1P671,_2P000,_2P390,_2P660,_3P232,_3P460
		specificValues.add(_0P000());
		specificValues.add(_0P679());
		specificValues.add(_0P848());
		specificValues.add(_1P045());
		specificValues.add(_1P296());
		specificValues.add(_1P671());
		specificValues.add(_2P000());
		specificValues.add(_2P390());
		specificValues.add(_2P660());
		specificValues.add(_3P232());
		specificValues.add(_3P460());
		//_0P678,_0P846,_1P043,_1P292,_1P664,_1P990,_2P374,_2P639,_3P195,_3P416
		specificValues.add(_0P000());
		specificValues.add(_0P678());
		specificValues.add(_0P846());
		specificValues.add(_1P043());
		specificValues.add(_1P292());
		specificValues.add(_1P664());
		specificValues.add(_1P990());
		specificValues.add(_2P374());
		specificValues.add(_2P639());
		specificValues.add(_3P195());
		specificValues.add(_3P416());
		//_0P677,_0P845,_1P042,_1P290,_1P660,_1P984,_2P364,_2P626,_3P174,_3P390
		specificValues.add(_0P000());
		specificValues.add(_0P677());
		specificValues.add(_0P845());
		specificValues.add(_1P042());
		specificValues.add(_1P290());
		specificValues.add(_1P660());
		specificValues.add(_1P984());
		specificValues.add(_2P364());
		specificValues.add(_2P626());
		specificValues.add(_3P174());
		specificValues.add(_3P390());
		//_0P675,_0P842,_1P037,_1P282,_1P646,_1P962,_2P330,_2P581,_3P098,_3P300
		specificValues.add(_0P000());
		specificValues.add(_0P675());
		specificValues.add(_0P842());
		specificValues.add(_1P037());
		specificValues.add(_1P282());
		specificValues.add(_1P646());
		specificValues.add(_1P962());
		specificValues.add(_2P330());
		specificValues.add(_2P581());
		specificValues.add(_3P098());
		specificValues.add(_3P300());
		//_0P674,_0P842,_1P036,_1P282,_1P645,_1P960,_2P326,_2P576,_3P090,_3P291
		specificValues.add(_0P000());
		specificValues.add(_0P674());
		specificValues.add(_0P842());
		specificValues.add(_1P036());
		specificValues.add(_1P282());
		specificValues.add(_1P645());
		specificValues.add(_1P960());
		specificValues.add(_2P326());
		specificValues.add(_2P576());
		specificValues.add(_3P090());
		specificValues.add(_3P291());
		/*zeroPer,fiftyPer, sixtyPer, seventyPer, eightyPer,ninetyPer,ninetyFivePer, 
		 * ninetyEightPer, ninetyNinePer,ninetyNinePEightPer, ninetyNinePninePer;*/
		specificValues.add(zeroPer());
		specificValues.add(fiftyPer());
		specificValues.add(sixtyPer());
		specificValues.add(seventyPer());
		specificValues.add(eightyPer());
		specificValues.add(ninetyPer());
		specificValues.add(ninetyFivePer());
		specificValues.add(ninetyEightPer());
		specificValues.add(ninetyNinePer());
		specificValues.add(ninetyNinePEightPer());
		specificValues.add(ninetyNinePninePer());
		
		return specificValues;
		
	}
	/*37th row in specific values*/
	/*zeroPer,fiftyPer, sixtyPer, seventyPer, eightyPer,ninetyPer,ninetyFivePer, 
	 * ninetyEightPer, ninetyNinePer,ninetyNinePEightPer, ninetyNinePninePer;*/
	Component zeroPer()
	{
		zeroPer= new JLabel("0%",SwingConstants.CENTER);
		zeroPer.setBackground(new Color(159,226,191));
		zeroPer.setOpaque(true);
		return zeroPer;
	}
	Component fiftyPer()
	{
		fiftyPer = new JLabel("50%",SwingConstants.CENTER);
		fiftyPer.setBackground(new Color(159,226,191));
		fiftyPer.setOpaque(true);
		return fiftyPer;
	}
	Component sixtyPer()
	{
		sixtyPer = new JLabel("60%",SwingConstants.CENTER);
		sixtyPer.setBackground(new Color(159,226,191));
		sixtyPer.setOpaque(true);
		return sixtyPer;
	}
	Component seventyPer()
	{
		seventyPer = new JLabel("70%",SwingConstants.CENTER);
		seventyPer.setBackground(new Color(159,226,191));
		seventyPer.setOpaque(true);
		return seventyPer;
	}
	Component eightyPer()
	{
		eightyPer = new JLabel("80%",SwingConstants.CENTER);
		eightyPer.setBackground(new Color(159,226,191));
		eightyPer.setOpaque(true);
		return eightyPer;
	}
	Component ninetyPer()
	{
		ninetyPer = new JLabel("90%",SwingConstants.CENTER);
		ninetyPer.setBackground(new Color(159,226,191));
		ninetyPer.setOpaque(true);
		return ninetyPer;
	}
	Component ninetyFivePer()
	{
		ninetyFivePer = new JLabel("95%",SwingConstants.CENTER);
		ninetyFivePer.setBackground(new Color(159,226,191));
		ninetyFivePer.setOpaque(true);
		return ninetyFivePer;
	}
	Component ninetyEightPer()
	{
		ninetyEightPer = new JLabel("98%",SwingConstants.CENTER);
		ninetyEightPer.setBackground(new Color(159,226,191));
		ninetyEightPer.setOpaque(true);
		return ninetyEightPer;
	}
	Component ninetyNinePer()
	{
		ninetyNinePer = new JLabel("99%",SwingConstants.CENTER);
		ninetyNinePer.setBackground(new Color(159,226,191));
		ninetyNinePer.setOpaque(true);
		return ninetyNinePer;
	}
	Component ninetyNinePEightPer()
	{
		ninetyNinePEightPer = new JLabel("99.8%",SwingConstants.CENTER);
		ninetyNinePEightPer.setBackground(new Color(159,226,191));
		ninetyNinePEightPer.setOpaque(true);
		return ninetyNinePEightPer;
	}
	Component ninetyNinePninePer()
	{
		ninetyNinePninePer = new JLabel("99.9%",SwingConstants.CENTER);
		ninetyNinePninePer.setBackground(new Color(159,226,191));
		ninetyNinePninePer.setOpaque(true);
		return ninetyNinePninePer;
	}
	/*36th row in specific values*/
	//_0P674,_0P842,_1P036,_1P282,_1P645,_1P960,_2P326,_2P576,_3P090,_3P291
	Component _0P674()
	{
		_0P674= new JLabel("0.674",SwingConstants.CENTER);
		_0P674.setBackground(new Color(159,226,191));
		_0P674.setOpaque(true);
		return _0P674;
	}
	Component _0P8421()
	{
		_0P842 = new JLabel("0.842",SwingConstants.CENTER);
		_0P842.setBackground(new Color(159,226,191));
		_0P842.setOpaque(true);
		return _0P842;
	}
	Component _1P036()
	{
		_1P036 = new JLabel("1.036",SwingConstants.CENTER);
		_1P036.setBackground(new Color(159,226,191));
		_1P036.setOpaque(true);
		return _1P036;
	}
	Component _1P2821()
	{
		_1P282 = new JLabel("1.282",SwingConstants.CENTER);
		_1P282.setBackground(new Color(159,226,191));
		_1P282.setOpaque(true);
		return _1P282;
	}
	Component _1P645()
	{
		_1P645 = new JLabel("1.645",SwingConstants.CENTER);
		_1P645.setBackground(new Color(159,226,191));
		_1P645.setOpaque(true);
		return _1P645;
	}
	Component _1P960()
	{
		_1P960 = new JLabel("1.960",SwingConstants.CENTER);
		_1P960.setBackground(new Color(159,226,191));
		_1P960.setOpaque(true);
		return _1P960;
	}
	Component _2P326()
	{
		_2P326 = new JLabel("2.326",SwingConstants.CENTER);
		_2P326.setBackground(new Color(159,226,191));
		_2P326.setOpaque(true);
		return _2P326;
	}
	Component _2P576()
	{
		_2P576 = new JLabel("2.576",SwingConstants.CENTER);
		_2P576.setBackground(new Color(159,226,191));
		_2P576.setOpaque(true);
		return _2P576;
	}
	Component _3P090()
	{
		_3P090 = new JLabel("3.090",SwingConstants.CENTER);
		_3P090.setBackground(new Color(159,226,191));
		_3P090.setOpaque(true);
		return _3P090;
	}
	Component _3P291()
	{
		_3P291 = new JLabel("3.291",SwingConstants.CENTER);
		_3P291.setBackground(new Color(159,226,191));
		_3P291.setOpaque(true);
		return _3P291;
	}
	/*35th row in specific values*/
	//_0P675,_0P842,_1P037,_1P282,_1P646,_1P962,_2P330,_2P581,_3P098,_3P300
	Component _0P675()
	{
		_0P675= new JLabel("0.675",SwingConstants.CENTER);
		_0P675.setBackground(new Color(159,226,191));
		_0P675.setOpaque(true);
		return _0P675;
	}
	Component _0P842()
	{
		_0P842 = new JLabel("0.842",SwingConstants.CENTER);
		_0P842.setBackground(new Color(159,226,191));
		_0P842.setOpaque(true);
		return _0P842;
	}
	Component _1P037()
	{
		_1P037 = new JLabel("1.037",SwingConstants.CENTER);
		_1P037.setBackground(new Color(159,226,191));
		_1P037.setOpaque(true);
		return _1P037;
	}
	Component _1P282()
	{
		_1P282 = new JLabel("1.282",SwingConstants.CENTER);
		_1P282.setBackground(new Color(159,226,191));
		_1P282.setOpaque(true);
		return _1P282;
	}
	Component _1P646()
	{
		_1P646 = new JLabel("1.646",SwingConstants.CENTER);
		_1P646.setBackground(new Color(159,226,191));
		_1P646.setOpaque(true);
		return _1P646;
	}
	Component _1P962()
	{
		_1P962 = new JLabel("1.962",SwingConstants.CENTER);
		_1P962.setBackground(new Color(159,226,191));
		_1P962.setOpaque(true);
		return _1P962;
	}
	Component _2P330()
	{
		_2P330 = new JLabel("2.330",SwingConstants.CENTER);
		_2P330.setBackground(new Color(159,226,191));
		_2P330.setOpaque(true);
		return _2P330;
	}
	Component _2P581()
	{
		_2P581 = new JLabel("2.581",SwingConstants.CENTER);
		_2P581.setBackground(new Color(159,226,191));
		_2P581.setOpaque(true);
		return _2P581;
	}
	Component _3P098()
	{
		_3P098 = new JLabel("3.098",SwingConstants.CENTER);
		_3P098.setBackground(new Color(159,226,191));
		_3P098.setOpaque(true);
		return _3P098;
	}
	Component _3P300()
	{
		_3P300 = new JLabel("3.300",SwingConstants.CENTER);
		_3P300.setBackground(new Color(159,226,191));
		_3P300.setOpaque(true);
		return _3P300;
	}
	/*34th row in specific values*/
	//_0P677,_0P845,_1P042,_1P290,_1P660,_1P984,_2P364,_2P626,_3P174,_3P390
	Component _0P677()
	{
		_0P677= new JLabel("0.677",SwingConstants.CENTER);
		_0P677.setBackground(new Color(159,226,191));
		_0P677.setOpaque(true);
		return _0P677;
	}
	Component _0P845()
	{
		_0P845 = new JLabel("0.845",SwingConstants.CENTER);
		_0P845.setBackground(new Color(159,226,191));
		_0P845.setOpaque(true);
		return _0P845;
	}
	Component _1P042()
	{
		_1P042 = new JLabel("1.042",SwingConstants.CENTER);
		_1P042.setBackground(new Color(159,226,191));
		_1P042.setOpaque(true);
		return _1P042;
	}
	Component _1P290()
	{
		_1P290 = new JLabel("1.290",SwingConstants.CENTER);
		_1P290.setBackground(new Color(159,226,191));
		_1P290.setOpaque(true);
		return _1P290;
	}
	Component _1P660()
	{
		_1P660 = new JLabel("1.660",SwingConstants.CENTER);
		_1P660.setBackground(new Color(159,226,191));
		_1P660.setOpaque(true);
		return _1P660;
	}
	Component _1P984()
	{
		_1P984 = new JLabel("1.984",SwingConstants.CENTER);
		_1P984.setBackground(new Color(159,226,191));
		_1P984.setOpaque(true);
		return _1P984;
	}
	Component _2P364()
	{
		_2P364 = new JLabel("2.364",SwingConstants.CENTER);
		_2P364.setBackground(new Color(159,226,191));
		_2P364.setOpaque(true);
		return _2P364;
	}
	Component _2P626()
	{
		_2P626 = new JLabel("2.626",SwingConstants.CENTER);
		_2P626.setBackground(new Color(159,226,191));
		_2P626.setOpaque(true);
		return _2P626;
	}
	Component _3P174()
	{
		_3P174 = new JLabel("3.174",SwingConstants.CENTER);
		_3P174.setBackground(new Color(159,226,191));
		_3P174.setOpaque(true);
		return _3P174;
	}
	Component _3P390()
	{
		_3P390 = new JLabel("3.390",SwingConstants.CENTER);
		_3P390.setBackground(new Color(159,226,191));
		_3P390.setOpaque(true);
		return _3P390;
	}
	/*33th row in specific values*/
	//_0P678,_0P846,_1P043,_1P292,_1P664,_1P990,_2P374,_2P639,_3P195,_3P416
	Component _0P678()
	{
		_0P678= new JLabel("0.678",SwingConstants.CENTER);
		_0P678.setBackground(new Color(159,226,191));
		_0P678.setOpaque(true);
		return _0P678;
	}
	Component _0P846()
	{
		_0P846 = new JLabel("0.846",SwingConstants.CENTER);
		_0P846.setBackground(new Color(159,226,191));
		_0P846.setOpaque(true);
		return _0P846;
	}
	Component _1P043()
	{
		_1P055 = new JLabel("1.043",SwingConstants.CENTER);
		_1P055.setBackground(new Color(159,226,191));
		_1P055.setOpaque(true);
		return _1P055;
	}
	Component _1P292()
	{
		_1P292 = new JLabel("1.292",SwingConstants.CENTER);
		_1P292.setBackground(new Color(159,226,191));
		_1P292.setOpaque(true);
		return _1P292;
	}
	Component _1P664()
	{
		_1P664 = new JLabel("1.664",SwingConstants.CENTER);
		_1P664.setBackground(new Color(159,226,191));
		_1P664.setOpaque(true);
		return _1P664;
	}
	Component _1P990()
	{
		_1P990 = new JLabel("1.990",SwingConstants.CENTER);
		_1P990.setBackground(new Color(159,226,191));
		_1P990.setOpaque(true);
		return _1P990;
	}
	Component _2P374()
	{
		_2P374 = new JLabel("2.374",SwingConstants.CENTER);
		_2P374.setBackground(new Color(159,226,191));
		_2P374.setOpaque(true);
		return _2P374;
	}
	Component _2P639()
	{
		_2P639 = new JLabel("2.639",SwingConstants.CENTER);
		_2P639.setBackground(new Color(159,226,191));
		_2P639.setOpaque(true);
		return _2P639;
	}
	Component _3P195()
	{
		_3P195 = new JLabel("3.195",SwingConstants.CENTER);
		_3P195.setBackground(new Color(159,226,191));
		_3P195.setOpaque(true);
		return _3P195;
	}
	Component _3P416()
	{
		_3P416 = new JLabel("3.416",SwingConstants.CENTER);
		_3P416.setBackground(new Color(159,226,191));
		_3P416.setOpaque(true);
		return _3P416;
	}
	/*32th row in specific values*/
	//_0P679,_0P848,_1P045,_1P296,_1P671,_2P000,_2P390,_2P660,_3P232,_3P460
	Component _0P679()
	{
		_0P679= new JLabel("0.679",SwingConstants.CENTER);
		_0P679.setBackground(new Color(159,226,191));
		_0P679.setOpaque(true);
		return _0P679;
	}
	Component _0P848()
	{
		_0P848 = new JLabel("0.848",SwingConstants.CENTER);
		_0P848.setBackground(new Color(159,226,191));
		_0P848.setOpaque(true);
		return _0P848;
	}
	Component _1P045()
	{
		_1P055 = new JLabel("1.045",SwingConstants.CENTER);
		_1P055.setBackground(new Color(159,226,191));
		_1P055.setOpaque(true);
		return _1P055;
	}
	Component _1P296()
	{
		_1P296 = new JLabel("1.296",SwingConstants.CENTER);
		_1P296.setBackground(new Color(159,226,191));
		_1P296.setOpaque(true);
		return _1P296;
	}
	Component _1P671()
	{
		_1P671 = new JLabel("1.671",SwingConstants.CENTER);
		_1P671.setBackground(new Color(159,226,191));
		_1P671.setOpaque(true);
		return _1P671;
	}
	Component _2P000()
	{
		_2P000 = new JLabel("2.000",SwingConstants.CENTER);
		_2P000.setBackground(new Color(159,226,191));
		_2P000.setOpaque(true);
		return _2P000;
	}
	Component _2P390()
	{
		_2P390 = new JLabel("2.390",SwingConstants.CENTER);
		_2P390.setBackground(new Color(159,226,191));
		_2P390.setOpaque(true);
		return _2P390;
	}
	Component _2P660()
	{
		_2P660 = new JLabel("2.660",SwingConstants.CENTER);
		_2P660.setBackground(new Color(159,226,191));
		_2P660.setOpaque(true);
		return _2P660;
	}
	Component _3P232()
	{
		_3P232 = new JLabel("3.232",SwingConstants.CENTER);
		_3P232.setBackground(new Color(159,226,191));
		_3P232.setOpaque(true);
		return _3P232;
	}
	Component _3P460()
	{
		_3P460 = new JLabel("3.460",SwingConstants.CENTER);
		_3P460.setBackground(new Color(159,226,191));
		_3P460.setOpaque(true);
		return _3P460;
	}
	/*31th row in specific values*/
	//_0P681,_0P851,_1P050,_1P303,_1P684,_2P021,_2P423,_2P704,_3P307,_3P551
	Component _0P681()
	{
		_0P681= new JLabel("0.681",SwingConstants.CENTER);
		_0P681.setBackground(new Color(159,226,191));
		_0P681.setOpaque(true);
		return _0P681;
	}
	Component _0P851()
	{
		_0P851 = new JLabel("0.851",SwingConstants.CENTER);
		_0P851.setBackground(new Color(159,226,191));
		_0P851.setOpaque(true);
		return _0P851;
	}
	Component _1P050()
	{
		_1P055 = new JLabel("1.050",SwingConstants.CENTER);
		_1P055.setBackground(new Color(159,226,191));
		_1P055.setOpaque(true);
		return _1P055;
	}
	Component _1P303()
	{
		_1P303 = new JLabel("1.303",SwingConstants.CENTER);
		_1P303.setBackground(new Color(159,226,191));
		_1P303.setOpaque(true);
		return _1P303;
	}
	Component _1P684()
	{
		_1P684 = new JLabel("1.684",SwingConstants.CENTER);
		_1P684.setBackground(new Color(159,226,191));
		_1P684.setOpaque(true);
		return _1P684;
	}
	Component _2P021()
	{
		_2P021 = new JLabel("2.021",SwingConstants.CENTER);
		_2P021.setBackground(new Color(159,226,191));
		_2P021.setOpaque(true);
		return _2P021;
	}
	Component _2P423()
	{
		_2P423 = new JLabel("2.423",SwingConstants.CENTER);
		_2P423.setBackground(new Color(159,226,191));
		_2P423.setOpaque(true);
		return _2P423;
	}
	Component _2P704()
	{
		_2P704 = new JLabel("2.704",SwingConstants.CENTER);
		_2P704.setBackground(new Color(159,226,191));
		_2P704.setOpaque(true);
		return _2P704;
	}
	Component _3P307()
	{
		_3P307 = new JLabel("3.307",SwingConstants.CENTER);
		_3P307.setBackground(new Color(159,226,191));
		_3P307.setOpaque(true);
		return _3P307;
	}
	Component _3P551()
	{
		_3P646 = new JLabel("3.551",SwingConstants.CENTER);
		_3P646.setBackground(new Color(159,226,191));
		_3P646.setOpaque(true);
		return _3P646;
	}
	/*30th row in specific values*/
	//_0P683,_0P854,_1P055,_1P310,_1P697,_2P042,_2P457,_2P750,_3P385,_3P646
	Component _0P68311()
	{
		_0P683= new JLabel("0.683",SwingConstants.CENTER);
		_0P683.setBackground(new Color(159,226,191));
		_0P683.setOpaque(true);
		return _0P683;
	}
	Component _0P8541()
	{
		_0P854 = new JLabel("0.854",SwingConstants.CENTER);
		_0P854.setBackground(new Color(159,226,191));
		_0P854.setOpaque(true);
		return _0P854;
	}
	Component _1P0551()
	{
		_1P055 = new JLabel("1.055",SwingConstants.CENTER);
		_1P055.setBackground(new Color(159,226,191));
		_1P055.setOpaque(true);
		return _1P055;
	}
	Component _1P310()
	{
		_1P310 = new JLabel("1.310",SwingConstants.CENTER);
		_1P310.setBackground(new Color(159,226,191));
		_1P310.setOpaque(true);
		return _1P310;
	}
	Component _1P697()
	{
		_1P697 = new JLabel("1.697",SwingConstants.CENTER);
		_1P697.setBackground(new Color(159,226,191));
		_1P697.setOpaque(true);
		return _1P697;
	}
	Component _2P042()
	{
		_2P042 = new JLabel("2.042",SwingConstants.CENTER);
		_2P042.setBackground(new Color(159,226,191));
		_2P042.setOpaque(true);
		return _2P042;
	}
	Component _2P457()
	{
		_2P457 = new JLabel("2.457",SwingConstants.CENTER);
		_2P457.setBackground(new Color(159,226,191));
		_2P457.setOpaque(true);
		return _2P457;
	}
	Component _2P750()
	{
		_2P750 = new JLabel("2.750",SwingConstants.CENTER);
		_2P750.setBackground(new Color(159,226,191));
		_2P750.setOpaque(true);
		return _2P750;
	}
	Component _3P385()
	{
		_3P385 = new JLabel("3.385",SwingConstants.CENTER);
		_3P385.setBackground(new Color(159,226,191));
		_3P385.setOpaque(true);
		return _3P385;
	}
	Component _3P6461()
	{
		_3P646 = new JLabel("3.646",SwingConstants.CENTER);
		_3P646.setBackground(new Color(159,226,191));
		_3P646.setOpaque(true);
		return _3P646;
	}
	/*29th row in specific values*/
	//_0P683,_0P854,_1P055,_1P311,_1P699,_2P045,_2P462,_2P756,_3P396,_3P659
	Component _0P6833()
	{
		_0P683= new JLabel("0.683",SwingConstants.CENTER);
		_0P683.setBackground(new Color(159,226,191));
		_0P683.setOpaque(true);
		return _0P683;
	}
	Component _0P854()
	{
		_0P854 = new JLabel("0.854",SwingConstants.CENTER);
		_0P854.setBackground(new Color(159,226,191));
		_0P854.setOpaque(true);
		return _0P854;
	}
	Component _1P055()
	{
		_1P055 = new JLabel("1.055",SwingConstants.CENTER);
		_1P055.setBackground(new Color(159,226,191));
		_1P055.setOpaque(true);
		return _1P055;
	}
	Component _1P311()
	{
		_1P311 = new JLabel("1.311",SwingConstants.CENTER);
		_1P311.setBackground(new Color(159,226,191));
		_1P311.setOpaque(true);
		return _1P311;
	}
	Component _1P699()
	{
		_1P699 = new JLabel("1.699",SwingConstants.CENTER);
		_1P699.setBackground(new Color(159,226,191));
		_1P699.setOpaque(true);
		return _1P699;
	}
	Component _2P045()
	{
		_2P045 = new JLabel("2.045",SwingConstants.CENTER);
		_2P045.setBackground(new Color(159,226,191));
		_2P045.setOpaque(true);
		return _2P045;
	}
	Component _2P462()
	{
		_2P462 = new JLabel("2.462",SwingConstants.CENTER);
		_2P462.setBackground(new Color(159,226,191));
		_2P462.setOpaque(true);
		return _2P462;
	}
	Component _2P756()
	{
		_2P756 = new JLabel("2.756",SwingConstants.CENTER);
		_2P756.setBackground(new Color(159,226,191));
		_2P756.setOpaque(true);
		return _2P756;
	}
	Component _3P396()
	{
		_3P396 = new JLabel("3.396",SwingConstants.CENTER);
		_3P396.setBackground(new Color(159,226,191));
		_3P396.setOpaque(true);
		return _3P396;
	}
	Component _3P659()
	{
		_3P659 = new JLabel("3.659",SwingConstants.CENTER);
		_3P659.setBackground(new Color(159,226,191));
		_3P659.setOpaque(true);
		return _3P659;
	}
	/*28th row in specific values*/
	//_0P683,_0P855,_1P056,_1P313,_1P701,_2P048,_2P467,_2P763,_3P408,_3P674
	Component _0P683()
	{
		_0P683= new JLabel("0.683",SwingConstants.CENTER);
		_0P683.setBackground(new Color(159,226,191));
		_0P683.setOpaque(true);
		return _0P683;
	}
	Component _0P8551()
	{
		_0P855 = new JLabel("0.855",SwingConstants.CENTER);
		_0P855.setBackground(new Color(159,226,191));
		_0P855.setOpaque(true);
		return _0P855;
	}
	Component _1P056()
	{
		_1P056 = new JLabel("1.056",SwingConstants.CENTER);
		_1P056.setBackground(new Color(159,226,191));
		_1P056.setOpaque(true);
		return _1P056;
	}
	Component _1P313()
	{
		_1P313 = new JLabel("1.313",SwingConstants.CENTER);
		_1P313.setBackground(new Color(159,226,191));
		_1P313.setOpaque(true);
		return _1P313;
	}
	Component _1P701()
	{
		_1P701 = new JLabel("1.701",SwingConstants.CENTER);
		_1P701.setBackground(new Color(159,226,191));
		_1P701.setOpaque(true);
		return _1P701;
	}
	Component _2P048()
	{
		_2P048 = new JLabel("2.048",SwingConstants.CENTER);
		_2P048.setBackground(new Color(159,226,191));
		_2P048.setOpaque(true);
		return _2P048;
	}
	Component _2P467()
	{
		_2P467 = new JLabel("2.467",SwingConstants.CENTER);
		_2P467.setBackground(new Color(159,226,191));
		_2P467.setOpaque(true);
		return _2P467;
	}
	Component _2P763()
	{
		_2P763 = new JLabel("2.763",SwingConstants.CENTER);
		_2P763.setBackground(new Color(159,226,191));
		_2P763.setOpaque(true);
		return _2P763;
	}
	Component _3P408()
	{
		_3P408 = new JLabel("3.408",SwingConstants.CENTER);
		_3P408.setBackground(new Color(159,226,191));
		_3P408.setOpaque(true);
		return _3P408;
	}
	Component _3P674()
	{
		_3P674 = new JLabel("3.674",SwingConstants.CENTER);
		_3P674.setBackground(new Color(159,226,191));
		_3P674.setOpaque(true);
		return _3P674;
	}
	/*27th row in specific values*/
	//_0P684,_0P855,_1P057,_1P314,_1P703,_2P052,_2P473,_2P771,_3P421,_3P690
	Component _0P68411()
	{
		_0P684= new JLabel("0.684",SwingConstants.CENTER);
		_0P684.setBackground(new Color(159,226,191));
		_0P684.setOpaque(true);
		return _0P684;
	}
	Component _0P855()
	{
		_0P855 = new JLabel("0.855",SwingConstants.CENTER);
		_0P855.setBackground(new Color(159,226,191));
		_0P855.setOpaque(true);
		return _0P855;
	}
	Component _1P057()
	{
		_1P057 = new JLabel("1.057",SwingConstants.CENTER);
		_1P057.setBackground(new Color(159,226,191));
		_1P057.setOpaque(true);
		return _1P057;
	}
	Component _1P314()
	{
		_1P314 = new JLabel("1.314",SwingConstants.CENTER);
		_1P314.setBackground(new Color(159,226,191));
		_1P314.setOpaque(true);
		return _1P314;
	}
	Component _1P703()
	{
		_1P703 = new JLabel("1.703",SwingConstants.CENTER);
		_1P703.setBackground(new Color(159,226,191));
		_1P703.setOpaque(true);
		return _1P703;
	}
	Component _2P052()
	{
		_2P052 = new JLabel("2.052",SwingConstants.CENTER);
		_2P052.setBackground(new Color(159,226,191));
		_2P052.setOpaque(true);
		return _2P052;
	}
	Component _2P473()
	{
		_2P473 = new JLabel("2.473",SwingConstants.CENTER);
		_2P473.setBackground(new Color(159,226,191));
		_2P473.setOpaque(true);
		return _2P473;
	}
	Component _2P771()
	{
		_2P771 = new JLabel("2.771",SwingConstants.CENTER);
		_2P771.setBackground(new Color(159,226,191));
		_2P771.setOpaque(true);
		return _2P771;
	}
	Component _3P421()
	{
		_3P421 = new JLabel("3.421",SwingConstants.CENTER);
		_3P421.setBackground(new Color(159,226,191));
		_3P421.setOpaque(true);
		return _3P421;
	}
	Component _3P690()
	{
		_3P690 = new JLabel("3.690",SwingConstants.CENTER);
		_3P690.setBackground(new Color(159,226,191));
		_3P690.setOpaque(true);
		return _3P690;
	}
	/*26th row in specific values*/
	//_0P684,_0P856,_1P058,_1P315,_1P706,_2P056,_2P479,_2P771,_3P435,_3P707
	Component _0P6841()
	{
		_0P684= new JLabel("0.684",SwingConstants.CENTER);
		_0P684.setBackground(new Color(159,226,191));
		_0P684.setOpaque(true);
		return _0P684;
	}
	Component _0P8561()
	{
		_0P856 = new JLabel("0.856",SwingConstants.CENTER);
		_0P856.setBackground(new Color(159,226,191));
		_0P856.setOpaque(true);
		return _0P856;
	}
	Component _1P0581()
	{
		_1P058 = new JLabel("1.058",SwingConstants.CENTER);
		_1P058.setBackground(new Color(159,226,191));
		_1P058.setOpaque(true);
		return _1P058;
	}
	Component _1P315()
	{
		_1P315 = new JLabel("1.315",SwingConstants.CENTER);
		_1P315.setBackground(new Color(159,226,191));
		_1P315.setOpaque(true);
		return _1P315;
	}
	Component _1P706()
	{
		_1P706 = new JLabel("1.706",SwingConstants.CENTER);
		_1P706.setBackground(new Color(159,226,191));
		_1P706.setOpaque(true);
		return _1P706;
	}
	Component _2P056()
	{
		_2P056 = new JLabel("2.056",SwingConstants.CENTER);
		_2P056.setBackground(new Color(159,226,191));
		_2P056.setOpaque(true);
		return _2P056;
	}
	Component _2P479()
	{
		_2P479 = new JLabel("2.479",SwingConstants.CENTER);
		_2P479.setBackground(new Color(159,226,191));
		_2P479.setOpaque(true);
		return _2P479;
	}
	Component _2P779()
	{
		_2P779 = new JLabel("2.779",SwingConstants.CENTER);
		_2P779.setBackground(new Color(159,226,191));
		_2P779.setOpaque(true);
		return _2P779;
	}
	Component _3P435()
	{
		_3P435 = new JLabel("3.435",SwingConstants.CENTER);
		_3P435.setBackground(new Color(159,226,191));
		_3P435.setOpaque(true);
		return _3P435;
	}
	Component _3P7071()
	{
		_3P707 = new JLabel("3.707",SwingConstants.CENTER);
		_3P707.setBackground(new Color(159,226,191));
		_3P707.setOpaque(true);
		return _3P707;
	}
	/*25th row in specific values*/	
	//_0P684,_0P856,_1P058,_1P316,_1P708,_2P060,_2P485,_2P787,_3P450,_3P725
	Component _0P684()
	{
		_0P684= new JLabel("0.684",SwingConstants.CENTER);
		_0P684.setBackground(new Color(159,226,191));
		_0P684.setOpaque(true);
		return _0P684;
	}
	Component _0P856()
	{
		_0P856 = new JLabel("0.856",SwingConstants.CENTER);
		_0P856.setBackground(new Color(159,226,191));
		_0P856.setOpaque(true);
		return _0P856;
	}
	Component _1P058()
	{
		_1P058 = new JLabel("1.058",SwingConstants.CENTER);
		_1P058.setBackground(new Color(159,226,191));
		_1P058.setOpaque(true);
		return _1P058;
	}
	Component _1P316()
	{
		_1P316 = new JLabel("1.316",SwingConstants.CENTER);
		_1P316.setBackground(new Color(159,226,191));
		_1P316.setOpaque(true);
		return _1P316;
	}
	Component _1P708()
	{
		_1P708 = new JLabel("1.708",SwingConstants.CENTER);
		_1P708.setBackground(new Color(159,226,191));
		_1P708.setOpaque(true);
		return _1P708;
	}
	Component _2P060()
	{
		_2P060 = new JLabel("2.060",SwingConstants.CENTER);
		_2P060.setBackground(new Color(159,226,191));
		_2P060.setOpaque(true);
		return _2P060;
	}
	Component _2P485()
	{
		_2P485 = new JLabel("2.485",SwingConstants.CENTER);
		_2P485.setBackground(new Color(159,226,191));
		_2P485.setOpaque(true);
		return _2P485;
	}
	Component _2P787()
	{
		_2P787 = new JLabel("2.797",SwingConstants.CENTER);
		_2P787.setBackground(new Color(159,226,191));
		_2P787.setOpaque(true);
		return _2P787;
	}
	Component _3P450()
	{
		_3P450 = new JLabel("3.450",SwingConstants.CENTER);
		_3P450.setBackground(new Color(159,226,191));
		_3P450.setOpaque(true);
		return _3P450;
	}
	Component _3P725()
	{
		_3P725 = new JLabel("3.725",SwingConstants.CENTER);
		_3P725.setBackground(new Color(159,226,191));
		_3P725.setOpaque(true);
		return _3P725;
	}
	/*24th row in specific values*/
	//_0P685,_0P857,_1P059,_1P318,_1P711,_2P064,_2P492,_2P797,_3P467,_3P745
	Component _0P6851()
	{
		_0P685= new JLabel("0.685",SwingConstants.CENTER);
		_0P685.setBackground(new Color(159,226,191));
		_0P685.setOpaque(true);
		return _0P685;
	}
	Component _0P857()
	{
		_0P857 = new JLabel("0.857",SwingConstants.CENTER);
		_0P857.setBackground(new Color(159,226,191));
		_0P857.setOpaque(true);
		return _0P857;
	}
	Component _1P059()
	{
		_1P059 = new JLabel("1.059",SwingConstants.CENTER);
		_1P059.setBackground(new Color(159,226,191));
		_1P059.setOpaque(true);
		return _1P059;
	}
	Component _1P318()
	{
		_1P318 = new JLabel("1.318",SwingConstants.CENTER);
		_1P318.setBackground(new Color(159,226,191));
		_1P318.setOpaque(true);
		return _1P318;
	}
	Component _1P711()
	{
		_1P711 = new JLabel("1.711",SwingConstants.CENTER);
		_1P711.setBackground(new Color(159,226,191));
		_1P711.setOpaque(true);
		return _1P711;
	}
	Component _2P064()
	{
		_2P064 = new JLabel("2.064",SwingConstants.CENTER);
		_2P064.setBackground(new Color(159,226,191));
		_2P064.setOpaque(true);
		return _2P064;
	}
	Component _2P492()
	{
		_2P492 = new JLabel("2.492",SwingConstants.CENTER);
		_2P492.setBackground(new Color(159,226,191));
		_2P492.setOpaque(true);
		return _2P492;
	}
	Component _2P797()
	{
		_2P797 = new JLabel("2.797",SwingConstants.CENTER);
		_2P797.setBackground(new Color(159,226,191));
		_2P797.setOpaque(true);
		return _2P797;
	}
	Component _3P467()
	{
		_3P467 = new JLabel("3.467",SwingConstants.CENTER);
		_3P467.setBackground(new Color(159,226,191));
		_3P467.setOpaque(true);
		return _3P467;
	}
	Component _3P745()
	{
		_3P745 = new JLabel("4.745",SwingConstants.CENTER);
		_3P745.setBackground(new Color(159,226,191));
		_3P745.setOpaque(true);
		return _3P745;
	}
	/*23th row in specific values*/
	//_0P685,_0P858,_1P060,_1P319,_1P714,_2P069,_2P500,_2P807,_3P485,_3P768
	Component _0P685()
	{
		_0P688= new JLabel("0.685",SwingConstants.CENTER);
		_0P688.setBackground(new Color(159,226,191));
		_0P688.setOpaque(true);
		return _0P688;
	}
	Component _0P8581()
	{
		_0P858 = new JLabel("0.858",SwingConstants.CENTER);
		_0P858.setBackground(new Color(159,226,191));
		_0P858.setOpaque(true);
		return _0P858;
	}
	Component _1P060()
	{
		_1P061 = new JLabel("1.060",SwingConstants.CENTER);
		_1P061.setBackground(new Color(159,226,191));
		_1P061.setOpaque(true);
		return _1P061;
	}
	Component _1P319()
	{
		_1P319 = new JLabel("1.319",SwingConstants.CENTER);
		_1P319.setBackground(new Color(159,226,191));
		_1P319.setOpaque(true);
		return _1P319;
	}
	Component _1P714()
	{
		_1P714 = new JLabel("1.714",SwingConstants.CENTER);
		_1P714.setBackground(new Color(159,226,191));
		_1P714.setOpaque(true);
		return _1P714;
	}
	Component _2P069()
	{
		_2P069 = new JLabel("2.069",SwingConstants.CENTER);
		_2P069.setBackground(new Color(159,226,191));
		_2P069.setOpaque(true);
		return _2P069;
	}
	Component _2P500()
	{
		_2P500 = new JLabel("2.500",SwingConstants.CENTER);
		_2P500.setBackground(new Color(159,226,191));
		_2P500.setOpaque(true);
		return _2P500;
	}
	Component _2P807()
	{
		_2P807 = new JLabel("2.819",SwingConstants.CENTER);
		_2P807.setBackground(new Color(159,226,191));
		_2P807.setOpaque(true);
		return _2P807;
	}
	Component _3P485()
	{
		_3P485 = new JLabel("3.485",SwingConstants.CENTER);
		_3P485.setBackground(new Color(159,226,191));
		_3P485.setOpaque(true);
		return _3P485;
	}
	Component _3P768()
	{
		_3P768 = new JLabel("4.768",SwingConstants.CENTER);
		_3P768.setBackground(new Color(159,226,191));
		_3P768.setOpaque(true);
		return _3P768;
	}
	/*22th row in specific values*/
	//_0P686,_0P858,_1P061,_1P321,_1P717,_2P074,_2P508,_2P819,_3P505,_4P792
	Component _0P6861()
	{
		_0P688= new JLabel("0.686",SwingConstants.CENTER);
		_0P688.setBackground(new Color(159,226,191));
		_0P688.setOpaque(true);
		return _0P688;
	}
	Component _0P858()
	{
		_0P858 = new JLabel("0.858",SwingConstants.CENTER);
		_0P858.setBackground(new Color(159,226,191));
		_0P858.setOpaque(true);
		return _0P858;
	}
	Component _1P0611()
	{
		_1P061 = new JLabel("1.061",SwingConstants.CENTER);
		_1P061.setBackground(new Color(159,226,191));
		_1P061.setOpaque(true);
		return _1P061;
	}
	Component _1P321()
	{
		_1P321 = new JLabel("1.321",SwingConstants.CENTER);
		_1P321.setBackground(new Color(159,226,191));
		_1P321.setOpaque(true);
		return _1P321;
	}
	Component _1P717()
	{
		_1P717 = new JLabel("1.717",SwingConstants.CENTER);
		_1P717.setBackground(new Color(159,226,191));
		_1P717.setOpaque(true);
		return _1P717;
	}
	Component _2P074()
	{
		_2P074 = new JLabel("2.074",SwingConstants.CENTER);
		_2P074.setBackground(new Color(159,226,191));
		_2P074.setOpaque(true);
		return _2P074;
	}
	Component _2P508()
	{
		_2P508 = new JLabel("2.508",SwingConstants.CENTER);
		_2P508.setBackground(new Color(159,226,191));
		_2P508.setOpaque(true);
		return _2P508;
	}
	Component _2P819()
	{
		_2P819 = new JLabel("2.819",SwingConstants.CENTER);
		_2P819.setBackground(new Color(159,226,191));
		_2P819.setOpaque(true);
		return _2P819;
	}
	Component _3P505()
	{
		_3P505 = new JLabel("3.505",SwingConstants.CENTER);
		_3P505.setBackground(new Color(159,226,191));
		_3P505.setOpaque(true);
		return _3P505;
	}
	Component _4P792()
	{
		_4P792 = new JLabel("4.792",SwingConstants.CENTER);
		_4P792.setBackground(new Color(159,226,191));
		_4P792.setOpaque(true);
		return _4P792;
	}
	/*21th row in specific values*/
	//_0P686,_0P859,_1P063,_1P323,_1P721,_2P080,_2P518,_2P831,_3P527,_4P819
	Component _0P686()
	{
		_0P688= new JLabel("0.686",SwingConstants.CENTER);
		_0P688.setBackground(new Color(159,226,191));
		_0P688.setOpaque(true);
		return _0P688;
	}
	Component _0P859()
	{
		_0P859 = new JLabel("0.859",SwingConstants.CENTER);
		_0P859.setBackground(new Color(159,226,191));
		_0P859.setOpaque(true);
		return _0P859;
	}
	Component _1P063()
	{
		_1P063 = new JLabel("1.063",SwingConstants.CENTER);
		_1P063.setBackground(new Color(159,226,191));
		_1P063.setOpaque(true);
		return _1P063;
	}
	Component _1P323()
	{
		_1P323 = new JLabel("1.323",SwingConstants.CENTER);
		_1P323.setBackground(new Color(159,226,191));
		_1P323.setOpaque(true);
		return _1P323;
	}
	Component _1P721()
	{
		_1P721 = new JLabel("1.721",SwingConstants.CENTER);
		_1P721.setBackground(new Color(159,226,191));
		_1P721.setOpaque(true);
		return _1P721;
	}
	Component _2P080()
	{
		_2P080 = new JLabel("2.080",SwingConstants.CENTER);
		_2P080.setBackground(new Color(159,226,191));
		_2P080.setOpaque(true);
		return _2P080;
	}
	Component _2P518()
	{
		_2P518 = new JLabel("2.518",SwingConstants.CENTER);
		_2P518.setBackground(new Color(159,226,191));
		_2P518.setOpaque(true);
		return _2P518;
	}
	Component _2P831()
	{
		_2P831 = new JLabel("2.831",SwingConstants.CENTER);
		_2P831.setBackground(new Color(159,226,191));
		_2P831.setOpaque(true);
		return _2P831;
	}
	Component _3P527()
	{
		_3P527 = new JLabel("3.527",SwingConstants.CENTER);
		_3P527.setBackground(new Color(159,226,191));
		_3P527.setOpaque(true);
		return _3P527;
	}
	Component _4P819()
	{
		_4P819 = new JLabel("4.819",SwingConstants.CENTER);
		_4P819.setBackground(new Color(159,226,191));
		_4P819.setOpaque(true);
		return _4P819;
	}
	/*20th row in specific values*/
	//_0P687,_0P860,_1P064,_1P325,_1P725,_2P086,_2P528,_2P845,_3P552,_4P850
	Component _0P687()
	{
		_0P687= new JLabel("0.687",SwingConstants.CENTER);
		_0P687.setBackground(new Color(159,226,191));
		_0P687.setOpaque(true);
		return _0P687;
	}
	Component _0P860()
	{
		_0P860 = new JLabel("0.860",SwingConstants.CENTER);
		_0P860.setBackground(new Color(159,226,191));
		_0P860.setOpaque(true);
		return _0P860;
	}
	Component _1P064()
	{
		_1P064 = new JLabel("1.064",SwingConstants.CENTER);
		_1P064.setBackground(new Color(159,226,191));
		_1P064.setOpaque(true);
		return _1P064;
	}
	Component _1P325()
	{
		_1P325 = new JLabel("1.325",SwingConstants.CENTER);
		_1P325.setBackground(new Color(159,226,191));
		_1P325.setOpaque(true);
		return _1P325;
	}
	Component _1P725()
	{
		_1P725 = new JLabel("1.725",SwingConstants.CENTER);
		_1P725.setBackground(new Color(159,226,191));
		_1P725.setOpaque(true);
		return _1P725;
	}
	Component _2P086()
	{
		_2P086 = new JLabel("2.086",SwingConstants.CENTER);
		_2P086.setBackground(new Color(159,226,191));
		_2P086.setOpaque(true);
		return _2P086;
	}
	Component _2P528()
	{
		_2P528 = new JLabel("2.528",SwingConstants.CENTER);
		_2P528.setBackground(new Color(159,226,191));
		_2P528.setOpaque(true);
		return _2P528;
	}
	Component _2P845()
	{
		_2P845 = new JLabel("2.845",SwingConstants.CENTER);
		_2P845.setBackground(new Color(159,226,191));
		_2P845.setOpaque(true);
		return _2P845;
	}
	Component _3P552()
	{
		_3P552 = new JLabel("3.552",SwingConstants.CENTER);
		_3P552.setBackground(new Color(159,226,191));
		_3P552.setOpaque(true);
		return _3P552;
	}
	Component _4P850()
	{
		_4P850 = new JLabel("4.850",SwingConstants.CENTER);
		_4P850.setBackground(new Color(159,226,191));
		_4P850.setOpaque(true);
		return _4P850;
	}
	/*19th row in specific values*/
	//_0P688,_0P861,_1P066,_1P328,_1P729,_2P093,_2P539,_2P861,_3P579,_4P883
	Component _0P6881()
	{
		_0P6881= new JLabel("0.681",SwingConstants.CENTER);
		_0P6881.setBackground(new Color(159,226,191));
		_0P6881.setOpaque(true);
		return _0P6881;
	}
	Component _0P861()
	{
		_0P861 = new JLabel("0.861",SwingConstants.CENTER);
		_0P861.setBackground(new Color(159,226,191));
		_0P861.setOpaque(true);
		return _0P861;
	}
	Component _1P066()
	{
		_1P066 = new JLabel("1.066",SwingConstants.CENTER);
		_1P066.setBackground(new Color(159,226,191));
		_1P066.setOpaque(true);
		return _1P066;
	}
	Component _1P328()
	{
		_1P328 = new JLabel("1.330",SwingConstants.CENTER);
		_1P328.setBackground(new Color(159,226,191));
		_1P328.setOpaque(true);
		return _1P328;
	}
	Component _1P729()
	{
		_1P729 = new JLabel("1.729",SwingConstants.CENTER);
		_1P729.setBackground(new Color(159,226,191));
		_1P729.setOpaque(true);
		return _1P729;
	}
	Component _2P093()
	{
		_2P093 = new JLabel("2.093",SwingConstants.CENTER);
		_2P093.setBackground(new Color(159,226,191));
		_2P093.setOpaque(true);
		return _2P093;
	}
	Component _2P539()
	{
		_2P539 = new JLabel("2.539",SwingConstants.CENTER);
		_2P539.setBackground(new Color(159,226,191));
		_2P539.setOpaque(true);
		return _2P539;
	}
	Component _2P861()
	{
		_2P861 = new JLabel("2.861",SwingConstants.CENTER);
		_2P861.setBackground(new Color(159,226,191));
		_2P861.setOpaque(true);
		return _2P861;
	}
	Component _3P579()
	{
		_3P579 = new JLabel("3.579",SwingConstants.CENTER);
		_3P579.setBackground(new Color(159,226,191));
		_3P579.setOpaque(true);
		return _3P579;
	}
	Component _4P883()
	{
		_4P883 = new JLabel("4.922",SwingConstants.CENTER);
		_4P883.setBackground(new Color(159,226,191));
		_4P883.setOpaque(true);
		return _4P883;
	}
	/*18th row in specific values*/
	//_0P688,_0P862,_1P067,_1P330,_1P734,_2P101,_2P552,_2P878,_3P610,_4P922
	Component _0P688()
	{
		_0P688= new JLabel("0.688",SwingConstants.CENTER);
		_0P688.setBackground(new Color(159,226,191));
		_0P688.setOpaque(true);
		return _0P688;
	}
	Component _0P862()
	{
		_0P862 = new JLabel("0.862",SwingConstants.CENTER);
		_0P862.setBackground(new Color(159,226,191));
		_0P862.setOpaque(true);
		return _0P862;
	}
	Component _1P067()
	{
		_1P067 = new JLabel("1.067",SwingConstants.CENTER);
		_1P067.setBackground(new Color(159,226,191));
		_1P067.setOpaque(true);
		return _1P067;
	}
	Component _1P330()
	{
		_1P330 = new JLabel("1.330",SwingConstants.CENTER);
		_1P330.setBackground(new Color(159,226,191));
		_1P330.setOpaque(true);
		return _1P330;
	}
	Component _1P734()
	{
		_1P734 = new JLabel("1.734",SwingConstants.CENTER);
		_1P734.setBackground(new Color(159,226,191));
		_1P734.setOpaque(true);
		return _1P734;
	}
	Component _2P101()
	{
		_2P101 = new JLabel("2.101",SwingConstants.CENTER);
		_2P101.setBackground(new Color(159,226,191));
		_2P101.setOpaque(true);
		return _2P101;
	}
	Component _2P552()
	{
		_2P552 = new JLabel("2.552",SwingConstants.CENTER);
		_2P552.setBackground(new Color(159,226,191));
		_2P552.setOpaque(true);
		return _2P552;
	}
	Component _2P878()
	{
		_2P878 = new JLabel("2.878",SwingConstants.CENTER);
		_2P878.setBackground(new Color(159,226,191));
		_2P878.setOpaque(true);
		return _2P878;
	}
	Component _3P610()
	{
		_3P610 = new JLabel("3.610",SwingConstants.CENTER);
		_3P610.setBackground(new Color(159,226,191));
		_3P610.setOpaque(true);
		return _3P610;
	}
	Component _4P922()
	{
		_4P922 = new JLabel("4.922",SwingConstants.CENTER);
		_4P922.setBackground(new Color(159,226,191));
		_4P922.setOpaque(true);
		return _4P922;
	}
	/*17th row in specific values*/
	//_0P689,_0P863,_1P069,_1P333,_1P740,_2P110,_2P567,_2P898,_3P646,_4P965
	Component _0P689()
	{
		_0P689= new JLabel("0.689",SwingConstants.CENTER);
		_0P689.setBackground(new Color(159,226,191));
		_0P689.setOpaque(true);
		return _0P689;
	}
	Component _0P863()
	{
		_0P863 = new JLabel("0.863",SwingConstants.CENTER);
		_0P863.setBackground(new Color(159,226,191));
		_0P863.setOpaque(true);
		return _0P863;
	}
	Component _1P069()
	{
		_1P069 = new JLabel("1.069",SwingConstants.CENTER);
		_1P069.setBackground(new Color(159,226,191));
		_1P069.setOpaque(true);
		return _1P069;
	}
	Component _1P333()
	{
		_1P333 = new JLabel("1.333",SwingConstants.CENTER);
		_1P333.setBackground(new Color(159,226,191));
		_1P333.setOpaque(true);
		return _1P333;
	}
	Component _1P740()
	{
		_1P740 = new JLabel("1.740",SwingConstants.CENTER);
		_1P740.setBackground(new Color(159,226,191));
		_1P740.setOpaque(true);
		return _1P740;
	}
	Component _2P110()
	{
		_2P110 = new JLabel("2.110",SwingConstants.CENTER);
		_2P110.setBackground(new Color(159,226,191));
		_2P110.setOpaque(true);
		return _2P110;
	}
	Component _2P567()
	{
		_2P567 = new JLabel("2.567",SwingConstants.CENTER);
		_2P567.setBackground(new Color(159,226,191));
		_2P567.setOpaque(true);
		return _2P567;
	}
	Component _2P898()
	{
		_2P898 = new JLabel("2.898",SwingConstants.CENTER);
		_2P898.setBackground(new Color(159,226,191));
		_2P898.setOpaque(true);
		return _2P898;
	}
	Component _3P646()
	{
		_3P646 = new JLabel("3.646",SwingConstants.CENTER);
		_3P646.setBackground(new Color(159,226,191));
		_3P646.setOpaque(true);
		return _3P646;
	}
	Component _4P965()
	{
		_4P965 = new JLabel("4.965",SwingConstants.CENTER);
		_4P965.setBackground(new Color(159,226,191));
		_4P965.setOpaque(true);
		return _4P965;
	}
	/*16th row in specific values*/
	//_0P690,_0P865,_1P071,_1P337,_1P746,_2P120,_2P583,_2P921,_3P686,_4P015
	Component _0P690()
	{
		_0P690 = new JLabel("0.691",SwingConstants.CENTER);
		_0P690.setBackground(new Color(159,226,191));
		_0P690.setOpaque(true);
		return _0P690;
	}
	Component _0P865()
	{
		_0P868 = new JLabel("0.865",SwingConstants.CENTER);
		_0P868.setBackground(new Color(159,226,191));
		_0P868.setOpaque(true);
		return _0P868;
	}
	Component _1P071()
	{
		_1P076 = new JLabel("1.074",SwingConstants.CENTER);
		_1P076.setBackground(new Color(159,226,191));
		_1P076.setOpaque(true);
		return _1P076;
	}
	Component _1P337()
	{
		_1P337 = new JLabel("1.337",SwingConstants.CENTER);
		_1P337.setBackground(new Color(159,226,191));
		_1P337.setOpaque(true);
		return _1P337;
	}
	Component _1P746()
	{
		_1P746 = new JLabel("1.746",SwingConstants.CENTER);
		_1P746.setBackground(new Color(159,226,191));
		_1P746.setOpaque(true);
		return _1P746;
	}
	Component _2P120()
	{
		_2P120 = new JLabel("2.120",SwingConstants.CENTER);
		_2P120.setBackground(new Color(159,226,191));
		_2P120.setOpaque(true);
		return _2P120;
	}
	Component _2P583()
	{
		_2P583 = new JLabel("2.602",SwingConstants.CENTER);
		_2P583.setBackground(new Color(159,226,191));
		_2P583.setOpaque(true);
		return _2P583;
	}
	Component _2P921()
	{
		_2P921 = new JLabel("2.921",SwingConstants.CENTER);
		_2P921.setBackground(new Color(159,226,191));
		_2P921.setOpaque(true);
		return _2P921;
	}
	Component _3P686()
	{
		_3P686 = new JLabel("3.686",SwingConstants.CENTER);
		_3P686.setBackground(new Color(159,226,191));
		_3P686.setOpaque(true);
		return _3P686;
	}
	Component _4P015()
	{
		_4P015 = new JLabel("4.015",SwingConstants.CENTER);
		_4P015.setBackground(new Color(159,226,191));
		_4P015.setOpaque(true);
		return _4P015;
	}
	/*15th row in specific values*/
	//_0P691,_0P866,_1P074,_1P341,_1P753,_2P131,_2P602,_2P947,_3P733,_4P073
	Component _0P691()
	{
		_0P691 = new JLabel("0.691",SwingConstants.CENTER);
		_0P691.setBackground(new Color(159,226,191));
		_0P691.setOpaque(true);
		return _0P691;
	}
	Component _0P866()
	{
		_0P866 = new JLabel("0.866",SwingConstants.CENTER);
		_0P866.setBackground(new Color(159,226,191));
		_0P866.setOpaque(true);
		return _0P866;
	}
	Component _1P074()
	{
		_1P074 = new JLabel("1.074",SwingConstants.CENTER);
		_1P074.setBackground(new Color(159,226,191));
		_1P074.setOpaque(true);
		return _1P074;
	}
	Component _1P341()
	{
		_1P341 = new JLabel("1.345",SwingConstants.CENTER);
		_1P341.setBackground(new Color(159,226,191));
		_1P341.setOpaque(true);
		return _1P341;
	}
	Component _1P753()
	{
		_1P753 = new JLabel("1.753",SwingConstants.CENTER);
		_1P753.setBackground(new Color(159,226,191));
		_1P753.setOpaque(true);
		return _1P753;
	}
	Component _2P131()
	{
		_2P131 = new JLabel("2.131",SwingConstants.CENTER);
		_2P131.setBackground(new Color(159,226,191));
		_2P131.setOpaque(true);
		return _2P131;
	}
	Component _2P602()
	{
		_2P602 = new JLabel("2.602",SwingConstants.CENTER);
		_2P602.setBackground(new Color(159,226,191));
		_2P602.setOpaque(true);
		return _2P602;
	}
	Component _2P947()
	{
		_2P947 = new JLabel("2.947",SwingConstants.CENTER);
		_2P947.setBackground(new Color(159,226,191));
		_2P947.setOpaque(true);
		return _2P947;
	}
	Component _3P733()
	{
		_3P733 = new JLabel("3.733",SwingConstants.CENTER);
		_3P733.setBackground(new Color(159,226,191));
		_3P733.setOpaque(true);
		return _3P733;
	}
	Component _4P073()
	{
		_4P073 = new JLabel("4.073",SwingConstants.CENTER);
		_4P073.setBackground(new Color(159,226,191));
		_4P073.setOpaque(true);
		return _4P073;
	}
	/*14th row in specific values*/
	//_0P692,_0P868,_1P076,_1P345,_1P761,_2P145,_2P624,_2P977,_3P787,_4P140
	Component _0P692()
	{
		_0P692 = new JLabel("0.692",SwingConstants.CENTER);
		_0P692.setBackground(new Color(159,226,191));
		_0P692.setOpaque(true);
		return _0P692;
	}
	Component _0P868()
	{
		_0P868 = new JLabel("0.868",SwingConstants.CENTER);
		_0P868.setBackground(new Color(159,226,191));
		_0P868.setOpaque(true);
		return _0P868;
	}
	Component _1P076()
	{
		_1P076 = new JLabel("1.076",SwingConstants.CENTER);
		_1P076.setBackground(new Color(159,226,191));
		_1P076.setOpaque(true);
		return _1P076;
	}
	Component _1P345()
	{
		_1P345 = new JLabel("1.345",SwingConstants.CENTER);
		_1P345.setBackground(new Color(159,226,191));
		_1P345.setOpaque(true);
		return _1P345;
	}
	Component _1P761()
	{
		_1P761 = new JLabel("1.761",SwingConstants.CENTER);
		_1P761.setBackground(new Color(159,226,191));
		_1P761.setOpaque(true);
		return _1P761;
	}
	Component _2P145()
	{
		_2P145 = new JLabel("2.145",SwingConstants.CENTER);
		_2P145.setBackground(new Color(159,226,191));
		_2P145.setOpaque(true);
		return _2P145;
	}
	Component _2P624()
	{
		_2P624 = new JLabel("2.624",SwingConstants.CENTER);
		_2P624.setBackground(new Color(159,226,191));
		_2P624.setOpaque(true);
		return _2P624;
	}
	Component _2P977()
	{
		_2P977 = new JLabel("2.977",SwingConstants.CENTER);
		_2P977.setBackground(new Color(159,226,191));
		_2P977.setOpaque(true);
		return _2P977;
	}
	Component _3P787()
	{
		_3P787 = new JLabel("3.787",SwingConstants.CENTER);
		_3P787.setBackground(new Color(159,226,191));
		_3P787.setOpaque(true);
		return _3P787;
	}
	Component _4P140()
	{
		_4P140 = new JLabel("4.140",SwingConstants.CENTER);
		_4P140.setBackground(new Color(159,226,191));
		_4P140.setOpaque(true);
		return _4P140;
	}
	/*13th row in specific values*/
	//_0P694,_0P870,_1P079,_1P350,_1P771,_2P160,_2P650,_3P012,_3P852,_4P221
	Component _0P694()
	{
		_0P694 = new JLabel("0.694",SwingConstants.CENTER);
		_0P694.setBackground(new Color(159,226,191));
		_0P694.setOpaque(true);
		return _0P694;
	}
	Component _0P870()
	{
		_0P870 = new JLabel("0.870",SwingConstants.CENTER);
		_0P870.setBackground(new Color(159,226,191));
		_0P870.setOpaque(true);
		return _0P870;
	}
	Component _1P079()
	{
		_1P079 = new JLabel("1.079",SwingConstants.CENTER);
		_1P079.setBackground(new Color(159,226,191));
		_1P079.setOpaque(true);
		return _1P079;
	}
	Component _1P350()
	{
		_1P350 = new JLabel("1.350",SwingConstants.CENTER);
		_1P350.setBackground(new Color(159,226,191));
		_1P350.setOpaque(true);
		return _1P350;
	}
	Component _1P771()
	{
		_1P771 = new JLabel("1.771",SwingConstants.CENTER);
		_1P771.setBackground(new Color(159,226,191));
		_1P771.setOpaque(true);
		return _1P771;
	}
	Component _2P160()
	{
		_2P160 = new JLabel("2.160",SwingConstants.CENTER);
		_2P160.setBackground(new Color(159,226,191));
		_2P160.setOpaque(true);
		return _2P160;
	}
	Component _2P650()
	{
		_2P650 = new JLabel("2.650",SwingConstants.CENTER);
		_2P650.setBackground(new Color(159,226,191));
		_2P650.setOpaque(true);
		return _2P650;
	}
	Component _3P012()
	{
		_3P012 = new JLabel("3.012",SwingConstants.CENTER);
		_3P012.setBackground(new Color(159,226,191));
		_3P012.setOpaque(true);
		return _3P012;
	}
	Component _3P852()
	{
		_3P852 = new JLabel("3.852",SwingConstants.CENTER);
		_3P852.setBackground(new Color(159,226,191));
		_3P852.setOpaque(true);
		return _3P852;
	}
	Component _4P221()
	{
		_4P221 = new JLabel("4.221",SwingConstants.CENTER);
		_4P221.setBackground(new Color(159,226,191));
		_4P221.setOpaque(true);
		return _4P221;
	}
	/*12th row in specific values*/
	//_0P695,_0P873,_1P083,_1P356,_1P782,_2P179,_2P681,_3P055,_3P930,_4P318
	Component _0P695()
	{
		_0P695 = new JLabel("0.695",SwingConstants.CENTER);
		_0P695.setBackground(new Color(159,226,191));
		_0P695.setOpaque(true);
		return _0P695;
	}
	Component _0P873()
	{
		_0P873 = new JLabel("0.873",SwingConstants.CENTER);
		_0P873.setBackground(new Color(159,226,191));
		_0P873.setOpaque(true);
		return _0P873;
	}
	Component _1P083()
	{
		_1P083 = new JLabel("1.083",SwingConstants.CENTER);
		_1P083.setBackground(new Color(159,226,191));
		_1P083.setOpaque(true);
		return _1P083;
	}
	Component _1P356()
	{
		_1P356 = new JLabel("1.356",SwingConstants.CENTER);
		_1P356.setBackground(new Color(159,226,191));
		_1P356.setOpaque(true);
		return _1P356;
	}
	Component _1P782()
	{
		_1P782 = new JLabel("1.782",SwingConstants.CENTER);
		_1P782.setBackground(new Color(159,226,191));
		_1P782.setOpaque(true);
		return _1P782;
	}
	Component _2P179()
	{
		_2P179 = new JLabel("2.179",SwingConstants.CENTER);
		_2P179.setBackground(new Color(159,226,191));
		_2P179.setOpaque(true);
		return _2P179;
	}
	Component _2P681()
	{
		_2P681 = new JLabel("2.681",SwingConstants.CENTER);
		_2P681.setBackground(new Color(159,226,191));
		_2P681.setOpaque(true);
		return _2P681;
	}
	Component _3P055()
	{
		_3P055 = new JLabel("3.055",SwingConstants.CENTER);
		_3P055.setBackground(new Color(159,226,191));
		_3P055.setOpaque(true);
		return _3P055;
	}
	Component _3P930()
	{
		_3P930 = new JLabel("3.930",SwingConstants.CENTER);
		_3P930.setBackground(new Color(159,226,191));
		_3P930.setOpaque(true);
		return _3P930;
	}
	Component _4P318()
	{
		_4P318 = new JLabel("4.318",SwingConstants.CENTER);
		_4P318.setBackground(new Color(159,226,191));
		_4P318.setOpaque(true);
		return _4P318;
	}
	/*11th row in specific values*/
	//_0P697,_0P876,_1P088,_1P363,_1P796,_2P201,_2P718,_3P106,_4P025,_4P437
	Component _0P697()
	{
		_0P697 = new JLabel("0.697",SwingConstants.CENTER);
		_0P697.setBackground(new Color(159,226,191));
		_0P697.setOpaque(true);
		return _0P697;
	}
	Component _0P876()
	{
		_0P876 = new JLabel("0.876",SwingConstants.CENTER);
		_0P876.setBackground(new Color(159,226,191));
		_0P876.setOpaque(true);
		return _0P876;
	}
	Component _1P088()
	{
		_1P088 = new JLabel("1.088",SwingConstants.CENTER);
		_1P088.setBackground(new Color(159,226,191));
		_1P088.setOpaque(true);
		return _1P088;
	}
	Component _1P363()
	{
		_1P363 = new JLabel("1.363",SwingConstants.CENTER);
		_1P363.setBackground(new Color(159,226,191));
		_1P363.setOpaque(true);
		return _1P363;
	}
	Component _1P796()
	{
		_1P796 = new JLabel("1.796",SwingConstants.CENTER);
		_1P796.setBackground(new Color(159,226,191));
		_1P796.setOpaque(true);
		return _1P796;
	}
	Component _2P201()
	{
		_2P201 = new JLabel("2.201",SwingConstants.CENTER);
		_2P201.setBackground(new Color(159,226,191));
		_2P201.setOpaque(true);
		return _2P201;
	}
	Component _2P718()
	{
		_2P718 = new JLabel("2.718",SwingConstants.CENTER);
		_2P718.setBackground(new Color(159,226,191));
		_2P718.setOpaque(true);
		return _2P718;
	}
	Component _3P106()
	{
		_3P106 = new JLabel("3.169",SwingConstants.CENTER);
		_3P106.setBackground(new Color(159,226,191));
		_3P106.setOpaque(true);
		return _3P106;
	}
	Component _4P144()
	{
		_4P144 = new JLabel("4.144",SwingConstants.CENTER);
		_4P144.setBackground(new Color(159,226,191));
		_4P144.setOpaque(true);
		return _4P144;
	}
	Component _4P587()
	{
		_4P587 = new JLabel("4.587",SwingConstants.CENTER);
		_4P587.setBackground(new Color(159,226,191));
		_4P587.setOpaque(true);
		return _4P587;
	}
	/*10th row in specific values*/
	//_0P700,_0P879,_1P093,_1P372,_1P812,_2P228,_2P764,_3P106,_4P144,_4P587
	Component _0P700()
	{
		_0P700 = new JLabel("0.700",SwingConstants.CENTER);
		_0P700.setBackground(new Color(159,226,191));
		_0P700.setOpaque(true);
		return _0P700;
	}
	Component _0P879()
	{
		_0P879 = new JLabel("0.879",SwingConstants.CENTER);
		_0P879.setBackground(new Color(159,226,191));
		_0P879.setOpaque(true);
		return _0P879;
	}
	Component _1P093()
	{
		_1P093 = new JLabel("1.093",SwingConstants.CENTER);
		_1P093.setBackground(new Color(159,226,191));
		_1P093.setOpaque(true);
		return _1P093;
	}
	Component _1P372()
	{
		_1P372 = new JLabel("1.372",SwingConstants.CENTER);
		_1P372.setBackground(new Color(159,226,191));
		_1P372.setOpaque(true);
		return _1P372;
	}
	Component _1P812()
	{
		_1P812 = new JLabel("1.812",SwingConstants.CENTER);
		_1P812.setBackground(new Color(159,226,191));
		_1P812.setOpaque(true);
		return _1P812;
	}
	Component _2P228()
	{
		_2P228 = new JLabel("2.228",SwingConstants.CENTER);
		_2P228.setBackground(new Color(159,226,191));
		_2P228.setOpaque(true);
		return _2P228;
	}
	Component _2P764()
	{
		_2P764 = new JLabel("2.764",SwingConstants.CENTER);
		_2P764.setBackground(new Color(159,226,191));
		_2P764.setOpaque(true);
		return _2P764;
	}
	Component _3P1061()
	{
		_3P106 = new JLabel("3.106",SwingConstants.CENTER);
		_3P106.setBackground(new Color(159,226,191));
		_3P106.setOpaque(true);
		return _3P106;
	}
	Component _4P025()
	{
		_4P025 = new JLabel("4.025",SwingConstants.CENTER);
		_4P025.setBackground(new Color(159,226,191));
		_4P025.setOpaque(true);
		return _4P025;
	}
	Component _4P437()
	{
		_4P437 = new JLabel("4.437",SwingConstants.CENTER);
		_4P437.setBackground(new Color(159,226,191));
		_4P437.setOpaque(true);
		return _4P437;
	}
	//_0P703,_0P883,_1P100,_1P383,_1P833,_2P262,_2P821,_3P250,_4P297,_4P781
	Component _0P703()
	{
		_0P703 = new JLabel("0.703",SwingConstants.CENTER);
		_0P703.setBackground(new Color(159,226,191));
		_0P703.setOpaque(true);
		return _0P703;
	}
	Component _0P883()
	{
		_0P883 = new JLabel("0.883",SwingConstants.CENTER);
		_0P883.setBackground(new Color(159,226,191));
		_0P883.setOpaque(true);
		return _0P883;
	}
	Component _1P100()
	{
		_1P100 = new JLabel("1.100",SwingConstants.CENTER);
		_1P100.setBackground(new Color(159,226,191));
		_1P100.setOpaque(true);
		return _1P100;
	}
	Component _1P383()
	{
		_1P383 = new JLabel("1.383",SwingConstants.CENTER);
		_1P383.setBackground(new Color(159,226,191));
		_1P383.setOpaque(true);
		return _1P383;
	}
	Component _1P833()
	{
		_1P833 = new JLabel("1.833",SwingConstants.CENTER);
		_1P833.setBackground(new Color(159,226,191));
		_1P833.setOpaque(true);
		return _1P833;
	}
	Component _2P262()
	{
		_2P262 = new JLabel("2.262",SwingConstants.CENTER);
		_2P262.setBackground(new Color(159,226,191));
		_2P262.setOpaque(true);
		return _2P262;
	}
	Component _2P821()
	{
		_2P821 = new JLabel("2.821",SwingConstants.CENTER);
		_2P821.setBackground(new Color(159,226,191));
		_2P821.setOpaque(true);
		return _2P821;
	}
	Component _3P250()
	{
		_3P250 = new JLabel("3.250",SwingConstants.CENTER);
		_3P250.setBackground(new Color(159,226,191));
		_3P250.setOpaque(true);
		return _3P250;
	}
	Component _4P297()
	{
		_4P297 = new JLabel("4.297",SwingConstants.CENTER);
		_4P297.setBackground(new Color(159,226,191));
		_4P297.setOpaque(true);
		return _4P297;
	}
	Component _4P781()
	{
		_4P781 = new JLabel("4.781",SwingConstants.CENTER);
		_4P781.setBackground(new Color(159,226,191));
		_4P781.setOpaque(true);
		return _4P781;
	}
	/*9th row in specific values*/
	//_0P706,_0P889,_1P108,_1P397,_1P860,_2P306,_2P896,_3P355,_4P501,_5P041
	Component _0P706()
	{
		_0P706 = new JLabel("0.706",SwingConstants.CENTER);
		_0P706.setBackground(new Color(159,226,191));
		_0P706.setOpaque(true);
		return _0P706;
	}
	Component _0P889()
	{
		_0P889 = new JLabel("0.889",SwingConstants.CENTER);
		_0P889.setBackground(new Color(159,226,191));
		_0P889.setOpaque(true);
		return _0P889;
	}
	Component _1P108()
	{
		_1P108 = new JLabel("1.108",SwingConstants.CENTER);
		_1P108.setBackground(new Color(159,226,191));
		_1P108.setOpaque(true);
		return _1P108;
	}
	Component _1P397()
	{
		_1P397 = new JLabel("1.397",SwingConstants.CENTER);
		_1P397.setBackground(new Color(159,226,191));
		_1P397.setOpaque(true);
		return _1P397;
	}
	Component _1P860()
	{
		_1P860 = new JLabel("1.860",SwingConstants.CENTER);
		_1P860.setBackground(new Color(159,226,191));
		_1P860.setOpaque(true);
		return _1P860;
	}
	Component _2P306()
	{
		_2P306 = new JLabel("2.306",SwingConstants.CENTER);
		_2P306.setBackground(new Color(159,226,191));
		_2P306.setOpaque(true);
		return _2P306;
	}
	Component _2P896()
	{
		_2P896 = new JLabel("2.896",SwingConstants.CENTER);
		_2P896.setBackground(new Color(159,226,191));
		_2P896.setOpaque(true);
		return _2P896;
	}
	Component _3P355()
	{
		_3P355 = new JLabel("3.355",SwingConstants.CENTER);
		_3P355.setBackground(new Color(159,226,191));
		_3P355.setOpaque(true);
		return _3P355;
	}
	Component _4P5011()
	{
		_4P501 = new JLabel("4.501",SwingConstants.CENTER);
		_4P501.setBackground(new Color(159,226,191));
		_4P501.setOpaque(true);
		return _4P501;
	}
	Component _5P041()
	{
		_5P041 = new JLabel("5.041",SwingConstants.CENTER);
		_5P041.setBackground(new Color(159,226,191));
		_5P041.setOpaque(true);
		return _5P041;
	}
	/*8th row in specific values*/
	//_0P711,_0P896,_1P119,_1P415,_1P895,_2P365,_2P998,_3P499,_4P501,_5P408
	Component _0P711()
	{
		_0P711 = new JLabel("0.711",SwingConstants.CENTER);
		_0P711.setBackground(new Color(159,226,191));
		_0P711.setOpaque(true);
		return _0P711;
	}
	Component _0P896()
	{
		_0P896 = new JLabel("0.896",SwingConstants.CENTER);
		_0P896.setBackground(new Color(159,226,191));
		_0P896.setOpaque(true);
		return _0P896;
	}
	Component _1P119()
	{
		_1P119 = new JLabel("1.119",SwingConstants.CENTER);
		_1P119.setBackground(new Color(159,226,191));
		_1P119.setOpaque(true);
		return _1P119;
	}
	Component _1P415()
	{
		_1P415 = new JLabel("1.415",SwingConstants.CENTER);
		_1P415.setBackground(new Color(159,226,191));
		_1P415.setOpaque(true);
		return _1P415;
	}
	Component _1P895()
	{
		_1P895 = new JLabel("1.895",SwingConstants.CENTER);
		_1P895.setBackground(new Color(159,226,191));
		_1P895.setOpaque(true);
		return _1P895;
	}
	Component _2P365()
	{
		_2P365 = new JLabel("2.365",SwingConstants.CENTER);
		_2P365.setBackground(new Color(159,226,191));
		_2P365.setOpaque(true);
		return _2P365;
	}
	Component _2P998()
	{
		_2P998 = new JLabel("2.998",SwingConstants.CENTER);
		_2P998.setBackground(new Color(159,226,191));
		_2P998.setOpaque(true);
		return _2P998;
	}
	Component _3P499()
	{
		_3P499 = new JLabel("3.499",SwingConstants.CENTER);
		_3P499.setBackground(new Color(159,226,191));
		_3P499.setOpaque(true);
		return _3P499;
	}
	Component _4P501()
	{
		_4P501 = new JLabel("4.501",SwingConstants.CENTER);
		_4P501.setBackground(new Color(159,226,191));
		_4P501.setOpaque(true);
		return _4P501;
	}
	Component _5P408()
	{
		_5P408 = new JLabel("5.408",SwingConstants.CENTER);
		_5P408.setBackground(new Color(159,226,191));
		_5P408.setOpaque(true);
		return _5P408;
	}
	/*7th row in specific values*/
	//_0P718,_0P906,_1P134,_1P440,_1P943,_2P447,_3P143,_3P707,_5P208,_5P959
	Component _0P718()
	{
		_0P718 = new JLabel("0.718",SwingConstants.CENTER);
		_0P718.setBackground(new Color(159,226,191));
		_0P718.setOpaque(true);
		return _0P718;
	}
	Component _0P906()
	{
		_0P906 = new JLabel("0.906",SwingConstants.CENTER);
		_0P906.setBackground(new Color(159,226,191));
		_0P906.setOpaque(true);
		return _0P906;
	}
	Component _1P134()
	{
		_1P134 = new JLabel("1.134",SwingConstants.CENTER);
		_1P134.setBackground(new Color(159,226,191));
		_1P134.setOpaque(true);
		return _1P134;
	}
	Component _1P440()
	{
		_1P440 = new JLabel("1.440",SwingConstants.CENTER);
		_1P440.setBackground(new Color(159,226,191));
		_1P440.setOpaque(true);
		return _1P440;
	}
	Component _1P943()
	{
		_1P943 = new JLabel("1.943",SwingConstants.CENTER);
		_1P943.setBackground(new Color(159,226,191));
		_1P943.setOpaque(true);
		return _1P943;
	}
	Component _2P447()
	{
		_2P447 = new JLabel("2.447",SwingConstants.CENTER);
		_2P447.setBackground(new Color(159,226,191));
		_2P447.setOpaque(true);
		return _2P447;
	}
	Component _3P143()
	{
		_3P143 = new JLabel("3.143",SwingConstants.CENTER);
		_3P143.setBackground(new Color(159,226,191));
		_3P143.setOpaque(true);
		return _3P143;
	}
	Component _3P707()
	{
		_3P707 = new JLabel("3.707",SwingConstants.CENTER);
		_3P707.setBackground(new Color(159,226,191));
		_3P707.setOpaque(true);
		return _3P707;
	}
	Component _5P208()
	{
		_5P208 = new JLabel("5.208",SwingConstants.CENTER);
		_5P208.setBackground(new Color(159,226,191));
		_5P208.setOpaque(true);
		return _5P208;
	}
	Component _5P959()
	{
		_5P959 = new JLabel("5.959",SwingConstants.CENTER);
		_5P959.setBackground(new Color(159,226,191));
		_5P959.setOpaque(true);
		return _5P959;
	}
	/*6th row in specific values*/
	//_0P727,_0P920,_1P156,_1P476,_2P015,_2P571,_3P365,_4P032,_5P893,_6P869
	Component _0P727()
	{
		_0P727 = new JLabel("0.727",SwingConstants.CENTER);
		_0P727.setBackground(new Color(159,226,191));
		_0P727.setOpaque(true);
		return _0P727;
	}
	Component _0P920()
	{
		_0P920 = new JLabel("0.920",SwingConstants.CENTER);
		_0P920.setBackground(new Color(159,226,191));
		_0P920.setOpaque(true);
		return _0P920;
	}
	Component _1P156()
	{
		_1P156 = new JLabel("1.156",SwingConstants.CENTER);
		_1P156.setBackground(new Color(159,226,191));
		_1P156.setOpaque(true);
		return _1P156;
	}
	Component _1P476()
	{
		_1P476 = new JLabel("1.476",SwingConstants.CENTER);
		_1P476.setBackground(new Color(159,226,191));
		_1P476.setOpaque(true);
		return _1P476;
	}
	Component _2P015()
	{
		_2P015 = new JLabel("2.015",SwingConstants.CENTER);
		_2P015.setBackground(new Color(159,226,191));
		_2P015.setOpaque(true);
		return _2P015;
	}
	Component puta()
	{
		_2P571 = new JLabel("2.571",SwingConstants.CENTER);
		_2P571.setBackground(new Color(159,226,191));
		_2P571.setOpaque(true);
		return _2P571;
	}
	Component _3P365()
	{
		_3P365 = new JLabel("3.365",SwingConstants.CENTER);
		_3P365.setBackground(new Color(159,226,191));
		_3P365.setOpaque(true);
		return _3P365;
	}
	Component _4P032()
	{
		_4P032 = new JLabel("4.032",SwingConstants.CENTER);
		_4P032.setBackground(new Color(159,226,191));
		_4P032.setOpaque(true);
		return _4P032;
	}
	Component _5P893()
	{
		_5P893 = new JLabel("5.893",SwingConstants.CENTER);
		_5P893.setBackground(new Color(159,226,191));
		_5P893.setOpaque(true);
		return _5P893;
	}
	Component _6P869()
	{
		_6P869 = new JLabel("6.869",SwingConstants.CENTER);
		_6P869.setBackground(new Color(159,226,191));
		_6P869.setOpaque(true);
		return _6P869;
	}
	/*5th row in specific values*/
	//_0P741,_0P941,_1P190,_1P533,_2P132,_2P776,_3P747,_4P604,_7P173,_8P610
	Component _0P741()
	{
		_0P741 = new JLabel("0.741",SwingConstants.CENTER);
		_0P741.setBackground(new Color(159,226,191));
		_0P741.setOpaque(true);
		return _0P741;
	}
	Component _0P941()
	{
		_0P941 = new JLabel("0.941",SwingConstants.CENTER);
		_0P941.setBackground(new Color(159,226,191));
		_0P941.setOpaque(true);
		return _0P941;
	}
	Component _1P190()
	{
		_1P190 = new JLabel("1.190",SwingConstants.CENTER);
		_1P190.setBackground(new Color(159,226,191));
		_1P190.setOpaque(true);
		return _1P190;
	}
	Component _1P533()
	{
		_1P533 = new JLabel("1.533",SwingConstants.CENTER);
		_1P533.setBackground(new Color(159,226,191));
		_1P533.setOpaque(true);
		return _1P533;
	}
	Component _2P132()
	{
		_2P132 = new JLabel("2.132",SwingConstants.CENTER);
		_2P132.setBackground(new Color(159,226,191));
		_2P132.setOpaque(true);
		return _2P132;
	}
	Component _2P776()
	{
		_2P776 = new JLabel("2.776",SwingConstants.CENTER);
		_2P776.setBackground(new Color(159,226,191));
		_2P776.setOpaque(true);
		return _2P776;
	}
	Component _3P747()
	{
		_3P747 = new JLabel("3.747",SwingConstants.CENTER);
		_3P747.setBackground(new Color(159,226,191));
		_3P747.setOpaque(true);
		return _3P747;
	}
	Component _4P604()
	{
		_4P604 = new JLabel("4.604",SwingConstants.CENTER);
		_4P604.setBackground(new Color(159,226,191));
		_4P604.setOpaque(true);
		return _4P604;
	}
	Component _7P173()
	{
		_7P173 = new JLabel("7.173",SwingConstants.CENTER);
		_7P173.setBackground(new Color(159,226,191));
		_7P173.setOpaque(true);
		return _7P173;
	}
	Component _8P610()
	{
		_8P610 = new JLabel("12.924",SwingConstants.CENTER);
		_8P610.setBackground(new Color(159,226,191));
		_8P610.setOpaque(true);
		return _8P610;
	}
	/*4th row in specific values*/
	//_0P765,_1P978,_1P250,_1P638,_2P353,_3P182,_4P541,_5P841,_10P215,_12P924
	Component _0P765()
	{
		_0P765 = new JLabel("0.765",SwingConstants.CENTER);
		_0P765.setBackground(new Color(159,226,191));
		_0P765.setOpaque(true);
		return _0P765;
	}
	Component _1P978()
	{
		_1P978 = new JLabel("1.978",SwingConstants.CENTER);
		_1P978.setBackground(new Color(159,226,191));
		_1P978.setOpaque(true);
		return _1P978;
	}
	Component _1P250()
	{
		_1P250 = new JLabel("1.250",SwingConstants.CENTER);
		_1P250.setBackground(new Color(159,226,191));
		_1P250.setOpaque(true);
		return _1P250;
	}
	Component _1P638()
	{
		_1P638 = new JLabel("1.638",SwingConstants.CENTER);
		_1P638.setBackground(new Color(159,226,191));
		_1P638.setOpaque(true);
		return _1P638;
	}
	Component _2P353()
	{
		_2P353 = new JLabel("2.353",SwingConstants.CENTER);
		_2P353.setBackground(new Color(159,226,191));
		_2P353.setOpaque(true);
		return _2P353;
	}
	Component _3P182()
	{
		_3P182 = new JLabel("3.182",SwingConstants.CENTER);
		_3P182.setBackground(new Color(159,226,191));
		_3P182.setOpaque(true);
		return _3P182;
	}
	Component _4P541()
	{
		_4P541 = new JLabel("4.541",SwingConstants.CENTER);
		_4P541.setBackground(new Color(159,226,191));
		_4P541.setOpaque(true);
		return _4P541;
	}
	Component _5P841()
	{
		_5P841 = new JLabel("5.841",SwingConstants.CENTER);
		_5P841.setBackground(new Color(159,226,191));
		_5P841.setOpaque(true);
		return _5P841;
	}
	Component _10P215()
	{
		_10P215 = new JLabel("10.215",SwingConstants.CENTER);
		_10P215.setBackground(new Color(159,226,191));
		_10P215.setOpaque(true);
		return _10P215;
	}
	Component _12P924()
	{
		_12P924 = new JLabel("12.924",SwingConstants.CENTER);
		_12P924.setBackground(new Color(159,226,191));
		_12P924.setOpaque(true);
		return _12P924;
	}
	/*3rd row in specific values*/
	//_0P816,_1P061,_1P386,_1P886,_2P920,_4P303,_6P965,_9P925,_22P357,_31P599
	Component _0P816()
	{
		_0P816 = new JLabel("0.816",SwingConstants.CENTER);
		_0P816.setBackground(new Color(159,226,191));
		_0P816.setOpaque(true);
		return _0P816;
	}
	Component _1P061()
	{
		_1P061 = new JLabel("1.061",SwingConstants.CENTER);
		_1P061.setBackground(new Color(159,226,191));
		_1P061.setOpaque(true);
		return _1P061;
	}
	Component _1P386()
	{
		_1P386 = new JLabel("1.386",SwingConstants.CENTER);
		_1P386.setBackground(new Color(159,226,191));
		_1P386.setOpaque(true);
		return _1P386;
	}
	Component _1P886()
	{
		_1P886 = new JLabel("1.886",SwingConstants.CENTER);
		_1P886.setBackground(new Color(159,226,191));
		_1P886.setOpaque(true);
		return _1P886;
	}
	Component _2P920()
	{
		_2P920 = new JLabel("2.920",SwingConstants.CENTER);
		_2P920.setBackground(new Color(159,226,191));
		_2P920.setOpaque(true);
		return _2P920;
	}
	Component _4P303()
	{
		_4P303 = new JLabel("4.303",SwingConstants.CENTER);
		_4P303.setBackground(new Color(159,226,191));
		_4P303.setOpaque(true);
		return _4P303;
	}
	Component _6P965()
	{
		_6P965 = new JLabel("6.965",SwingConstants.CENTER);
		_6P965.setBackground(new Color(159,226,191));
		_6P965.setOpaque(true);
		return _6P965;
	}
	Component _9P925()
	{
		_9P925 = new JLabel("9.925",SwingConstants.CENTER);
		_9P925.setBackground(new Color(159,226,191));
		_9P925.setOpaque(true);
		return _9P925;
	}
	Component _22P357()
	{
		_22P357 = new JLabel("22.357",SwingConstants.CENTER);
		_22P357.setBackground(new Color(159,226,191));
		_22P357.setOpaque(true);
		return _22P357;
	}
	Component _31P599()
	{
		_31P599 = new JLabel("31.599",SwingConstants.CENTER);
		_31P599.setBackground(new Color(159,226,191));
		_31P599.setOpaque(true);
		return _31P599;
	}
	
	/*2nd row in specific values*/
	//_0P000, _1P000, _1P376, _1P963,_3P078,_6P314,_12P71,_31P82,_63P66,_318P31,_636P62
	Component _0P000()
	{
		_0P000 = new JLabel("0.000",SwingConstants.CENTER);
		_0P000.setBackground(new Color(159,226,191));
		_0P000.setOpaque(true);
		return _0P000;
	}
	Component _1P000()
	{
		_1P000 = new JLabel("1.000",SwingConstants.CENTER);
		_1P000.setBackground(new Color(159,226,191));
		_1P000.setOpaque(true);
		return _1P000;
	}
	Component _1P376()
	{
		_1P376 = new JLabel("1.376",SwingConstants.CENTER);
		_1P376.setBackground(new Color(159,226,191));
		_1P376.setOpaque(true);
		return _1P376;
	}
	Component _1P963()
	{
		_1P963 = new JLabel("1.963",SwingConstants.CENTER);
		_1P963.setBackground(new Color(159,226,191));
		_1P963.setOpaque(true);
		return _1P963;
	}
	Component _3P078()
	{
		_3P078 = new JLabel("3.078",SwingConstants.CENTER);
		_3P078.setBackground(new Color(159,226,191));
		_3P078.setOpaque(true);
		return _3P078;
	}
	Component _6P314()
	{
		_6P314 = new JLabel("6.314",SwingConstants.CENTER);
		_6P314.setBackground(new Color(159,226,191));
		_6P314.setOpaque(true);
		return _6P314;
	}
	Component _12P71()
	{
		_12P71 = new JLabel("12.71",SwingConstants.CENTER);
		_12P71.setBackground(new Color(159,226,191));
		_12P71.setOpaque(true);
		return _12P71;
	}
	Component _31P82()
	{
		_31P82 = new JLabel("31.82",SwingConstants.CENTER);
		_31P82.setBackground(new Color(159,226,191));
		_31P82.setOpaque(true);
		return _31P82;
	}
	Component _63P66()
	{
		_63P66 = new JLabel("63.66",SwingConstants.CENTER);
		_63P66.setBackground(new Color(159,226,191));
		_63P66.setOpaque(true);
		return _63P66;
	}
	Component _318P31()
	{
		_318P31 = new JLabel("318.31",SwingConstants.CENTER);
		_318P31.setBackground(new Color(159,226,191));
		_318P31.setOpaque(true);
		return _318P31;
	}
	Component _636P62()
	{
		_636P62 = new JLabel("636.62",SwingConstants.CENTER);
		_636P62.setBackground(new Color(159,226,191));
		_636P62.setOpaque(true);
		return _636P62;
	}
	/*1st row in specific values*/
	Component blank()
	{
		blank = new JLabel("    ",SwingConstants.CENTER);
		blank.setBackground(new Color(159,226,191));
		blank.setOpaque(true);
		return blank;
	}
	Component blank1()
	{
		blank1 = new JLabel("   ",SwingConstants.CENTER);
		blank1.setBackground(new Color(159,226,191));
		blank1.setOpaque(true);
		return blank1;
	}
	Component blank2()
	{
		blank2 = new JLabel("    ",SwingConstants.CENTER);
		blank2.setBackground(new Color(159,226,191));
		blank2.setOpaque(true);
		return blank2;
	}
	Component blank3()
	{
		blank3 = new JLabel("    ",SwingConstants.CENTER);
		blank3.setBackground(new Color(159,226,191));
		blank3.setOpaque(true);
		return blank3;
	}
	Component blank4()
	{
		blank4 = new JLabel("    ",SwingConstants.CENTER);
		blank4.setBackground(new Color(159,226,191));
		blank4.setOpaque(true);
		return blank4;
	}
	Component blank5()
	{
		blank5 = new JLabel("    ",SwingConstants.CENTER);
		blank5.setBackground(new Color(159,226,191));
		blank5.setOpaque(true);
		return blank5;
	}
	Component blank6()
	{
		blank6 = new JLabel("    ",SwingConstants.CENTER);
		blank6.setBackground(new Color(159,226,191));
		blank6.setOpaque(true);
		return blank6;
	}
	Component blank7()
	{
		blank7 = new JLabel("    ",SwingConstants.CENTER);
		blank7.setBackground(new Color(159,226,191));
		blank7.setOpaque(true);
		return blank7;
	}
	Component blank8()
	{
		blank8 = new JLabel("    ",SwingConstants.CENTER);
		blank8.setBackground(new Color(159,226,191));
		blank8.setOpaque(true);
		return blank8;
	}
	Component blank9()
	{
		blank9 = new JLabel("    ",SwingConstants.CENTER);
		blank9.setBackground(new Color(159,226,191));
		blank9.setOpaque(true);
		return blank9;
	}
	Component blank10()
	{
		blank10 = new JLabel("    ",SwingConstants.CENTER);
		blank10.setBackground(new Color(159,226,191));
		blank10.setOpaque(true);
		return blank10;
	}
	
	/*****************tailValues***************/
	Component tailValues()//(0, 40, 100, 50)
	{
		tailValues = new JLabel();
		tailValues.setBackground(Color.black);
		tailValues.setBounds(100, 40, 740, 50);
		tailValues.setLayout(new GridLayout(2,11,5,5));	
		tailValues.add(P5());
		tailValues.add(_0P25());
		tailValues.add(_0P2());
		tailValues.add(_0P15());
		tailValues.add(_0P1());
		tailValues.add(_0P051());
		tailValues.add(_0P025());
		tailValues.add(_0P011());
		tailValues.add(_0P005());
		tailValues.add(_0P0011());
		tailValues.add(_0P0005());
		
		tailValues.add(_1P00());
		tailValues.add(_0P50());
		tailValues.add(_0P40());
		tailValues.add(_0P30());
		tailValues.add(_0P20());
		tailValues.add(_0P10());
		tailValues.add(_0P05());
		tailValues.add(_0P02());
		tailValues.add(_0P01());
		tailValues.add(_0P002());
		tailValues.add(_0P001());

		
		tailValues.setOpaque(true);
		return tailValues;
	}
	Component P5()
	{
		P5 = new JLabel("0.50",SwingConstants.CENTER);
		P5.setBackground(new Color(173,216,230));
		P5.setOpaque(true);
		return P5;
	}
	Component _0P25()
	{
		_0P25 = new JLabel("0.25",SwingConstants.CENTER);
		_0P25.setBackground(new Color(173,216,230));
		_0P25.setOpaque(true);
		return _0P25;
	}
	Component _0P2()
	{
		_0P2 = new JLabel("0.20",SwingConstants.CENTER);
		_0P2.setBackground(new Color(173,216,230));
		_0P2.setOpaque(true);
		return _0P2;
	}
	Component _0P15()
	{
		_0P15 = new JLabel("0.15",SwingConstants.CENTER);
		_0P15.setBackground(new Color(173,216,230));
		_0P15.setOpaque(true);
		return _0P15;
	}
	Component _0P1()
	{
		_0P1 = new JLabel("0.10",SwingConstants.CENTER);
		_0P1.setBackground(new Color(173,216,230));
		_0P1.setOpaque(true);
		return _0P1;
	}
	Component _0P051()
	{
		_0P051 = new JLabel("0.05",SwingConstants.CENTER);
		_0P051.setBackground(new Color(173,216,230));
		_0P051.setOpaque(true);
		return _0P051;
	}
	Component _0P025()
	{
		_0P025 = new JLabel("0.025",SwingConstants.CENTER);
		_0P025.setBackground(new Color(173,216,230));
		_0P025.setOpaque(true);
		return _0P025;
	}
	Component _0P011()
	{
		_0P011 = new JLabel("0.01",SwingConstants.CENTER);
		_0P011.setBackground(new Color(173,216,230));
		_0P011.setOpaque(true);
		return _0P011;
	}
	Component _0P005()
	{
		_0P005 = new JLabel("0.005",SwingConstants.CENTER);
		_0P005.setBackground(new Color(173,216,230));
		_0P005.setOpaque(true);
		return _0P005;
	}
	Component _0P0011()
	{
		_0P0011 = new JLabel("0.001",SwingConstants.CENTER);
		_0P0011.setBackground(new Color(173,216,230));
		_0P0011.setOpaque(true);
		return _0P0011;
	}
	Component _0P0005()
	{
		_0P0005 = new JLabel("0.0005",SwingConstants.CENTER);
		_0P0005.setBackground(new Color(173,216,230));
		_0P0005.setOpaque(true);
		return _0P0005;
	}
	Component _1P00()
	{
		_1P00 = new JLabel("1.00",SwingConstants.CENTER);
		_1P00.setBackground(new Color(173,216,230));
		_1P00.setOpaque(true);
		return _1P00;
	}
	Component _0P50()
	{
		_0P50 = new JLabel("0.50",SwingConstants.CENTER);
		_0P50.setBackground(new Color(173,216,230));
		_0P50.setOpaque(true);
		return _0P50;
	}
	Component _0P40()
	{
		_0P40 = new JLabel("0.40",SwingConstants.CENTER);
		_0P40.setBackground(new Color(173,216,230));
		_0P40.setOpaque(true);
		return _0P40;
	}
	Component _0P30()
	{
		_0P30 = new JLabel("0.30",SwingConstants.CENTER);
		_0P30.setBackground(new Color(173,216,230));
		_0P30.setOpaque(true);
		return _0P30;
	}
	Component _0P20()
	{
		_0P20 = new JLabel("0.20",SwingConstants.CENTER);
		_0P20.setBackground(new Color(173,216,230));
		_0P20.setOpaque(true);
		return _0P20;
	}
	Component _0P10()
	{
		_0P10 = new JLabel("0.10",SwingConstants.CENTER);
		_0P10.setBackground(new Color(173,216,230));
		_0P10.setOpaque(true);
		return _0P10;
	}
	
	Component _0P05()
	{
		_0P05 = new JLabel("0.05",SwingConstants.CENTER);
		_0P05.setBackground(new Color(173,216,230));
		_0P05.setOpaque(true);
		return _0P05;
	}
	Component _0P02()
	{
		_0P02 = new JLabel("0.02",SwingConstants.CENTER);
		_0P02.setBackground(new Color(173,216,230));
		_0P02.setOpaque(true);
		return _0P02;
	}
	Component _0P01()
	{
		_0P01 = new JLabel("0.01",SwingConstants.CENTER);
		_0P01.setBackground(new Color(173,216,230));
		_0P01.setOpaque(true);
		return _0P01;
	}
	Component _0P002()
	{
		_0P002 = new JLabel("0.002",SwingConstants.CENTER);
		_0P002.setBackground(new Color(173,216,230));
		_0P002.setOpaque(true);
		return _0P002;
	}
	Component _0P001()
	{
		_0P001 = new JLabel("0.001",SwingConstants.CENTER);
		_0P001.setBackground(new Color(173,216,230));
		_0P001.setOpaque(true);
		return _0P001;
	}
	
	/*****************df***************/
	Component df()
	{
		df = new JLabel();
		df.setBackground(Color.black);
		df.setOpaque(true);
		df.setBounds(0,90,100,570);
		df.setLayout(new GridLayout(37,1,0,2));
		df.add(df1());
		df.add(_1());
		df.add(_2());
		df.add(_3());
		df.add(_4());
		df.add(_5());
		df.add(_6());
		df.add(_7());
		df.add(_8());
		df.add(_9());
		df.add(_10());
		df.add(_11());
		df.add(_12());
		df.add(_13());
		df.add(_14());
		df.add(_15());
		df.add(_16());
		df.add(_17());
		df.add(_18());
		df.add(_19());
		df.add(_20());
		df.add(_21());
		df.add(_22());
		df.add(_23());
		df.add(_24());
		df.add(_25());
		df.add(_26());
		df.add(_27());
		df.add(_28());
		df.add(_29());
		df.add(_30());
		df.add(_40());
		df.add(_60());
		df.add(_80());
		df.add(_100());
		df.add(_1000());
		df.add(Z());
		return df;
	}
	Component df1()
	{
		df1 = new JLabel("df",SwingConstants.CENTER);
		df1.setBackground(new Color(220,159,164));
		df1.setOpaque(true);
		return df1;
		
	}
	Component _1()
	{
		_1 = new JLabel("1",SwingConstants.CENTER);
		_1.setBackground(new Color(220,159,164));
		_1.setOpaque(true);
		return _1;	
	}
	Component _2()
	{
		_2 = new JLabel("2",SwingConstants.CENTER);
		_2.setBackground(new Color(220,159,164));
		_2.setOpaque(true);
		return _2;	
	}
	Component _3()
	{
		_3 = new JLabel("3",SwingConstants.CENTER);
		_3.setBackground(new Color(220,159,164));
		_3.setOpaque(true);
		return _3;	
	}
	Component _4()
	{
		_4 = new JLabel("4",SwingConstants.CENTER);
		_4.setBackground(new Color(220,159,164));
		_4.setOpaque(true);
		return _4;	
	}
	Component _5()
	{
		_5 = new JLabel("5",SwingConstants.CENTER);
		_5.setBackground(new Color(220,159,164));
		_5.setOpaque(true);
		return _5;	
	}
	Component _6()
	{
		_6 = new JLabel("6",SwingConstants.CENTER);
		_6.setBackground(new Color(220,159,164));
		_6.setOpaque(true);
		return _6;	
	}
	Component _7()
	{
		_7 = new JLabel("7",SwingConstants.CENTER);
		_7.setBackground(new Color(220,159,164));
		_7.setOpaque(true);
		return _7;	
	}
	Component _8()
	{
		_8 = new JLabel("8",SwingConstants.CENTER);
		_8.setBackground(new Color(220,159,164));
		_8.setOpaque(true);
		return _8;	
	}
	Component _9()
	{
		_9 = new JLabel("9",SwingConstants.CENTER);
		_9.setBackground(new Color(220,159,164));
		_9.setOpaque(true);
		return _9;	
	}
	Component _10()
	{
		_10 = new JLabel("10",SwingConstants.CENTER);
		_10.setBackground(new Color(220,159,164));
		_10.setOpaque(true);
		return _10;	
	}
	Component _11()
	{
		_11 = new JLabel("11",SwingConstants.CENTER);
		_11.setBackground(new Color(220,159,164));
		_11.setOpaque(true);
		return _11;	
	}
	Component _12()
	{
		_12 = new JLabel("12",SwingConstants.CENTER);
		_12.setBackground(new Color(220,159,164));
		_12.setOpaque(true);
		return _12;	
	}
	Component _13()
	{
		_13 = new JLabel("13",SwingConstants.CENTER);
		_13.setBackground(new Color(220,159,164));
		_13.setOpaque(true);
		return _13;	
	}
	Component _14()
	{
		_14 = new JLabel("14",SwingConstants.CENTER);
		_14.setBackground(new Color(220,159,164));
		_14.setOpaque(true);
		return _14;	
	}
	Component _15()
	{
		_15 = new JLabel("15",SwingConstants.CENTER);
		_15.setBackground(new Color(220,159,164));
		_15.setOpaque(true);
		return _15;	
	}
	Component _16()
	{
		_16 = new JLabel("16",SwingConstants.CENTER);
		_16.setBackground(new Color(220,159,164));
		_16.setOpaque(true);
		return _16;	
	}
	Component _17()
	{
		_17 = new JLabel("17",SwingConstants.CENTER);
		_17.setBackground(new Color(220,159,164));
		_17.setOpaque(true);
		return _17;	
	}
	Component _18()
	{
		_18 = new JLabel("18",SwingConstants.CENTER);
		_18.setBackground(new Color(220,159,164));
		_18.setOpaque(true);
		return _18;	
	}
	Component _19()
	{
		_19 = new JLabel("19",SwingConstants.CENTER);
		_19.setBackground(new Color(220,159,164));
		_19.setOpaque(true);
		return _19;	
	}
	Component _20()
	{
		_20 = new JLabel("20",SwingConstants.CENTER);
		_20.setBackground(new Color(220,159,164));
		_20.setOpaque(true);
		return _20;	
	}
	Component _21()
	{
		_21 = new JLabel("21",SwingConstants.CENTER);
		_21.setBackground(new Color(220,159,164));
		_21.setOpaque(true);
		return _21;	
	}
	Component _22()
	{
		_22 = new JLabel("22",SwingConstants.CENTER);
		_22.setBackground(new Color(220,159,164));
		_22.setOpaque(true);
		return _22;	
	}
	Component _23()
	{
		_23 = new JLabel("23",SwingConstants.CENTER);
		_23.setBackground(new Color(220,159,164));
		_23.setOpaque(true);
		return _23;	
	}
	Component _24()
	{
		_24 = new JLabel("24",SwingConstants.CENTER);
		_24.setBackground(new Color(220,159,164));
		_24.setOpaque(true);
		return _24;	
	}
	Component _25()
	{
		_25 = new JLabel("25",SwingConstants.CENTER);
		_25.setBackground(new Color(220,159,164));
		_25.setOpaque(true);
		return _25;	
	}
	Component _26()
	{
		_26 = new JLabel("26",SwingConstants.CENTER);
		_26.setBackground(new Color(220,159,164));
		_26.setOpaque(true);
		return _26;	
	}
	Component _27()
	{
		_27 = new JLabel("27",SwingConstants.CENTER);
		_27.setBackground(new Color(220,159,164));
		_27.setOpaque(true);
		return _27;	
	}
	Component _28()
	{
		_28 = new JLabel("28",SwingConstants.CENTER);
		_28.setBackground(new Color(220,159,164));
		_28.setOpaque(true);
		return _28;	
	}
	Component _29()
	{
		_29 = new JLabel("29",SwingConstants.CENTER);
		_29.setBackground(new Color(220,159,164));
		_29.setOpaque(true);
		return _29;	
	}
	Component _30()
	{
		_30 = new JLabel("30",SwingConstants.CENTER);
		_30.setBackground(new Color(220,159,164));
		_30.setOpaque(true);
		return _30;	
	}
	Component _40()
	{
		_40 = new JLabel("40",SwingConstants.CENTER);
		_40.setBackground(new Color(220,159,164));
		_40.setOpaque(true);
		return _40;	
	}
	Component _60()
	{
		_60 = new JLabel("60",SwingConstants.CENTER);
		_60.setBackground(new Color(220,159,164));
		_60.setOpaque(true);
		return _60;	
	}
	Component _80()
	{
		_80 = new JLabel("80",SwingConstants.CENTER);
		_80.setBackground(new Color(220,159,164));
		_80.setOpaque(true);
		return _80;	
	}
	Component _100()
	{
		_100 = new JLabel("100",SwingConstants.CENTER);
		_100.setBackground(new Color(220,159,164));
		_100.setOpaque(true);
		return _100;	
	}
	Component _1000()
	{
		_1000 = new JLabel("1000",SwingConstants.CENTER);
		_1000.setBackground(new Color(220,159,164));
		_1000.setOpaque(true);
		return _1000;	
	}
	Component Z()
	{
		Z = new JLabel("Z",SwingConstants.CENTER);
		Z.setBackground(new Color(220,159,164));
		Z.setFont(new Font("Arial",Font.BOLD,12));
		Z.setOpaque(true);
		return Z;	
	}

	/*****************One & Two tail***************/
	Component oneTwoTail()
	{
		oneTwoTail = new JLabel();
		oneTwoTail.setBackground(Color.black);
		oneTwoTail.setOpaque(true);
		oneTwoTail.setBounds(0, 40, 100, 50);
		oneTwoTail.setLayout(new GridLayout(2,1,0,2));
		oneTwoTail.add(oneTail());
		oneTwoTail.add(twoTail());
		
		return oneTwoTail;
	}
	Component oneTail()
	{
		oneTail = new JLabel("One-tail",SwingConstants.CENTER);
		oneTail.setBackground(new Color(225,198,153));
		oneTail.setOpaque(true);
		oneTail.setForeground(Color.black);
		oneTail.setFont(new Font("Arial", Font.BOLD, 15));
		return oneTail;
	}
	Component twoTail()
	{
		twoTail = new JLabel("Two-tail",SwingConstants.CENTER);
		twoTail.setBackground(new Color(225,198,153));
		twoTail.setOpaque(true);
		twoTail.setForeground(Color.black);
		twoTail.setFont(new Font("Arial", Font.BOLD, 15));
		return twoTail;
	}
	/*****************T-table title***************/
	Component tTableTit()
	{
		tTableTit = new JLabel("T-table",SwingConstants.CENTER);
		tTableTit.setBackground(Color.black);
		tTableTit.setOpaque(true);
		tTableTit.setForeground(Color.white);
		tTableTit.setBounds(0, 0, 840, 40);
		tTableTit.setFont(kawoszeh());
		return tTableTit;
	}
	Font kawoszeh()
	{
		try { 
			
			//akronim = Font.createFont(Font.TRUETYPE_FONT,
              //      new FileInputStream("./Fonts/Akronim-Regular.ttf")).deriveFont(75f);
			kawoszeh = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/kawoszeh.ttf")).deriveFont(45f);
			
		} catch (Exception e) { 
		    e.printStackTrace();
		}
		return kawoszeh;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==back)
		{
			//ZTableResults results = new ZTableResults();
			
			Home.home.setVisible(false);
			GenerateFormula.generateFormula.setVisible(false);	
			Statistics.statistics.setVisible(false);
			CentralTendency.centralTendency.setVisible(false);
			ZTest.zTest.setVisible(false);
			TTest.tTest.setVisible(true);
			//FTest fTest = new FTest();
			FTest.fTest.setVisible(false);
			//esults.getZTableResults().setVisible(false);
			if(ZTest.zTableResultsList.size()!=0)
			{
				ZTest.zTableResultsList.get(0).getZTableResults().setVisible(false);
			}
			else
			{
				TTableResults.tTableResults.setVisible(false);
			}
			
			
			
			
		}
		
	}	

}

