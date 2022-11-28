package mainPackage;
import frontEnd.*;
import backEnd.*;

public class Main {

	public static void main(String[] args) {
		new Home();
		
		// resources/
		
		//ZTestB zTest = new ZTestB("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20|21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40","there is no significant difference",0.01);
		
		//System.out.println("Tail: "+zTest.getTail());
		
		//System.out.println("Z Score: "+zTest.getZScore()+" | tabular value: "+zTest.getTabularValue());
		//System.out.println("Z-Test Conclusion: "+zTest.getConclusion());
		
		//~~~T-TEST~~~
		
		
		/*TTestB test = new TTestB("1,2,3,4,5,6,7,8,9|21,22,23,24,25,26,27,28,29","there is no significant difference",0.01);
		
		System.out.println("sample1: "+test.getSample1());
		System.out.println("sample2: "+test.getSample2());
		System.out.println("degree of freedom: "+test.getDegreeOfFreedom());
		System.out.println("difference: "+test.getSummationDifference());
		System.out.println("differenceSquared: "+test.getSummationDifferenceSquared());
		System.out.println("tScore: "+test.getTScore());
		System.out.println("tail: "+test.getTail());
		System.out.println("TabularValue: "+test.getTabularValue());//3.355
		System.out.println("Conclusion: "+test.getConclusion());*/
		
		//~~~F-TEST~~~
		
		/*FTestB test = new FTestB("1,2,3,4,5,6|11,12,13,14,15,16|21,22,23,24,25,26|31,32,33,34,35,36","CS is better than IS",0.05);
		
		System.out.println("listOfSample: "+test.getInput());
		System.out.println("Size of listOfSample: "+test.getInput().size()+" sets");
		System.out.println("Null Hypothesis: "+test.getNullHypothesis());
		System.out.println("LevelOfSignificance: "+test.getLevelOfSignificance());
		System.out.println("Summation of X: "+test.getSummationOfX());
		System.out.println("Summation of X squared: "+test.getSummationOfXSquared());
		System.out.println("number of rows: "+test.getNumOfRows());
		System.out.println("n: "+test.getN());
		System.out.println("TSS: "+test.getTSS());
		System.out.println("Summation Per Squared Set: "+test.getSummationPerSquaredSet());
		System.out.println("SSb: "+test.getSSb());
		System.out.println("SSw: "+test.getSSw());
		System.out.println("FScore: "+test.getFScore());
		System.out.println("DFb: "+test.getDFb());
		System.out.println("DFw: "+test.getDFw());
		System.out.println("Tabular Value: "+test.getTabularValue());
		System.out.println("Conclusion: "+test.getConclusion());*/
		
	}

}

