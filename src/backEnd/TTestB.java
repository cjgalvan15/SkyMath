package backEnd;

import java.util.ArrayList;

public class TTestB 
{
	private ArrayList<Double> sample1 = new ArrayList<Double>();
	private ArrayList<Double> sample2 = new ArrayList<Double>();
	private ArrayList<Double> differenceList = new ArrayList<Double>();
	private double summationDifference,summationDifferenceSquared;
	private double tScore;
	private double tabularValue;
	private String nullHypothesis;
	private double levelOfSignificance;
	private String conclusion;
	private int tail, degreeOfFreedom;
	private int n;
	private double mean1, mean2;
	
	
	
	public TTestB(String dataInput, String nullHypothesis, double levelOfSignificance) 
	{
		
		
		try {
			//sample1.add(0.01);
			
			
			setInput(dataInput);
			setN();
			
			if(getN()>2&&getN()<=30)
			{
				setNullHypothesis(nullHypothesis);
				
				setLevelOfSignificance(levelOfSignificance);
				setDegreeOfFreedom();
				setTail();
				
				setTabularValue(getTail(), getDegreeOfFreedom(),getLevelOfSignificance());
				
				setMean1();
				System.out.println("Mean1: "+getMean1());
				setMean2();
				System.out.println("Mean2: "+getMean2());
				setSummationDifference();
				
				System.out.println("summation difference: "+getSummationDifference());
				setSummationDifferenceSquared();
				System.out.println("summation difference squared: "+getSummationDifferenceSquared());
				setTScore();
				System.out.println("TScore: "+getTScore());
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
	public void setConclusion()
	{
		try {
			if(tScore<tabularValue)
			{
				
				this.conclusion="Accept Null Hypothesis";
			}
			else
			{
				this.conclusion="Reject Null Hypothesis";
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public String getConclusion()
	{
		return this.conclusion;
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
								//System.out.println("There is no: "+ str);
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
	public int getTail()
	{
		return this.tail;
	}

	public void setTabularValue(int tail, int df, double levelOfSignificance)
	{
		TTable table = new TTable();
		boolean confirmLvlOfSigni=false;
		
		
		try {
			if(tail==1)
			{
				for(int i=0;i<table.getTable().size();i++)
				{
					double temp = table.getTable().get(i).getOneTailedKey();
					
					if(temp==levelOfSignificance)
					{
						confirmLvlOfSigni = true;
						for(int j=0;j<table.getTable().get(i).getVerticalValues().size();j++)
						{
							int temp2 = table.getTable().get(i).getVerticalValues().get(j).getDf();
							
							if(temp2==df)
							{
								this.tabularValue = table.getTable().get(i).getVerticalValues().get(j).getValue();
							}
						}
					}
					
					
				}
			}
			else
			{
				for(int i=0;i<table.getTable().size();i++)
				{
					double temp = table.getTable().get(i).getTwoTailedKey();
					
					if(temp==levelOfSignificance)
					{
						
						confirmLvlOfSigni = true;
						for(int j=0;j<table.getTable().get(i).getVerticalValues().size();j++)
						{
							int temp2 = table.getTable().get(i).getVerticalValues().get(j).getDf();
							
							if(temp2==df)
							{
								
								this.tabularValue = table.getTable().get(i).getVerticalValues().get(j).getValue();
							}
						}
					}

				}
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public double getTabularValue()
	{
		return this.tabularValue;
	}
		
	public double getTScore()
	{
		return this.tScore;
	}
	public void setMean1()
	{
		int sample1Size= sample1.size();
		double temp=0;
		
		for(int i=0; i<sample1Size;i++)
		{
			temp+=sample1.get(i);
		}
		mean1=temp/sample1Size;
		
	}
	public double getMean1()
	{
		return mean1;
	}
	public double getMean2()
	{
		return mean2;
	}
	public void setMean2()
	{
		int sample2Size = sample2.size();
		double temp=0;
		
		for(int i=0;i<sample2Size;i++)
		{
			temp+=sample2.get(i);
		}
		mean2= temp/sample2Size;
	}
	public void setTScore()
	{
		double temp;
		
		try {
		System.out.println("summationDifference: "+summationDifference);
		System.out.println("summationDifferenceSquared: "+summationDifferenceSquared);
		System.out.println("n: "+n);
		//System.out.println("numerator: "+(getMean1()-getMean2()));
		//System.out.println("denominator: "+Math.sqrt((summationDifferenceSquared)-((summationDifference*summationDifference)/n)/(n*(n-1))));
		double numerator = getMean1()-getMean2();
		System.out.println("numerator: "+numerator);
		double denominator1 = (summationDifferenceSquared);
		System.out.println("denominator1: "+denominator1);
		double denominator2 = (summationDifference*summationDifference)/n;
		System.out.println("denominator2: "+denominator2);
		double denominator3 = n*(n-1);
		System.out.println("denominator3: "+denominator3);
		double denominatorF = Math.sqrt((denominator1-denominator2)/denominator3);
		System.out.println("denominatorF: "+denominatorF);
		temp=numerator/denominatorF;
			//temp=Math.abs(temp);// debug
			
		System.out.println("temp: "+temp);
		tScore=temp;
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public void setN()
	{
		n=sample1.size();
	}
	public int getN()
	{
		return n;
	}
	public double getSummationDifferenceSquared()
	{
		return summationDifferenceSquared;
	}
	public void setSummationDifferenceSquared()
	{
		double temp=0;
		
		try {
			for(int i=0;i<differenceList.size();i++)
			{
				temp=differenceList.get(i)*differenceList.get(i);
				//System.out.println("i: "+i+" | temp: "+temp);
				summationDifferenceSquared+=temp;
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public double getSummationDifference()
	{
		return summationDifference;
	}
	public void setSummationDifference()
	{
		double temp=0;
		try {
			if(sample1.size()==sample2.size())
			{
				
				for(int i=0;i<sample1.size();i++)
				{
					temp=sample1.get(i)-sample2.get(i);
					summationDifference+=temp;
					differenceList.add(temp);
				}
				
			}
			else
			{
				System.out.println("Size of sets are not the same");
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public void setLevelOfSignificance(double levelOfSignificance) {
		this.levelOfSignificance=levelOfSignificance;
		
	}
	public double getLevelOfSignificance()
	{
		return this.levelOfSignificance;
	}
	public void setNullHypothesis(String nullHypothesis) {
		this.nullHypothesis=nullHypothesis;
		
	}
	public String getNullHypothesis()
	{
		return this.nullHypothesis;
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
		String str="";
		boolean open=true;
		double strDouble;
		
		try {
			for(int i=0;i<input.length();i++)
			{
				//store the char into string
				String symbol = String.valueOf(input.charAt(i));
				//System.out.println("i: "+i+" | symbol: "+symbol);
				if(i==input.length()-1)
				{
					str+=symbol;
					strDouble = Double.valueOf(str);
					sample2.add(strDouble);
					str="";
				}
				else if(!symbol.equals(","))
				{
					if(symbol.equals("|"))
					{
						open=false;
						strDouble = Double.valueOf(str);
						sample1.add(strDouble);
						str="";
					}
					else
					{
						str+=symbol;
						//System.out.println(str);
					}
				}
				else
				{
					
					strDouble = Double.valueOf(str);
					//System.out.println("strDouble");
					
					if(open==true)
					{
						sample1.add(strDouble);
						str="";
					}
					else
					{
						sample2.add(strDouble);
						str="";
					}
				}
			}
			if(sample1.size()<=30)
			{
				
			}
			else
			{
				sample1.clear();
				sample2.clear();
				System.out.println("Please number of data less than 30");
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	
	public void setDegreeOfFreedom()
	{
		this.degreeOfFreedom=n-1;
	}
	public void setTabularValue(double levelOfSignificance, int tail)
	{
		
	}
	public int getDegreeOfFreedom()
	{
		return this.degreeOfFreedom;
	}
	
	
	
	
	

}
