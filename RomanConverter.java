package arabic2roman;

import java.util.Scanner;
/* Tester class for converting arabic to Roman number */
public class RomanConverter {
	private static String number;
	   private static Scanner reader = new Scanner(System.in);  // Reading from System.in
       
		public static boolean isNumeric(String str)
		{
		    for (char c : str.toCharArray())
		    {
		        if (!Character.isDigit(c)) return false;
		    }
		    return true;
		}
	    
		public static void main(String[] args) {      
	          System.out.println("I am a simple chat bot, I will help you convert arabic to Roman numerals");
	          System.out.println("Enter a Roman numeral and I will convert it to an ordinary arabic integer.  ");
	          System.out.println("and I will convert it to a Roman numeral :) .  Type 'q' when");
	          System.out.println("you want to quit.");
	          
	          while (true) {
	    
	             System.out.println();
	             System.out.print("? ");
	             
	             /* Skip past any blanks at the beginning of the input line.
	                Break out of the loop if there is nothing else on the line. */
	             System.out.println("Enter a number: ");
	             number = reader.nextLine();
	             
//	             while (number.equals(' ') || number.equals('\t'))
//	                number=System.console().readLine();
	             
	             if ( number.equals("q"))
	                break;
	                
	             /* If the first non-blank character is a digit, read an arabic
	                numeral and convert it to a Roman numeral.  */
	                
	             if ( isNumeric(number)  ) {
	                int arabic = Integer.valueOf(number);
	                try {
	                    RomanNumeral N = new RomanNumeral(arabic);
	                    System.out.println(N.toInt() + " = " + N.toString());
	                }
	                catch (NumberFormatException e) {
	                    System.out.println("Invalid input.");
	                    System.out.println(e.getMessage());
	                }
	             }
	             else
	            	 System.out.println("Please enter a valid Arabic number! ");
	          }  // end while
	          
	          System.out.println("OK.  Bye for now.");
	          reader.close();
	          //close reader to avoid any memory leak.
	       }  // end main()
	       
	    } 
