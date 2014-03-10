import java.util.*;

public class PaintingParty
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			//Set up an empty gird that we can "paint" on
			int gridSize = sc.nextInt();
			char[][] grid = new char[gridSize][gridSize];
			for(int j = 0; j < grid.length;j++)
			{
				for(int k = 0; k < grid.length;k++)
				{
					grid[j][k] = '.';
				}
			}
			int amountToDraw = sc.nextInt();
			for(int j = 0; j < amountToDraw; j++)
			{
				//Get details for each painting
				String typeToDraw = sc.next();
				int xStart = sc.nextInt();
				int yStart = sc.nextInt();
				int width = sc.nextInt();
				int height = sc.nextInt();
				char charToDraw = sc.next().charAt(0);
				//We basically loop through the area of the rectangle that is made
				//So it will hit every location
				for(int h = 0; h < height;h++)
				{
					for(int w = 0; w < width;w++)
					{
						//If it is an empty shape, we will only draw on the outsides
						//Ok since the bottom left corner is (1,1) we need to do some transformations
						//This is because we are using a char array with the point (0,0) in the top left
						//We need to subtract one from the X, and subtract the yValue from the size of the grid
						// to get the true coordinates in the char array
						//After that we just set that location to the char we were told 
						if(typeToDraw.equals("Empty"))
						{
							if(h == 0 || h == height - 1 || w == 0 || w == width - 1)
							{
								grid[gridSize - yStart- h][xStart + w -1] = charToDraw;
							}
						}
						else
						{
							grid[gridSize - yStart- h][xStart + w - 1] = charToDraw;
						}
					}
				}

			}
			//Print out the array.
			System.out.printf("Case %d:\n",i+1);
			for(int j = 0; j < grid.length;j++)
			{
				for(int k = 0; k < grid.length;k++)
				{
					System.out.print(grid[j][k]);
				}
				System.out.println();
			}
		}
		
	}
}