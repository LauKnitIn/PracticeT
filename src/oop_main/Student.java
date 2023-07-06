package oop_main;
import java.util.Scanner;//Importing scanner in class to enter data
public class Student {
//Class attributes
	
	 private String name;//name
	 private int id;//student id
	 private int scores [] = new int [5];//Initializing array of scores to be filled by student
	 private int [] arrangingGrades = new int [3];//Array of scores arranged by highest to lowest
	 private boolean verifyScores;//To manage scores out of range 1-10
	
	 /*When creating a Student, it will ask for the student name
	  *the id, and for the scores obtained by the student
	  *thats why the Scanner object is needed*/
	 
	Student (String name,int id,Scanner input) {
		this.name = name;//Equaling the attribute name to the one entered
		this.id = id;//Equaling the attribute id to the one entered
		/*Calling the class method to fill up the
		 *array with scores entered via Scanner input*/
		scoresArray(input);
		/*Calling the class method to arrange
		 *the scores by highest to lowest*/
		arrangingScores(this.scores);
	}
	
	//Class method to fill up the scores array
	private int [] scoresArray (Scanner input) {//Needs an Scanner to do so
		//to fill array
		for(int position = 0; position < this.scores.length; position++) {
			this.scores[position] = input.nextInt();//In each position with the entered one
		}
		/*After filling the array, the method calls the verifying method 
		 * which needs an array to verify, so this method passes
		 * the filled array to check*/
		verifyingScores(this.scores);
		sortingScores();
		return this.scores;
	}
	
	private void verifyingScores (int[] scores) {//Used to modify the verifyScores attribute
		//Goes through the array checking if the scores are in the range 1-10
		for(int i = 0; i < scores.length; i++) {
			//If any of the scores are out of bounds 
			if(scores[i] < 0 || scores[i] > 10) {
				this.verifyScores = false;//Change the attribute to false
				break;//Breaks checking
			}else {//Otherwise makes it true and continues checking each score
				this.verifyScores = true;
			}
		}
	}
	
	//Arranging scores from greatest to lowest
	private void sortingScores() {
		int aux = 0;//Will help to empty positions for swapping
		for(int position = 0; position < this.scores.length ; position++) { //till all positions are sorted out right
			for( int j = 0; j < this.scores.length; j ++) {//Does the actual swap
				if(!(j+1 > this.scores.length-1)) {//Swapping only positions in the array
					//Will compare the actual position and the next one
					if(this.scores[j]< this.scores[j+1] ) {//If the element is minor than the next one
						aux = this.scores[j];//Aux will save actual element to empty actual position
						//greatest element transfers to empty position
						this.scores[j] = this.scores[j+1];
						this.scores[j+1] = aux;//Previous saved element occupies the emptied position
					}
				}
			}
		}
	}
	
	/*Adding elements to the list that will contain the
	 *highest grade, the average score and lowest score*/
	
	private void arrangingScores (int[] scores) {
		int averageScore = 0;//To calculate average score 
		for(int i = 0; i < scores.length; i++) {
			averageScore += scores[i];//Adding up all grades
		}
		averageScore = averageScore/this.scores.length;//Dividing by length
		this.arrangingGrades[0] = scores[0];//Adding the greatest scores to first position
		this.arrangingGrades[1] = averageScore;//Average grade in the second position
		this.arrangingGrades[2] = scores[scores.length-1];//Lowest grade in last position
	}	
	//Getters to show needed info
	public int[] getArrangedScores () {
		return this.arrangingGrades;
	}
	public int[] getScores () {
		return this.scores;
	}
	public boolean getVerification () {
		return this.verifyScores;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
