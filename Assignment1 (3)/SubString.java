import java.util.*;
import java.util.Scanner;

class SubStringNotFoundException extends Exception {

    public SubStringNotFoundException(String str) {
        super(str);
    }
}
 
public class SubString
{  
	public static void main(String args[])
	{  
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter your Text: ");  
		String line= in.nextLine(); 
		System.out.println("String: "+line);
		String str1 ="SDMCET";
		
		try{
			line=line.toUpperCase();
			boolean result = line.contains(str1);
			if(result) {
				System.out.println(str1+ " is present in the string.");
			}
			else {
				throw new SubStringNotFoundException("SDMCET is not present in the string");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
		  