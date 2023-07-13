package tercerPunto;
import java.util.Scanner;//Importing Scanner to use
public class executable {
	
	public static Student [] sizing (Student array [],int increase) {
		Student aux [] = new Student [increase];
		for(int i = 0; i < array.length; i++) {
			aux[i] = array[i];
		}
		array = aux;
		return array;
	}

	public static void main(String[] args) {
		
		Student students [] = new Student [1];//sizing Student's array 
		Student adultStudents[] = new Student [1]; //Sizing older Student's array
		final int ADULT = 18;//Constant to know whereas a student is an adult or not
		int positionStudent = 0;//To count position for the Student's array
		int adultPosition = 0;//To count position for the adult Student's array
		String end = "*";//To identify the input that tells the program to stop
		boolean condition = true;//To get the while loop to run
		
		Scanner input = new Scanner(System.in);//Creating Scanner 

		while(condition) {//Loop to collect student data
			//To save the name to be assigned to Student 
			System.out.println("Enter student's name or enter * if you're finished");
			String name = input.nextLine();
			if(name.equals(end)) {//Condition to break the loop
				break;
			}
			System.out.println("Enter student's age");//Asking for the student's age
			int age = input.nextInt();//Saving student's age
			Student toAdd = new Student (name,age);//Creating the Student to add in the array
			students [positionStudent] = toAdd;//Adding Student to position in the array
			students = sizing(students,students.length+1);//Calling re-size function
			if(age >= ADULT) {//If the students age is 18+ 
				adultStudents [adultPosition] = toAdd;//Student will also be added to the adult array
				//REPEATS THE SIZING PROCESS
				Student aux [] = new Student [adultStudents.length+1];
				for(int i = 0; i < adultStudents.length; i++) {
					aux [i] = adultStudents[i];
				}
				adultStudents = aux;
				adultPosition++;
			}
			positionStudent++;
			input.nextLine();
		}
		System.out.println("| Name |-| Age   |");
		for(int i = 0; i < students.length-1; i++) {
			System.out.println("\n+-------+----");
			System.out.println("| " + students[i].getName()+ "  |" + students[i].getAge());
		}
		input.close();
	}

}
