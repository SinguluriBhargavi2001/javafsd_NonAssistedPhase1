import java.util.*;
import java.util.regex.*;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		ArrayList<String> emails=new ArrayList<String>();
		//Valid Emails 	
		emails.add("bhargavisinguluri@gmail.com");
		emails.add("bhargavisinguluri2001@gmail.com");
		emails.add("bhargavi@yahoo.in");
		emails.add("name@gmail.com");
		emails.add("name@domain.ac.in");
		emails.add("firstname.lastname@gmail.com");
		emails.add("name@domain.co.in");
		emails.add("name#@domain.ac.in");
		
		//Invalid Emails
		emails.add("@domain.ac.in");
		emails.add("name#domaincom");
		
		//Regular Expressions
		String regex="^(.+)@(.+)$";
		Pattern p=Pattern.compile(regex);
		
		//Searching and validating the mail which user enters
		System.out.println("Enter the mail id that have to be searched");
        String search=obj.next();
        if(emails.contains(search)) {
       	 System.out.println("The email "+search+" is found");
       	 Matcher matcher = p.matcher(search);
       	 
        //if mail matches all the requirements it is valid
        if(matcher.matches()) {
           System.out.println("Valid Email ID");
        } 
        else {
           System.out.println("Invalid Email ID");
           System.out.println("Please enter a valid email id as mentioned");
        }
        }
        else {
       	 System.out.println("The email "+search+" is not found");
        }
	}
}
