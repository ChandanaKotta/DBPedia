package arabic2roman;

public class RomanNumeral {
	private final int num;   // The number represented by this Roman numeral.
    
    /* The following arrays are used by the toString() function to construct
       the standard Roman numeral representation of the number.  For each i,
       the number numbers[i] is represented by the corresponding string, letters[i].
    */
    
    private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  
                                          50,   40,   10,    9,    5,    4,    1 };
                                       
    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
                                        "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
       
 
    public RomanNumeral(int arabic) {
          // Constructor.  Creates the Roman number with the int value specified
          // by the parameter.  
    	
    	//Only positive values of arabic are accepted
       if (arabic < 1)
          throw new NumberFormatException("Value of RomanNumeral must be positive.");
       if (arabic > 3999)
          throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
       num = arabic;
    }
    
    public String toString() {
          // Return the standard representation of this Roman numeral.
       String roman = "";  // The roman numeral.
       int N = num;        // N represents the part of num that still has
                           //   to be converted to Roman numeral representation.
       for (int i = 0; i < numbers.length; i++) {
          while (N >= numbers[i]) {
             roman += letters[i];
             N -= numbers[i];
          }
       }
       return roman;
    }
    
  
    public int toInt() {
         // Return the value of this Roman numeral as an int.
       return num;
    }

}
