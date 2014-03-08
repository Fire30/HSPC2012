import java.util.*;

public class WheresTheRainbow
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			// All we need to do is implement a formula
			// d = abs(height/tan(theta) - height)
			double height = sc.nextDouble();
			double theta = Math.toRadians(sc.nextDouble());
			double distanceFromCenter = height / Math.tan(theta);
			double d = Math.abs(distanceFromCenter - height);
			System.out.printf("Case %d: %s\n",i + 1, String.valueOf(d));
		}	
	}
}