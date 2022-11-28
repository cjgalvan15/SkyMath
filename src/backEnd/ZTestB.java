package backEnd;

import java.util.ArrayList;
import java.util.HashMap;

public class ZTestB 
{
	
	//store the input data
	//within arraylist
	private ArrayList<Double> sample1 = new ArrayList<Double>();
	private ArrayList<Double> sample2 = new ArrayList<Double>();
	private double mean1, mean2;
	private double n1, n2;
	private double sd1, sd2;
	private double zScore;
	private double leftArea, confidenceLevel;
	private static double tabularValue;
	private String nullHypothesis;
	private static double levelOfSignificance;
	private String conclusion;
	private static int tail;
	private static int size1_2;
	
	
	public ZTestB(String dataInput, String nullHypothesis, double levelOfSignificance)
	{
		try {
			setInput(dataInput);
			
			int size1_2=sample1.size()+sample2.size();
			
			System.out.println("size1_2: "+size1_2);
			if(size1_2>30)
			{
				
				setNullHypothesis(nullHypothesis);
				
				
				setLevelOfSignificance(levelOfSignificance);
		
		
				setTail();
		
				
				setTabularValue(getLevelOfSignificance(),getTail());//debug
		
		
				
				setMean1();
		
				
				setMean2();
		
				
				setN1();
		
				
				setN2();
		
				
				setSd1();
		
				
				setSd2();
		
				
				setZScore();
		
				
				setConclusion();
			}
			else
			{
				//nothing gonna happen
			}
			
	
			
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
		
		
	}
	public ZTestB()
	{
		
	}
	
	public void setTail()
	{
		String str="";
		int getIndex=0;
		boolean signal=false;
		
		try {
			for(int i=0;i<nullHypothesis.length();i++)
			{
				//get the character into string
				String getStr = String.valueOf(nullHypothesis.charAt(i));
				
				if(getStr.equals("n"))
				{
					getIndex=i;
					
					//System.out.println("nullHypothesis.length(): "+nullHypothesis.length());
					//System.out.println(nullHypothesis.length()-i);
					if((nullHypothesis.length()-i)>=14)
					{
						for(int j=0;j<14;i++,j++)
						{
							getStr = String.valueOf(nullHypothesis.charAt(i));
							str+=getStr;//
							//System.out.println("str: "+str);
							
							if(str.equals("no significant"))
							{
								System.out.println("There is no: "+ str);
								tail=1;
								i=nullHypothesis.length();
								j=14;
								signal=true;
							}
							
						}
					}
					
					
				}
				
				
				
			}
			if (signal==false)
			{
				tail=2;
				
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
		
		
		
		
	}
	public static int getTail()
	{
		return tail;
	}

	public String getNullHypothesis()
	{
		return nullHypothesis;
	}
	public static double getLevelOfSignificance()
	{
		return levelOfSignificance;
	}
	public String getConclusion()
	{
		return conclusion;
	}
	public void setConclusion()
	{
		//compare the tabularValue and zScore
		try {
			if(zScore<tabularValue)
			{
				
				this.conclusion="Accept Null Hypothesis";
			}
			else
			{
				this.conclusion="Reject Null Hypothesis";
			}
		}catch(Exception e) {
			System.out.println("There is an error");
		}
		
		
	}
	public void setNullHypothesis(String nullHypothesis)
	{
		this.nullHypothesis=nullHypothesis;
	}
	public void setLevelOfSignificance(double levelOfSignificance)
	{
		this.levelOfSignificance=levelOfSignificance;
	}
	
	
	public static void setTabularValue(double levelOfSignificance,int tail)
	{
		
		//System.out.println(new ZTable().table.size());
		//search for the tabular in table
		try {
			ZTable table = new ZTable();
			
			//System.out.println(table.getTable().size());
			for(int i=0;i<table.getTable().size();i++)
			{
				
				if(table.getTable().get(i).getKey()==levelOfSignificance)
				{
					if(tail==1)
					{
						tabularValue=table.getTable().get(i).getVerticalValues().get(0).getValue();
						
					}
					else
					{
						tabularValue=table.getTable().get(i).getVerticalValues().get(1).getValue();
						
					}
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	

	public static double getTabularValue()
	{
		return tabularValue;
	}

	/*public void setConfidencelLevel(double significanceLevel)
	{
		
		this.confidenceLevel=1-significanceLevel;
	}*/
	
	public double getZScore()
	{
		return zScore;
	}
	public void setZScore()
	{
		try {
			System.out.println("mean1: "+mean1);
			System.out.println("mean2: "+mean2);
			double numerator = mean1-mean2;
			System.out.println("numerator: "+numerator);
			System.out.println("sd1: "+sd1);
			System.out.println("n1: "+n1);
			double denominator1 = (sd1*sd1)/n1;
			System.out.println("denominator1: "+denominator1);
			System.out.println("sd2: "+sd2);
			System.out.println("n2: "+n2);
			double denominator2 = (sd2*sd2)/n2;
			System.out.println("denominator2: "+denominator2);
			double denominator = Math.sqrt(denominator1+denominator2);
			System.out.println("denominator: "+denominator);
			zScore = Math.abs(numerator/denominator);
			//zScore=Math.abs((mean1-mean2)/(Math.sqrt(((sd1*sd1)/n1)+((sd2*sd2)/n2))));
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	
	public double getSd1() {
		return sd1;
	}


	public void setSd1() {
		
		double summation=0.0;
		try {
			//get the summation+=(x-mean1)(x-mean1)
			for(int i=0;i<sample1.size();i++)
			{
				summation+=(sample1.get(i)-mean1)*(sample1.get(i)-mean1);
			}
			//after getting the summation
			//get the sd1
			
			this.sd1= Math.sqrt(summation/(n1-1));
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
		
	}
	public double getSd2() {
		return sd2;
	}


	public void setSd2() {
		double summation=0.0;
		
		try {
			//get the summation+=(x-mean1)(x-mean1)
			for(int i=0;i<sample2.size();i++)
			{
				summation+=(sample2.get(i)-mean2)*(sample2.get(i)-mean2);
			}
			//after getting the summation
			//get the sd2
			
			this.sd2= Math.sqrt(summation/(n2-1));
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	
	void setN1()
	{
		this.n1 = sample1.size();
	}
	public double getN1()
	{
		return n1;
	}
	public double getN2()
	{
		return n2;
	}
	void setN2()
	{
		this.n2 = sample2.size();
	}
	
	void setMean1()
	{
		//mean1=CentralTendencyB.mean(sample1);
		try {
			CentralTendencyB.setMean(sample1);
			mean1= CentralTendencyB.getMean();
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	void setMean2()
	{
		try {
			CentralTendencyB.setMean(sample2);
			mean2= CentralTendencyB.getMean();
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	
	public ArrayList<Double> getSample1()
	{
		return sample1;
	}
	public ArrayList<Double> getSample2()
	{
		return sample2;
	}
	
	
	
	public void setInput(String input)
	{
		int j=0;
		String str="", term="";
		boolean open=true;
		double strDouble=0;
		
		try {
			for(int i=0;i<input.length();i++)
			{
				//store the char into string
				String symbol = String.valueOf(input.charAt(i));
				//System.out.println("symbol: "+symbol);
				
				if(i==input.length()-1)
				{
					term+=symbol;
					strDouble = Double.valueOf(term);
					sample2.add(strDouble);
					str="";
				}
				else if(symbol.equals(" "))
				{
					//nothing would happen
				}
				else if (symbol.equals("|"))
				{
						open=false;
						strDouble = Double.valueOf(term);
						sample1.add(strDouble);
						str="";
						term="";
				}
					/*else
					{
						str+=symbol;
						//System.out.println(str);
					}
				}*/
				else if(symbol.equals(","))
				{
					
					strDouble = Double.valueOf(term);
					
					//System.out.println("strDouble: "+strDouble);
					//System.out.println("strDouble");
					
					if(open==true)
					{
						sample1.add(strDouble);
						str="";
						term="";
					}
					else
					{
						sample2.add(strDouble);
						str="";
						term="";
					}
				}
				else
				{
					term+=symbol;
					//System.out.println("term: "+term);
				}
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}

	public double getMean2() {
		return mean2;
	}
	public double getMean1() {
		return mean1;
	}


}

 


