import java.util.*;

class AuthenticationFailed extends RuntimeException
{
	AuthenticationFailed(String message)
	{
		super(message);
	}
}

public class Authentication
{
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = scanner.nextLine();
		System.out.println("Enter your password: ");
		String password = scanner.nextLine();

		if(!username.equals("user") && !password.equals("password"))
		{
			try
			{
			throw new AuthenticationFailed("Wrong username or password.");
			}
			catch(AuthenticationFailed ex)
			{
				ex.printStackTrace(); //toString() , getMessage()
			}
		}
	}
}
//throwing exception



//Wirte a user defined exception class to authentciate the username and password
// Find the average of n positive integers, raising a user defined exception for each negative input 

