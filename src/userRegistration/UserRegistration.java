package userRegistration;


import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	

	public static void main(String[] args) {
	// Registered User
	Scanner sc=new Scanner(System.in);
//	System.out.println ("Please enter First name:");
//	String fName=sc.nextLine();
//	isValidFirstName(fName);
//	
//	System.out.println ("Please enter Last name:");
//	String lName=sc.next();
//	isValidLastName(lName);
//	
//	System.out.println ("Please enter Email:");
//	String email=sc.next();
//	isValidEmail(email);
	
//	System.out.println ("Please enter Phone Number:");
//  String phnNo=sc.next();
//	isValidPhoneNo(phnNo);

	System.out.println ("Please enter Password:");
	String passWord=sc.next();
	isValidPassword(passWord);

	sc.close();
	}
	
	 public static void isValidFirstName(String fName)
	    {
	  
	        /**
	         *  Regex to check valid Firstname.
	         **/
	        String regex = "^[A-Z][a-z]{2,}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(fName);
	        
	        	        
	        if(matcher.find()) {
	            System.out.println("FirstName is valid");
	         } else {
	            System.out.println("FirstName is not valid");
	         }
	        
	    }
	 
	 public static void isValidLastName(String lName)
	    {
	  
	        /**
	         *  Regex to check valid Lastname.
	        **/
	        String regex = "^[A-Z][a-z]{2,}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lName);
	        
	     
	        
	        if(matcher.find()) {
	            System.out.println("Lastname is valid");
	         } else {
	            System.out.println("Lastname is not valid");
	         }
	        
	    }
	 
	 public static void isValidEmail(String email)
	    {
	  
	        /**
	         *  Regex to check valid email.
	        **/
	        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        
	     
	        
	        if(matcher.find()) {
	            System.out.println("email is valid");
	         } else {
	            System.out.println("email is not valid");
	         }
	        
	    }
	 
	 public static void isValidPhoneNo(CharSequence phnNo)
    {
  
        /**
         *  Regex to check valid Phone Number.
        **/
	    String regex =  "^(?:(?:\\+|0{0,2})[0-9](\\s*[\\ -]\\s*)?|[0]?)?[6-9]\\d{9}|(\\d[ -]?){10}\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phnNo);
        
     	        
        if(matcher.find()) {
            System.out.println("Phone Number is valid");
         } else {
            System.out.println("Phone Number is not valid");
         }
        
    }
	 
	 public static void isValidPassword(String passWord)
	    {
	  
	        /**
	         *  Regex to check valid Password.
	        **/
		    String regex =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(passWord);
	        
	     	        
	        if(matcher.find()) {
	            System.out.println("Password is valid");
	         } else {
	            System.out.println("Password is not valid");
	         }
	        
	    }
	 
}