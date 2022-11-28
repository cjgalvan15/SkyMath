package backEnd;

import java.util.ArrayList;

import frontEnd.ZTableResults;

public class ZTable 
{
	private static ArrayList<ValueHandler> table;
		
		
	public ZTable()
	{
		
		//ValueHandler v1 = new ValueHandler(0.0,0.06);
		//sample.add(v1);
		
		//ZTableResults zTableResults = new ZTableResults();
		
		table = new ArrayList<ValueHandler>();
	
		
		//create an arrayList 
		//w/ the 0 value.get
		ArrayList<ValueHandler> pointTen = new ArrayList<ValueHandler>();
		
		
		
		pointTen.add(new ValueHandler(1,1.281,ZTableResults.get_pN1Point281()));
		
	
		
		pointTen.add(new ValueHandler(2,1.645,ZTableResults.get_pN1Point6451()));
		
		
		
		table.add(new ValueHandler(0.10,pointTen, ZTableResults.get_point10()));
		

		
		ArrayList<ValueHandler> pointZeroFive = new ArrayList<ValueHandler>();
		
		
		
		pointZeroFive.add(new ValueHandler(1,1.6451, ZTableResults.get_pN1Point6451()));
		
		
		
		pointZeroFive.add(new ValueHandler(2,1.96,ZTableResults.get_pN1Point96()));
		
		
		
		table.add(new ValueHandler(0.05,pointZeroFive, ZTableResults.get_point05()));
	
		
		ArrayList<ValueHandler> pointTwentyFive = new ArrayList<ValueHandler>();
		
		
		
		pointTwentyFive.add(new ValueHandler(1,1.961, ZTableResults.get_pN1Point961()));
		

		pointTwentyFive.add(new ValueHandler(2,2.33, ZTableResults.get_pN2Point33()));
		
		table.add(new ValueHandler(0.025,pointTwentyFive, ZTableResults.get_point025()));
		
		ArrayList<ValueHandler> pointZeroOne = new ArrayList<ValueHandler>();
		
		pointZeroOne.add(new ValueHandler(1,2.3, ZTableResults.get_pN2Point3()));
		pointZeroOne.add(new ValueHandler(2,2.38, ZTableResults.get_pN2Point38()));
		
		table.add(new ValueHandler(0.01,pointZeroOne, ZTableResults.get_point01()));
		
		//System.out.println("0.10 LOS at one tailed: "+table.get(0).getVerticalValues().get(0).getValue());
		
		
	}
	
	
	public static ArrayList<ValueHandler> getTable()
	{
		return table;
	}
	
	
}
