package oop_main;
import java.util.Scanner;//Importing Scanner
public class Executable {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Creating Scanner for data input

		/*Constants to define highest score,
		 *average score and lowest score */
		final int HIGHEST = 1;
		final int MID = 2;
		final int LOWEST = 3;
		//Printing instructions to user to create Student
		System.out.println("Enter your name ->"); 
		String name = input.nextLine();//To save name entered
		System.out.println("Enter your student id ->");
		int id = input.nextInt();//To save entered id
		System.out.println("Enter your scores one by one");//Asking for the obtained scores
		Student test = new Student(name,id,input);//Creating a student
		//Calling verification attribute of Student to verify scores
		if(test.getVerification() == false) {//In case that the entered scores are out of range 0-10
			System.out.println("Enter a valid score");
		}else {
			//Calling Student attribute scores to show the entered scores
			System.out.println("your scores were: ");
			for(int i = 0; i < test.getScores().length; i++) {
				System.out.println(test.getScores()[i]);
			}
			System.out.println();
			/*Showing scores by calling Student
			 *attributes name and arrangedScores*/
			for(int j = 0; j < test.getArrangedScores().length; j++) {
				switch (j+1) {
				case HIGHEST://Showing the highest score
					System.out.println( test.getName()+" your highest score was -> " + test.getArrangedScores()[j]);
					break;
				case MID://Showing average score
					System.out.println(test.getName()+" your average score was -> " + test.getArrangedScores()[j]);
					break;
				case LOWEST://Showing lowest score
					System.out.println(test.getName()+" your lowest score was -> " + test.getArrangedScores()[j] + " dont't worry you can improve");
					break;
				}
			}
		}

	}

}
