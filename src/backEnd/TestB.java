package backEnd;

import java.util.ArrayList;

public class TestB {

	private static ArrayList<Double> sample = new ArrayList<Double>();

	public static String listToString(ArrayList<String> list)
	{
		
		String result = "";
		
		for(int i=0;i<list.size();i++)
		{
			if(i<=list.size()-1)
			{
				result+= list.get(i);
			}
			else
			{
				result= "and "+list.get(i);
			}
		}
		
		return result;
	}
}
