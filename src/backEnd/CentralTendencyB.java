package backEnd;

import java.util.ArrayList;

public class CentralTendencyB {
	
	private static ArrayList<Double> list;
	private static double[] list2;
	private static double mean, median;
	private static ArrayList<String> mode;
	
	public CentralTendencyB(String input)
	{
		try {
			setList(input);
			setMean(getList());
			listToArray(getList());
			setMedian(list2);
			setMode(list2);
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
	}
	
	public static ArrayList<Double> getList()
	{
		return list;
	}
	
	public static void setList(String input)
	{
		try {
			list = new ArrayList<Double>(); 
			String str="";
			
			for(int i=0;i<input.length();i++)
			{
				String symbol = String.valueOf(input.charAt(i));
				
				if(i==input.length()-1)
				{
					str+=symbol;
					list.add(Double.valueOf(str));
					str="";
				}
				else if(symbol.equals(" "))
				{
					//nothing gonna happen here
				}
				else if(symbol.equals(","))
				{
					list.add(Double.valueOf(str));
					str="";
				}
				else
				{
					str+=symbol;
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
		
		
		//System.out.println(list);
		
	}
	
	public static double[] listToArray(ArrayList<Double> input)
	{
		int size = input.size();
		list2 = new double[size];
		
		for(int i=0;i<list2.length;i++)
		{
			list2[i]=input.get(i);
		}
		
		//after getting the elements within the input
		//return the list
		
		return list2;
		
		
	}
	public static double[] getList2()
	{
		return list2;
	}

	public static void setMean(ArrayList<Double> inputData)
	{
		try {
			double sum=0;
			int i=0;
			for(; i<inputData.size();i++)
			{
				sum+=inputData.get(i);
			}
			double iDouble= Integer.valueOf(i++);
			mean = sum/iDouble;
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
	
		
	}
	public static double getMean()
	{
		return mean;
	}
	public static void setMedian(double[] inputData)
	{
		int middle=0;
		median = 0;
		
		try {
			if((inputData.length%2)==1)
			{
				middle=inputData.length/2;
				median= inputData[middle];
			}
			else if((inputData.length%2)==0)
			{
				middle=inputData.length/2;
				median=(inputData[middle]+inputData[middle-1])/2;
			
			}
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
	}
	public static double getMedian()
	{
		return median;
	}
	
	public static ArrayList<String> getMode()
	{
		return mode;
	}
	public static void setMode(double[] inputData)
	{
		ArrayList<Double> tempStorage = new ArrayList<Double>();
		ArrayList<String> hasSameData = new ArrayList<String>();
		int j=0, k=0, count=0, tempSize=0;
		int highest=0;
		double getData=0, tempData=0;
		mode=new ArrayList<String>();
		//store the inputData within an ArrayList "tempStorage"
		
		
		try {
			for(int i=0;i<inputData.length;i++)
			{
				getData = inputData[i];
				tempStorage.add(getData);
				
			}
			
			//get the data that has the same within the arraylist
			for(;j<tempStorage.size()-1;j++)
			{
				tempData = tempStorage.get(j);
				for(k=j+1;k<tempStorage.size();k++)
				{
					tempSize = tempStorage.size();
					//System.out.println("tempData: "+tempData+" | "+tempStorage.get(k)+" | tempSize: "+tempSize);
					
					if(tempData==tempStorage.get(k))
					{
						//System.out.println("tempData: "+tempData+" | "+tempStorage.get(k));
						count++;
						tempStorage.remove(k);
						k--;
						//System.out.println("[1]"+"tempData: "+tempData+" | count: "+count);
						tempSize=tempStorage.size();
						
					}
					if(k==tempSize-1&&count!=0)
					{
						//System.out.println("[2]"+"tempData: "+tempData+" | "+"Count: "+count+1);
						//convert the count value into String
						String countStr = String.valueOf(count+1);
						//convert the tempData into String
						String tempDataStr = String.valueOf(tempData);
						
						hasSameData.add(tempDataStr+"~"+countStr);
						count=0;
							
					}
				}
			}
			for(int i=0;i<hasSameData.size();i++)
			{
				String getHasSameData = hasSameData.get(i);
				for(int z=0;z<getHasSameData.length();z++)
				{
					String temporary = String.valueOf(getHasSameData.charAt(z));
					
					
					if(temporary.equals("~"))
					{
						temporary = String.valueOf(getHasSameData.charAt(++z));
						//System.out.println("Temporary: "+temporary+" | getHasSameData: "+getHasSameData);
					
						int temporaryInt = Integer.valueOf(temporary);
						if(i==0)
						{
							highest = Integer.valueOf(temporary);
							z=getHasSameData.length();
						}
						else if(i!=0&&temporaryInt>highest)
						{
							highest=temporaryInt;
							z=getHasSameData.length();
						}

					}
				}
			}
			
			//System.out.println("highest: "+highest);
			
			//search for the other data with highest
			
			boolean open=false;
			for(int i=0;i<hasSameData.size();i++)
			{
				String str="";
				String getHasSameData = hasSameData.get(i);
				
				for(int x=0;x<getHasSameData.length();x++)
				{
					String temporary = String.valueOf(getHasSameData.charAt(x));
					if(temporary.equals("~"))
					{
						int tally= Integer.valueOf(String.valueOf(getHasSameData.charAt(++x)));
						if(tally==highest)
						{
							//copy the data into a String
							open=true;
							for(int index = 0;index<=x-2;index++)
							{
								str+=String.valueOf(getHasSameData.charAt(index));
							}
						}
					}
					
				}
				if(open==true)
				{
					mode.add(str);
					str="";
					open=false;
				}
				
			}
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
		
	
		
	}
	

}
