package backEnd;

import java.util.ArrayList;

public class FTableCompilation 
{
	//attributes
	private ArrayList<ValueHandler> fTableCompilation = new ArrayList<ValueHandler>();
	private double levelOfSignificance;
	
	public FTableCompilation(double levelOfSignificance, ArrayList<ValueHandler> fTableCompilation)
	{
		try {
			this.fTableCompilation = fTableCompilation;
			this.levelOfSignificance= levelOfSignificance;
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
	}
	public ArrayList<ValueHandler> getFTableCompilation()
	{
		return this.fTableCompilation;
	}
	public double getLevelOfSignificance()
	{
		return this.levelOfSignificance;
	}

}
