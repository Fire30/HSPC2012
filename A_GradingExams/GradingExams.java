import java.util.*;

public class GradingExams
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i = 0; i < numOfCases;i++)
		{
			//Gets how long the test key is
			int tesetLength = sc.nextInt();
			//Need to jump to next line to get the data
			sc.nextLine();
			String testAnswers = sc.nextLine();
			String answerKey = sc.nextLine();
			int numIncorrect = 0;
			//compares the two strings by each char
			for(int j = 0; j < tesetLength; j++)
			{
				if(testAnswers.charAt(j) != answerKey.charAt(j))
					numIncorrect++;
			}
			System.out.printf("Case %d: %d\n",i+1,numIncorrect);
		}
	}
}