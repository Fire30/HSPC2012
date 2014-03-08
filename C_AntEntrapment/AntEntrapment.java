import java.util.*;

public class AntEntrapment
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			int numOfCoordinates = sc.nextInt();
			//Just getting all the data into a usable form so we can analyze it later on
			Coordinate[] coordinates = new Coordinate[numOfCoordinates];
			for(int j = 0; j < numOfCoordinates;j++)
			{
				coordinates[j] = new Coordinate(sc.nextDouble(),sc.nextDouble());
			}
			//Ok so if we are going to try to make a rectangle out of points
			//We need to find the points farthest to the left,right,up, and down
			Coordinate farthestLeft = coordinates[0];
			Coordinate farthestRight = coordinates[0];
			Coordinate farthestUp = coordinates[0];
			Coordinate farthestDown = coordinates[0];
			for(Coordinate coordinate:coordinates)
			{
				if(coordinate.x < farthestLeft.x)
					farthestLeft = coordinate;
				if(coordinate.x > farthestRight.x)
					farthestRight = coordinate;
				if(coordinate.y < farthestDown.y)
					farthestDown = coordinate;
				if(coordinate.y > farthestUp.y)
					farthestUp = coordinate;
			}
			//Now that we have the dimensions we just need to calculate the Area and Perimter
			double area = (farthestUp.y - farthestDown.y) * (farthestRight.x - farthestLeft.x);
			double perimter = 2 * (farthestUp.y - farthestDown.y) + 2 * (farthestRight.x - farthestLeft.x);
			//I have to use valueOf because printing it as a float has trailing 0's
			System.out.printf("Case %d: Area %s, Perimeter %s\n",i+1, String.valueOf(area), String.valueOf(perimter));
		}
	}
	public static class Coordinate
	{
		public double x;
		public double y;
		public Coordinate(double x,double y)
		{
			this.x = x;
			this.y = y;
		}
	}
}