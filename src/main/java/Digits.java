import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	   for(int i =0; i<(""+num).length();i++){
		digitList.set(i,num%10);
		   num=num/10;
	   }
	}

	public boolean isStrictlyIncreasing()
	{ 
	 int max = -1;
		for( int i =0; i<digitList.size();i++){
			if(max<digitList.get(i)){
				max=digitList.get(i);
			} else{
				return false; }
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
