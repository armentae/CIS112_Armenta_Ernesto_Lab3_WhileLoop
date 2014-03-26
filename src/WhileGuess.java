import java.util.Scanner;


public class WhileGuess
{

public static void main (String [] args)
{
	Scanner input = new Scanner (System.in);
	int computerNum;
	int userNum;
	int count=1;
	while (count<4)
	{
		computerNum = 0 + (int) (Math.random()*10);
	
	System.out.println ("Please guess a number");
	
	userNum = input.nextInt();
	System.out.printf("The computer number is %d ",computerNum);
	if (computerNum == userNum) 
	{
		System.out.println (" correct guess");
	}
	else if (computerNum>userNum) {
		System.out.println ("Your number is too low");
	}
	else
	{
		System.out.println("Your number is too High");{
		}
	}
	count++;{
	}
	}
	}
}
	
