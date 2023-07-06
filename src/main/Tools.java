package main;
public class Tools {

	//Prime number verifier
	public static String even_odd (int num) {
		int verifier = num%2;
		String even = "the entered number is Even";
		String odd = "the entered number is Odd";
		if(verifier ==0) {
			return even;
		}
		else {
			return odd;
		}	
	}

	public static String palindromeCheck(String originalWord) {
		String newWord = "";
		int letterCount = originalWord.length();//To know the amount of characters in text
		while(letterCount != 0) {//While cycle to take out of the text each letter
			//Variable saving letters subtracted from last to first one by one
			String letter = originalWord.substring(letterCount-1, letterCount);
			letterCount= letterCount-1;//Subtract to letterCount variable to later break cycle
			newWord = newWord + letter;//Adds the letter subtracted to the new word being formed
		}
		if(newWord.equals(originalWord)) {//Compares the formed word with the entered one 
			return "It is a palindrome!!";//If they're the same prints
		}else {//If they're not the same prints
			return "It is not a palindrome =(";
		}
	}

	public static int factorialGenerator (int num) {
		int result = 1;//Initializing variable in 1 to multiply properly
		//Loop that goes from one to target number
		for(int multiplier = 1; multiplier <= num; multiplier++ ) {
			result = result * multiplier;//Multiplying result by each number on the iteration
		}
		return result;
	}
}
