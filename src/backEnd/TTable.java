package backEnd;

import java.util.ArrayList;

public class TTable 
{


	private static ArrayList<ValueHandler> table;
		
		
	TTable()
	{
		//ValueHandler v1 = new ValueHandler(0.0,0.06);
		//sample.add(v1);
		
		table = new ArrayList<ValueHandler>();
		
		ArrayList<ValueHandler> index0 = new ArrayList<ValueHandler>();
		
		index0.add(new ValueHandler(1,0.000));
		index0.add(new ValueHandler(2,0.000));
		index0.add(new ValueHandler(3,0.000));
		index0.add(new ValueHandler(4,0.000));
		index0.add(new ValueHandler(5,0.000));
		index0.add(new ValueHandler(6,0.000));
		index0.add(new ValueHandler(7,0.000));
		index0.add(new ValueHandler(8,0.000));
		index0.add(new ValueHandler(9,0.000));
		index0.add(new ValueHandler(10,0.000));
		index0.add(new ValueHandler(11,0.000));
		index0.add(new ValueHandler(12,0.000));
		index0.add(new ValueHandler(13,0.000));
		index0.add(new ValueHandler(14,0.000));
		index0.add(new ValueHandler(15,0.000));
		index0.add(new ValueHandler(16,0.000));
		index0.add(new ValueHandler(17,0.000));
		index0.add(new ValueHandler(18,0.000));
		index0.add(new ValueHandler(19,0.000));
		index0.add(new ValueHandler(20,0.000));
		index0.add(new ValueHandler(21,0.000));		
		index0.add(new ValueHandler(22,0.000));
		index0.add(new ValueHandler(23,0.000));
		index0.add(new ValueHandler(24,0.000));
		index0.add(new ValueHandler(25,0.000));
		index0.add(new ValueHandler(26,0.000));
		index0.add(new ValueHandler(27,0.000));
		index0.add(new ValueHandler(28,0.000));
		index0.add(new ValueHandler(29,0.000));
		index0.add(new ValueHandler(30,0.000));
		index0.add(new ValueHandler(40,0.000));
		index0.add(new ValueHandler(60,0.000));
		index0.add(new ValueHandler(80,0.000));
		index0.add(new ValueHandler(100,0.000));
		index0.add(new ValueHandler(1000,0.000));
		
		table.add(new ValueHandler(0.50,1.0,index0));
		
		
		ArrayList<ValueHandler> index1 = new ArrayList<ValueHandler>();
		
		index1.add(new ValueHandler(1,1.000));
		index1.add(new ValueHandler(2,0.816));
		index1.add(new ValueHandler(3,0.765));
		index1.add(new ValueHandler(4,0.741));
		index1.add(new ValueHandler(5,0.727));
		index1.add(new ValueHandler(6,0.718));
		index1.add(new ValueHandler(7,0.711));
		index1.add(new ValueHandler(8,0.706));
		index1.add(new ValueHandler(9,0.703));
		index1.add(new ValueHandler(10,0.700));
		index1.add(new ValueHandler(11,0.697));
		index1.add(new ValueHandler(12,0.695));
		index1.add(new ValueHandler(13,0.694));
		index1.add(new ValueHandler(14,0.692));
		index1.add(new ValueHandler(15,0.691));
		index1.add(new ValueHandler(16,0.690));
		index1.add(new ValueHandler(17,0.689));
		index1.add(new ValueHandler(18,0.688));
		index1.add(new ValueHandler(19,0.688));
		index1.add(new ValueHandler(20,0.687));
		index1.add(new ValueHandler(21,0.686));
		index1.add(new ValueHandler(22,0.686));		
		index1.add(new ValueHandler(23,0.685));
		index1.add(new ValueHandler(24,0.685));
		index1.add(new ValueHandler(25,0.684));
		index1.add(new ValueHandler(26,0.684));
		index1.add(new ValueHandler(27,0.684));
		index1.add(new ValueHandler(28,0.683));
		index1.add(new ValueHandler(29,0.683));
		index1.add(new ValueHandler(30,0.683));
		index1.add(new ValueHandler(40,0.681));
		index1.add(new ValueHandler(60,0.679));
		index1.add(new ValueHandler(80,0.678));
		index1.add(new ValueHandler(100,0.677));
		index1.add(new ValueHandler(1000,0.675));
		
		table.add(new ValueHandler(0.25,0.50,index1));
		
		ArrayList<ValueHandler> index2 = new ArrayList<ValueHandler>();
		
		index2.add(new ValueHandler(1,1.376));
		index2.add(new ValueHandler(2,1.061));
		index2.add(new ValueHandler(3,0.978));
		index2.add(new ValueHandler(4,0.941));
		index2.add(new ValueHandler(5,0.920));
		index2.add(new ValueHandler(6,0.906));
		index2.add(new ValueHandler(7,0.896));
		index2.add(new ValueHandler(8,0.889));
		index2.add(new ValueHandler(9,0.883));
		index2.add(new ValueHandler(10,0.879));
		index2.add(new ValueHandler(11,0.876));
		index2.add(new ValueHandler(12,0.873));
		index2.add(new ValueHandler(13,0.870));
		index2.add(new ValueHandler(14,0.868));
		index2.add(new ValueHandler(15,0.866));
		index2.add(new ValueHandler(16,0.865));
		index2.add(new ValueHandler(17,0.863));
		index2.add(new ValueHandler(18,0.862));
		index2.add(new ValueHandler(19,0.861));
		index2.add(new ValueHandler(20,0.860));
		index2.add(new ValueHandler(21,0.859));
		index2.add(new ValueHandler(22,0.858));		
		index2.add(new ValueHandler(23,0.858));
		index2.add(new ValueHandler(24,0.857));
		index2.add(new ValueHandler(25,0.856));
		index2.add(new ValueHandler(26,0.856));
		index2.add(new ValueHandler(27,0.855));
		index2.add(new ValueHandler(28,0.855));
		index2.add(new ValueHandler(29,0.854));
		index2.add(new ValueHandler(30,0.854));
		index2.add(new ValueHandler(40,0.851));
		index2.add(new ValueHandler(60,0.848));
		index2.add(new ValueHandler(80,0.846));
		index2.add(new ValueHandler(100,0.845));
		index2.add(new ValueHandler(1000,0.842));
		
		table.add(new ValueHandler(0.20,0.40,index2));
		
		ArrayList<ValueHandler> index3 = new ArrayList<ValueHandler>();
		
		index3.add(new ValueHandler(1,1.963));
		index3.add(new ValueHandler(2,1.386));
		index3.add(new ValueHandler(3,1.250));
		index3.add(new ValueHandler(4,1.190));
		index3.add(new ValueHandler(5,1.156));
		index3.add(new ValueHandler(6,1.134));
		index3.add(new ValueHandler(7,1.119));
		index3.add(new ValueHandler(8,1.108));
		index3.add(new ValueHandler(9,1.100));
		index3.add(new ValueHandler(10,1.093));
		index3.add(new ValueHandler(11,1.088));
		index3.add(new ValueHandler(12,1.083));
		index3.add(new ValueHandler(13,1.079));
		index3.add(new ValueHandler(14,1.076));
		index3.add(new ValueHandler(15,1.074));
		index3.add(new ValueHandler(16,1.071));
		index3.add(new ValueHandler(17,1.069));
		index3.add(new ValueHandler(18,1.067));
		index3.add(new ValueHandler(19,1.066));
		index3.add(new ValueHandler(20,1.064));
		index3.add(new ValueHandler(21,1.063));
		index3.add(new ValueHandler(22,1.061));		
		index3.add(new ValueHandler(23,1.060));
		index3.add(new ValueHandler(24,1.059));
		index3.add(new ValueHandler(25,1.058));
		index3.add(new ValueHandler(26,1.058));
		index3.add(new ValueHandler(27,1.057));
		index3.add(new ValueHandler(28,1.056));
		index3.add(new ValueHandler(29,1.055));
		index3.add(new ValueHandler(30,1.055));
		index3.add(new ValueHandler(40,1.050));
		index3.add(new ValueHandler(60,1.045));
		index3.add(new ValueHandler(80,1.043));
		index3.add(new ValueHandler(100,1.042));
		index3.add(new ValueHandler(1000,1.037));
		
		table.add(new ValueHandler(0.15,0.30,index3));
		
		ArrayList<ValueHandler> index4 = new ArrayList<ValueHandler>();
		
		index4.add(new ValueHandler(1,3.078));
		index4.add(new ValueHandler(2,1.886));
		index4.add(new ValueHandler(3,1.638));
		index4.add(new ValueHandler(4,1.533));
		index4.add(new ValueHandler(5,1.476));
		index4.add(new ValueHandler(6,1.440));
		index4.add(new ValueHandler(7,1.415));
		index4.add(new ValueHandler(8,1.397));
		index4.add(new ValueHandler(9,1.383));
		index4.add(new ValueHandler(10,1.372));
		index4.add(new ValueHandler(11,1.363));
		index4.add(new ValueHandler(12,1.356));
		index4.add(new ValueHandler(13,1.350));
		index4.add(new ValueHandler(14,1.345));
		index4.add(new ValueHandler(15,1.341));
		index4.add(new ValueHandler(16,1.337));
		index4.add(new ValueHandler(17,1.333));
		index4.add(new ValueHandler(18,1.330));
		index4.add(new ValueHandler(19,1.328));
		index4.add(new ValueHandler(20,1.325));
		index4.add(new ValueHandler(21,1.323));
		index4.add(new ValueHandler(22,1.321));		
		index4.add(new ValueHandler(23,1.319));
		index4.add(new ValueHandler(24,1.318));
		index4.add(new ValueHandler(25,1.316));
		index4.add(new ValueHandler(26,1.315));
		index4.add(new ValueHandler(27,1.314));
		index4.add(new ValueHandler(28,1.313));
		index4.add(new ValueHandler(29,1.311));
		index4.add(new ValueHandler(30,1.310));
		index4.add(new ValueHandler(40,1.303));
		index4.add(new ValueHandler(60,1.296));
		index4.add(new ValueHandler(80,1.292));
		index4.add(new ValueHandler(100,1.290));
		index4.add(new ValueHandler(1000,1.282));
		
		table.add(new ValueHandler(0.10,0.20,index4));
		
		
		ArrayList<ValueHandler> index5 = new ArrayList<ValueHandler>();
		
		index5.add(new ValueHandler(1,6.314));
		index5.add(new ValueHandler(2,2.920));
		index5.add(new ValueHandler(3,2.353));
		index5.add(new ValueHandler(4,2.132));
		index5.add(new ValueHandler(5,2.015));
		index5.add(new ValueHandler(6,1.943));
		index5.add(new ValueHandler(7,1.895));
		index5.add(new ValueHandler(8,1.860));
		index5.add(new ValueHandler(9,1.833));
		index5.add(new ValueHandler(10,1.812));
		index5.add(new ValueHandler(11,1.796));
		index5.add(new ValueHandler(12,1.782));
		index5.add(new ValueHandler(13,1.771));
		index5.add(new ValueHandler(14,1.761));
		index5.add(new ValueHandler(15,1.753));
		index5.add(new ValueHandler(16,1.746));
		index5.add(new ValueHandler(17,1.740));
		index5.add(new ValueHandler(18,1.734));
		index5.add(new ValueHandler(19,1.729));
		index5.add(new ValueHandler(20,1.725));
		index5.add(new ValueHandler(21,1.721));
		index5.add(new ValueHandler(22,1.717));		
		index5.add(new ValueHandler(23,1.714));
		index5.add(new ValueHandler(24,1.711));
		index5.add(new ValueHandler(25,1.708));
		index5.add(new ValueHandler(26,1.706));
		index5.add(new ValueHandler(27,1.703));
		index5.add(new ValueHandler(28,1.701));
		index5.add(new ValueHandler(29,1.699));
		index5.add(new ValueHandler(30,1.697));
		index5.add(new ValueHandler(40,1.684));
		index5.add(new ValueHandler(60,1.671));
		index5.add(new ValueHandler(80,1.664));
		index5.add(new ValueHandler(100,1.660));
		index5.add(new ValueHandler(1000,1.646));
		
		table.add(new ValueHandler(0.05,0.10,index5));
				
		ArrayList<ValueHandler> index6 = new ArrayList<ValueHandler>();
		
		index6.add(new ValueHandler(1,12.71));
		index6.add(new ValueHandler(2,4.303));
		index6.add(new ValueHandler(3,3.182));
		index6.add(new ValueHandler(4,2.776));
		index6.add(new ValueHandler(5,2.571));
		index6.add(new ValueHandler(6,2.447));
		index6.add(new ValueHandler(7,2.365));
		index6.add(new ValueHandler(8,2.306));
		index6.add(new ValueHandler(9,2.262));
		index6.add(new ValueHandler(10,2.228));
		index6.add(new ValueHandler(11,2.201));
		index6.add(new ValueHandler(12,2.179));
		index6.add(new ValueHandler(13,2.160));
		index6.add(new ValueHandler(14,2.145));
		index6.add(new ValueHandler(15,2.131));
		index6.add(new ValueHandler(16,2.120));
		index6.add(new ValueHandler(17,2.110));
		index6.add(new ValueHandler(18,2.101));
		index6.add(new ValueHandler(19,2.093));
		index6.add(new ValueHandler(20,2.086));
		index6.add(new ValueHandler(21,2.080));
		index6.add(new ValueHandler(22,2.074));		
		index6.add(new ValueHandler(23,2.069));
		index6.add(new ValueHandler(24,2.064));
		index6.add(new ValueHandler(25,2.060));
		index6.add(new ValueHandler(26,2.056));
		index6.add(new ValueHandler(27,2.052));
		index6.add(new ValueHandler(28,2.048));
		index6.add(new ValueHandler(29,2.045));
		index6.add(new ValueHandler(30,2.042));
		index6.add(new ValueHandler(40,2.021));
		index6.add(new ValueHandler(60,2.000));
		index6.add(new ValueHandler(80,1.990));
		index6.add(new ValueHandler(100,1.984));
		index6.add(new ValueHandler(1000,1.962));
		
		table.add(new ValueHandler(0.025,0.05,index6));
		
		ArrayList<ValueHandler> index7 = new ArrayList<ValueHandler>();
		
		index7.add(new ValueHandler(1,31.82));
		index7.add(new ValueHandler(2,6.965));
		index7.add(new ValueHandler(3,4.541));
		index7.add(new ValueHandler(4,3.747));
		index7.add(new ValueHandler(5,3.365));
		index7.add(new ValueHandler(6,3.143));
		index7.add(new ValueHandler(7,2.998));
		index7.add(new ValueHandler(8,2.896));
		index7.add(new ValueHandler(9,2.821));
		index7.add(new ValueHandler(10,2.764));
		index7.add(new ValueHandler(11,2.718));
		index7.add(new ValueHandler(12,2.681));
		index7.add(new ValueHandler(13,2.650));
		index7.add(new ValueHandler(14,2.624));
		index7.add(new ValueHandler(15,2.602));
		index7.add(new ValueHandler(16,2.583));
		index7.add(new ValueHandler(17,2.567));
		index7.add(new ValueHandler(18,2.552));
		index7.add(new ValueHandler(19,2.539));
		index7.add(new ValueHandler(20,2.528));
		index7.add(new ValueHandler(21,2.518));
		index7.add(new ValueHandler(22,2.508));		
		index7.add(new ValueHandler(23,2.500));
		index7.add(new ValueHandler(24,2.492));
		index7.add(new ValueHandler(25,2.485));
		index7.add(new ValueHandler(26,2.479));
		index7.add(new ValueHandler(27,2.473));
		index7.add(new ValueHandler(28,2.467));
		index7.add(new ValueHandler(29,2.462));
		index7.add(new ValueHandler(30,2.457));
		index7.add(new ValueHandler(40,2.423));
		index7.add(new ValueHandler(60,2.390));
		index7.add(new ValueHandler(80,2.374));
		index7.add(new ValueHandler(100,2.364));
		index7.add(new ValueHandler(1000,2.330));
		
		table.add(new ValueHandler(0.01,0.02,index7));
		
		ArrayList<ValueHandler> index8 = new ArrayList<ValueHandler>();
		
		index8.add(new ValueHandler(1,63.66));
		index8.add(new ValueHandler(2,9.925));
		index8.add(new ValueHandler(3,5.841));
		index8.add(new ValueHandler(4,4.604));
		index8.add(new ValueHandler(5,4.032));
		index8.add(new ValueHandler(6,3.707));
		index8.add(new ValueHandler(7,3.499));
		index8.add(new ValueHandler(8,3.355));
		index8.add(new ValueHandler(9,3.250));
		index8.add(new ValueHandler(10,3.169));
		index8.add(new ValueHandler(11,3.106));
		index8.add(new ValueHandler(12,3.055));
		index8.add(new ValueHandler(13,3.012));
		index8.add(new ValueHandler(14,2.977));
		index8.add(new ValueHandler(15,2.947));
		index8.add(new ValueHandler(16,2.921));
		index8.add(new ValueHandler(17,2.898));
		index8.add(new ValueHandler(18,2.878));
		index8.add(new ValueHandler(19,2.861));
		index8.add(new ValueHandler(20,2.845));
		index8.add(new ValueHandler(21,2.831));
		index8.add(new ValueHandler(22,2.819));		
		index8.add(new ValueHandler(23,2.807));
		index8.add(new ValueHandler(24,2.797));
		index8.add(new ValueHandler(25,2.787));
		index8.add(new ValueHandler(26,2.779));
		index8.add(new ValueHandler(27,2.771));
		index8.add(new ValueHandler(28,2.763));
		index8.add(new ValueHandler(29,2.756));
		index8.add(new ValueHandler(30,2.750));
		index8.add(new ValueHandler(40,2.704));
		index8.add(new ValueHandler(60,2.660));
		index8.add(new ValueHandler(80,2.639));
		index8.add(new ValueHandler(100,2.626));
		index8.add(new ValueHandler(1000,2.581));
		
		table.add(new ValueHandler(0.005,0.01,index8));
		
		ArrayList<ValueHandler> index9 = new ArrayList<ValueHandler>();
		
		index9.add(new ValueHandler(1,318.31));
		index9.add(new ValueHandler(2,22.327));
		index9.add(new ValueHandler(3,10.215));
		index9.add(new ValueHandler(4,7.173));
		index9.add(new ValueHandler(5,5.893));
		index9.add(new ValueHandler(6,5.208));
		index9.add(new ValueHandler(7,4.785));
		index9.add(new ValueHandler(8,4.501));
		index9.add(new ValueHandler(9,4.297));
		index9.add(new ValueHandler(10,4.144));
		index9.add(new ValueHandler(11,4.025));
		index9.add(new ValueHandler(12,3.930));
		index9.add(new ValueHandler(13,3.852));
		index9.add(new ValueHandler(14,3.787));
		index9.add(new ValueHandler(15,3.733));
		index9.add(new ValueHandler(16,3.686));
		index9.add(new ValueHandler(17,3.646));
		index9.add(new ValueHandler(18,3.610));
		index9.add(new ValueHandler(19,3.579));
		index9.add(new ValueHandler(20,3.552));
		index9.add(new ValueHandler(21,3.527));
		index9.add(new ValueHandler(22,3.505));		
		index9.add(new ValueHandler(23,3.485));
		index9.add(new ValueHandler(24,3.467));
		index9.add(new ValueHandler(25,3.450));
		index9.add(new ValueHandler(26,3.435));
		index9.add(new ValueHandler(27,3.421));
		index9.add(new ValueHandler(28,3.408));
		index9.add(new ValueHandler(29,3.396));
		index9.add(new ValueHandler(30,3.385));
		index9.add(new ValueHandler(40,3.307));
		index9.add(new ValueHandler(60,3.232));
		index9.add(new ValueHandler(80,3.195));
		index9.add(new ValueHandler(100,3.174));
		index9.add(new ValueHandler(1000,3.098));
		
		table.add(new ValueHandler(0.001,0.002,index9));
		
		ArrayList<ValueHandler> index10 = new ArrayList<ValueHandler>();
		
		index10.add(new ValueHandler(1,636.62));
		index10.add(new ValueHandler(2,31.599));
		index10.add(new ValueHandler(3,12.924));
		index10.add(new ValueHandler(4,8.610));
		index10.add(new ValueHandler(5,6.869));
		index10.add(new ValueHandler(6,5.959));
		index10.add(new ValueHandler(7,5.408));
		index10.add(new ValueHandler(8,5.041));
		index10.add(new ValueHandler(9,4.781));
		index10.add(new ValueHandler(10,4.587));
		index10.add(new ValueHandler(11,4.437));
		index10.add(new ValueHandler(12,4.318));
		index10.add(new ValueHandler(13,4.221));
		index10.add(new ValueHandler(14,4.140));
		index10.add(new ValueHandler(15,4.073));
		index10.add(new ValueHandler(16,4.015));
		index10.add(new ValueHandler(17,3.965));
		index10.add(new ValueHandler(18,3.922));
		index10.add(new ValueHandler(19,3.883));
		index10.add(new ValueHandler(20,3.850));
		index10.add(new ValueHandler(21,3.819));
		index10.add(new ValueHandler(22,3.792));		
		index10.add(new ValueHandler(23,3.768));
		index10.add(new ValueHandler(24,3.745));
		index10.add(new ValueHandler(25,3.725));
		index10.add(new ValueHandler(26,3.707));
		index10.add(new ValueHandler(27,3.690));
		index10.add(new ValueHandler(28,3.674));
		index10.add(new ValueHandler(29,3.659));
		index10.add(new ValueHandler(30,3.646));
		index10.add(new ValueHandler(40,3.551));
		index10.add(new ValueHandler(60,3.460));
		index10.add(new ValueHandler(80,3.416));
		index10.add(new ValueHandler(100,3.390));
		index10.add(new ValueHandler(1000,3.300));
		
		table.add(new ValueHandler(0.0005,0.001,index10));
		//ArrayList<ValueHandler> 
	}
	public static ArrayList<ValueHandler> getTable()
	{
		return table;
	}
}
