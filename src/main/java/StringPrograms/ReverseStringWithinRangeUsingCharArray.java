package StringPrograms;

public class ReverseStringWithinRangeUsingCharArray {
	
	/*
	 * Prerequisites to verify:-
	 * 1. String length should not be zero.
	 * 2. Starting range should be greater than or equal to zero.
	 * 3. Ending range should be less than string length
	 * 4. Starting index should not be greater than ending index
	 */
	
	public static String reverseStringInRange(String inputString, int startingIndex, int endIndex)
	{
		// Checking preconditions
		if(inputString.length() <= 0 )
		{
			System.out.print("Input String length must be greater than zero. ");
			return inputString;
		}
		else if(startingIndex < 0 | endIndex >= inputString.length() | startingIndex >endIndex)	
		{
			System.out.print("Invalid range specified. ");
			return inputString;
		}
		// Convert string to char array
		char[] inputStringInArray = inputString.toCharArray();
		// Swap values
		while(startingIndex < endIndex)
		{
			char temp = inputStringInArray[startingIndex];
			inputStringInArray[startingIndex] = inputStringInArray[endIndex];
			inputStringInArray[endIndex] = temp;
			startingIndex ++;
			endIndex--;
		}
		
		return String.copyValueOf(inputStringInArray);
	}

	public static void main(String[] args) {
		
		System.out.println(reverseStringInRange("MakeSeleniumEasy", 4, 11));
		System.out.println(reverseStringInRange("SunShines", 0, 2));
		System.out.println(reverseStringInRange("EastWest", -3, 7));
		System.out.println(reverseStringInRange("WestEast", 2, 10));
		System.out.println(reverseStringInRange("News", 3, 1));
		System.out.println(reverseStringInRange("", 2, 10));
	}
}
