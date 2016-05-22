package session4_assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strorg, strrev = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      strorg = in.nextLine();
	 
	      int length = strorg.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	    	  strrev = strrev + strorg.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+strrev);
	   }
	}

