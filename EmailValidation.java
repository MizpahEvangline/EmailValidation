

import java.util.Scanner;

public class EmailValidation 
{
   public static void main(String[] args) 
   {
	  String email;
	  String array[]= {"mizpah@gmail.com", "evangline@gmail.com", "blessy@gmail.com"};
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the email Id to search");
	  email=sc.next();
	  if(array[0].equals(email))
	  {
		  System.out.println("Valid email Id");
	  }
	  else if(array[1].equals(email))
	  {
		  System.out.println("Valid email Id");
	  }
	  else if(array[2].equals(email))
	  {
		  System.out.println("Valid email Id");
	  }
	  else 
	  {
		  System.out.println("Invalid email Id");
	  }
   }	  
}  
