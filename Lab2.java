// Lab2.java Starter File

import java.io.*; // BufferedReader
import java.util.*; // Scanner

public class Lab2
{
	public static void main (String args[]) throws Exception // i.e. the input file you put on cmd line is not in directory
	{


		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Lab2 <input filename>\n\n"); // i.e. C:\> java Lab2 L2input.txt
			System.exit(0);
		}
		BufferedReader infile = new BufferedReader (new FileReader( args[0] )); // we read our text file line by line
		int lineNum=0;
		while( infile.ready() ) // ifile.ready() means "while there are any lines left in file"
		{
			String line = toAlphaLowerCase(infile.readLine());
			if ( isPalindrome( line ) )
				System.out.format("<%s> IS palindrome.\n",line);
			else
				System.out.format("<%s> NOT palindrome.\n",line);
		}
	} // END MAIN

	// ******* MODIFY NOTHING ABOVE  THIS   LINE YOU FILL IN THE METHODS BELOW *******
	// RETURNS A STRING WITH ALL NON ALPHABETIC CHARS REMOVED. ALL REMAINING ARE ALPHAS CONVERTED TO LOWER CASE
	// "Madam I'm Adam" returns "madamimadam" which is now ready for a simple palindromic test
	// To test whether a char is alpha i.e. letter of the alphabet
	//
	// READ THIS BEFORE WRITING THIS METHOD!  ==> https://docs.oracle.com/javase/tutorial/i18n/text/charintro.html


	static String toAlphaLowerCase( String s )
	{
		// READ BEFORE WRITING METHOD! ==> https://docs.oracle.com/javase/tutorial/i18n/text/charintro.html

//add the lowercsae of the alphabet using a stringbuilder
		StringBuilder sb = new StringBuilder();
		    for(int i = 0; i < s.length(); i++)
				//Loop though the lines s and find the letters
	{
		        if(Character.isLetter(s.charAt(i)))
	{
		            sb.append(Character.toLowerCase(s.charAt(i)));
	}
	}
		    return sb.toString();
	}
 // (just to make it compile) YOU CHANGE AS NEEDED

	// RETURNs true if and only if the string passed in is a palindrome
	static boolean isPalindrome( String s )
	{
		//This loop compares each letter of the string to the first and last, 2nd and second to last and so on...
		int length = s.length();
     for (int i = 0; i < (length/2); ++i)
	{    //Loop
         if (s.charAt(i) != s.charAt(length - i - 1))
 	{         //If they are not equal than it will return false and prints not Palindrome
             return false;
 	}
			return true;

}   //IF it passes the test above than it is a palindrome
     return true;

	} // (just to make it compile) YOU CHANGE AS NEEDED

}// END LAB2 CLASS
