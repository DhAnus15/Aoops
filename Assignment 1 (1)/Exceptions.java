import java.util.*;

class Exceptions
{
	public static void main(String args[])
    {
        try {
            int a = 15,b = 0;
            int c = a / b; 
            System.out.println("Result = " + c); // Divide by zero exception
        }
        catch (ArithmeticException e) {
            System.out.println("A number Cannot be divided by 0");
        }
		
		try {
            int a[] = new int[6];  // Index out of bound exception
            a[10] = 9;              // We are referencing to an index which is greater 
									//than the last index of the array
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array Index is Out Of Bounds");
        }
		
		try {
            String a = null; 
            System.out.println(a.charAt(0));   // Nullpointerexception
												// The variable has null value but we are trying to refer it
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
	}
}