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

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
	
	public String toString()
	{
		return digitList.toString();
	}
}
