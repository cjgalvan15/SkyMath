package backEnd;

import java.util.ArrayList;

public class FTable 
{
	private  ArrayList<ValueHandler> zeroPointTenTable;
	private  ArrayList<ValueHandler> zeroPointZeroFiveTable;
	private ArrayList<ValueHandler> zeroPointZeroTwentyFiveTable;
	private ArrayList<ValueHandler> zeroPointZeroOneTable;
	private static ArrayList<FTableCompilation> table;
	
	FTable()
	{
		try {
			table = new ArrayList<FTableCompilation>();
			
			setZeroPointTenTable();
			setZeroPointZeroFiveTable();
			setZeroPointZeroTwentyFiveTable();
			setZeroPointZeroOneTable();
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
		//compile ftables within an arrayList
		
	}
	public ArrayList<FTableCompilation> getTable()
	{
		return this.table;
	}
	
	public void setZeroPointZeroOneTable()
	{
		zeroPointZeroOneTable = new ArrayList<ValueHandler>();
		
		ArrayList<ValueHandler> index0= new ArrayList<ValueHandler>();
		
		index0.add(new ValueHandler(1, 4052.181));
		index0.add(new ValueHandler(2, 98.503));
		index0.add(new ValueHandler(3, 34.116));
		index0.add(new ValueHandler(4, 21.198));
		index0.add(new ValueHandler(5, 16.258));
		index0.add(new ValueHandler(6, 13.745));
		index0.add(new ValueHandler(7, 12.246));
		index0.add(new ValueHandler(8, 11.259));
		index0.add(new ValueHandler(9, 10.561));
		index0.add(new ValueHandler(10, 10.044));/////////////////////////////////////
		index0.add(new ValueHandler(11, 9.646));
		index0.add(new ValueHandler(12, 9.330));
		index0.add(new ValueHandler(13, 9.074));
		index0.add(new ValueHandler(14, 8.862));
		index0.add(new ValueHandler(15, 8.683));
		index0.add(new ValueHandler(16, 8.531));
		index0.add(new ValueHandler(17,8.400));
		index0.add(new ValueHandler(18, 8.285));
		index0.add(new ValueHandler(19, 8.185));
		index0.add(new ValueHandler(20, 8.096));
		index0.add(new ValueHandler(21, 8.017));
		index0.add(new ValueHandler(22, 7.945));
		index0.add(new ValueHandler(23, 7.881));
		index0.add(new ValueHandler(24, 7.823));
		index0.add(new ValueHandler(25, 7.770));
		index0.add(new ValueHandler(26, 7.721	));
		index0.add(new ValueHandler(27, 7.677));
		index0.add(new ValueHandler(28,7.636));
		index0.add(new ValueHandler(29,7.598));
		index0.add(new ValueHandler(30, 7.562));
		index0.add(new ValueHandler(40, 7.314));
		index0.add(new ValueHandler(60, 7.077));
		index0.add(new ValueHandler(120, 6.851));
		
		zeroPointZeroOneTable.add(new ValueHandler(1,index0));
		
		ArrayList<ValueHandler> index1= new ArrayList<ValueHandler>();
		
		index1.add(new ValueHandler(1, 4999.500));
		index1.add(new ValueHandler(2, 99.000	));
		index1.add(new ValueHandler(3, 30.817));
		index1.add(new ValueHandler(4, 18.000));
		index1.add(new ValueHandler(5, 13.274));
		index1.add(new ValueHandler(6, 10.925));
		index1.add(new ValueHandler(7, 9.547));
		index1.add(new ValueHandler(8, 8.649));
		index1.add(new ValueHandler(9, 8.022));
		index1.add(new ValueHandler(10, 7.559));
		index1.add(new ValueHandler(11, 7.206));
		index1.add(new ValueHandler(12,6.927));
		index1.add(new ValueHandler(13, 6.701));
		index1.add(new ValueHandler(14, 6.515));
		index1.add(new ValueHandler(15, 6.359));
		index1.add(new ValueHandler(16, 6.226));
		index1.add(new ValueHandler(17, 6.112));
		index1.add(new ValueHandler(18, 6.013));
		index1.add(new ValueHandler(19, 5.926));
		index1.add(new ValueHandler(20,5.849));
		index1.add(new ValueHandler(21, 5.780));
		index1.add(new ValueHandler(22, 5.719));
		index1.add(new ValueHandler(23, 5.664));
		index1.add(new ValueHandler(24, 5.614));
		index1.add(new ValueHandler(25, 5.568));
		index1.add(new ValueHandler(26, 5.526));
		index1.add(new ValueHandler(27, 5.488));
		index1.add(new ValueHandler(28, 5.453));
		index1.add(new ValueHandler(29, 5.420));
		index1.add(new ValueHandler(30,5.390));
		index1.add(new ValueHandler(40, 5.179));
		index1.add(new ValueHandler(60, 4.977));
		index1.add(new ValueHandler(120, 4.787));
		
		zeroPointZeroOneTable.add(new ValueHandler(2,index1));
		
		ArrayList<ValueHandler> index2= new ArrayList<ValueHandler>();
		
		index2.add(new ValueHandler(1, 5403.352));
		index2.add(new ValueHandler(2, 99.166));
		index2.add(new ValueHandler(3,29.457));
		index2.add(new ValueHandler(4, 16.694));
		index2.add(new ValueHandler(5, 12.060));
		index2.add(new ValueHandler(6, 9.780));
		index2.add(new ValueHandler(7, 8.451));
		index2.add(new ValueHandler(8, 7.591));
		index2.add(new ValueHandler(9, 6.992));
		index2.add(new ValueHandler(10,6.552));
		index2.add(new ValueHandler(11, 6.217));
		index2.add(new ValueHandler(12, 5.953));
		index2.add(new ValueHandler(13, 5.739));
		index2.add(new ValueHandler(14, 5.564));
		index2.add(new ValueHandler(15, 5.417));
		index2.add(new ValueHandler(16, 5.292));
		index2.add(new ValueHandler(17, 5.185));
		index2.add(new ValueHandler(18, 5.092));
		index2.add(new ValueHandler(19, 5.010));
		index2.add(new ValueHandler(20, 4.938));
		index2.add(new ValueHandler(21, 4.874));
		index2.add(new ValueHandler(22, 4.817));
		index2.add(new ValueHandler(23, 4.765));
		index2.add(new ValueHandler(24, 4.718));
		index2.add(new ValueHandler(25, 4.675));
		index2.add(new ValueHandler(26, 4.637));
		index2.add(new ValueHandler(27, 4.601));
		index2.add(new ValueHandler(28, 4.568));
		index2.add(new ValueHandler(29, 4.538));
		index2.add(new ValueHandler(30, 4.510));
		index2.add(new ValueHandler(40, 4.313));
		index2.add(new ValueHandler(60, 4.126));
		index2.add(new ValueHandler(120, 3.949));
		
		zeroPointZeroOneTable.add(new ValueHandler(3,index2));
		
		ArrayList<ValueHandler> index3= new ArrayList<ValueHandler>();
		
		index3.add(new ValueHandler(1,5624.583));
		index3.add(new ValueHandler(2, 99.249));
		index3.add(new ValueHandler(3,28.710));
		index3.add(new ValueHandler(4, 15.977));
		index3.add(new ValueHandler(5, 11.392));
		index3.add(new ValueHandler(6, 9.148));
		index3.add(new ValueHandler(7, 7.847));
		index3.add(new ValueHandler(8, 7.006));
		index3.add(new ValueHandler(9,6.422));
		index3.add(new ValueHandler(10, 5.994));
		index3.add(new ValueHandler(11,5.668));
		index3.add(new ValueHandler(12, 5.412));
		index3.add(new ValueHandler(13,5.205));
		index3.add(new ValueHandler(14, 5.035));
		index3.add(new ValueHandler(15, 4.893));
		index3.add(new ValueHandler(16, 4.773));
		index3.add(new ValueHandler(17,4.669));
		index3.add(new ValueHandler(18, 4.579));
		index3.add(new ValueHandler(19, 4.500));
		index3.add(new ValueHandler(20, 4.431));
		index3.add(new ValueHandler(21, 4.369));
		index3.add(new ValueHandler(22, 4.313));
		index3.add(new ValueHandler(23, 4.264));
		index3.add(new ValueHandler(24, 4.218));
		index3.add(new ValueHandler(25, 4.177));
		index3.add(new ValueHandler(26, 4.140));
		index3.add(new ValueHandler(27, 4.106));
		index3.add(new ValueHandler(28,4.074));
		index3.add(new ValueHandler(29, 4.045));
		index3.add(new ValueHandler(30,4.018));
		index3.add(new ValueHandler(40, 3.828));
		index3.add(new ValueHandler(60, 3.649));
		index3.add(new ValueHandler(120, 3.480));
		
		zeroPointZeroOneTable.add(new ValueHandler(4,index3));
		
		ArrayList<ValueHandler> index4= new ArrayList<ValueHandler>();
		
		index4.add(new ValueHandler(1, 5763.650));
		index4.add(new ValueHandler(2, 99.299));
		index4.add(new ValueHandler(3, 28.237));/////last modified
		index4.add(new ValueHandler(4, 15.522));
		index4.add(new ValueHandler(5, 10.967));
		index4.add(new ValueHandler(6, 8.746));
		index4.add(new ValueHandler(7, 7.460));
		index4.add(new ValueHandler(8, 6.632));
		index4.add(new ValueHandler(9, 6.057));
		index4.add(new ValueHandler(10, 5.636));
		index4.add(new ValueHandler(11,5.316));
		index4.add(new ValueHandler(12, 5.064));
		index4.add(new ValueHandler(13, 4.862));
		index4.add(new ValueHandler(14, 4.695));
		index4.add(new ValueHandler(15,4.556));
		index4.add(new ValueHandler(16, 4.437));
		index4.add(new ValueHandler(17, 4.336));
		index4.add(new ValueHandler(18, 4.248));
		index4.add(new ValueHandler(19,4.171));
		index4.add(new ValueHandler(20, 4.103));
		index4.add(new ValueHandler(21,4.042	));
		index4.add(new ValueHandler(22, 3.988));
		index4.add(new ValueHandler(23, 3.939));
		index4.add(new ValueHandler(24, 3.895));
		index4.add(new ValueHandler(25, 3.855));
		index4.add(new ValueHandler(26,3.818));
		index4.add(new ValueHandler(27,3.785));
		index4.add(new ValueHandler(28, 3.754	));
		index4.add(new ValueHandler(29, 3.725));
		index4.add(new ValueHandler(30, 3.699));
		index4.add(new ValueHandler(40, 3.514));
		index4.add(new ValueHandler(60, 3.339));
		index4.add(new ValueHandler(120, 3.174));
		
		zeroPointZeroOneTable.add(new ValueHandler(5,index4));
		
		ArrayList<ValueHandler> index5= new ArrayList<ValueHandler>();
		
		index5.add(new ValueHandler(1, 5858.986));
		index5.add(new ValueHandler(2, 99.333));
		index5.add(new ValueHandler(3, 27.911));
		index5.add(new ValueHandler(4, 15.207));
		index5.add(new ValueHandler(5, 10.672));
		index5.add(new ValueHandler(6, 8.466));
		index5.add(new ValueHandler(7,7.191));
		index5.add(new ValueHandler(8, 6.371));
		index5.add(new ValueHandler(9, 5.802));
		index5.add(new ValueHandler(10, 5.386));
		index5.add(new ValueHandler(11,5.069));
		index5.add(new ValueHandler(12, 4.821));
		index5.add(new ValueHandler(13, 4.620));
		index5.add(new ValueHandler(14,4.456));
		index5.add(new ValueHandler(15, 4.318));
		index5.add(new ValueHandler(16, 4.202));
		index5.add(new ValueHandler(17, 4.102));
		index5.add(new ValueHandler(18,4.015));
		index5.add(new ValueHandler(19, 3.939));
		index5.add(new ValueHandler(20, 3.871));
		index5.add(new ValueHandler(21, 3.812));
		index5.add(new ValueHandler(22, 3.758));
		index5.add(new ValueHandler(23, 3.710));
		index5.add(new ValueHandler(24, 3.667));
		index5.add(new ValueHandler(25, 3.627));
		index5.add(new ValueHandler(26, 3.591));
		index5.add(new ValueHandler(27, 3.558));
		index5.add(new ValueHandler(28, 3.528));
		index5.add(new ValueHandler(29,3.499));
		index5.add(new ValueHandler(30, 3.473));
		index5.add(new ValueHandler(40,3.291));
		index5.add(new ValueHandler(60,3.119));
		index5.add(new ValueHandler(120, 2.956));
		
		zeroPointZeroOneTable.add(new ValueHandler(6,index5));
		
		ArrayList<ValueHandler> index6= new ArrayList<ValueHandler>();
		
		index6.add(new ValueHandler(1, 5928.356));
		index6.add(new ValueHandler(2, 99.356	));
		index6.add(new ValueHandler(3, 27.672));
		index6.add(new ValueHandler(4, 14.976));
		index6.add(new ValueHandler(5, 10.456));
		index6.add(new ValueHandler(6, 8.260));
		index6.add(new ValueHandler(7, 6.993));
		index6.add(new ValueHandler(8, 6.178));
		index6.add(new ValueHandler(9, 5.613));
		index6.add(new ValueHandler(10, 5.200));
		index6.add(new ValueHandler(11, 4.886));
		index6.add(new ValueHandler(12, 4.640));
		index6.add(new ValueHandler(13,4.441));
		index6.add(new ValueHandler(14, 4.278));
		index6.add(new ValueHandler(15, 4.142));
		index6.add(new ValueHandler(16, 4.026));
		index6.add(new ValueHandler(17, 3.927));
		index6.add(new ValueHandler(18, 3.841));
		index6.add(new ValueHandler(19,3.765));
		index6.add(new ValueHandler(20, 3.699));
		index6.add(new ValueHandler(21, 3.640));
		index6.add(new ValueHandler(22, 3.587));
		index6.add(new ValueHandler(23, 3.539));
		index6.add(new ValueHandler(24, 3.496));
		index6.add(new ValueHandler(25, 3.457));
		index6.add(new ValueHandler(26, 3.421));
		index6.add(new ValueHandler(27, 3.388));
		index6.add(new ValueHandler(28, 3.358));
		index6.add(new ValueHandler(29,3.330));
		index6.add(new ValueHandler(30, 3.304	));
		index6.add(new ValueHandler(40, 3.124));
		index6.add(new ValueHandler(60, 2.953));
		index6.add(new ValueHandler(120, 2.792));
		
		zeroPointZeroOneTable.add(new ValueHandler(7,index6));
		
		ArrayList<ValueHandler> index7= new ArrayList<ValueHandler>();
		
		index7.add(new ValueHandler(1, 5981.070));
		index7.add(new ValueHandler(2, 99.374));
		index7.add(new ValueHandler(3, 27.489));
		index7.add(new ValueHandler(4, 14.799));
		index7.add(new ValueHandler(5, 10.289));
		index7.add(new ValueHandler(6, 8.102));
		index7.add(new ValueHandler(7, 6.840));
		index7.add(new ValueHandler(8, 6.029));
		index7.add(new ValueHandler(9,5.467));
		index7.add(new ValueHandler(10, 5.057));
		index7.add(new ValueHandler(11, 4.744));
		index7.add(new ValueHandler(12, 4.499));
		index7.add(new ValueHandler(13, 4.302));
		index7.add(new ValueHandler(14, 4.140));
		index7.add(new ValueHandler(15, 4.004));
		index7.add(new ValueHandler(16, 3.890));
		index7.add(new ValueHandler(17, 3.791));
		index7.add(new ValueHandler(18, 3.705));
		index7.add(new ValueHandler(19, 3.631));
		index7.add(new ValueHandler(20, 3.564));
		index7.add(new ValueHandler(21, 3.506));
		index7.add(new ValueHandler(22, 3.453));
		index7.add(new ValueHandler(23,3.406));
		index7.add(new ValueHandler(24, 3.363));
		index7.add(new ValueHandler(25, 3.324));
		index7.add(new ValueHandler(26, 3.288));
		index7.add(new ValueHandler(27, 3.256));
		index7.add(new ValueHandler(28, 3.226));
		index7.add(new ValueHandler(29, 3.198));
		index7.add(new ValueHandler(30, 3.173));
		index7.add(new ValueHandler(40, 2.993));
		index7.add(new ValueHandler(60, 2.823));
		index7.add(new ValueHandler(120, 2.663));
		
		zeroPointZeroOneTable.add(new ValueHandler(8,index7));
		
		ArrayList<ValueHandler> index8= new ArrayList<ValueHandler>();
		
		index8.add(new ValueHandler(1, 6022.473));
		index8.add(new ValueHandler(2, 99.388));
		index8.add(new ValueHandler(3, 27.345));
		index8.add(new ValueHandler(4, 14.659));
		index8.add(new ValueHandler(5, 10.158));
		index8.add(new ValueHandler(6, 7.976));
		index8.add(new ValueHandler(7, 6.719));
		index8.add(new ValueHandler(8, 5.911));
		index8.add(new ValueHandler(9, 5.351));
		index8.add(new ValueHandler(10, 4.942));
		index8.add(new ValueHandler(11, 4.632));
		index8.add(new ValueHandler(12, 4.388));
		index8.add(new ValueHandler(13, 4.191));
		index8.add(new ValueHandler(14, 4.030));
		index8.add(new ValueHandler(15, 3.895));
		index8.add(new ValueHandler(16, 3.780));
		index8.add(new ValueHandler(17, 3.682));
		index8.add(new ValueHandler(18, 3.597));
		index8.add(new ValueHandler(19, 3.523));
		index8.add(new ValueHandler(20, 3.457));
		index8.add(new ValueHandler(21, 3.398));
		index8.add(new ValueHandler(22, 3.346));
		index8.add(new ValueHandler(23, 3.299));
		index8.add(new ValueHandler(24, 3.256));
		index8.add(new ValueHandler(25, 3.217));
		index8.add(new ValueHandler(26, 3.182));
		index8.add(new ValueHandler(27, 3.149));
		index8.add(new ValueHandler(28, 3.120));
		index8.add(new ValueHandler(29, 3.092));
		index8.add(new ValueHandler(30, 3.067));
		index8.add(new ValueHandler(40,2.888));
		index8.add(new ValueHandler(60, 2.718));
		index8.add(new ValueHandler(120,2.559));
		
		zeroPointZeroOneTable.add(new ValueHandler(9,index8));
		
		ArrayList<ValueHandler> index9= new ArrayList<ValueHandler>();
		
		index9.add(new ValueHandler(1, 6055.847));
		index9.add(new ValueHandler(2,99.399));
		index9.add(new ValueHandler(3, 27.229));
		index9.add(new ValueHandler(4, 14.546));
		index9.add(new ValueHandler(5, 10.051));
		index9.add(new ValueHandler(6, 7.874));
		index9.add(new ValueHandler(7, 6.620));
		index9.add(new ValueHandler(8, 5.814));
		index9.add(new ValueHandler(9, 5.257));
		index9.add(new ValueHandler(10, 4.849));
		index9.add(new ValueHandler(11, 4.539));
		index9.add(new ValueHandler(12,4.296));
		index9.add(new ValueHandler(13,4.100));
		index9.add(new ValueHandler(14, 3.939));
		index9.add(new ValueHandler(15, 3.805));
		index9.add(new ValueHandler(16, 3.691));
		index9.add(new ValueHandler(17, 3.593));
		index9.add(new ValueHandler(18, 3.508));
		index9.add(new ValueHandler(19, 3.434));
		index9.add(new ValueHandler(20, 3.368));
		index9.add(new ValueHandler(21, 3.310));
		index9.add(new ValueHandler(22, 3.258));
		index9.add(new ValueHandler(23, 3.211));
		index9.add(new ValueHandler(24, 3.168));
		index9.add(new ValueHandler(25, 3.129));
		index9.add(new ValueHandler(26, 3.094));
		index9.add(new ValueHandler(27, 3.062));
		index9.add(new ValueHandler(28, 3.032));
		index9.add(new ValueHandler(29,3.005));
		index9.add(new ValueHandler(30, 2.979	));
		index9.add(new ValueHandler(40, 2.801));
		index9.add(new ValueHandler(60, 2.632));
		index9.add(new ValueHandler(120, 2.472));
		
		zeroPointZeroOneTable.add(new ValueHandler(10,index9));
		
		ArrayList<ValueHandler> index10= new ArrayList<ValueHandler>();
		
		index10.add(new ValueHandler(1, 6106.321));
		index10.add(new ValueHandler(2, 99.416));
		index10.add(new ValueHandler(3, 27.052));
		index10.add(new ValueHandler(4, 14.374));
		index10.add(new ValueHandler(5, 9.888));
		index10.add(new ValueHandler(6, 7.718));
		index10.add(new ValueHandler(7, 6.469));
		index10.add(new ValueHandler(8, 5.667));
		index10.add(new ValueHandler(9, 5.111));
		index10.add(new ValueHandler(10, 4.706));
		index10.add(new ValueHandler(11,4.397));
		index10.add(new ValueHandler(12, 4.155));
		index10.add(new ValueHandler(13, 3.960));
		index10.add(new ValueHandler(14, 3.800));
		index10.add(new ValueHandler(15, 3.666));
		index10.add(new ValueHandler(16, 3.553));
		index10.add(new ValueHandler(17, 3.455));
		index10.add(new ValueHandler(18, 3.371));
		index10.add(new ValueHandler(19, 3.297));
		index10.add(new ValueHandler(20, 3.231));
		index10.add(new ValueHandler(21, 3.173));
		index10.add(new ValueHandler(22, 3.121));
		index10.add(new ValueHandler(23, 3.074));
		index10.add(new ValueHandler(24, 3.032));
		index10.add(new ValueHandler(25,2.993));
		index10.add(new ValueHandler(26,2.958));
		index10.add(new ValueHandler(27, 2.926));
		index10.add(new ValueHandler(28,2.896	));
		index10.add(new ValueHandler(29,2.868));
		index10.add(new ValueHandler(30,2.843));
		index10.add(new ValueHandler(40, 2.665));
		index10.add(new ValueHandler(60, 2.496));
		index10.add(new ValueHandler(120, 2.336));//last attempt
		
		zeroPointZeroOneTable.add(new ValueHandler(12,index10));
		
		ArrayList<ValueHandler> index11= new ArrayList<ValueHandler>();
		
		index11.add(new ValueHandler(1,6157.285));
		index11.add(new ValueHandler(2, 99.433));
		index11.add(new ValueHandler(3, 26.872));//last attempt
		index11.add(new ValueHandler(4,14.198));
		index11.add(new ValueHandler(5, 9.722));
		index11.add(new ValueHandler(6, 7.559));
		index11.add(new ValueHandler(7, 6.314));
		index11.add(new ValueHandler(8, 5.515));
		index11.add(new ValueHandler(9, 4.962));
		index11.add(new ValueHandler(10, 4.558));
		index11.add(new ValueHandler(11, 4.251));
		index11.add(new ValueHandler(12, 4.010));
		index11.add(new ValueHandler(13,3.815));
		index11.add(new ValueHandler(14, 3.656));
		index11.add(new ValueHandler(15, 3.522));
		index11.add(new ValueHandler(16, 3.409));
		index11.add(new ValueHandler(17,3.312));
		index11.add(new ValueHandler(18, 3.227));
		index11.add(new ValueHandler(19,3.153));
		index11.add(new ValueHandler(20, 3.088));
		index11.add(new ValueHandler(21,3.030));
		index11.add(new ValueHandler(22, 2.978));
		index11.add(new ValueHandler(23, 2.931));
		index11.add(new ValueHandler(24, 2.889));
		index11.add(new ValueHandler(25, 2.850));
		index11.add(new ValueHandler(26, 2.815));
		index11.add(new ValueHandler(27, 2.783));
		index11.add(new ValueHandler(28, 2.753));
		index11.add(new ValueHandler(29, 2.726));
		index11.add(new ValueHandler(30, 2.700));
		index11.add(new ValueHandler(40, 2.522));
		index11.add(new ValueHandler(60,2.352));
		index11.add(new ValueHandler(120, 2.192));
		
		zeroPointZeroOneTable.add(new ValueHandler(15,index11));
		
		ArrayList<ValueHandler> index12= new ArrayList<ValueHandler>();
		
		index12.add(new ValueHandler(1, 6208.730));
		index12.add(new ValueHandler(2, 99.449));
		index12.add(new ValueHandler(3,26.690));
		index12.add(new ValueHandler(4, 14.020	));
		index12.add(new ValueHandler(5, 9.553));
		index12.add(new ValueHandler(6, 7.396));
		index12.add(new ValueHandler(7, 6.155));
		index12.add(new ValueHandler(8, 5.359));
		index12.add(new ValueHandler(9, 4.808));
		index12.add(new ValueHandler(10, 4.405));
		index12.add(new ValueHandler(11, 4.099));
		index12.add(new ValueHandler(12,3.858));
		index12.add(new ValueHandler(13, 3.665));
		index12.add(new ValueHandler(14, 3.505));
		index12.add(new ValueHandler(15, 3.372));
		index12.add(new ValueHandler(16, 3.259));
		index12.add(new ValueHandler(17,3.162));
		index12.add(new ValueHandler(18, 3.077));
		index12.add(new ValueHandler(19, 3.003));
		index12.add(new ValueHandler(20, 2.938));
		index12.add(new ValueHandler(21, 2.880));
		index12.add(new ValueHandler(22, 2.827));
		index12.add(new ValueHandler(23, 2.781));
		index12.add(new ValueHandler(24, 2.738));
		index12.add(new ValueHandler(25, 2.699));
		index12.add(new ValueHandler(26, 2.664));
		index12.add(new ValueHandler(27, 2.632));
		index12.add(new ValueHandler(28, 2.602));
		index12.add(new ValueHandler(29, 2.574));
		index12.add(new ValueHandler(30, 2.549));
		index12.add(new ValueHandler(40, 2.369));
		index12.add(new ValueHandler(60, 2.198));
		index12.add(new ValueHandler(120, 2.035));
		
		zeroPointZeroOneTable.add(new ValueHandler(20,index12));
		
		ArrayList<ValueHandler> index13= new ArrayList<ValueHandler>();
		
		index13.add(new ValueHandler(1, 6234.631));
		index13.add(new ValueHandler(2,99.458));
		index13.add(new ValueHandler(3,26.598));
		index13.add(new ValueHandler(4, 13.929));
		index13.add(new ValueHandler(5,9.466));
		index13.add(new ValueHandler(6, 7.313	));
		index13.add(new ValueHandler(7,6.074));
		index13.add(new ValueHandler(8, 5.279));
		index13.add(new ValueHandler(9, 4.729));
		index13.add(new ValueHandler(10, 4.327));
		index13.add(new ValueHandler(11, 4.021));
		index13.add(new ValueHandler(12, 3.780));
		index13.add(new ValueHandler(13, 3.587));
		index13.add(new ValueHandler(14,3.427));
		index13.add(new ValueHandler(15, 3.294));
		index13.add(new ValueHandler(16, 3.181));
		index13.add(new ValueHandler(17,3.084));
		index13.add(new ValueHandler(18, 2.999));
		index13.add(new ValueHandler(19, 2.925));
		index13.add(new ValueHandler(20, 2.859));
		index13.add(new ValueHandler(21, 2.801));
		index13.add(new ValueHandler(22, 2.749	));
		index13.add(new ValueHandler(23, 2.702));
		index13.add(new ValueHandler(24, 2.659));
		index13.add(new ValueHandler(25, 2.620));
		index13.add(new ValueHandler(26, 2.585));
		index13.add(new ValueHandler(27, 2.552));
		index13.add(new ValueHandler(28, 2.522));
		index13.add(new ValueHandler(29, 2.495));
		index13.add(new ValueHandler(30, 2.469));
		index13.add(new ValueHandler(40, 2.288));
		index13.add(new ValueHandler(60, 2.115));
		index13.add(new ValueHandler(120, 1.950));
		
		
		zeroPointZeroOneTable.add(new ValueHandler(24,index13));
		
		ArrayList<ValueHandler> index14= new ArrayList<ValueHandler>();
		
		index14.add(new ValueHandler(1, 6260.649));
		index14.add(new ValueHandler(2, 99.466));
		index14.add(new ValueHandler(3,26.505));
		index14.add(new ValueHandler(4, 13.838));
		index14.add(new ValueHandler(5, 9.379));
		index14.add(new ValueHandler(6,7.229));
		index14.add(new ValueHandler(7, 5.992));
		index14.add(new ValueHandler(8, 5.198));
		index14.add(new ValueHandler(9, 4.649));
		index14.add(new ValueHandler(10, 4.247));
		index14.add(new ValueHandler(11, 3.941));
		index14.add(new ValueHandler(12, 3.701));
		index14.add(new ValueHandler(13, 3.507));
		index14.add(new ValueHandler(14, 3.348));
		index14.add(new ValueHandler(15, 3.214));
		index14.add(new ValueHandler(16, 3.101));
		index14.add(new ValueHandler(17, 3.003));
		index14.add(new ValueHandler(18, 2.919));
		index14.add(new ValueHandler(19, 2.844));
		index14.add(new ValueHandler(20, 2.778));
		index14.add(new ValueHandler(21, 2.720));
		index14.add(new ValueHandler(22, 2.667));
		index14.add(new ValueHandler(23, 2.620));
		index14.add(new ValueHandler(24, 2.577));
		index14.add(new ValueHandler(25, 2.538));
		index14.add(new ValueHandler(26, 2.503));
		index14.add(new ValueHandler(27, 2.470));
		index14.add(new ValueHandler(28, 2.440));
		index14.add(new ValueHandler(29, 2.412));
		index14.add(new ValueHandler(30, 2.386));
		index14.add(new ValueHandler(40, 2.203));
		index14.add(new ValueHandler(60,2.028));
		index14.add(new ValueHandler(120, 1.860));
		
		zeroPointZeroOneTable.add(new ValueHandler(30,index14));
		
		ArrayList<ValueHandler> index15= new ArrayList<ValueHandler>();
		
		index15.add(new ValueHandler(1, 6286.782));
		index15.add(new ValueHandler(2, 99.474));
		index15.add(new ValueHandler(3,26.411));
		index15.add(new ValueHandler(4, 13.745));
		index15.add(new ValueHandler(5, 9.291));
		index15.add(new ValueHandler(6, 7.143));
		index15.add(new ValueHandler(7, 5.908));
		index15.add(new ValueHandler(8, 5.116));
		index15.add(new ValueHandler(9, 4.567));
		index15.add(new ValueHandler(10, 4.165));
		index15.add(new ValueHandler(11, 3.860));
		index15.add(new ValueHandler(12, 3.619));
		index15.add(new ValueHandler(13, 3.425));
		index15.add(new ValueHandler(14, 3.266));
		index15.add(new ValueHandler(15, 3.132));
		index15.add(new ValueHandler(16, 3.018));
		index15.add(new ValueHandler(17, 2.920));
		index15.add(new ValueHandler(18, 2.835));
		index15.add(new ValueHandler(19, 2.761));
		index15.add(new ValueHandler(20, 2.695));
		index15.add(new ValueHandler(21, 2.636));
		index15.add(new ValueHandler(22, 2.583));
		index15.add(new ValueHandler(23, 2.535));
		index15.add(new ValueHandler(24, 2.492));
		index15.add(new ValueHandler(25, 2.453));
		index15.add(new ValueHandler(26, 2.417));
		index15.add(new ValueHandler(27,2.384	));
		index15.add(new ValueHandler(28, 2.354));
		index15.add(new ValueHandler(29, 2.325));
		index15.add(new ValueHandler(30, 2.299));
		index15.add(new ValueHandler(40, 2.114));
		index15.add(new ValueHandler(60, 1.936));
		index15.add(new ValueHandler(120, 1.763));
		
		zeroPointZeroOneTable.add(new ValueHandler(40,index15));
		
		ArrayList<ValueHandler> index16= new ArrayList<ValueHandler>();
		
		index16.add(new ValueHandler(1, 6313.030));
		index16.add(new ValueHandler(2, 99.482));
		index16.add(new ValueHandler(3,26.316));
		index16.add(new ValueHandler(4, 13.652));
		index16.add(new ValueHandler(5,9.202));
		index16.add(new ValueHandler(6, 7.057));
		index16.add(new ValueHandler(7, 5.824));
		index16.add(new ValueHandler(8, 5.032));
		index16.add(new ValueHandler(9, 4.483));
		index16.add(new ValueHandler(10, 4.082));
		index16.add(new ValueHandler(11, 3.776));
		index16.add(new ValueHandler(12, 3.535));
		index16.add(new ValueHandler(13, 3.341));
		index16.add(new ValueHandler(14, 3.181));
		index16.add(new ValueHandler(15,3.047));
		index16.add(new ValueHandler(16, 2.933));
		index16.add(new ValueHandler(17, 2.835));
		index16.add(new ValueHandler(18, 2.749));
		index16.add(new ValueHandler(19, 2.674));
		index16.add(new ValueHandler(20, 2.608));
		index16.add(new ValueHandler(21, 2.548));
		index16.add(new ValueHandler(22,2.495));
		index16.add(new ValueHandler(23, 2.447));
		index16.add(new ValueHandler(24, 2.403));
		index16.add(new ValueHandler(25, 2.364));
		index16.add(new ValueHandler(26,2.327));
		index16.add(new ValueHandler(27, 2.294));
		index16.add(new ValueHandler(28, 2.263));
		index16.add(new ValueHandler(29, 2.234));
		index16.add(new ValueHandler(30, 2.208));
		index16.add(new ValueHandler(40, 2.019));
		index16.add(new ValueHandler(60, 1.836));
		index16.add(new ValueHandler(120, 1.656));
		
		zeroPointZeroOneTable.add(new ValueHandler(60,index16));
		
		ArrayList<ValueHandler> index17= new ArrayList<ValueHandler>();
		
		index17.add(new ValueHandler(1, 6339.391));
		index17.add(new ValueHandler(2, 99.491));
		index17.add(new ValueHandler(3,26.221));
		index17.add(new ValueHandler(4, 13.558));
		index17.add(new ValueHandler(5, 9.112));
		index17.add(new ValueHandler(6, 6.969));
		index17.add(new ValueHandler(7, 5.737));
		index17.add(new ValueHandler(8, 4.946));
		index17.add(new ValueHandler(9, 4.398));
		index17.add(new ValueHandler(10, 3.996));
		index17.add(new ValueHandler(11, 3.690));
		index17.add(new ValueHandler(12, 3.449));
		index17.add(new ValueHandler(13, 3.255));
		index17.add(new ValueHandler(14, 3.094));
		index17.add(new ValueHandler(15, 2.959));
		index17.add(new ValueHandler(16,2.845));
		index17.add(new ValueHandler(17, 2.746));
		index17.add(new ValueHandler(18, 2.660));
		index17.add(new ValueHandler(19, 2.584));
		index17.add(new ValueHandler(20, 2.517));
		index17.add(new ValueHandler(21, 2.457));
		index17.add(new ValueHandler(22, 2.403));
		index17.add(new ValueHandler(23, 2.354));
		index17.add(new ValueHandler(24, 2.310));
		index17.add(new ValueHandler(25, 2.270));
		index17.add(new ValueHandler(26, 2.233	));
		index17.add(new ValueHandler(27, 2.198));
		index17.add(new ValueHandler(28, 2.167));
		index17.add(new ValueHandler(29, 2.138));
		index17.add(new ValueHandler(30, 2.111));
		index17.add(new ValueHandler(40, 1.917));
		index17.add(new ValueHandler(60, 1.726));
		index17.add(new ValueHandler(120, 1.533));
		
		
		zeroPointZeroOneTable.add(new ValueHandler(120,index17));
		
		table.add(new FTableCompilation(0.01, zeroPointZeroOneTable));
		
	}
	
	public void setZeroPointZeroTwentyFiveTable()
	{
		zeroPointZeroTwentyFiveTable = new ArrayList<ValueHandler>();
		
		ArrayList<ValueHandler> index0= new ArrayList<ValueHandler>();
		
		index0.add(new ValueHandler(1, 647.7890));
		index0.add(new ValueHandler(2, 38.5063));
		index0.add(new ValueHandler(3, 17.4434));
		index0.add(new ValueHandler(4, 12.2179	));
		index0.add(new ValueHandler(5, 10.0070));
		index0.add(new ValueHandler(6, 8.8131));
		index0.add(new ValueHandler(7, 8.0727));
		index0.add(new ValueHandler(8, 7.5709));
		index0.add(new ValueHandler(9, 7.2093));
		index0.add(new ValueHandler(10, 6.9367));/////////////////////////////////////
		index0.add(new ValueHandler(11, 6.7241));
		index0.add(new ValueHandler(12, 6.5538));
		index0.add(new ValueHandler(13, 6.4143	));
		index0.add(new ValueHandler(14, 6.2979));
		index0.add(new ValueHandler(15, 6.1995));
		index0.add(new ValueHandler(16, 6.1151	));
		index0.add(new ValueHandler(17,6.0420));
		index0.add(new ValueHandler(18, 5.9781));
		index0.add(new ValueHandler(19, 5.9216));
		index0.add(new ValueHandler(20, 5.8715));
		index0.add(new ValueHandler(21, 5.8266));
		index0.add(new ValueHandler(22, 5.7863));
		index0.add(new ValueHandler(23, 5.7498));
		index0.add(new ValueHandler(24, 5.7166));
		index0.add(new ValueHandler(25, 5.6864));
		index0.add(new ValueHandler(26, 5.6586));
		index0.add(new ValueHandler(27, 5.6331));
		index0.add(new ValueHandler(28,5.6096));
		index0.add(new ValueHandler(29,5.5878));
		index0.add(new ValueHandler(30, 5.5675));
		index0.add(new ValueHandler(40, 5.4239));
		index0.add(new ValueHandler(60, 5.2856));
		index0.add(new ValueHandler(120, 5.1523));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(1,index0));
		
		ArrayList<ValueHandler> index1= new ArrayList<ValueHandler>();
		
		index1.add(new ValueHandler(1, 799.5000));
		index1.add(new ValueHandler(2, 39.0000	));
		index1.add(new ValueHandler(3, 16.0441));
		index1.add(new ValueHandler(4, 10.6491	));
		index1.add(new ValueHandler(5, 8.4336));
		index1.add(new ValueHandler(6, 7.2599));
		index1.add(new ValueHandler(7, 6.5415));
		index1.add(new ValueHandler(8, 6.0595));
		index1.add(new ValueHandler(9, 5.7147));
		index1.add(new ValueHandler(10, 5.4564));
		index1.add(new ValueHandler(11, 5.2559	));
		index1.add(new ValueHandler(12,5.0959));
		index1.add(new ValueHandler(13, 4.9653));
		index1.add(new ValueHandler(14, 4.8567));
		index1.add(new ValueHandler(15, 4.7650));
		index1.add(new ValueHandler(16, 4.6867));
		index1.add(new ValueHandler(17, 4.6189));
		index1.add(new ValueHandler(18, 4.5597));
		index1.add(new ValueHandler(19, 4.5075));
		index1.add(new ValueHandler(20, 4.4613));
		index1.add(new ValueHandler(21, 4.4199));
		index1.add(new ValueHandler(22, 4.3828	));
		index1.add(new ValueHandler(23, 4.3492));
		index1.add(new ValueHandler(24, 4.3187));
		index1.add(new ValueHandler(25, 4.2909	));
		index1.add(new ValueHandler(26, 4.2655));
		index1.add(new ValueHandler(27, 4.2421));
		index1.add(new ValueHandler(28, 4.2205	));
		index1.add(new ValueHandler(29, 4.2006));
		index1.add(new ValueHandler(30,4.1821));
		index1.add(new ValueHandler(40, 4.0510));
		index1.add(new ValueHandler(60, 3.9253));
		index1.add(new ValueHandler(120, 3.8046));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(2,index1));
		
