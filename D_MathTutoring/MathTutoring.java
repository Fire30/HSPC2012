import java.util.*;

public class MathTutoring
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			// The first int on the line is the current highest polynomial
			int highestDegree = sc.nextInt();
			//It is easier to print while you are calculating
			// instead of doing it all at the end
			System.out.printf("Case %d: %d ",i + 1,highestDegree -1);
			//We just go  through all the terms and multiply it by its polynomial
			for(int j = 0; j < highestDegree; j++)
			{
				System.out.print(sc.nextInt() * (highestDegree - j));
				if(j + 1 != highestDegree)
				{
					System.out.print(" ");
				}
			}
			//The last int we don't care about
			sc.nextInt();
			System.out.println();
		}	
	}
}