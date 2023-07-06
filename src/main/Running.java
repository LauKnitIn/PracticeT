package main;
import java.util.Scanner;
public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); //Creating Scanner
		
		//EVEN_ODD VERIFIER
		
		System.out.println("Enter the number you'd like to check");//Print instruction;
		String verified = Tools.even_odd(input.nextInt());//Assign function to a variable to print
		System.out.println(verified);//Print return statement of the function
		
		//PALINDROME_CHECK
		
		System.out.println("Enter below the word to verify");
		input.nextLine();
		String toCheck = Tools.palindromeCheck(input.nextLine());
		System.out.println(toCheck);

		//FACTORIAL 
		
		System.out.println("Enter the number you'd like to know the factorial of");
		int generate = Tools.factorialGenerator(input.nextInt());
		System.out.println("the result is -> " + generate);
		
		input.close();
		
	}

}
