import java.util.*;

public class ReducingImproperFractions
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			//Calculate the various variables we need
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			int wholeValue = numerator / denominator;
			int newNumerator = numerator % denominator;
			//If the newNumerator is 0 we either have an integer or the number is 0
			if(newNumerator == 0)
			{
				if(wholeValue == 0)
				{
					System.out.printf("Case %d: 0\n",i+1);
				}
				else
				{
					System.out.printf("Case %d: %d\n",i + 1, wholeValue);
				}
			}
			//If the numerator is less than the denominator that means there is no reduction that needs to be done
			else if(numerator < denominator)
			{
				System.out.printf("Case %d: %d/%d\n",i+1,numerator,denominator);
			}
			else
			{
				System.out.printf("Case %d: %d %d/%d\n",i+1,wholeValue,newNumerator,denominator);
			}
		}
	}
}