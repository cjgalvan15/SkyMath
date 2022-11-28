package backEnd;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JLabel;

public class ValueHandler 
{
	private double key;
	private ArrayList<ValueHandler> verticalValues = new ArrayList<ValueHandler>();
	private ValueHandler handler;
	private double value;
	private double oneTailedKey, twoTailedKey;
	private int df,tail, DFn, DFd;
	private Component labelValue;
	
	public ValueHandler(double key, ArrayList<ValueHandler> listOfValues, Component labelValue)
	{
		this.key= key;
		setVerticalValues(listOfValues);
		this.labelValue = labelValue;
	}
	public ValueHandler(int DFn, ArrayList<ValueHandler> listOfValues)
	{
		this.DFn= DFn;
		setVerticalValues(listOfValues);
		
	}

	public ValueHandler(double key, double value)
	{
		this.key = key;
		this.value = value;
	}
	public ValueHandler(int df, double value)
	{
		this.df = df;
		this.value=value;
		
	}
	public ValueHandler(int tail, double value, Component labelValue)
	{
		this.tail = tail;
		this.value=value;
		this.labelValue = labelValue;
	}
	public ValueHandler(double oneTailedKey,double twoTailedKey, ArrayList<ValueHandler> listOfValues)
	{
		this.oneTailedKey=oneTailedKey;
		this.twoTailedKey=twoTailedKey;
		this.verticalValues=listOfValues;
	}
	public Component getComponent()
	{
		return labelValue;
	}
	public int getDFn()
	{
		return this.DFn;
	}
	
	public double getOneTailedKey()
	{
		return this.oneTailedKey;
	}
	public double getTwoTailedKey()
	{
		return this.twoTailedKey;
	}
	public void setVerticalValues(ArrayList<ValueHandler> listOfValues)
	{
		this.verticalValues= listOfValues;
	}
	public double getKey()
	{
		return this.key;
	}
	public ArrayList<ValueHandler> getVerticalValues()
	{
		return this.verticalValues;
	}
	public ValueHandler getValueHandler()
	{
		return this.handler;
	}
	public double getValue()
	{
		return this.value;
	}
	public int getDf()
	{
		return this.df;
	}
}
