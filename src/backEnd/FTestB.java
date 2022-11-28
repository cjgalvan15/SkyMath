

package backEnd;

import java.util.ArrayList;

public class FTestB 
{
	private ArrayList<String> listOfSample = new ArrayList<String>();
	private String nullHypothesis;
	private double levelOfSignificance, SSw, MSSb, MSSw, fScore, tabularValue;
	private double summationOfX, summationOfXSquared, TSS, SSb, summationPerSquaredSet;
	private int n, numOfRows;
	private String conclusion;
	private int DFb, DFw;
	
	
	public FTestB(String dataInput, String nullHypothesis, double levelOfSignificance)
	{
		
		try {
			setInput(dataInput);
			setNullHypothesis(nullHypothesis);
			setLevelOfSignificance(levelOfSignificance);
			setSummationOfX(dataInput);
			setSummationOfXSquared(dataInput);
			
			
			
			setN();
			setTSS();
			
			
			
			setSummationPerSquaredSet();
			setSSb();
			setSSw();
			setDFb();
			setDFw();
			setMSSb();
			setMSSw();
			
			FTable fTable = new FTable();
			
			setTabularValue(fTable.getTable(),getLevelOfSignificance(),getDFb(), getDFw());
			setFScore();
			setConclusion();
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	
	public void setTabularValue(ArrayList<FTableCompilation> compilation, double levelOfSinificance, int DFb, int DFw)
	{
		
		try {
			for(int i=0;i<compilation.size();i++)
			{
				//store the level of significance per table
				double tempLvlOfSignificance = compilation.get(i).getLevelOfSignificance();
				
				if(tempLvlOfSignificance==levelOfSignificance)
				{
					for(int j=0;j<compilation.get(i).getFTableCompilation().size();j++)
					{
						//temporarily store DFb into tempDFn
						int tempDFn = compilation.get(i).getFTableCompilation().get(j).getDFn();
						
						if(tempDFn==DFb)
						{
							for(int k=0;k<compilation.get(i).getFTableCompilation().get(j).getVerticalValues().size();k++)
							{
								
								//temporarily store key into tempKey
								int tempKey=compilation.get(i).getFTableCompilation().get(j).getVerticalValues().get(k).getDf();
								
								if(tempKey==DFw)
								{
									this.tabularValue=compilation.get(i).getFTableCompilation().get(j).getVerticalValues().get(k).getValue();
								}
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
	public void setConclusion()
	{
		
		try {
			if(fScore<tabularValue)
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
	public void setDFb()
	{
		this.DFb= listOfSample.size()-1;
	}
	public double getFScore()
	{
		return this.fScore;
	}
	public void setDFw()
	{
		this.DFw = (n-1)-DFb;
	}
	public void setMSSb()
	{
		this.MSSb= SSb/DFb;
	}
	public void setMSSw()
	{
		this.MSSw = SSw/DFw;
	}
	public void setFScore()
	{
		this.fScore = MSSb/MSSw;
	}
	public int getDFb()
	{
		return this.DFb;
	}
	public int getDFw()
	{
		return this.DFw;
	}
	
	public void setSSw()
	{
	
		this.SSw=TSS-SSb;
	}
	public double getSSw()
	{
		return this.SSw;
	}
	public void setSummationPerSquaredSet()
	{
		try {
			for(int i=0;i<listOfSample.size();i++)
			{
				
				double tempStorage=0.0;
				String tempStr="";
				
			
				for(int j=0;j<listOfSample.get(i).length();j++)
				{
					String getChar = String.valueOf(listOfSample.get(i).charAt(j));
					double temp;
					
					
					if(j==listOfSample.get(i).length()-1)
					{
						tempStr+=String.valueOf(listOfSample.get(i).charAt(j));
						double getWholeNum = Double.valueOf(tempStr);
						tempStorage+=getWholeNum;
						
						//System.out.println("tempStorage: "+tempStorage);
						
						tempStr="";
						getWholeNum=0.0;
					}
					else if(getChar.equals(","))
					{
						double getWholeNum = Double.valueOf(tempStr);
						tempStorage+=getWholeNum;
						
						//clear the tempStr and getWholeNum
						tempStr="";
						getWholeNum=0.0;
						
					}
					else
					{
						tempStr+=String.valueOf(listOfSample.get(i).charAt(j));
						
					}
				}
				tempStorage*=tempStorage;
				summationPerSquaredSet+=tempStorage;
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}

		
	}
	public double getSummationPerSquaredSet()
	{
		return this.summationPerSquaredSet;
	}
	public void setSSb()
	{
		try {
			this.SSb = (summationPerSquaredSet/numOfRows)-((summationOfX*summationOfX)/n);
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public double getSSb()
	{
		return this.SSb;
	}
	public int getNumOfRows()
	{
		return this.numOfRows;
	}
	public void setN()
	{
		
		int size=0;
		
		try {
			for(int i=0;i<listOfSample.get(0).length();i++)
			{
				String getChar = String.valueOf(listOfSample.get(0).charAt(i));
				
				
				if(i==listOfSample.get(0).length()-1)
				{
					++size;
				}
				else if(getChar.equals(","))
				{
					++size;
				}
				
			}
			this.numOfRows=size;
			size*=listOfSample.size();
			this.n=size;
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
	public int getN()
	{
		return this.n;
	}
	public void setTSS()
	{
		
		try {
			TSS= summationOfXSquared-((summationOfX*summationOfX)/n);
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
	}
	public double getTSS()
	{
		return this.TSS;
	}
	public void setSummationOfX(String dataInput)
	{
		
		double tempStorage=0.0;
		String tempStr="";
		
		try {
			for(int i=0;i<dataInput.length();i++)
			{
				String getChar = String.valueOf(dataInput.charAt(i));
				double temp;
				
				if(i==dataInput.length()-1)
				{
					tempStr+=String.valueOf(dataInput.charAt(i));
					double getWholeNum = Double.valueOf(tempStr);
					tempStorage+=getWholeNum;
					
					
					
					tempStr="";
					getWholeNum=0.0;
				}
				else if(getChar.equals(",")||getChar.equals("|"))
				{
					double getWholeNum = Double.valueOf(tempStr);
					tempStorage+=getWholeNum;
					
					//clear the tempStr and getWholeNum
					tempStr="";
					getWholeNum=0.0;
					
				}
				else
				{
					tempStr+=String.valueOf(dataInput.charAt(i));
					
				}
				
			}
			this.summationOfX= tempStorage;
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		

	}
	public double getSummationOfX()
	{
		return this.summationOfX;
	}
	public void setSummationOfXSquared(String dataInput)
	{
		double tempStorage=0.0;
		String tempStr="";
		
		try {
			for(int i=0;i<dataInput.length();i++)
			{
				String getChar = String.valueOf(dataInput.charAt(i));
				double temp;
				
				if(i==dataInput.length()-1)
				{
					tempStr+=String.valueOf(dataInput.charAt(i));
					double getWholeNum = Double.valueOf(tempStr);
					tempStorage+=getWholeNum*getWholeNum;
					
					
					tempStr="";
					getWholeNum=0.0;
				}
				else if(getChar.equals(",")||getChar.equals("|"))
				{
					double getWholeNum = Double.valueOf(tempStr);
					tempStorage+=getWholeNum*getWholeNum;
					
					//clear the tempStr and getWholeNum
					tempStr="";
					getWholeNum=0.0;
					
				}
				else
				{
					tempStr+=String.valueOf(dataInput.charAt(i));
					
				}
				
			}
			this.summationOfXSquared= tempStorage;
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
		
	}
	public double getSummationOfXSquared()
	{
		return this.summationOfXSquared;
	}
	
	public void setLevelOfSignificance(double levelOfSignificance)
	{
		this.levelOfSignificance=levelOfSignificance;
	}
	public double getLevelOfSignificance()
	{
		return this.levelOfSignificance;
	}
	public void setNullHypothesis(String nullHypothesis)
	{
		this.nullHypothesis=nullHypothesis;
	}
	public String getNullHypothesis()
	{
		return this.nullHypothesis;
	}
	
	public ArrayList<String> getInput()
	{
		return this.listOfSample;
	}
	public void setInput(String dataInput)
	{
		String tempStr="";
		
		try {
			for(int i=0;i<dataInput.length();i++)
			{
				String temp=String.valueOf(dataInput.charAt(i));
				
				if(i==dataInput.length()-1)
				{
					tempStr+=temp;
					listOfSample.add(tempStr);
					
					
				}
				else if(temp.equals("|"))
				{
					listOfSample.add(tempStr);
					tempStr="";
				}
				else
				{
					tempStr+=temp;
				}
			}
		}catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
	}
}
