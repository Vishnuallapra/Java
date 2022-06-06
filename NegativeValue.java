import java.util.*;

class NegativeValueException extends RuntimeException
{
	NegativeValueException(String message)
	{
		super(message);
	}
}

public class NegativeValue
{
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of numbers: ");
		int number_of_numbers = scanner.nextInt();
        int sum=0;
        for(int i=0; i< number_of_numbers;i++)
        {
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            if(num < 0)
		    {
                try
                {
                throw new NegativeValueException("Values must be > 0");
                }
                catch(NegativeValueException ex)
                {
                    ex.printStackTrace();
                    i -= 1;
                }
		    }
            sum += num;
        }
        int average = sum/number_of_numbers;
        System.out.println("The average is: " + average);
		
	}
}
//throwing exception



//Wirte a user defined exception class to authentciate the username and password
// Find the average of n positive integers, raising a user defined exception for each negative input 

