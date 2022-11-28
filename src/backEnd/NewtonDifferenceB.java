package backEnd;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class NewtonDifferenceB {

	public static final String[] numbers ={"0","1","2","3","4","5","6","7","8","9","."};
	public static DecimalFormat df=  new DecimalFormat("###,###.00");
	public static Scanner input= new Scanner(System.in);;
	private static String newtonDifference="";
	
	
	public NewtonDifferenceB(String input)
	{
		setNewtonDiff(input);
	}
	public static void storeTextElemInArray(String text, ArrayList<Double>numbers)
	{
		char first;
		boolean isDigit;
		String str="";
		
		try {
			for(int i=0;i<text.length();i++)
			{
				//[1,2,5,10,17]
				first = text.charAt(i);
				isDigit = Character.isDigit(first);
			
				
				if(isDigit==true)
				{
					str+=String.valueOf(first);
				}
				else if(first==','||i==text.length()-1)
				{
					double firstIntoDouble = Double.valueOf(String.valueOf(str));
					numbers.add(firstIntoDouble);
					str="";
				}
			}
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
		
	}
	public static void completeDiffTable(ArrayList<Double>numbers, int x, int fx)
	{
		try {
			for(int agwat=fx-1;x<fx;x++)//3<3-> f
			{
				
				if(x==fx-1)//2==2-> t
				{
					fx=fx+agwat;//5+1=5
					agwat=agwat-1;
				}
				//store the value into temp
				
				else //if(x!=fx-1) //x!=3-1(2)
				{

					if((numbers.get(x)==0)&&(numbers.get(x+1)==0))
					{
						x=fx;
					
					}
					
					else
					{
						double difference=numbers.get(x+1)-numbers.get(x);
						String tempStr = df.format(difference);
						double temp1 = Double.parseDouble(tempStr);
						
						numbers.add(temp1);
					}

				}
				
			}
		}catch(Exception ee)
		{
					System.out.println("There is an error");
		}
		
	}
	public static String getNewtonDiff()
	{
		return newtonDifference;
	}
	public static void setNewtonDiff(String text)
	{
		 ArrayList<Double> numbers = new ArrayList<Double>();
		 ArrayList<String> numbers_str = new ArrayList<String>();
		 ArrayList<Integer> h_search = new ArrayList<Integer>();
		 ArrayList<String> f_diffstr1 = new ArrayList<String>();
		 ArrayList<String> Term_List1 = new ArrayList<String>();
		 ArrayList<Integer> diff_sizes= new ArrayList<Integer>();
		 ArrayList<String>f_diff = new ArrayList<String>();
		 String f_diffstr = "";
		 double dob_str1;
		 double quotient_1;
		 String diff_str="",store_1;
		 double diff_dob;
		 double factorial_dob;
		 int factorial;
		 String quotient_str="";
		 ArrayList<String> f_diff_List = new ArrayList<String>();
		 ArrayList<String> prod1_List = new ArrayList<String>();
		 String prod1_List_str = "";
		 ArrayList<String> prod_Lst_y = new ArrayList<String>();
		 ArrayList<String> f_diff_official = new ArrayList<String>();
		 ArrayList<String> s1 = new ArrayList<String>();
		  
		 String str_s1 = "";
		 ArrayList<String> f_dff = new ArrayList<String>();
		 String result = "",prodList_str;
		 boolean continuation = true;
		 String yes="";
		
		
		ArrayList<String> last_arrayList=new ArrayList<String>();
		String theResult = "";
		
		
		storeTextElemInArray(text,numbers);
		
		//Input the size of fx in arraylist
		int fx_sz=numbers.size();
		
		//System.out.println(numbers);
		
		//Insert the difference into arraylist
		//if the element is zero 
		String y;
		int fx=fx_sz;//3
		int x=0;
		
		//create a method named "completeDifferenceTable"
		completeDiffTable(numbers, x, fx);
	
		//Simplify.Table(numbers, fx_sz);
		while(continuation==true)
		{
			System.out.println("Enter h: ");
			int h = 0;
			
			
			h_search = SimplifyB.hSearch(numbers, fx_sz);

			
			//get the index of the last element of h_search
			int index_lsearch = h_search.size()-1;

			
			//Get the last element of h_search
			int l_e_h_search = h_search.get(index_lsearch);
		
			
			ArrayList<String> differences1 = new ArrayList<String>(SimplifyB.storage_differences(numbers,l_e_h_search, fx_sz, h)); //[3.0,1.0,0.00]
			
			
			//System.out.println("Here's the differences: "+differences1);
			
			
		
			
			
			for(int x1=0,x3=x1,x2=-1;x1<differences1.size();x1++,x2++)
			{
			
				//if h is less than or equal to the last element of h_search
				//proceed to forward difference
				
				if(x3==0)
				{	x3++;//1
					store_1=differences1.get(x1);
					
					f_diff.add(store_1);//[+1.00]
					
					
				}
				else
				{
								
					
					if(h<=l_e_h_search+1)
					{
						f_diffstr1 = SimplifyB.forward_diff(x1, h);//[(+1x^1)],[(+1x^1),(+1x^1-1)]
						
												
						
						f_diffstr = SimplifyB.arrayListToString(f_diffstr1);
					
				
					
						diff_str = differences1.get(x1);//x2=>0,1
					
						
						
						
						
						diff_dob = Double.valueOf(diff_str);
						
						
						
						
						factorial = SimplifyB.Factorial(x1);
					
						
						
						
						factorial_dob = Double.valueOf(factorial);
				
						
						
						
						quotient_1 = diff_dob/factorial_dob;
					
						
						
						if(quotient_1<0.0)
						{
							quotient_str = "("+df.format(quotient_1)+")";
					
							
							
							f_diff_List = SimplifyB.ToArrayList(f_diffstr);
							
							
							
							prod1_List = SimplifyB.multiply_many_parenthesis(f_diff_List);
						
							
							
							
							//System.out.println("Product of forward differences: "+prod1_List);
							
							prod1_List_str = SimplifyB.arrayListToString(prod1_List);
						
							
						
						
							
							prod_Lst_y= SimplifyB.product(quotient_str, prod1_List_str);
							

							
							for(int cv=0; cv<prod_Lst_y.size();cv++)
							{
								
								prodList_str = prod_Lst_y.get(cv);
								
								
								
								if(prodList_str!="")
								{
									f_diff.add(prodList_str);
								}
								else
								{
									
								}
							}
						}
						else
						{
							quotient_str = "(+"+df.format(quotient_1)+")";
							
							
							
							f_diff_List = SimplifyB.ToArrayList(f_diffstr);
				
							
							
							prod1_List = SimplifyB.multiply_many_parenthesis(f_diff_List);
						
							
														
							//System.out.println("Product of forward differences: "+prod1_List);
							
							prod1_List_str = SimplifyB.arrayListToString(prod1_List);
						
							
						
						
							
							prod_Lst_y= SimplifyB.product(quotient_str, prod1_List_str);
					
							
							for(int cv=0; cv<prod_Lst_y.size();cv++)
							{
								
								prodList_str = prod_Lst_y.get(cv);
						
								if(prodList_str!="")
								{
									f_diff.add(prodList_str);
								}
								else
								{
									
								}
							}
						}
					}
					else
					{
						f_diffstr1 = SimplifyB.backward_diff(x1, h);//[(+1x^1)],[(+1x^1),(+1x^1-1)]
						
						f_diffstr = SimplifyB.arrayListToString(f_diffstr1);
												
						diff_str = differences1.get(x1);//x2=>0,1
						
						diff_dob = Double.valueOf(diff_str);
						
						factorial = SimplifyB.Factorial(x1);
						
						factorial_dob = Double.valueOf(factorial);
						
						quotient_1 = diff_dob/factorial_dob;
						
						if(quotient_1<0.0)
						{
							quotient_str = "("+df.format(quotient_1)+")";
							
							f_diff_List = SimplifyB.ToArrayList(f_diffstr);
							
							prod1_List = SimplifyB.multiply_many_parenthesis(f_diff_List);
							
							//System.out.println("Product of forward differences: "+prod1_List);
							
							prod1_List_str = SimplifyB.arrayListToString(prod1_List);
							
							prod_Lst_y= SimplifyB.product(quotient_str, prod1_List_str);
							
							for(int cv=0; cv<prod_Lst_y.size();cv++)
							{
								
								prodList_str = prod_Lst_y.get(cv);
								
								if(prodList_str!="")
								{
									f_diff.add(prodList_str);
								}
								else
								{
									
								}
							}
						}
						else
						{
							quotient_str = "(+"+df.format(quotient_1)+")";
							
							
							
							f_diff_List = SimplifyB.ToArrayList(f_diffstr);
							
							
							
							prod1_List = SimplifyB.multiply_many_parenthesis(f_diff_List);
							
							
							
							
							//System.out.println("Product of forward differences: "+prod1_List);
							
							prod1_List_str = SimplifyB.arrayListToString(prod1_List);
							
							prod_Lst_y= SimplifyB.product(quotient_str, prod1_List_str);
							
							for(int cv=0; cv<prod_Lst_y.size();cv++)
							{
								
								prodList_str = prod_Lst_y.get(cv);
								
								if(prodList_str!="")
								{
									f_diff.add(prodList_str);
								}
								else
								{
									
								}
							}
						}
					}
					
				}
			}
			
			//add in one arraylist the elements of f_diff
			for(int y1=0;y1<f_diff.size();y1++)
			{
				String s10 = f_diff.get(y1);
				
				f_diff_official.add(s10);
				
			}
			
			f_dff = SimplifyB.addition(f_diff_official);
			
			f_diff_official.clear();
			
			result = SimplifyB.arrayListToString(f_dff);
						
			last_arrayList=SimplifyB.stringToArrayList(result);
			
			newtonDifference = SimplifyB.eliminateZero(last_arrayList);
			
			
			
			boolean continuation2=true;
			continuation=false;
			
			
			/*while(continuation2==true)
			{
				System.out.println("[y/n]Do you want to use this table? ");
				y = input.next();
				
				if(y.equals("y"))
				{
					differences1.clear();
					f_diff.clear();
					f_diffstr1.clear();
					f_diffstr="";
					f_diff_List.clear();
					prod1_List.clear();
					prod1_List_str="";
					prod_Lst_y.clear();
					f_dff.clear();
					f_diff_official.clear();
					result="";
					
					
					continuation2=false;
					continuation=true;
					
				}
				else if(y.equals("n"))
				{
					continuation2=false;
					continuation = false;
					System.out.println("END: Please insert another table");
					
				}
				else
				{
					differences1.clear();
					f_diff.clear();
					f_diffstr1.clear();
					f_diffstr="";
					f_diff_List.clear();
					prod1_List.clear();
					prod1_List_str="";
					prod_Lst_y.clear();
					f_dff.clear();
					f_diff_official.clear();
					result="";
					
					
					continuation2=true;
					System.out.println("Please insert either 'y' or 'n'. Thank you!");
				}
				
			}*/
			
			
		}
		//return theResult;
		
	}

	
}
