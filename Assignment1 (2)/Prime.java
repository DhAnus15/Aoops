import java.util.*;
import java.util.Scanner;


// user-defined exception
class NegativeNumberNotAllowedException extends Exception {

    public NegativeNumberNotAllowedException(String str) {
        super(str);
    }
}

// user-defined exception
class NumberNotPrimeException extends Exception {
    public NumberNotPrimeException(String str) {
        super(str);
    }
}

class Prime 
{
    public static void main(String[] args) 
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if its prime number or not:");
        int number= sc.nextInt();
	
		try{
			if(number < 0)
				throw new NegativeNumberNotAllowedException("Negative not Allowed");
							// first check if entered number is negative
							// if the number is negative throw NegativeNumberNotAllowedException
		}
		catch(Exception e){
			System.out.println(e);
		}
			 
		boolean flag = false;
		for (int i = 2;i <= number / 2; i++) 
		{
			if (number%i == 0) 
			{
				flag = true;
				break;
			}
		}
		
		try{
			if (!flag)
				System.out.println(number+ "is prime number");
			else
				throw new NumberNotPrimeException("Number is not prime");  // and if the number is not prime throw NumberNotPrimeException
		}
		catch (Exception e) {
            System.out.println(e);
        }		
	}
}
  
		