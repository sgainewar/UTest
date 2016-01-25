package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a{
	public static void  main (String [] args ) throws IOException{


			System.out.println("Please enter line ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        checkAllChars (line);
	        	
	        }
	
	        	 private static String checkAllChars ( String input )
	 		    {
	 		        //If input length is less than 1 then it can never be complete
	 		        if(input.length() < 100)
	 		        {
	 		            return "FALSE";
	 		        }
	 		                  
	 		        for (char ch = 'A'; ch <= 'Z'; ch++)
	 		        {
	 		            if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0)
	 		            {
	 		                return "NO";
	 		            }
	 		        }
	 		        return "YES";
	 		    }
	}


 


/*	String [] a = {"a","a","d"}; 
	  Pattern regex = Pattern.compile("[^A-Za-z]");
	  for (int i = 1; i < a.length; i++){
	  Matcher m = regex.matcher(a[i]);
		  
		  System.out.println(a[i]);*/