		ArrayList<ValueHandler> index2= new ArrayList<ValueHandler>();
		
		index2.add(new ValueHandler(1, 864.1630));
		index2.add(new ValueHandler(2, 39.1655));
		index2.add(new ValueHandler(3, 15.4392));
		index2.add(new ValueHandler(4, 9.9792));
		index2.add(new ValueHandler(5, 7.7636));
		index2.add(new ValueHandler(6, 6.5988));
		index2.add(new ValueHandler(7, 5.8898	));
		index2.add(new ValueHandler(8, 5.4160));
		index2.add(new ValueHandler(9, 5.0781));
		index2.add(new ValueHandler(10, 4.8256));
		index2.add(new ValueHandler(11, 4.6300));
		index2.add(new ValueHandler(12, 4.4742));
		index2.add(new ValueHandler(13, 4.3472));
		index2.add(new ValueHandler(14, 4.2417));
		index2.add(new ValueHandler(15, 4.1528	));
		index2.add(new ValueHandler(16, 4.0768));
		index2.add(new ValueHandler(17, 4.0112));
		index2.add(new ValueHandler(18, 3.9539));
		index2.add(new ValueHandler(19, 3.9034	));
		index2.add(new ValueHandler(20, 3.8587));
		index2.add(new ValueHandler(21, 3.8188	));
		index2.add(new ValueHandler(22, 3.7829));
		index2.add(new ValueHandler(23, 3.7505));
		index2.add(new ValueHandler(24, 3.0088));
		index2.add(new ValueHandler(25, 3.6943));
		index2.add(new ValueHandler(26, 3.6697));
		index2.add(new ValueHandler(27, 3.6472	));
		index2.add(new ValueHandler(28, 3.6264	));
		index2.add(new ValueHandler(29, 3.6072));
		index2.add(new ValueHandler(30, 3.5894	));
		index2.add(new ValueHandler(40, 3.4633));
		index2.add(new ValueHandler(60, 3.3425));
		index2.add(new ValueHandler(120, 3.2269));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(3,index2));
		
		ArrayList<ValueHandler> index3= new ArrayList<ValueHandler>();
		
		index3.add(new ValueHandler(1,899.5833));
		index3.add(new ValueHandler(2, 39.2484));
		index3.add(new ValueHandler(3,15.1010));
		index3.add(new ValueHandler(4, 9.6045));
		index3.add(new ValueHandler(5, 7.3879));
		index3.add(new ValueHandler(6, 6.2272));
		index3.add(new ValueHandler(7, 5.5226));
		index3.add(new ValueHandler(8, 5.0526	));
		index3.add(new ValueHandler(9,4.7181));
		index3.add(new ValueHandler(10, 4.4683));
		index3.add(new ValueHandler(11,4.2751));
		index3.add(new ValueHandler(12, 4.1212));
		index3.add(new ValueHandler(13,3.9959));
		index3.add(new ValueHandler(14, 3.8919));
		index3.add(new ValueHandler(15, 3.8043));
		index3.add(new ValueHandler(16, 3.7294));
		index3.add(new ValueHandler(17,3.6648));
		index3.add(new ValueHandler(18, 3.6083));
		index3.add(new ValueHandler(19, 3.5587));
		index3.add(new ValueHandler(20, 3.5147));
		index3.add(new ValueHandler(21, 3.4754));
		index3.add(new ValueHandler(22, 3.4401	));
		index3.add(new ValueHandler(23, 3.4083));
		index3.add(new ValueHandler(24, 3.3794));
		index3.add(new ValueHandler(25, 3.3530));
		index3.add(new ValueHandler(26, 3.3289));
		index3.add(new ValueHandler(27, 3.3067));
		index3.add(new ValueHandler(28, 3.2863));
		index3.add(new ValueHandler(29, 3.2674));
		index3.add(new ValueHandler(30,3.2499));
		index3.add(new ValueHandler(40, 3.1261));
		index3.add(new ValueHandler(60, 3.0077));
		index3.add(new ValueHandler(120, 2.8943));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(4,index3));
		
		ArrayList<ValueHandler> index4= new ArrayList<ValueHandler>();
		
		index4.add(new ValueHandler(1, 921.8479));
		index4.add(new ValueHandler(2, 39.2982));
		index4.add(new ValueHandler(3, 14.8848));/////last modified
		index4.add(new ValueHandler(4, 9.3645	));
		index4.add(new ValueHandler(5, 7.1464));
		index4.add(new ValueHandler(6, 5.9876	));
		index4.add(new ValueHandler(7, 5.2852	));
		index4.add(new ValueHandler(8, 4.8173));
		index4.add(new ValueHandler(9, 4.4844));
		index4.add(new ValueHandler(10, 4.2361));
		index4.add(new ValueHandler(11,4.0440));
		index4.add(new ValueHandler(12, 3.8911));
		index4.add(new ValueHandler(13, 3.7667	));
		index4.add(new ValueHandler(14, 3.6634));
		index4.add(new ValueHandler(15,3.5764));
		index4.add(new ValueHandler(16, 3.5021));
		index4.add(new ValueHandler(17, 3.4379));
		index4.add(new ValueHandler(18, 3.3820));
		index4.add(new ValueHandler(19,3.3327));
		index4.add(new ValueHandler(20, 3.2891));
		index4.add(new ValueHandler(21,3.2501));
		index4.add(new ValueHandler(22, 3.2151));
		index4.add(new ValueHandler(23, 3.1835));
		index4.add(new ValueHandler(24, 3.1548));
		index4.add(new ValueHandler(25, 3.1287	));
		index4.add(new ValueHandler(26,3.1048));
		index4.add(new ValueHandler(27, 3.0828));
		index4.add(new ValueHandler(28, 3.0626));
		index4.add(new ValueHandler(29, 3.0438	));
		index4.add(new ValueHandler(30, 3.0265));
		index4.add(new ValueHandler(40, 2.9037));
		index4.add(new ValueHandler(60, 2.7863));
		index4.add(new ValueHandler(120, 2.6740));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(5,index4));
		
		ArrayList<ValueHandler> index5= new ArrayList<ValueHandler>();
		
		index5.add(new ValueHandler(1, 937.1111	));
		index5.add(new ValueHandler(2, 39.3315));
		index5.add(new ValueHandler(3, 14.7347));
		index5.add(new ValueHandler(4, 9.1973));
		index5.add(new ValueHandler(5, 6.9777));
		index5.add(new ValueHandler(6, 5.8198));
		index5.add(new ValueHandler(7, 5.1186));
		index5.add(new ValueHandler(8, 4.6517));
		index5.add(new ValueHandler(9, 4.3197));
		index5.add(new ValueHandler(10, 4.0721	));
		index5.add(new ValueHandler(11,3.8807	));
		index5.add(new ValueHandler(12, 3.7283));
		index5.add(new ValueHandler(13, 3.6043));
		index5.add(new ValueHandler(14, 3.5014));
		index5.add(new ValueHandler(15, 3.4147));
		index5.add(new ValueHandler(16, 3.3406));
		index5.add(new ValueHandler(17, 3.2767));
		index5.add(new ValueHandler(18, 3.2209));
		index5.add(new ValueHandler(19, 3.1718));
		index5.add(new ValueHandler(20, 3.1283));
		index5.add(new ValueHandler(21, 3.0895	));
		index5.add(new ValueHandler(22, 3.0546));
		index5.add(new ValueHandler(23, 3.0232));
		index5.add(new ValueHandler(24, 2.9946));
		index5.add(new ValueHandler(25, 2.9685));
		index5.add(new ValueHandler(26, 2.9447));
		index5.add(new ValueHandler(27, 2.9228	));
		index5.add(new ValueHandler(28, 2.9027	));
		index5.add(new ValueHandler(29, 2.8840));
		index5.add(new ValueHandler(30, 2.8667));
		index5.add(new ValueHandler(40,2.7444));
		index5.add(new ValueHandler(60,2.6274));
		index5.add(new ValueHandler(120, 2.5154));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(6,index5));
		
		ArrayList<ValueHandler> index6= new ArrayList<ValueHandler>();
		
		index6.add(new ValueHandler(1, 948.2169	));
		index6.add(new ValueHandler(2, 39.3552));
		index6.add(new ValueHandler(3, 14.6244));
		index6.add(new ValueHandler(4, 9.0741	));
		index6.add(new ValueHandler(5, 6.8531));
		index6.add(new ValueHandler(6, 5.6955));
		index6.add(new ValueHandler(7, 4.9949));
		index6.add(new ValueHandler(8, 4.5286));
		index6.add(new ValueHandler(9, 4.1970));
		index6.add(new ValueHandler(10, 3.9498));
		index6.add(new ValueHandler(11, 3.7586));
		index6.add(new ValueHandler(12, 3.6065));
		index6.add(new ValueHandler(13,3.4827));
		index6.add(new ValueHandler(14, 3.3799));
		index6.add(new ValueHandler(15, 3.2934));
		index6.add(new ValueHandler(16, 3.2194));
		index6.add(new ValueHandler(17, 3.1556));
		index6.add(new ValueHandler(18, 3.0999));
		index6.add(new ValueHandler(19, 3.0509	));
		index6.add(new ValueHandler(20, 3.0074	));
		index6.add(new ValueHandler(21, 2.9686	));
		index6.add(new ValueHandler(22, 2.9338));
		index6.add(new ValueHandler(23, 2.9023));
		index6.add(new ValueHandler(24, 2.8738));
		index6.add(new ValueHandler(25, 2.8478));
		index6.add(new ValueHandler(26, 2.8240));
		index6.add(new ValueHandler(27, 2.8021));
		index6.add(new ValueHandler(28, 2.7820));
		index6.add(new ValueHandler(29, 2.7633));
		index6.add(new ValueHandler(30, 2.7460));
		index6.add(new ValueHandler(40, 2.6238));
		index6.add(new ValueHandler(60, 2.5068));
		index6.add(new ValueHandler(120, 2.3948));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(7,index6));
		
		ArrayList<ValueHandler> index7= new ArrayList<ValueHandler>();
		
		index7.add(new ValueHandler(1, 956.6562));
		index7.add(new ValueHandler(2, 39.3730));
		index7.add(new ValueHandler(3, 14.5399));
		index7.add(new ValueHandler(4, 8.9796));
		index7.add(new ValueHandler(5, 6.7572));
		index7.add(new ValueHandler(6, 5.5996));
		index7.add(new ValueHandler(7, 4.8993));
		index7.add(new ValueHandler(8, 4.4333));
		index7.add(new ValueHandler(9, 4.1020));
		index7.add(new ValueHandler(10, 3.8549));
		index7.add(new ValueHandler(11, 3.6638));
		index7.add(new ValueHandler(12, 3.5118));
		index7.add(new ValueHandler(13, 3.3880));
		index7.add(new ValueHandler(14, 3.2853));
		index7.add(new ValueHandler(15, 3.1987));
		index7.add(new ValueHandler(16, 3.1248));
		index7.add(new ValueHandler(17, 3.0610));
		index7.add(new ValueHandler(18, 3.0053));
		index7.add(new ValueHandler(19, 2.9563));
		index7.add(new ValueHandler(20, 2.9128));
		index7.add(new ValueHandler(21, 2.8740));
		index7.add(new ValueHandler(22, 2.8392));
		index7.add(new ValueHandler(23,2.8077	));
		index7.add(new ValueHandler(24, 2.7791));
		index7.add(new ValueHandler(25, 2.7531));
		index7.add(new ValueHandler(26, 2.7293));
		index7.add(new ValueHandler(27, 2.7074));
		index7.add(new ValueHandler(28, 2.6872));
		index7.add(new ValueHandler(29, 2.6686));
		index7.add(new ValueHandler(30, 2.6513));
		index7.add(new ValueHandler(40, 2.5289));
		index7.add(new ValueHandler(60, 2.4117));
		index7.add(new ValueHandler(120, 2.2994));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(8,index7));
		
		ArrayList<ValueHandler> index8= new ArrayList<ValueHandler>();
		
		index8.add(new ValueHandler(1, 963.2846));
		index8.add(new ValueHandler(2, 39.3869));
		index8.add(new ValueHandler(3, 14.4731	));
		index8.add(new ValueHandler(4, 8.9047	));
		index8.add(new ValueHandler(5, 6.6811));
		index8.add(new ValueHandler(6, 5.5234));
		index8.add(new ValueHandler(7, 4.8232));
		index8.add(new ValueHandler(8, 4.3572));
		index8.add(new ValueHandler(9, 4.0260));
		index8.add(new ValueHandler(10, 3.7790));
		index8.add(new ValueHandler(11, 3.5879));
		index8.add(new ValueHandler(12, 3.4358));
		index8.add(new ValueHandler(13, 3.3120));
		index8.add(new ValueHandler(14, 3.2093));
		index8.add(new ValueHandler(15, 3.1227));
		index8.add(new ValueHandler(16, 3.0488));
		index8.add(new ValueHandler(17, 2.9849));
		index8.add(new ValueHandler(18, 2.9291));
		index8.add(new ValueHandler(19, 2.8801));
		index8.add(new ValueHandler(20, 2.8365));
		index8.add(new ValueHandler(21, 2.7977));
		index8.add(new ValueHandler(22, 2.7628	));
		index8.add(new ValueHandler(23, 2.7313));
		index8.add(new ValueHandler(24, 2.7027));
		index8.add(new ValueHandler(25, 2.6766	));
		index8.add(new ValueHandler(26, 2.6528));
		index8.add(new ValueHandler(27, 2.6309));
		index8.add(new ValueHandler(28, 2.6106));
		index8.add(new ValueHandler(29, 2.5919));
		index8.add(new ValueHandler(30, 2.5746));
		index8.add(new ValueHandler(40,2.4519));
		index8.add(new ValueHandler(60, 2.3344));
		index8.add(new ValueHandler(120,2.2217));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(9,index8));
		
		ArrayList<ValueHandler> index9= new ArrayList<ValueHandler>();
		
		index9.add(new ValueHandler(1, 968.6274));
		index9.add(new ValueHandler(2, 39.3980));
		index9.add(new ValueHandler(3, 14.4189));
		index9.add(new ValueHandler(4, 8.8439));
		index9.add(new ValueHandler(5, 6.6192));
		index9.add(new ValueHandler(6, 5.4613));
		index9.add(new ValueHandler(7, 4.7611));
		index9.add(new ValueHandler(8, 4.2951));
		index9.add(new ValueHandler(9, 3.9639));
		index9.add(new ValueHandler(10, 3.7168));
		index9.add(new ValueHandler(11, 3.5257	));
		index9.add(new ValueHandler(12, 3.3736));
		index9.add(new ValueHandler(13, 3.2497	));
		index9.add(new ValueHandler(14, 3.1469));
		index9.add(new ValueHandler(15, 3.0602));
		index9.add(new ValueHandler(16, 2.9862));
		index9.add(new ValueHandler(17, 2.9222));
		index9.add(new ValueHandler(18, 2.8664));
		index9.add(new ValueHandler(19, 2.8172));
		index9.add(new ValueHandler(20, 2.7737));
		index9.add(new ValueHandler(21, 2.7348	));
		index9.add(new ValueHandler(22, 2.6998));
		index9.add(new ValueHandler(23, 2.6682));
		index9.add(new ValueHandler(24, 2.6396));
		index9.add(new ValueHandler(25, 2.6135));
		index9.add(new ValueHandler(26, 2.5896	));
		index9.add(new ValueHandler(27, 2.5676));
		index9.add(new ValueHandler(28, 2.5473));
		index9.add(new ValueHandler(29,2.5286));
		index9.add(new ValueHandler(30, 2.5112));
		index9.add(new ValueHandler(40, 2.3882));
		index9.add(new ValueHandler(60, 2.2702	));
		index9.add(new ValueHandler(120, 2.1570	));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(10,index9));
		
		ArrayList<ValueHandler> index10= new ArrayList<ValueHandler>();
		
		index10.add(new ValueHandler(1, 976.7079));
		index10.add(new ValueHandler(2, 39.4146));
		index10.add(new ValueHandler(3, 14.3366));
		index10.add(new ValueHandler(4, 8.7512));
		index10.add(new ValueHandler(5, 6.5245));
		index10.add(new ValueHandler(6, 5.3662));
		index10.add(new ValueHandler(7, 4.6658));
		index10.add(new ValueHandler(8, 4.1997));
		index10.add(new ValueHandler(9, 3.8682));
		index10.add(new ValueHandler(10, 3.6209	));
		index10.add(new ValueHandler(11,3.4296));
		index10.add(new ValueHandler(12, 3.2773));
		index10.add(new ValueHandler(13, 3.1532));
		index10.add(new ValueHandler(14, 3.0502));
		index10.add(new ValueHandler(15, 2.9633));
		index10.add(new ValueHandler(16, 2.8890));
		index10.add(new ValueHandler(17, 2.8249));
		index10.add(new ValueHandler(18, 2.7689));
		index10.add(new ValueHandler(19, 2.7196));
		index10.add(new ValueHandler(20, 2.6758));
		index10.add(new ValueHandler(21, 2.6368));
		index10.add(new ValueHandler(22, 2.6017));
		index10.add(new ValueHandler(23, 2.5699));
		index10.add(new ValueHandler(24, 2.5411));
		index10.add(new ValueHandler(25, 2.5149));
		index10.add(new ValueHandler(26, 2.4908));
		index10.add(new ValueHandler(27, 2.4688));
		index10.add(new ValueHandler(28, 2.4484));
		index10.add(new ValueHandler(29, 2.4295));
		index10.add(new ValueHandler(30,2.4120	));
		index10.add(new ValueHandler(40, 2.2882));
		index10.add(new ValueHandler(60, 2.1692));
		index10.add(new ValueHandler(120, 2.0548));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(12,index10));
		
		ArrayList<ValueHandler> index11= new ArrayList<ValueHandler>();
		
		index11.add(new ValueHandler(1,984.8668	));
		index11.add(new ValueHandler(2, 39.4313));
		index11.add(new ValueHandler(3, 14.2527));//last attempt
		index11.add(new ValueHandler(4,8.6565));
		index11.add(new ValueHandler(5, 6.4277));
		index11.add(new ValueHandler(6, 5.2687));
		index11.add(new ValueHandler(7, 4.5678	));
		index11.add(new ValueHandler(8, 4.1012));
		index11.add(new ValueHandler(9, 3.7694));
		index11.add(new ValueHandler(10, 3.5217));
		index11.add(new ValueHandler(11, 3.3299));
		index11.add(new ValueHandler(12, 3.1772));
		index11.add(new ValueHandler(13,3.0527));
		index11.add(new ValueHandler(14, 2.9493));
		index11.add(new ValueHandler(15, 2.8621	));
		index11.add(new ValueHandler(16, 2.7875));
		index11.add(new ValueHandler(17,2.7230));
		index11.add(new ValueHandler(18, 2.6667	));
		index11.add(new ValueHandler(19,2.6171));
		index11.add(new ValueHandler(20, 2.5731));
		index11.add(new ValueHandler(21, 2.5338	));
		index11.add(new ValueHandler(22, 2.4984));
		index11.add(new ValueHandler(23, 2.4665));
		index11.add(new ValueHandler(24, 2.4374));
		index11.add(new ValueHandler(25, 2.4110));
		index11.add(new ValueHandler(26, 2.3867));
		index11.add(new ValueHandler(27, 2.3644));
		index11.add(new ValueHandler(28, 2.3438));
		index11.add(new ValueHandler(29, 2.3248));
		index11.add(new ValueHandler(30, 2.3072	));
		index11.add(new ValueHandler(40, 2.1819));
		index11.add(new ValueHandler(60,2.0613	));
		index11.add(new ValueHandler(120, 1.9450	));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(15,index11));
		
		ArrayList<ValueHandler> index12= new ArrayList<ValueHandler>();
		
		index12.add(new ValueHandler(1, 993.1028));
		index12.add(new ValueHandler(2, 39.4479	));
		index12.add(new ValueHandler(3,14.1674));
		index12.add(new ValueHandler(4, 8.5599));
		index12.add(new ValueHandler(5, 6.3286));
		index12.add(new ValueHandler(6, 5.1684));
		index12.add(new ValueHandler(7, 4.4667));
		index12.add(new ValueHandler(8, 3.9995));
		index12.add(new ValueHandler(9, 3.6669));
		index12.add(new ValueHandler(10, 3.4185));
		index12.add(new ValueHandler(11, 3.2261	));
		index12.add(new ValueHandler(12,3.0728));
		index12.add(new ValueHandler(13, 2.9477));
		index12.add(new ValueHandler(14, 2.8437	));
		index12.add(new ValueHandler(15, 2.7559));
		index12.add(new ValueHandler(16, 2.6808));
		index12.add(new ValueHandler(17,2.6158));
		index12.add(new ValueHandler(18, 2.5590	));
		index12.add(new ValueHandler(19, 2.5089));
		index12.add(new ValueHandler(20, 2.4645));
		index12.add(new ValueHandler(21, 2.4247));
		index12.add(new ValueHandler(22, 2.3890));
		index12.add(new ValueHandler(23, 2.3567));
		index12.add(new ValueHandler(24, 2.3273));
		index12.add(new ValueHandler(25, 2.3005));
		index12.add(new ValueHandler(26, 2.2759));
		index12.add(new ValueHandler(27, 2.2533));
		index12.add(new ValueHandler(28, 2.2324));
		index12.add(new ValueHandler(29, 2.2131));
		index12.add(new ValueHandler(30, 2.1952	));
		index12.add(new ValueHandler(40, 2.0677));
		index12.add(new ValueHandler(60, 1.9445));
		index12.add(new ValueHandler(120, 1.8249));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(20,index12));
		
		ArrayList<ValueHandler> index13= new ArrayList<ValueHandler>();
		
		index13.add(new ValueHandler(1, 997.2492));
		index13.add(new ValueHandler(2, 39.4562));
		index13.add(new ValueHandler(3,14.1241));
		index13.add(new ValueHandler(4, 8.5109));
		index13.add(new ValueHandler(5,6.2780));
		index13.add(new ValueHandler(6, 5.1172));
		index13.add(new ValueHandler(7,4.4150));
		index13.add(new ValueHandler(8, 3.9472));
		index13.add(new ValueHandler(9, 3.6142));
		index13.add(new ValueHandler(10, 3.3654));
		index13.add(new ValueHandler(11, 3.1725));
		index13.add(new ValueHandler(12, 3.0187));
		index13.add(new ValueHandler(13, 2.8932));
		index13.add(new ValueHandler(14,2.7888));
		index13.add(new ValueHandler(15, 2.7006	));
		index13.add(new ValueHandler(16, 2.6252));
		index13.add(new ValueHandler(17,2.5598	));
		index13.add(new ValueHandler(18, 2.5027));
		index13.add(new ValueHandler(19, 2.4523));
		index13.add(new ValueHandler(20, 2.4076));
		index13.add(new ValueHandler(21, 2.3675));
		index13.add(new ValueHandler(22, 2.3315));
		index13.add(new ValueHandler(23, 2.2989	));
		index13.add(new ValueHandler(24, 2.2693	));
		index13.add(new ValueHandler(25, 2.2422));
		index13.add(new ValueHandler(26, 2.2174));
		index13.add(new ValueHandler(27, 2.1946	));
		index13.add(new ValueHandler(28, 2.1735));
		index13.add(new ValueHandler(29, 2.1540	));
		index13.add(new ValueHandler(30, 2.1359));
		index13.add(new ValueHandler(40, 2.0069	));
		index13.add(new ValueHandler(60, 1.8817	));
		index13.add(new ValueHandler(120, 1.7597));
		
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(24,index13));
		
		ArrayList<ValueHandler> index14= new ArrayList<ValueHandler>();
		
		index14.add(new ValueHandler(1, 1001.414));
		index14.add(new ValueHandler(2, 39.465));
		index14.add(new ValueHandler(3,14.081));
		index14.add(new ValueHandler(4, 8.461));
		index14.add(new ValueHandler(5, 6.227	));
		index14.add(new ValueHandler(6, 5.065));
		index14.add(new ValueHandler(7, 4.362));
		index14.add(new ValueHandler(8, 3.894));
		index14.add(new ValueHandler(9, 3.560));
		index14.add(new ValueHandler(10, 3.311));
		index14.add(new ValueHandler(11, 3.118));
		index14.add(new ValueHandler(12, 2.963	));
		index14.add(new ValueHandler(13, 2.837));
		index14.add(new ValueHandler(14, 2.732));
		index14.add(new ValueHandler(15, 2.644	));
		index14.add(new ValueHandler(16, 2.568));
		index14.add(new ValueHandler(17, 2.502));
		index14.add(new ValueHandler(18, 2.445));
		index14.add(new ValueHandler(19, 2.394	));
		index14.add(new ValueHandler(20, 2.349	));
		index14.add(new ValueHandler(21, 2.308	));
		index14.add(new ValueHandler(22, 2.272));
		index14.add(new ValueHandler(23, 2.239	));
		index14.add(new ValueHandler(24, 2.209));
		index14.add(new ValueHandler(25, 2.182));
		index14.add(new ValueHandler(26, 2.157));
		index14.add(new ValueHandler(27, 2.133));
		index14.add(new ValueHandler(28, 2.112));
		index14.add(new ValueHandler(29, 2.092));
		index14.add(new ValueHandler(30, 2.074));
		index14.add(new ValueHandler(40, 1.943	));
		index14.add(new ValueHandler(60, 1.815	));
		index14.add(new ValueHandler(120, 1.690));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(30,index14));
		
		ArrayList<ValueHandler> index15= new ArrayList<ValueHandler>();
		
		index15.add(new ValueHandler(1, 1005.598));
		index15.add(new ValueHandler(2, 39.473));
		index15.add(new ValueHandler(3,14.037));
		index15.add(new ValueHandler(4, 8.411));
		index15.add(new ValueHandler(5, 6.175));
		index15.add(new ValueHandler(6, 5.012));
		index15.add(new ValueHandler(7, 4.309));
		index15.add(new ValueHandler(8, 3.840	));
		index15.add(new ValueHandler(9, 3.505));
		index15.add(new ValueHandler(10, 3.255));
		index15.add(new ValueHandler(11, 3.061));
		index15.add(new ValueHandler(12, 2.906));
		index15.add(new ValueHandler(13, 2.780	));
		index15.add(new ValueHandler(14, 2.674	));
		index15.add(new ValueHandler(15, 2.585));
		index15.add(new ValueHandler(16, 2.509));
		index15.add(new ValueHandler(17, 2.442));
		index15.add(new ValueHandler(18, 2.384	));
		index15.add(new ValueHandler(19, 2.333));
		index15.add(new ValueHandler(20, 2.287));
		index15.add(new ValueHandler(21, 2.246));
		index15.add(new ValueHandler(22, 2.210));
		index15.add(new ValueHandler(23, 2.176));
		index15.add(new ValueHandler(24, 2.146));
		index15.add(new ValueHandler(25, 2.118));
		index15.add(new ValueHandler(26, 2.093));
		index15.add(new ValueHandler(27,2.069));
		index15.add(new ValueHandler(28, 2.048));
		index15.add(new ValueHandler(29, 2.028	));
		index15.add(new ValueHandler(30, 2.009));
		index15.add(new ValueHandler(40, 1.875));
		index15.add(new ValueHandler(60, 1.744));
		index15.add(new ValueHandler(120, 1.614));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(40,index15));
		
		ArrayList<ValueHandler> index16= new ArrayList<ValueHandler>();
		
		index16.add(new ValueHandler(1, 1009.800));
		index16.add(new ValueHandler(2, 39.481));
		index16.add(new ValueHandler(3,13.992));
		index16.add(new ValueHandler(4, 8.360));
		index16.add(new ValueHandler(5, 6.123));
		index16.add(new ValueHandler(6, 4.959));
		index16.add(new ValueHandler(7, 4.254));
		index16.add(new ValueHandler(8, 3.784	));
		index16.add(new ValueHandler(9, 3.449	));
		index16.add(new ValueHandler(10, 3.198	));
		index16.add(new ValueHandler(11, 3.004));
		index16.add(new ValueHandler(12, 2.848));
		index16.add(new ValueHandler(13, 2.720));
		index16.add(new ValueHandler(14, 2.614));
		index16.add(new ValueHandler(15, 2.524));
		index16.add(new ValueHandler(16, 2.447));
		index16.add(new ValueHandler(17, 2.380));
		index16.add(new ValueHandler(18, 2.321));
		index16.add(new ValueHandler(19, 2.270));
		index16.add(new ValueHandler(20, 2.223));
		index16.add(new ValueHandler(21, 2.182	));
		index16.add(new ValueHandler(22, 2.145));
		index16.add(new ValueHandler(23, 2.111	));
		index16.add(new ValueHandler(24, 2.080	));
		index16.add(new ValueHandler(25, 2.052	));
		index16.add(new ValueHandler(26, 2.026));
		index16.add(new ValueHandler(27, 2.002	));
		index16.add(new ValueHandler(28, 1.980));
		index16.add(new ValueHandler(29, 1.959	));
		index16.add(new ValueHandler(30, 1.940	));
		index16.add(new ValueHandler(40, 1.803	));
		index16.add(new ValueHandler(60, 1.667));
		index16.add(new ValueHandler(120, 1.530));
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(60,index16));
		
		ArrayList<ValueHandler> index17= new ArrayList<ValueHandler>();
		
		index17.add(new ValueHandler(1, 1014.020));
		index17.add(new ValueHandler(2, 39.490));
		index17.add(new ValueHandler(3,13.947));
		index17.add(new ValueHandler(4, 8.309));
		index17.add(new ValueHandler(5, 6.069));
		index17.add(new ValueHandler(6, 4.904	));
		index17.add(new ValueHandler(7, 4.199	));
		index17.add(new ValueHandler(8, 3.728	));
		index17.add(new ValueHandler(9, 3.392	));
		index17.add(new ValueHandler(10, 3.140));
		index17.add(new ValueHandler(11, 2.944));
		index17.add(new ValueHandler(12, 2.787));
		index17.add(new ValueHandler(13, 2.659));
		index17.add(new ValueHandler(14, 2.552));
		index17.add(new ValueHandler(15, 2.461));
		index17.add(new ValueHandler(16,2.383));
		index17.add(new ValueHandler(17, 2.315));
		index17.add(new ValueHandler(18, 2.256	));
		index17.add(new ValueHandler(19, 2.203));
		index17.add(new ValueHandler(20, 2.156	));
		index17.add(new ValueHandler(21, 2.114));
		index17.add(new ValueHandler(22, 2.076	));
		index17.add(new ValueHandler(23, 2.041));
		index17.add(new ValueHandler(24, 2.010));
		index17.add(new ValueHandler(25, 1.981));
		index17.add(new ValueHandler(26, 1.954));
		index17.add(new ValueHandler(27, 1.930));
		index17.add(new ValueHandler(28, 1.907));
		index17.add(new ValueHandler(29, 1.886));
		index17.add(new ValueHandler(30, 1.866));
		index17.add(new ValueHandler(40, 1.724));
		index17.add(new ValueHandler(60, 1.581	));
		index17.add(new ValueHandler(120, 1.433	));
		
		
		zeroPointZeroTwentyFiveTable.add(new ValueHandler(120,index17));
		
		table.add(new FTableCompilation(0.025, zeroPointZeroTwentyFiveTable));
		
	}
	
	public void setZeroPointZeroFiveTable()
	{
		zeroPointZeroFiveTable = new ArrayList<ValueHandler>();
		
		ArrayList<ValueHandler> index0= new ArrayList<ValueHandler>();
		
		index0.add(new ValueHandler(1, 161.4476));
		index0.add(new ValueHandler(2, 18.5128));
		index0.add(new ValueHandler(3, 10.1280));
		index0.add(new ValueHandler(4, 7.7086));
		index0.add(new ValueHandler(5, 6.6079));
		index0.add(new ValueHandler(6, 5.9874));
		index0.add(new ValueHandler(7, 5.5914));
		index0.add(new ValueHandler(8, 5.3177));
		index0.add(new ValueHandler(9, 5.1174));
		index0.add(new ValueHandler(10, 4.9646));
		index0.add(new ValueHandler(11, 4.8443));
		index0.add(new ValueHandler(12, 4.7472	));
		index0.add(new ValueHandler(13, 4.6672));
		index0.add(new ValueHandler(14, 4.6001));
		index0.add(new ValueHandler(15, 4.5431));
		index0.add(new ValueHandler(16, 4.4940));
		index0.add(new ValueHandler(17, 4.4513));
		index0.add(new ValueHandler(18, 4.4139));
		index0.add(new ValueHandler(19, 4.3807));
		index0.add(new ValueHandler(20, 4.3512));
		index0.add(new ValueHandler(21, 4.3248));
		index0.add(new ValueHandler(22, 4.3009));
		index0.add(new ValueHandler(23, 4.2793));
		index0.add(new ValueHandler(24, 4.2597));
		index0.add(new ValueHandler(25, 4.2417	));
		index0.add(new ValueHandler(26, 4.2252	));
		index0.add(new ValueHandler(27, 4.2100));
		index0.add(new ValueHandler(28, 4.1960));
		index0.add(new ValueHandler(29, 4.1830));
		index0.add(new ValueHandler(30, 4.1709));
		index0.add(new ValueHandler(40, 4.0847));
		index0.add(new ValueHandler(60, 4.0012));
		index0.add(new ValueHandler(120, 3.9201));
		
		zeroPointZeroFiveTable.add(new ValueHandler(1,index0));
		
		ArrayList<ValueHandler> index1= new ArrayList<ValueHandler>();
		
		index1.add(new ValueHandler(1, 199.5000));
		index1.add(new ValueHandler(2, 19.0000));
		index1.add(new ValueHandler(3, 9.5521	));
		index1.add(new ValueHandler(4, 6.9443));
		index1.add(new ValueHandler(5, 5.7861));
		index1.add(new ValueHandler(6, 5.1433));
		index1.add(new ValueHandler(7, 4.7374));
		index1.add(new ValueHandler(8, 4.4590));
		index1.add(new ValueHandler(9, 4.2565));
		index1.add(new ValueHandler(10, 4.1028));
		index1.add(new ValueHandler(11, 3.9823));
		index1.add(new ValueHandler(12, 3.8853));
		index1.add(new ValueHandler(13, 3.8056));
		index1.add(new ValueHandler(14, 3.7389));
		index1.add(new ValueHandler(15, 3.6823));
		index1.add(new ValueHandler(16, 3.6337	));
		index1.add(new ValueHandler(17, 3.5915));
		index1.add(new ValueHandler(18, 3.5546));
		index1.add(new ValueHandler(19, 3.5219));
		index1.add(new ValueHandler(20, 3.4928));
		index1.add(new ValueHandler(21, 3.4668));
		index1.add(new ValueHandler(22, 3.4434));
		index1.add(new ValueHandler(23, 3.4221));
		index1.add(new ValueHandler(24, 3.4028));
		index1.add(new ValueHandler(25, 3.3852));
		index1.add(new ValueHandler(26, 3.3690));
		index1.add(new ValueHandler(27, 3.3541));
		index1.add(new ValueHandler(28, 3.3404));
		index1.add(new ValueHandler(29, 3.3277	));
		index1.add(new ValueHandler(30, 3.3158));
		index1.add(new ValueHandler(40, 3.2317));
		index1.add(new ValueHandler(60, 3.1504));
		index1.add(new ValueHandler(120, 3.0718));
		
		zeroPointZeroFiveTable.add(new ValueHandler(2,index1));
		
		ArrayList<ValueHandler> index2= new ArrayList<ValueHandler>();
		
		index2.add(new ValueHandler(1, 215.7073));
		index2.add(new ValueHandler(2, 19.1643));
		index2.add(new ValueHandler(3, 9.2766));
		index2.add(new ValueHandler(4, 6.5914));
		index2.add(new ValueHandler(5, 5.4095));
		index2.add(new ValueHandler(6, 4.7571));
		index2.add(new ValueHandler(7, 4.3468));
		index2.add(new ValueHandler(8, 4.0662));
		index2.add(new ValueHandler(9, 3.8625));
		index2.add(new ValueHandler(10, 3.7083));
		index2.add(new ValueHandler(11, 3.5874));
		index2.add(new ValueHandler(12, 3.4903));
		index2.add(new ValueHandler(13, 3.4105));
		index2.add(new ValueHandler(14, 3.3439));
		index2.add(new ValueHandler(15, 3.2874));
		index2.add(new ValueHandler(16, 3.2389));
		index2.add(new ValueHandler(17, 3.1968));
		index2.add(new ValueHandler(18, 3.1599));
		index2.add(new ValueHandler(19, 3.1274));
		index2.add(new ValueHandler(20, 3.0984));
		index2.add(new ValueHandler(21, 3.0725));
		index2.add(new ValueHandler(22, 3.0491));
		index2.add(new ValueHandler(23, 3.0280));
		index2.add(new ValueHandler(24, 3.0088));
		index2.add(new ValueHandler(25, 2.9912));
		index2.add(new ValueHandler(26, 2.9752));
		index2.add(new ValueHandler(27, 2.9604));
		index2.add(new ValueHandler(28, 2.9467));
		index2.add(new ValueHandler(29, 2.9340));
		index2.add(new ValueHandler(30, 2.9223));
		index2.add(new ValueHandler(40, 2.8387));
		index2.add(new ValueHandler(60, 2.7581	));
		index2.add(new ValueHandler(120, 2.6802));
		
		zeroPointZeroFiveTable.add(new ValueHandler(3,index2));
		
		ArrayList<ValueHandler> index3= new ArrayList<ValueHandler>();
		
		index3.add(new ValueHandler(1, 224.5832	));
		index3.add(new ValueHandler(2, 19.2468));
		index3.add(new ValueHandler(3, 9.1172));
		index3.add(new ValueHandler(4, 6.3882));
		index3.add(new ValueHandler(5, 5.1922));
		index3.add(new ValueHandler(6, 4.5337));
		index3.add(new ValueHandler(7, 4.1203));
		index3.add(new ValueHandler(8, 3.8379));
		index3.add(new ValueHandler(9, 3.6331));
		index3.add(new ValueHandler(10, 3.4780));
		index3.add(new ValueHandler(11, 3.3567));
		index3.add(new ValueHandler(12, 3.2592));
		index3.add(new ValueHandler(13,3.1791));
		index3.add(new ValueHandler(14, 3.1122));
		index3.add(new ValueHandler(15, 3.0556));
		index3.add(new ValueHandler(16, 3.0069));
		index3.add(new ValueHandler(17, 2.9647));
		index3.add(new ValueHandler(18, 2.9277));
		index3.add(new ValueHandler(19, 2.8951));
		index3.add(new ValueHandler(20, 2.8661));
		index3.add(new ValueHandler(21, 2.8401));
		index3.add(new ValueHandler(22, 2.8167));
		index3.add(new ValueHandler(23, 2.7955));
		index3.add(new ValueHandler(24, 2.7763));
		index3.add(new ValueHandler(25, 2.7587));
		index3.add(new ValueHandler(26, 2.7426));
		index3.add(new ValueHandler(27, 2.7278));
		index3.add(new ValueHandler(28, 2.7141));
		index3.add(new ValueHandler(29, 2.7014));
		index3.add(new ValueHandler(30, 2.6896));
		index3.add(new ValueHandler(40, 2.6060));
		index3.add(new ValueHandler(60, 2.5252));
		index3.add(new ValueHandler(120, 2.4472));
		
		zeroPointZeroFiveTable.add(new ValueHandler(4,index3));
		
		ArrayList<ValueHandler> index4= new ArrayList<ValueHandler>();
		
		index4.add(new ValueHandler(1, 230.1619));
		index4.add(new ValueHandler(2, 19.2964));
		index4.add(new ValueHandler(3, 9.0135));
		index4.add(new ValueHandler(4, 6.2561));
		index4.add(new ValueHandler(5, 5.0503));
		index4.add(new ValueHandler(6, 4.3874));
		index4.add(new ValueHandler(7, 3.9715));
		index4.add(new ValueHandler(8, 3.6875));
		index4.add(new ValueHandler(9, 3.4817));
		index4.add(new ValueHandler(10, 3.3258));
		index4.add(new ValueHandler(11, 3.2039));
		index4.add(new ValueHandler(12, 3.1059));
		index4.add(new ValueHandler(13, 3.0254));
		index4.add(new ValueHandler(14, 2.9582));
		index4.add(new ValueHandler(15, 2.9013));
		index4.add(new ValueHandler(16, 2.8524	));
		index4.add(new ValueHandler(17, 2.8100	));
		index4.add(new ValueHandler(18, 2.7729));
		index4.add(new ValueHandler(19, 2.7401));
		index4.add(new ValueHandler(20, 2.7109));
		index4.add(new ValueHandler(21,2.6848));
		index4.add(new ValueHandler(22, 2.6613));
		index4.add(new ValueHandler(23, 2.6400));
		index4.add(new ValueHandler(24, 2.6207));
		index4.add(new ValueHandler(25, 2.6030));
		index4.add(new ValueHandler(26, 2.5868));
		index4.add(new ValueHandler(27, 2.5719));
		index4.add(new ValueHandler(28, 2.5581));
		index4.add(new ValueHandler(29, 2.5454));
		index4.add(new ValueHandler(30, 2.5336));
		index4.add(new ValueHandler(40, 2.4495));
		index4.add(new ValueHandler(60, 2.3683));
		index4.add(new ValueHandler(120, 2.2899));
		
		zeroPointZeroFiveTable.add(new ValueHandler(5,index4));
		
		ArrayList<ValueHandler> index5= new ArrayList<ValueHandler>();
		
		index5.add(new ValueHandler(1, 233.9860));
		index5.add(new ValueHandler(2, 19.3295));
		index5.add(new ValueHandler(3, 8.9406));
		index5.add(new ValueHandler(4, 6.1631));
		index5.add(new ValueHandler(5, 4.9503));
		index5.add(new ValueHandler(6, 4.2839));
		index5.add(new ValueHandler(7, 3.8660));
		index5.add(new ValueHandler(8, 3.5806));
		index5.add(new ValueHandler(9, 3.3738));
		index5.add(new ValueHandler(10, 3.2172));
		index5.add(new ValueHandler(11,3.0946));
		index5.add(new ValueHandler(12, 2.9961));
		index5.add(new ValueHandler(13, 2.9153));
		index5.add(new ValueHandler(14, 2.8477));
		index5.add(new ValueHandler(15, 2.7905));
		index5.add(new ValueHandler(16, 2.7413));
		index5.add(new ValueHandler(17, 2.6987));
		index5.add(new ValueHandler(18, 2.6613));
		index5.add(new ValueHandler(19, 2.6283));
		index5.add(new ValueHandler(20, 2.5990));
		index5.add(new ValueHandler(21, 2.5727));
		index5.add(new ValueHandler(22, 2.5491));
		index5.add(new ValueHandler(23, 2.5277));
		index5.add(new ValueHandler(24, 2.5082));
		index5.add(new ValueHandler(25, 2.4904));
		index5.add(new ValueHandler(26, 2.4741));
		index5.add(new ValueHandler(27, 2.4591));
		index5.add(new ValueHandler(28, 2.4453));
		index5.add(new ValueHandler(29, 2.4324));
		index5.add(new ValueHandler(30, 2.4205));
		index5.add(new ValueHandler(40, 2.3359));
		index5.add(new ValueHandler(60, 2.2541));
		index5.add(new ValueHandler(120, 2.1750));
		
		zeroPointZeroFiveTable.add(new ValueHandler(6,index5));
		
		ArrayList<ValueHandler> index6= new ArrayList<ValueHandler>();
		
		index6.add(new ValueHandler(1, 236.7684));
		index6.add(new ValueHandler(2, 19.3532));
		index6.add(new ValueHandler(3, 8.8867));
		index6.add(new ValueHandler(4, 6.0942));
		index6.add(new ValueHandler(5, 4.8759));
		index6.add(new ValueHandler(6, 4.2067));
		index6.add(new ValueHandler(7, 3.7870));
		index6.add(new ValueHandler(8, 3.5005));
		index6.add(new ValueHandler(9, 3.2927));
		index6.add(new ValueHandler(10, 3.1355));
		index6.add(new ValueHandler(11, 3.0123));
		index6.add(new ValueHandler(12, 2.9134));
		index6.add(new ValueHandler(13,2.8321));
		index6.add(new ValueHandler(14, 2.7642));
		index6.add(new ValueHandler(15, 2.7066));
		index6.add(new ValueHandler(16, 2.6572));
		index6.add(new ValueHandler(17, 2.6143));
		index6.add(new ValueHandler(18, 2.5767));
		index6.add(new ValueHandler(19, 2.5435));
		index6.add(new ValueHandler(20, 2.5140));
		index6.add(new ValueHandler(21, 2.4876));
		index6.add(new ValueHandler(22, 2.4638));
		index6.add(new ValueHandler(23, 2.4422));
		index6.add(new ValueHandler(24, 2.4226));
		index6.add(new ValueHandler(25, 2.4047));
		index6.add(new ValueHandler(26, 2.3883));
		index6.add(new ValueHandler(27, 2.3732));
		index6.add(new ValueHandler(28, 2.3593));
		index6.add(new ValueHandler(29, 2.3463));
		index6.add(new ValueHandler(30, 2.3343));
		index6.add(new ValueHandler(40, 2.2490));
		index6.add(new ValueHandler(60, 2.1665));
		index6.add(new ValueHandler(120, 2.0868));
		
		zeroPointZeroFiveTable.add(new ValueHandler(7,index6));
		
		ArrayList<ValueHandler> index7= new ArrayList<ValueHandler>();
		
		index7.add(new ValueHandler(1, 238.8827));
		index7.add(new ValueHandler(2, 19.3710	));
		index7.add(new ValueHandler(3, 8.8452));
		index7.add(new ValueHandler(4, 6.0410));
		index7.add(new ValueHandler(5, 4.8183));
		index7.add(new ValueHandler(6, 4.1468));
		index7.add(new ValueHandler(7, 3.7257));
		index7.add(new ValueHandler(8, 3.4381));
		index7.add(new ValueHandler(9, 3.2296));
		index7.add(new ValueHandler(10, 3.0717));
		index7.add(new ValueHandler(11, 2.9480));
		index7.add(new ValueHandler(12, 2.8486));
		index7.add(new ValueHandler(13, 2.7669));
		index7.add(new ValueHandler(14, 2.6987));
		index7.add(new ValueHandler(15, 2.6408));
		index7.add(new ValueHandler(16, 2.5911));
		index7.add(new ValueHandler(17, 2.5480));
		index7.add(new ValueHandler(18, 2.5102));
		index7.add(new ValueHandler(19, 2.4768));
		index7.add(new ValueHandler(20, 2.4471));
		index7.add(new ValueHandler(21, 2.4205));
		index7.add(new ValueHandler(22, 2.3965));
		index7.add(new ValueHandler(23,2.3748));
		index7.add(new ValueHandler(24, 2.3551));
		index7.add(new ValueHandler(25, 2.3371));
		index7.add(new ValueHandler(26, 2.3205));
		index7.add(new ValueHandler(27, 2.3053));
		index7.add(new ValueHandler(28, 2.2913));
		index7.add(new ValueHandler(29, 2.2783));
		index7.add(new ValueHandler(30, 2.2662));
		index7.add(new ValueHandler(40, 2.1802));
		index7.add(new ValueHandler(60, 2.0970));
		index7.add(new ValueHandler(120, 2.0164));
		
		zeroPointZeroFiveTable.add(new ValueHandler(8,index7));
		
		ArrayList<ValueHandler> index8= new ArrayList<ValueHandler>();
		
		index8.add(new ValueHandler(1, 240.5433));
		index8.add(new ValueHandler(2, 19.3848));
		index8.add(new ValueHandler(3, 8.8123));
		index8.add(new ValueHandler(4, 5.9988));
		index8.add(new ValueHandler(5, 4.7725));
		index8.add(new ValueHandler(6, 4.0990));
		index8.add(new ValueHandler(7, 3.6767));
		index8.add(new ValueHandler(8, 3.3881));
		index8.add(new ValueHandler(9, 3.1789));
		index8.add(new ValueHandler(10, 3.0204));
		index8.add(new ValueHandler(11, 2.8962));
		index8.add(new ValueHandler(12, 2.7964));
		index8.add(new ValueHandler(13, 2.7144));
		index8.add(new ValueHandler(14, 2.6458));
		index8.add(new ValueHandler(15, 2.5876));
		index8.add(new ValueHandler(16, 2.5377));
		index8.add(new ValueHandler(17, 2.4943));
		index8.add(new ValueHandler(18, 2.4563));
		index8.add(new ValueHandler(19, 2.4227));
		index8.add(new ValueHandler(20, 2.3928));
		index8.add(new ValueHandler(21, 2.3660));
		index8.add(new ValueHandler(22, 2.3419));
		index8.add(new ValueHandler(23, 2.3201));
		index8.add(new ValueHandler(24, 2.3002));
		index8.add(new ValueHandler(25, 2.2821));
		index8.add(new ValueHandler(26, 2.2655));
		index8.add(new ValueHandler(27, 2.2501));
		index8.add(new ValueHandler(28, 2.2360));
		index8.add(new ValueHandler(29, 2.2229	));
		index8.add(new ValueHandler(30, 2.2107));
		index8.add(new ValueHandler(40,2.1240));
		index8.add(new ValueHandler(60, 2.0401));
		index8.add(new ValueHandler(120,1.9588	));
		
		zeroPointZeroFiveTable.add(new ValueHandler(9,index8));
		
		ArrayList<ValueHandler> index9= new ArrayList<ValueHandler>();
		
		index9.add(new ValueHandler(1, 241.8817));
		index9.add(new ValueHandler(2, 19.3959));
		index9.add(new ValueHandler(3, 8.7855));
		index9.add(new ValueHandler(4, 5.9644));
		index9.add(new ValueHandler(5, 4.7351));
		index9.add(new ValueHandler(6, 4.0600));
		index9.add(new ValueHandler(7, 3.6365));
		index9.add(new ValueHandler(8, 3.3472));
		index9.add(new ValueHandler(9, 3.1373));
		index9.add(new ValueHandler(10, 2.9782));
		index9.add(new ValueHandler(11, 2.8536));
		index9.add(new ValueHandler(12, 2.7534));
		index9.add(new ValueHandler(13, 2.6710));
		index9.add(new ValueHandler(14, 2.6022));
		index9.add(new ValueHandler(15, 2.5437));
		index9.add(new ValueHandler(16, 2.4935));
		index9.add(new ValueHandler(17, 2.4499));
		index9.add(new ValueHandler(18, 2.4117));
		index9.add(new ValueHandler(19, 2.3779));
		index9.add(new ValueHandler(20, 2.3479));
		index9.add(new ValueHandler(21, 2.3210));
		index9.add(new ValueHandler(22, 2.2967));
		index9.add(new ValueHandler(23, 2.2747));
		index9.add(new ValueHandler(24, 2.2547));
		index9.add(new ValueHandler(25, 2.2365));
		index9.add(new ValueHandler(26, 2.2197));
		index9.add(new ValueHandler(27, 2.2043));
		index9.add(new ValueHandler(28, 2.1900));
		index9.add(new ValueHandler(29, 2.1768	));
		index9.add(new ValueHandler(30, 2.1646	));
		index9.add(new ValueHandler(40, 2.0772));
		index9.add(new ValueHandler(60, 1.9926));
		index9.add(new ValueHandler(120, 1.9105));
		
		zeroPointZeroFiveTable.add(new ValueHandler(10,index9));
		
		ArrayList<ValueHandler> index10= new ArrayList<ValueHandler>();
		
		index10.add(new ValueHandler(1, 243.9060));
		index10.add(new ValueHandler(2, 19.4125));
		index10.add(new ValueHandler(3, 8.7446));
		index10.add(new ValueHandler(4, 5.9117));
		index10.add(new ValueHandler(5, 4.6777));
		index10.add(new ValueHandler(6, 3.9999));
		index10.add(new ValueHandler(7, 3.5747));
		index10.add(new ValueHandler(8, 3.2839));
		index10.add(new ValueHandler(9, 3.0729));
		index10.add(new ValueHandler(10, 2.9130));
		index10.add(new ValueHandler(11, 2.7876	));
		index10.add(new ValueHandler(12, 2.6866));
		index10.add(new ValueHandler(13, 2.6037));
		index10.add(new ValueHandler(14, 2.5342	));
		index10.add(new ValueHandler(15, 2.4753));
		index10.add(new ValueHandler(16, 2.4247));
		index10.add(new ValueHandler(17, 2.3807));
		index10.add(new ValueHandler(18, 2.3421));
		index10.add(new ValueHandler(19, 2.3080	));
		index10.add(new ValueHandler(20, 2.2776));
		index10.add(new ValueHandler(21, 2.2504));
		index10.add(new ValueHandler(22, 2.2258));
		index10.add(new ValueHandler(23, 2.2036));
		index10.add(new ValueHandler(24, 2.1834));
		index10.add(new ValueHandler(25, 2.1649));
		index10.add(new ValueHandler(26, 2.1479));
		index10.add(new ValueHandler(27, 2.1323));
		index10.add(new ValueHandler(28, 2.1179));
		index10.add(new ValueHandler(29, 2.1045));
		index10.add(new ValueHandler(30,2.0921));
		index10.add(new ValueHandler(40, 2.0035));
		index10.add(new ValueHandler(60, 1.9174));
		index10.add(new ValueHandler(120, 1.8337));
		
		zeroPointZeroFiveTable.add(new ValueHandler(12,index10));
		
		ArrayList<ValueHandler> index11= new ArrayList<ValueHandler>();
		
		index11.add(new ValueHandler(1,245.9499));
		index11.add(new ValueHandler(2, 19.4291));
		index11.add(new ValueHandler(3, 8.7029));
		index11.add(new ValueHandler(4, 5.8578));
		index11.add(new ValueHandler(5, 4.6188));//last attempt
		index11.add(new ValueHandler(6, 3.9381));
		index11.add(new ValueHandler(7, 3.5107));
		index11.add(new ValueHandler(8, 3.2184));
		index11.add(new ValueHandler(9, 3.0061));
		index11.add(new ValueHandler(10, 2.8450	));
		index11.add(new ValueHandler(11, 2.7186));
		index11.add(new ValueHandler(12, 2.6169));
		index11.add(new ValueHandler(13,2.5331));
		index11.add(new ValueHandler(14, 2.4630	));
		index11.add(new ValueHandler(15, 2.4034));
		index11.add(new ValueHandler(16, 2.3522));
		index11.add(new ValueHandler(17, 2.3077));
		index11.add(new ValueHandler(18, 2.2686));
		index11.add(new ValueHandler(19,2.2341));
		index11.add(new ValueHandler(20, 2.2033));
		index11.add(new ValueHandler(21, 2.1757));
		index11.add(new ValueHandler(22, 2.1508));
		index11.add(new ValueHandler(23, 2.1282));
		index11.add(new ValueHandler(24, 2.1077));
		index11.add(new ValueHandler(25, 2.0889));
		index11.add(new ValueHandler(26, 2.0716));
		index11.add(new ValueHandler(27, 2.0558));
		index11.add(new ValueHandler(28, 2.0411	));
		index11.add(new ValueHandler(29, 2.0275));
		index11.add(new ValueHandler(30, 2.0148));
		index11.add(new ValueHandler(40, 1.9245));
		index11.add(new ValueHandler(60,1.8364));
		index11.add(new ValueHandler(120, 1.7505));
		
		zeroPointZeroFiveTable.add(new ValueHandler(15,index11));
		
		ArrayList<ValueHandler> index12= new ArrayList<ValueHandler>();
		
		index12.add(new ValueHandler(1, 248.0131));
		index12.add(new ValueHandler(2, 19.4458));
		index12.add(new ValueHandler(3,8.6602));
		index12.add(new ValueHandler(4, 5.8025));
		index12.add(new ValueHandler(5, 4.5581));
		index12.add(new ValueHandler(6, 3.8742));
		index12.add(new ValueHandler(7, 3.4445));
		index12.add(new ValueHandler(8, 3.1503));
		index12.add(new ValueHandler(9, 2.9365));
		index12.add(new ValueHandler(10, 2.7740));
		index12.add(new ValueHandler(11, 2.6464));
		index12.add(new ValueHandler(12, 2.5436));
		index12.add(new ValueHandler(13, 2.4589));
		index12.add(new ValueHandler(14, 2.3879));
		index12.add(new ValueHandler(15, 2.3275));
		index12.add(new ValueHandler(16, 2.2756	));
		index12.add(new ValueHandler(17, 2.2304));
		index12.add(new ValueHandler(18, 2.1906));
		index12.add(new ValueHandler(19, 2.1555));
		index12.add(new ValueHandler(20, 2.1242));
		index12.add(new ValueHandler(21, 2.0960));
		index12.add(new ValueHandler(22, 2.0707));
		index12.add(new ValueHandler(23, 2.0476));
		index12.add(new ValueHandler(24, 2.0267));
		index12.add(new ValueHandler(25, 2.0075));
		index12.add(new ValueHandler(26, 1.9898	));
		index12.add(new ValueHandler(27, 1.9736));
		index12.add(new ValueHandler(28, 1.9586));
		index12.add(new ValueHandler(29, 1.9446));
		index12.add(new ValueHandler(30, 1.9317));
		index12.add(new ValueHandler(40, 1.8389));
		index12.add(new ValueHandler(60, 1.7480));
		index12.add(new ValueHandler(120, 1.6587));
		
		zeroPointZeroFiveTable.add(new ValueHandler(20,index12));
		
		ArrayList<ValueHandler> index13= new ArrayList<ValueHandler>();
		
		index13.add(new ValueHandler(1, 249.0518));
		index13.add(new ValueHandler(2, 19.4541	));
		index13.add(new ValueHandler(3,8.6385));
		index13.add(new ValueHandler(4, 5.7744	));
		index13.add(new ValueHandler(5, 4.5272));
		index13.add(new ValueHandler(6, 3.8415));
		index13.add(new ValueHandler(7,3.4105));
		index13.add(new ValueHandler(8, 3.1152));
		index13.add(new ValueHandler(9, 2.9005));
		index13.add(new ValueHandler(10, 2.7372));
		index13.add(new ValueHandler(11, 2.6090));
		index13.add(new ValueHandler(12, 2.5055));
		index13.add(new ValueHandler(13, 2.4202));
		index13.add(new ValueHandler(14, 2.3487));
		index13.add(new ValueHandler(15, 2.2878));
		index13.add(new ValueHandler(16, 2.2354));
		index13.add(new ValueHandler(17, 2.1898));
		index13.add(new ValueHandler(18, 2.1497));
		index13.add(new ValueHandler(19, 2.1141));
		index13.add(new ValueHandler(20, 2.0825));
		index13.add(new ValueHandler(21, 2.0540));
		index13.add(new ValueHandler(22, 2.0283));
		index13.add(new ValueHandler(23, 2.0050));
		index13.add(new ValueHandler(24, 1.9838));
		index13.add(new ValueHandler(25, 1.9643));
		index13.add(new ValueHandler(26, 1.9464));
		index13.add(new ValueHandler(27, 1.9299));
		index13.add(new ValueHandler(28, 1.9147));
		index13.add(new ValueHandler(29, 1.9005));
		index13.add(new ValueHandler(30, 1.8874));
		index13.add(new ValueHandler(40, 1.7929));
		index13.add(new ValueHandler(60, 1.7001));
		index13.add(new ValueHandler(120, 1.6084));
		
		
		zeroPointZeroFiveTable.add(new ValueHandler(24,index13));
		
		ArrayList<ValueHandler> index14= new ArrayList<ValueHandler>();
		
		index14.add(new ValueHandler(1, 250.0951));
		index14.add(new ValueHandler(2, 19.4624));
		index14.add(new ValueHandler(3,8.6166));
		index14.add(new ValueHandler(4, 5.7459));
		index14.add(new ValueHandler(5, 4.4957));
		index14.add(new ValueHandler(6, 3.8082));
		index14.add(new ValueHandler(7, 3.3758));
		index14.add(new ValueHandler(8, 3.0794));
		index14.add(new ValueHandler(9, 2.8637));
		index14.add(new ValueHandler(10, 2.6996));
		index14.add(new ValueHandler(11, 2.5705));
		index14.add(new ValueHandler(12, 2.4663));
		index14.add(new ValueHandler(13, 2.3803));
		index14.add(new ValueHandler(14, 2.3082));
		index14.add(new ValueHandler(15, 2.2468));
		index14.add(new ValueHandler(16, 2.1938));
		index14.add(new ValueHandler(17, 2.1477	));
		index14.add(new ValueHandler(18, 2.1071));
		index14.add(new ValueHandler(19, 2.0712));
		index14.add(new ValueHandler(20, 2.0391));
		index14.add(new ValueHandler(21, 2.0102));
		index14.add(new ValueHandler(22, 1.9842));
		index14.add(new ValueHandler(23, 1.9605));
		index14.add(new ValueHandler(24, 1.9390));
		index14.add(new ValueHandler(25, 1.9010	));
		index14.add(new ValueHandler(26, 1.8842));
		index14.add(new ValueHandler(27, 1.8687));
		index14.add(new ValueHandler(28, 1.8543));
		index14.add(new ValueHandler(29, 1.9005));
		index14.add(new ValueHandler(30, 1.8409));
		index14.add(new ValueHandler(40, 1.7444));
		index14.add(new ValueHandler(60, 1.6491));
		index14.add(new ValueHandler(120, 1.5543));
		
		zeroPointZeroFiveTable.add(new ValueHandler(30,index14));
		
		ArrayList<ValueHandler> index15= new ArrayList<ValueHandler>();
		
		index15.add(new ValueHandler(1, 251.1432));
		index15.add(new ValueHandler(2, 19.4707));
		index15.add(new ValueHandler(3,8.5944));
		index15.add(new ValueHandler(4, 5.7170));
		index15.add(new ValueHandler(5, 4.4638));
		index15.add(new ValueHandler(6, 3.7743));
		index15.add(new ValueHandler(7, 3.3404));
		index15.add(new ValueHandler(8, 3.0428));
		index15.add(new ValueHandler(9, 2.8259));
		index15.add(new ValueHandler(10, 2.6609));
		index15.add(new ValueHandler(11, 2.5309));
		index15.add(new ValueHandler(12, 2.4259));
		index15.add(new ValueHandler(13, 2.3392));
		index15.add(new ValueHandler(14, 2.2664));
		index15.add(new ValueHandler(15, 2.2043));
		index15.add(new ValueHandler(16, 2.1507	));
		index15.add(new ValueHandler(17, 2.1040));
		index15.add(new ValueHandler(18, 2.0629));
		index15.add(new ValueHandler(19, 2.0264));
		index15.add(new ValueHandler(20, 1.9938));
		index15.add(new ValueHandler(21, 1.9645	));
		index15.add(new ValueHandler(22, 1.9380));
		index15.add(new ValueHandler(23, 1.9139));
		index15.add(new ValueHandler(24, 1.8920));
		index15.add(new ValueHandler(25, 1.8718));
		index15.add(new ValueHandler(26, 1.8533));
		index15.add(new ValueHandler(27, 1.8361));
		index15.add(new ValueHandler(28, 1.8203));
		index15.add(new ValueHandler(29, 1.8055));
		index15.add(new ValueHandler(30, 1.7918));
		index15.add(new ValueHandler(40, 1.6928));
		index15.add(new ValueHandler(60, 1.5943));
		index15.add(new ValueHandler(120, 1.4952));
		
		zeroPointZeroFiveTable.add(new ValueHandler(40,index15));
		
		ArrayList<ValueHandler> index16= new ArrayList<ValueHandler>();
		
		index16.add(new ValueHandler(1, 252.1957));
		index16.add(new ValueHandler(2, 19.4791));
		index16.add(new ValueHandler(3,8.5720));
		index16.add(new ValueHandler(4, 5.6877));
		index16.add(new ValueHandler(5, 4.4314));
		index16.add(new ValueHandler(6, 3.7398));
		index16.add(new ValueHandler(7, 3.3043));
		index16.add(new ValueHandler(8, 3.0053));
		index16.add(new ValueHandler(9, 2.7872));
		index16.add(new ValueHandler(10, 2.6211));
		index16.add(new ValueHandler(11, 2.4901	));
		index16.add(new ValueHandler(12, 2.3842	));
		index16.add(new ValueHandler(13, 2.2966));
		index16.add(new ValueHandler(14, 2.2229));
		index16.add(new ValueHandler(15, 2.1601));
		index16.add(new ValueHandler(16, 2.1058));
		index16.add(new ValueHandler(17, 2.0584));
		index16.add(new ValueHandler(18, 2.0166));
		index16.add(new ValueHandler(19, 1.9795));
		index16.add(new ValueHandler(20, 1.9464));
		index16.add(new ValueHandler(21, 1.9165));
		index16.add(new ValueHandler(22, 1.8894));
		index16.add(new ValueHandler(23, 1.8648));
		index16.add(new ValueHandler(24, 1.8424));
		index16.add(new ValueHandler(25, 1.8217));
		index16.add(new ValueHandler(26, 1.8027));
		index16.add(new ValueHandler(27, 1.7851));
		index16.add(new ValueHandler(28, 1.7689));
		index16.add(new ValueHandler(29, 1.7537));
		index16.add(new ValueHandler(30, 1.7396	));
		index16.add(new ValueHandler(40, 1.6373	));
		index16.add(new ValueHandler(60, 1.5343));
		index16.add(new ValueHandler(120, 1.4290));
		
		zeroPointZeroFiveTable.add(new ValueHandler(60,index16));
		
		ArrayList<ValueHandler> index17= new ArrayList<ValueHandler>();
		
		index17.add(new ValueHandler(1, 253.2529));
		index17.add(new ValueHandler(2, 19.4874));
		index17.add(new ValueHandler(3,8.5494));
		index17.add(new ValueHandler(4, 5.6581));
		index17.add(new ValueHandler(5, 4.3985));
		index17.add(new ValueHandler(6, 3.7047));
		index17.add(new ValueHandler(7, 3.2674));
		index17.add(new ValueHandler(8, 2.9669));
		index17.add(new ValueHandler(9, 2.7475));
		index17.add(new ValueHandler(10, 2.5801));
		index17.add(new ValueHandler(11, 2.4480));
		index17.add(new ValueHandler(12, 2.3410));
		index17.add(new ValueHandler(13, 2.2524));
		index17.add(new ValueHandler(14, 2.1778));
		index17.add(new ValueHandler(15, 2.1141));
		index17.add(new ValueHandler(16, 2.0589));
		index17.add(new ValueHandler(17, 2.0107));
		index17.add(new ValueHandler(18, 1.9681));
		index17.add(new ValueHandler(19, 1.9302));
		index17.add(new ValueHandler(20, 1.8963));
		index17.add(new ValueHandler(21, 1.8657));
		index17.add(new ValueHandler(22, 1.8380));
		index17.add(new ValueHandler(23, 1.8128));
		index17.add(new ValueHandler(24, 1.7896));
		index17.add(new ValueHandler(25, 1.7684));
		index17.add(new ValueHandler(26, 1.7488));
		index17.add(new ValueHandler(27, 1.7306));
		index17.add(new ValueHandler(28, 1.7138));
		index17.add(new ValueHandler(29, 1.6981));
		index17.add(new ValueHandler(30, 1.6835));
		index17.add(new ValueHandler(40, 1.5766));
		index17.add(new ValueHandler(60, 1.4673));
		index17.add(new ValueHandler(120, 1.3519));
		
		
		zeroPointZeroFiveTable.add(new ValueHandler(120,index17));
		
		table.add(new FTableCompilation(0.05, zeroPointZeroFiveTable));
		
	}
	
	public void setZeroPointTenTable()
	{

		zeroPointTenTable  = new ArrayList<ValueHandler>();
		ArrayList<ValueHandler> index0= new ArrayList<ValueHandler>();
		
		index0.add(new ValueHandler(1, 39.86346));
		index0.add(new ValueHandler(2, 8.52632));
		index0.add(new ValueHandler(3, 5.53832));
		index0.add(new ValueHandler(4, 4.54477));
		index0.add(new ValueHandler(5, 4.06042	));
		index0.add(new ValueHandler(6, 3.77595));
		index0.add(new ValueHandler(7, 3.58943	));
		index0.add(new ValueHandler(8, 3.45792));
		index0.add(new ValueHandler(9, 3.36030));
		index0.add(new ValueHandler(10, 3.28502));
		index0.add(new ValueHandler(11, 3.22520));
		index0.add(new ValueHandler(12, 3.17655));
		index0.add(new ValueHandler(13, 3.13621));
		index0.add(new ValueHandler(14, 3.10221));
		index0.add(new ValueHandler(15, 3.07319	));
		index0.add(new ValueHandler(16, 3.04811));
		index0.add(new ValueHandler(17, 3.02623));
		index0.add(new ValueHandler(18, 3.00698));
		index0.add(new ValueHandler(19, 2.98990	));
		index0.add(new ValueHandler(20, 2.97465));
		index0.add(new ValueHandler(21, 2.96096));
		index0.add(new ValueHandler(22, 2.94858));
		index0.add(new ValueHandler(23, 2.93736));
		index0.add(new ValueHandler(24, 2.92712));
		index0.add(new ValueHandler(25, 2.91774));
		index0.add(new ValueHandler(26, 2.90913));
		index0.add(new ValueHandler(27, 2.90119	));
		index0.add(new ValueHandler(28, 2.89385));
		index0.add(new ValueHandler(29, 2.88703));
		index0.add(new ValueHandler(30, 2.88069));
		index0.add(new ValueHandler(40, 2.83535));
		index0.add(new ValueHandler(60, 2.79107));
		index0.add(new ValueHandler(120, 2.74781));
		
		zeroPointTenTable.add(new ValueHandler(1,index0));
		
		ArrayList<ValueHandler> index1= new ArrayList<ValueHandler>();
		
		index1.add(new ValueHandler(1, 49.50000));
		index1.add(new ValueHandler(2, 9.00000	));
		index1.add(new ValueHandler(3, 5.46238));
		index1.add(new ValueHandler(4, 4.32456));
		index1.add(new ValueHandler(5, 3.77972	));
		index1.add(new ValueHandler(6, 3.46330));
		index1.add(new ValueHandler(7, 3.25744));
		index1.add(new ValueHandler(8, 3.11312));
		index1.add(new ValueHandler(9, 3.00645));
		index1.add(new ValueHandler(10, 2.92447));
		index1.add(new ValueHandler(11, 2.85951));
		index1.add(new ValueHandler(12, 2.80680));
		index1.add(new ValueHandler(13, 2.76317));
		index1.add(new ValueHandler(14, 2.72647));
		index1.add(new ValueHandler(15, 2.69517));
		index1.add(new ValueHandler(16, 2.66817));
		index1.add(new ValueHandler(17, 2.64464));
		index1.add(new ValueHandler(18, 2.62395));
		index1.add(new ValueHandler(19, 2.60561));
		index1.add(new ValueHandler(20, 2.58925));
		index1.add(new ValueHandler(21, 2.57457	));
		index1.add(new ValueHandler(22, 2.56131));
		index1.add(new ValueHandler(23, 2.54929));
		index1.add(new ValueHandler(24, 2.53833	));
		index1.add(new ValueHandler(25, 2.52831));
		index1.add(new ValueHandler(26, 2.51910	));
		index1.add(new ValueHandler(27, 2.51061));
		index1.add(new ValueHandler(28, 2.50276));
		index1.add(new ValueHandler(29, 2.49548));
		index1.add(new ValueHandler(30, 2.48872));
		index1.add(new ValueHandler(40, 2.44037	));
		index1.add(new ValueHandler(60, 2.39325));
		index1.add(new ValueHandler(120, 2.34734));
		
		zeroPointTenTable.add(new ValueHandler(2,index1));
		
		ArrayList<ValueHandler> index2= new ArrayList<ValueHandler>();
		
		index2.add(new ValueHandler(1, 53.59324	));
		index2.add(new ValueHandler(2, 9.16179));
		index2.add(new ValueHandler(3, 5.39077	));
		index2.add(new ValueHandler(4, 4.19086));
		index2.add(new ValueHandler(5, 3.61948));
		index2.add(new ValueHandler(6, 3.28876));
		index2.add(new ValueHandler(7, 3.07407));
		index2.add(new ValueHandler(8, 2.92380	));
		index2.add(new ValueHandler(9, 2.81286));
		index2.add(new ValueHandler(10, 2.72767));
		index2.add(new ValueHandler(11, 2.66023	));
		index2.add(new ValueHandler(12, 2.60552));
		index2.add(new ValueHandler(13, 2.56027));
		index2.add(new ValueHandler(14, 2.52222));
		index2.add(new ValueHandler(15, 2.48979));
		index2.add(new ValueHandler(16, 2.46181));
		index2.add(new ValueHandler(17, 2.43743));
		index2.add(new ValueHandler(18, 2.41601));
		index2.add(new ValueHandler(19, 2.39702));
		index2.add(new ValueHandler(20, 2.38009));
		index2.add(new ValueHandler(21, 2.36489));
		index2.add(new ValueHandler(22, 2.35117));
		index2.add(new ValueHandler(23, 2.33873));
		index2.add(new ValueHandler(24, 2.32739	));
		index2.add(new ValueHandler(25, 2.31702));
		index2.add(new ValueHandler(26, 2.30749));
		index2.add(new ValueHandler(27, 2.29871));
		index2.add(new ValueHandler(28, 2.29060));
		index2.add(new ValueHandler(29, 2.28307));
		index2.add(new ValueHandler(30, 2.27607));
		index2.add(new ValueHandler(40, 2.22609));
		index2.add(new ValueHandler(60, 2.17741));
		index2.add(new ValueHandler(120, 2.12999));
		
		zeroPointTenTable.add(new ValueHandler(3,index2));
		
		ArrayList<ValueHandler> index3= new ArrayList<ValueHandler>();
		
		index3.add(new ValueHandler(1, 55.83296));
		index3.add(new ValueHandler(2, 9.24342));
		index3.add(new ValueHandler(3, 5.34264));
		index3.add(new ValueHandler(4, 4.10725));
		index3.add(new ValueHandler(5, 3.52020));
		index3.add(new ValueHandler(6, 3.18076));
		index3.add(new ValueHandler(7, 2.96053));
		index3.add(new ValueHandler(8, 2.80643));
		index3.add(new ValueHandler(9, 2.69268));
		index3.add(new ValueHandler(10, 2.60534));
		index3.add(new ValueHandler(11, 2.53619));
		index3.add(new ValueHandler(12, 2.48010));
		index3.add(new ValueHandler(13, 2.43371));
		index3.add(new ValueHandler(14, 2.39469));
		index3.add(new ValueHandler(15, 2.36143));
		index3.add(new ValueHandler(16, 2.33274));
		index3.add(new ValueHandler(17, 2.30775));
		index3.add(new ValueHandler(18, 2.28577));
		index3.add(new ValueHandler(19, 2.26630));
		index3.add(new ValueHandler(20, 2.24893));
		index3.add(new ValueHandler(21, 2.23334));
		index3.add(new ValueHandler(22, 2.21927));
		index3.add(new ValueHandler(23, 2.20651));
		index3.add(new ValueHandler(24, 2.19488));
		index3.add(new ValueHandler(25, 2.18424));
		index3.add(new ValueHandler(26, 2.17447));
		index3.add(new ValueHandler(27, 2.16546));
		index3.add(new ValueHandler(28, 2.15714));
		index3.add(new ValueHandler(29, 2.14941));
		index3.add(new ValueHandler(30, 2.14223));
		index3.add(new ValueHandler(40, 2.09095));
		index3.add(new ValueHandler(60, 2.04099	));
		index3.add(new ValueHandler(120, 1.99230));
		
		zeroPointTenTable.add(new ValueHandler(4,index3));
		
		ArrayList<ValueHandler> index4= new ArrayList<ValueHandler>();
		
		index4.add(new ValueHandler(1, 57.24008));
		index4.add(new ValueHandler(2, 9.29263));
		index4.add(new ValueHandler(3, 5.30916));
		index4.add(new ValueHandler(4, 4.05058));
		index4.add(new ValueHandler(5, 3.45298));
		index4.add(new ValueHandler(6, 3.10751));
		index4.add(new ValueHandler(7, 2.88334));
		index4.add(new ValueHandler(8, 2.72645));
		index4.add(new ValueHandler(9, 2.61061));
		index4.add(new ValueHandler(10, 2.52164));
		index4.add(new ValueHandler(11, 2.45118));
		index4.add(new ValueHandler(12, 2.39402));
		index4.add(new ValueHandler(13, 2.34672));
		index4.add(new ValueHandler(14, 2.30694));
		index4.add(new ValueHandler(15, 2.27302));
		index4.add(new ValueHandler(16, 2.24376));
		index4.add(new ValueHandler(17, 2.21825));
		index4.add(new ValueHandler(18, 2.19583));
		index4.add(new ValueHandler(19, 2.17596));
		index4.add(new ValueHandler(20, 2.15823));
		index4.add(new ValueHandler(21, 2.14231));
		index4.add(new ValueHandler(22, 2.12794));
		index4.add(new ValueHandler(23, 2.11491));
		index4.add(new ValueHandler(24, 2.10303));
		index4.add(new ValueHandler(25, 2.09216));
		index4.add(new ValueHandler(26, 2.08218));
		index4.add(new ValueHandler(27, 2.07298));
		index4.add(new ValueHandler(28, 2.06447));
		index4.add(new ValueHandler(29, 2.05658));
		index4.add(new ValueHandler(30, 2.04925	));
		index4.add(new ValueHandler(40, 1.99682));
		index4.add(new ValueHandler(60, 1.94571));
		index4.add(new ValueHandler(120, 1.89587));
		
		zeroPointTenTable.add(new ValueHandler(5,index4));
		
		ArrayList<ValueHandler> index5= new ArrayList<ValueHandler>();
		
		index5.add(new ValueHandler(1, 58.20442));
		index5.add(new ValueHandler(2, 9.32553));
		index5.add(new ValueHandler(3, 5.28473));
		index5.add(new ValueHandler(4, 4.00975));
		index5.add(new ValueHandler(5, 3.40451));
		index5.add(new ValueHandler(6, 3.05455));
		index5.add(new ValueHandler(7, 2.82739));
		index5.add(new ValueHandler(8, 2.66833));
		index5.add(new ValueHandler(9, 2.55086));
		index5.add(new ValueHandler(10, 2.46058));
		index5.add(new ValueHandler(11, 2.38907));
		index5.add(new ValueHandler(12, 2.33102));
		index5.add(new ValueHandler(13, 2.28298));
		index5.add(new ValueHandler(14, 2.24256));
		index5.add(new ValueHandler(15, 2.20808));
		index5.add(new ValueHandler(16, 2.17833));
		index5.add(new ValueHandler(17, 2.15239));
		index5.add(new ValueHandler(18, 2.12958));
		index5.add(new ValueHandler(19, 2.10936));
		index5.add(new ValueHandler(20, 2.09132));
		index5.add(new ValueHandler(21, 2.07512));
		index5.add(new ValueHandler(22, 2.06050));
		index5.add(new ValueHandler(23, 2.04723));
		index5.add(new ValueHandler(24, 2.03513));
		index5.add(new ValueHandler(25, 2.02406));
		index5.add(new ValueHandler(26, 2.01389));
		index5.add(new ValueHandler(27, 2.00452));
		index5.add(new ValueHandler(28, 1.99585));
		index5.add(new ValueHandler(29, 1.98781));
		index5.add(new ValueHandler(30, 1.98033));
		index5.add(new ValueHandler(40, 1.92688));
		index5.add(new ValueHandler(60, 1.87472));
		index5.add(new ValueHandler(120, 1.82381));
		
		zeroPointTenTable.add(new ValueHandler(6,index5));
		
		ArrayList<ValueHandler> index6= new ArrayList<ValueHandler>();
		
		index6.add(new ValueHandler(1, 58.90595));
		index6.add(new ValueHandler(2, 9.34908));
		index6.add(new ValueHandler(3, 5.26619));
		index6.add(new ValueHandler(4, 3.97897));
		index6.add(new ValueHandler(5, 3.36790));
		index6.add(new ValueHandler(6, 3.01446));
		index6.add(new ValueHandler(7, 2.78493));
		index6.add(new ValueHandler(8, 2.62413));
		index6.add(new ValueHandler(9, 2.50531));
		index6.add(new ValueHandler(10, 2.41397));
		index6.add(new ValueHandler(11, 2.34157));
		index6.add(new ValueHandler(12, 2.28278));
		index6.add(new ValueHandler(13, 2.23410));
		index6.add(new ValueHandler(14, 2.19313));
		index6.add(new ValueHandler(15, 2.15818	));
		index6.add(new ValueHandler(16, 2.12800));
		index6.add(new ValueHandler(17, 2.10169));
		index6.add(new ValueHandler(18, 2.07854));
		index6.add(new ValueHandler(19, 2.05802));
		index6.add(new ValueHandler(20, 2.03970));
		index6.add(new ValueHandler(21, 2.02325));
		index6.add(new ValueHandler(22, 2.00840));
		index6.add(new ValueHandler(23, 1.99492));
		index6.add(new ValueHandler(24, 1.98263));
		index6.add(new ValueHandler(25, 1.97138));
		index6.add(new ValueHandler(26, 1.96104));
		index6.add(new ValueHandler(27, 1.95151));
		index6.add(new ValueHandler(28, 1.94270	));
		index6.add(new ValueHandler(29, 1.93452));
		index6.add(new ValueHandler(30, 1.92692));
		index6.add(new ValueHandler(40, 1.87252));
		index6.add(new ValueHandler(60, 1.81939));
		index6.add(new ValueHandler(120, 1.76748));
		
		zeroPointTenTable.add(new ValueHandler(7,index6));
		
		ArrayList<ValueHandler> index7= new ArrayList<ValueHandler>();
		
		index7.add(new ValueHandler(1, 59.43898));
		index7.add(new ValueHandler(2, 9.36677));
		index7.add(new ValueHandler(3, 5.25167));
		index7.add(new ValueHandler(4, 3.95494));
		index7.add(new ValueHandler(5, 3.33928));
		index7.add(new ValueHandler(6, 2.98304));
		index7.add(new ValueHandler(7, 2.75158));
		index7.add(new ValueHandler(8, 2.58935));
		index7.add(new ValueHandler(9, 2.46941));
		index7.add(new ValueHandler(10, 2.37715));
		index7.add(new ValueHandler(11, 2.30400));
		index7.add(new ValueHandler(12, 2.24457));
		index7.add(new ValueHandler(13, 2.19535));
		index7.add(new ValueHandler(14, 2.15390));
		index7.add(new ValueHandler(15, 2.11853));
		index7.add(new ValueHandler(16, 2.08798));
		index7.add(new ValueHandler(17, 2.06134));
		index7.add(new ValueHandler(18, 2.03789));
		index7.add(new ValueHandler(19, 2.01710));
		index7.add(new ValueHandler(20, 1.99853));
		index7.add(new ValueHandler(21, 1.98186));
		index7.add(new ValueHandler(22, 1.96680));
		index7.add(new ValueHandler(23, 1.95312));
		index7.add(new ValueHandler(24, 1.94066));
		index7.add(new ValueHandler(25, 1.92925));
		index7.add(new ValueHandler(26, 1.91876));
		index7.add(new ValueHandler(27, 1.90909));
		index7.add(new ValueHandler(28, 1.90014));
		index7.add(new ValueHandler(29, 1.89184));
		index7.add(new ValueHandler(30, 1.88412));
		index7.add(new ValueHandler(40, 1.82886));
		index7.add(new ValueHandler(60, 1.77483));
		index7.add(new ValueHandler(120, 1.72196));
		
		zeroPointTenTable.add(new ValueHandler(8,index7));
		
		ArrayList<ValueHandler> index8= new ArrayList<ValueHandler>();
		
		index8.add(new ValueHandler(1, 59.85759));
		index8.add(new ValueHandler(2, 9.38054));
		index8.add(new ValueHandler(3, 5.24000));
		index8.add(new ValueHandler(4, 3.93567));
		index8.add(new ValueHandler(5, 3.31628));
		index8.add(new ValueHandler(6, 2.95774));
		index8.add(new ValueHandler(7, 2.75158));
		index8.add(new ValueHandler(8, 2.56124));
		index8.add(new ValueHandler(9, 2.44034));
		index8.add(new ValueHandler(10, 2.34731));
		index8.add(new ValueHandler(11, 2.27350));
		index8.add(new ValueHandler(12, 2.21352));
		index8.add(new ValueHandler(13, 2.16382));
		index8.add(new ValueHandler(14, 2.12195));
		index8.add(new ValueHandler(15, 2.08621));
		index8.add(new ValueHandler(16, 2.05533));
		index8.add(new ValueHandler(17, 2.02839));
		index8.add(new ValueHandler(18, 2.00467));
		index8.add(new ValueHandler(19, 1.98364));
		index8.add(new ValueHandler(20, 1.96485));
		index8.add(new ValueHandler(21, 1.94797));
		index8.add(new ValueHandler(22, 1.93273));
		index8.add(new ValueHandler(23, 1.91888));
		index8.add(new ValueHandler(24, 1.90625));
		index8.add(new ValueHandler(25, 1.89469));
		index8.add(new ValueHandler(26, 1.88407));
		index8.add(new ValueHandler(27, 1.87427));
		index8.add(new ValueHandler(28, 1.86520));
		index8.add(new ValueHandler(29, 1.85679));
		index8.add(new ValueHandler(30, 1.84896));
		index8.add(new ValueHandler(40, 1.79290));
		index8.add(new ValueHandler(60, 1.73802));
		index8.add(new ValueHandler(120, 1.68425));
		
		zeroPointTenTable.add(new ValueHandler(9,index8));
		
		ArrayList<ValueHandler> index9= new ArrayList<ValueHandler>();
		
		index9.add(new ValueHandler(1, 60.19498));
		index9.add(new ValueHandler(2, 9.39157));
		index9.add(new ValueHandler(3, 5.23041));
		index9.add(new ValueHandler(4, 3.91988));
		index9.add(new ValueHandler(5, 3.29740));
		index9.add(new ValueHandler(6, 2.93693));
		index9.add(new ValueHandler(7, 2.70251));
		index9.add(new ValueHandler(8, 2.53804));
		index9.add(new ValueHandler(9, 2.41632));
		index9.add(new ValueHandler(10, 2.32260));
		index9.add(new ValueHandler(11, 2.24823));
		index9.add(new ValueHandler(12, 2.18776));
		index9.add(new ValueHandler(13, 2.13763));
		index9.add(new ValueHandler(14, 2.09540));
		index9.add(new ValueHandler(15, 2.05932));
		index9.add(new ValueHandler(16, 2.02815));
		index9.add(new ValueHandler(17, 2.00094));
		index9.add(new ValueHandler(18, 1.97698));
		index9.add(new ValueHandler(19, 1.95573));
		index9.add(new ValueHandler(20, 1.96485));
		index9.add(new ValueHandler(21, 1.91967));
		index9.add(new ValueHandler(22, 1.90425));
		index9.add(new ValueHandler(23, 1.89025));
		index9.add(new ValueHandler(24, 1.87748));
		index9.add(new ValueHandler(25, 1.86578));
		index9.add(new ValueHandler(26, 1.85503));
		index9.add(new ValueHandler(27, 1.84511));
		index9.add(new ValueHandler(28, 1.83593	));
		index9.add(new ValueHandler(29, 1.82741));
		index9.add(new ValueHandler(30, 1.81949));
		index9.add(new ValueHandler(40, 1.76269));
		index9.add(new ValueHandler(60, 1.70701));
		index9.add(new ValueHandler(120, 1.65238));
		
		zeroPointTenTable.add(new ValueHandler(10,index9));
		
		ArrayList<ValueHandler> index10= new ArrayList<ValueHandler>();
		
		index10.add(new ValueHandler(1, 60.70521));
		index10.add(new ValueHandler(2, 9.40813));
		index10.add(new ValueHandler(3, 5.21562));
		index10.add(new ValueHandler(4, 3.89553));
		index10.add(new ValueHandler(5, 3.26824));
		index10.add(new ValueHandler(6, 2.90472));
		index10.add(new ValueHandler(7, 2.66811));
		index10.add(new ValueHandler(8, 2.50196));
		index10.add(new ValueHandler(9, 2.37888));
		index10.add(new ValueHandler(10, 2.28405));
		index10.add(new ValueHandler(11, 2.20873));
		index10.add(new ValueHandler(12, 2.14744));
		index10.add(new ValueHandler(13, 2.09659));
		index10.add(new ValueHandler(14, 2.05371));
		index10.add(new ValueHandler(15, 2.01707));
		index10.add(new ValueHandler(16, 1.98539));
		index10.add(new ValueHandler(17, 1.95772));
		index10.add(new ValueHandler(18, 1.93334));
		index10.add(new ValueHandler(19, 1.91170));
		index10.add(new ValueHandler(20, 1.89236));
		index10.add(new ValueHandler(21, 1.87497));
		index10.add(new ValueHandler(22, 1.85925));
		index10.add(new ValueHandler(23, 1.84497));
		index10.add(new ValueHandler(24, 1.83194));
		index10.add(new ValueHandler(25, 1.82000));
		index10.add(new ValueHandler(26, 1.80902));
		index10.add(new ValueHandler(27, 1.79889));
		index10.add(new ValueHandler(28, 1.78951));
		index10.add(new ValueHandler(29, 1.78081));
		index10.add(new ValueHandler(30, 1.77270));
		index10.add(new ValueHandler(40, 1.71456));
		index10.add(new ValueHandler(60, 1.65743));
		index10.add(new ValueHandler(120, 1.60120));
		
		zeroPointTenTable.add(new ValueHandler(12,index10));
		
		ArrayList<ValueHandler> index11= new ArrayList<ValueHandler>();
		
		index11.add(new ValueHandler(1, 61.22034));
		index11.add(new ValueHandler(2, 9.42471));
		index11.add(new ValueHandler(3, 5.20031));
		index11.add(new ValueHandler(4, 3.87036));
		index11.add(new ValueHandler(5, 3.23801));
		index11.add(new ValueHandler(6, 2.87122));
		index11.add(new ValueHandler(7, 2.63223));
		index11.add(new ValueHandler(8, 2.46422));
		index11.add(new ValueHandler(9, 2.33962));
		index11.add(new ValueHandler(10, 2.24351));
		index11.add(new ValueHandler(11, 2.16709));
		index11.add(new ValueHandler(12, 2.10485));
		index11.add(new ValueHandler(13, 2.05316));
		index11.add(new ValueHandler(14, 2.00953));
		index11.add(new ValueHandler(15, 1.97222));
		index11.add(new ValueHandler(16, 1.93992));
		index11.add(new ValueHandler(17, 1.91169));
		index11.add(new ValueHandler(18, 1.88681));
		index11.add(new ValueHandler(19, 1.86471));
		index11.add(new ValueHandler(20, 1.84494));
		index11.add(new ValueHandler(21, 1.82715));
		index11.add(new ValueHandler(22, 1.81106));
		index11.add(new ValueHandler(23, 1.79643));
		index11.add(new ValueHandler(24, 1.78308));
		index11.add(new ValueHandler(25, 1.77083));
		index11.add(new ValueHandler(26, 1.75957));
		index11.add(new ValueHandler(27, 1.74917));
		index11.add(new ValueHandler(28, 1.73954));
		index11.add(new ValueHandler(29, 1.73060));
		index11.add(new ValueHandler(30, 1.72227));
		index11.add(new ValueHandler(40, 1.66241));
		index11.add(new ValueHandler(60, 1.60337));
		index11.add(new ValueHandler(120, 1.54500));
		
		zeroPointTenTable.add(new ValueHandler(15,index11));
		
		ArrayList<ValueHandler> index12= new ArrayList<ValueHandler>();
		
		index12.add(new ValueHandler(1, 61.74029));
		index12.add(new ValueHandler(2, 9.44131));
		index12.add(new ValueHandler(3,5.18448));
		index12.add(new ValueHandler(4, 3.84434));
		index12.add(new ValueHandler(5, 3.20665));
		index12.add(new ValueHandler(6, 2.83634));
		index12.add(new ValueHandler(7, 2.59473));
		index12.add(new ValueHandler(8, 2.42464));
		index12.add(new ValueHandler(9, 2.29832));
		index12.add(new ValueHandler(10, 2.20074));
		index12.add(new ValueHandler(11, 2.12305));
		index12.add(new ValueHandler(12, 2.05968));
		index12.add(new ValueHandler(13, 2.00698));
		index12.add(new ValueHandler(14, 1.96245));
		index12.add(new ValueHandler(15, 1.92431));
		index12.add(new ValueHandler(16, 1.89127));
		index12.add(new ValueHandler(17, 1.86236));
		index12.add(new ValueHandler(18, 1.83685));
		index12.add(new ValueHandler(19, 1.81416));
		index12.add(new ValueHandler(20, 1.79384));
		index12.add(new ValueHandler(21, 1.77555));
		index12.add(new ValueHandler(22, 1.75899));
		index12.add(new ValueHandler(23, 1.74392));
		index12.add(new ValueHandler(24, 1.73015));
		index12.add(new ValueHandler(25, 1.71752));
		index12.add(new ValueHandler(26, 1.70589));
		index12.add(new ValueHandler(27, 1.69514));
		index12.add(new ValueHandler(28, 1.68519));
		index12.add(new ValueHandler(29, 1.67593));
		index12.add(new ValueHandler(30, 1.66731));
		index12.add(new ValueHandler(40, 1.60515));
		index12.add(new ValueHandler(60, 1.54349));
		index12.add(new ValueHandler(120, 1.48207));
		
		zeroPointTenTable.add(new ValueHandler(20,index12));
		
		ArrayList<ValueHandler> index13= new ArrayList<ValueHandler>();
		
		index13.add(new ValueHandler(1, 62.00205));
		index13.add(new ValueHandler(2, 9.44962));
		index13.add(new ValueHandler(3,5.17636));
		index13.add(new ValueHandler(4, 3.83099));
		index13.add(new ValueHandler(5, 3.19052));
		index13.add(new ValueHandler(6, 2.81834));
		index13.add(new ValueHandler(7, 2.57533));
		index13.add(new ValueHandler(8, 2.40410));
		index13.add(new ValueHandler(9, 2.27683));
		index13.add(new ValueHandler(10, 2.17843));
		index13.add(new ValueHandler(11, 2.10001));
		index13.add(new ValueHandler(12, 2.03599));
		index13.add(new ValueHandler(13, 1.98272));
		index13.add(new ValueHandler(14, 1.93766));
		index13.add(new ValueHandler(15, 1.89904));
		index13.add(new ValueHandler(16, 1.86556));
		index13.add(new ValueHandler(17, 1.83624));
		index13.add(new ValueHandler(18, 1.81035));
		index13.add(new ValueHandler(19, 1.78731));
		index13.add(new ValueHandler(20, 1.76667));
		index13.add(new ValueHandler(21, 1.74807));
		index13.add(new ValueHandler(22, 1.73122));
		index13.add(new ValueHandler(23, 1.71588));
		index13.add(new ValueHandler(24, 1.70185));
		index13.add(new ValueHandler(25, 1.68898));
		index13.add(new ValueHandler(26, 1.67712));
		index13.add(new ValueHandler(27, 1.66616));
		index13.add(new ValueHandler(28, 1.65600));
		index13.add(new ValueHandler(29, 1.64655));
		index13.add(new ValueHandler(30, 1.63774));
		index13.add(new ValueHandler(40, 1.57411));
		index13.add(new ValueHandler(60, 1.51072));
		index13.add(new ValueHandler(120, 1.44723));
		
		
		zeroPointTenTable.add(new ValueHandler(24,index13));
		
		ArrayList<ValueHandler> index14= new ArrayList<ValueHandler>();
		
		index14.add(new ValueHandler(1, 62.26497));
		index14.add(new ValueHandler(2, 9.45793));
		index14.add(new ValueHandler(3,5.16811));
		index14.add(new ValueHandler(4, 3.81742));
		index14.add(new ValueHandler(5, 3.17408));
		index14.add(new ValueHandler(6, 2.79996));
		index14.add(new ValueHandler(7, 2.55546));
		index14.add(new ValueHandler(8, 2.38302));
		index14.add(new ValueHandler(9, 2.25472));
		index14.add(new ValueHandler(10, 2.15543));
		index14.add(new ValueHandler(11, 2.07621));
		index14.add(new ValueHandler(12, 2.01149));
		index14.add(new ValueHandler(13, 1.95757));
		index14.add(new ValueHandler(14, 1.91193));
		index14.add(new ValueHandler(15, 1.87277));
		index14.add(new ValueHandler(16, 1.83879));
		index14.add(new ValueHandler(17, 1.80901));
		index14.add(new ValueHandler(18, 1.78269));
		index14.add(new ValueHandler(19, 1.75924));
		index14.add(new ValueHandler(20, 1.73822));
		index14.add(new ValueHandler(21, 1.71927));
		index14.add(new ValueHandler(22, 1.70208));
		index14.add(new ValueHandler(23, 1.68643));
		index14.add(new ValueHandler(24, 1.67210));
		index14.add(new ValueHandler(25, 1.65895));
		index14.add(new ValueHandler(26, 1.64682));
		index14.add(new ValueHandler(27, 1.63560));
		index14.add(new ValueHandler(28, 1.62519));
		index14.add(new ValueHandler(29, 1.61551));
		index14.add(new ValueHandler(30, 1.60648));
		index14.add(new ValueHandler(40, 1.54108));
		index14.add(new ValueHandler(60, 1.47554));
		index14.add(new ValueHandler(120, 1.40938));
		
		zeroPointTenTable.add(new ValueHandler(30,index14));
		
		ArrayList<ValueHandler> index15= new ArrayList<ValueHandler>();
		
		index15.add(new ValueHandler(1, 62.52905));
		index15.add(new ValueHandler(2, 9.46624));
		index15.add(new ValueHandler(3,5.15972));
		index15.add(new ValueHandler(4, 3.80361));
		index15.add(new ValueHandler(5, 3.15732));
		index15.add(new ValueHandler(6, 2.78117));
		index15.add(new ValueHandler(7, 2.53510	));
		index15.add(new ValueHandler(8, 2.36136));
		index15.add(new ValueHandler(9, 2.23196));
		index15.add(new ValueHandler(10, 2.13169));
		index15.add(new ValueHandler(11, 2.05161));
		index15.add(new ValueHandler(12, 1.98610));
		index15.add(new ValueHandler(13, 1.93147));
		index15.add(new ValueHandler(14, 1.88516));
		index15.add(new ValueHandler(15, 1.84539));
		index15.add(new ValueHandler(16, 1.81084));
		index15.add(new ValueHandler(17, 1.78053));
		index15.add(new ValueHandler(18, 1.75371));
		index15.add(new ValueHandler(19, 1.72979));
		index15.add(new ValueHandler(20, 1.70833));
		index15.add(new ValueHandler(21, 1.68896));
		index15.add(new ValueHandler(22, 1.67138));
		index15.add(new ValueHandler(23, 1.65535));
		index15.add(new ValueHandler(24, 1.64067));
		index15.add(new ValueHandler(25, 1.62718));
		index15.add(new ValueHandler(26, 1.61472));
		index15.add(new ValueHandler(27, 1.60320));
		index15.add(new ValueHandler(28, 1.59250));
		index15.add(new ValueHandler(29, 1.58253));
		index15.add(new ValueHandler(30, 1.57323));
		index15.add(new ValueHandler(40, 1.50562));
		index15.add(new ValueHandler(60, 1.43734));
		index15.add(new ValueHandler(120, 1.36760));
		
		zeroPointTenTable.add(new ValueHandler(40,index15));
		
		ArrayList<ValueHandler> index16= new ArrayList<ValueHandler>();
		
		index16.add(new ValueHandler(1, 62.79428));
		index16.add(new ValueHandler(2, 9.47456));
		index16.add(new ValueHandler(3,5.15119));
		index16.add(new ValueHandler(4, 3.78957	));
		index16.add(new ValueHandler(5, 3.14023));
		index16.add(new ValueHandler(6, 2.76195));
		index16.add(new ValueHandler(7, 2.51422));
		index16.add(new ValueHandler(8, 2.33910));
		index16.add(new ValueHandler(9, 2.20849));
		index16.add(new ValueHandler(10, 2.10716));
		index16.add(new ValueHandler(11, 2.02612));
		index16.add(new ValueHandler(12, 1.95973));
		index16.add(new ValueHandler(13, 1.90429));
		index16.add(new ValueHandler(14, 1.85723));
		index16.add(new ValueHandler(15, 1.81676));
		index16.add(new ValueHandler(16, 1.78156));
		index16.add(new ValueHandler(17, 1.75063));
		index16.add(new ValueHandler(18, 1.72322));
		index16.add(new ValueHandler(19, 1.69876));
		index16.add(new ValueHandler(20, 1.67678));
		index16.add(new ValueHandler(21, 1.65691));
		index16.add(new ValueHandler(22, 1.63885));
		index16.add(new ValueHandler(23, 1.62237));
		index16.add(new ValueHandler(24, 1.60726));
		index16.add(new ValueHandler(25, 1.59335));
		index16.add(new ValueHandler(26, 1.58050));
		index16.add(new ValueHandler(27, 1.56859));
		index16.add(new ValueHandler(28, 1.55753));
		index16.add(new ValueHandler(29, 1.54721));
		index16.add(new ValueHandler(30, 1.53757));
		index16.add(new ValueHandler(40, 1.46716));
		index16.add(new ValueHandler(60, 1.39520));
		index16.add(new ValueHandler(120, 1.32034));
		
		zeroPointTenTable.add(new ValueHandler(60,index16));
		
		ArrayList<ValueHandler> index17= new ArrayList<ValueHandler>();
		
		index17.add(new ValueHandler(1, 63.06064));
		index17.add(new ValueHandler(2, 9.48289	));
		index17.add(new ValueHandler(3,5.14251));
		index17.add(new ValueHandler(4, 3.77527	));
		index17.add(new ValueHandler(5, 3.12279	));
		index17.add(new ValueHandler(6, 2.74229));
		index17.add(new ValueHandler(7, 2.49279));
		index17.add(new ValueHandler(8, 2.31618));
		index17.add(new ValueHandler(9, 2.18427));
		index17.add(new ValueHandler(10, 2.08176));
		index17.add(new ValueHandler(11, 1.99965));
		index17.add(new ValueHandler(12, 1.93228));
		index17.add(new ValueHandler(13, 1.87591));
		index17.add(new ValueHandler(14, 1.82800));
		index17.add(new ValueHandler(15, 1.78672));
		index17.add(new ValueHandler(16, 1.75075));
		index17.add(new ValueHandler(17, 1.71909));
		index17.add(new ValueHandler(18, 1.69099));
		index17.add(new ValueHandler(19, 1.66587));
		index17.add(new ValueHandler(20, 1.64326));
		index17.add(new ValueHandler(21, 1.62278));
		index17.add(new ValueHandler(22, 1.60415));
		index17.add(new ValueHandler(23, 1.58711));
		index17.add(new ValueHandler(24, 1.57146));
		index17.add(new ValueHandler(25, 1.55703));
		index17.add(new ValueHandler(26, 1.54368));
		index17.add(new ValueHandler(27, 1.53129));
		index17.add(new ValueHandler(28, 1.51976));
		index17.add(new ValueHandler(29, 1.50899));
		index17.add(new ValueHandler(30, 1.49891));
		index17.add(new ValueHandler(40, 1.42476));
		index17.add(new ValueHandler(60, 1.34757));
		index17.add(new ValueHandler(120, 1.26457));
		
		zeroPointTenTable.add(new ValueHandler(120,index17));
		
		
		table.add(new FTableCompilation(0.10, zeroPointTenTable));
	}
	public ArrayList<ValueHandler> getZeroPointTenTable()
	{
		return zeroPointTenTable;
	}
	public ArrayList<ValueHandler> getZeroPointZeroFiveTable()
	{
		return zeroPointZeroFiveTable;
	}
	public ArrayList<ValueHandler> getZeroPointZeroTwentyFiveTable()
	{
		return zeroPointZeroTwentyFiveTable;
	}
	public ArrayList<ValueHandler> getZeroPointZeroOneTable()
	{
		return zeroPointZeroOneTable;
	}
	
	

}
