package userRegistration;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	

	public static void main(String[] args) {
	// Registered User
	Scanner sc=new Scanner(System.in);
	System.out.println ("Please enter First name:");
	String fName=sc.nextLine();
	isValidFirstName(fName);
	sc.close();
	//System.out.println ("Please enter Last name:");
//	String lName=sc.next();

	}
	
	 public static void isValidFirstName(String fName)
	    {
	  
	        // Regex to check valid Firstname.
	        String regex = "^[A-Z][a-z]{2,}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(fName);
	        
	        
	        
	        if(matcher.find()) {
	            System.out.println("FirstName is valid");
	         } else {
	            System.out.println("FirstName is not valid");
	         }
	        
	    }
}