package segundoPunto;
import java.util.Scanner;//Importing Scanner
public class Executable {
	
	//Function to assign the amount of days in each month
	public static int [] [] assingDays () {//Returns a 2-d array
		int count = 0;//To access the 1-d array 
		int [][] days = new int [3][4];//Creating 2-d array
		//Adding the amount of days for each month
		int [] amountDays = {31,29,31,30,31,30,31,31,30,31,30,31};
		for(int x = 0; x < days.length; x++) {//Accessing rows of 2-d array
			for(int y = 0; y < days[x].length; y++) {//Accessing columns of each row
				//Filling the 2-d array with the days from the 1-d array 
				days [x][y] = amountDays[count];
				count++;//Helps to add the correct elements to the array
			}
		}
		return days;
	}
	//Same as above but for the names for each month
	//how could it be optimized ?
	public static  String [][] assingNames (){
		int count = 0;
		String [][] names = new String [3][4];
		String [] monthNames = {"January","February","March","April","May","June","July","Agust","September","October","November","December"};
		 for(int i = 0; i < names.length; i++) {
			 for(int j = 0; j < names[i].length; j++) {
				 names[i][j] = monthNames[count];
				 count++;
			 }
		 }
		return names;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);//Creating Scanner
		//Instruction
		System.out.println("Enter one number and find out what month it belogs to");
		int find = input.nextInt();//Saving position of the month to find
		Month calendar [][] = new Month [3][4];//Creating a 2-d array of months
		int count = 0;//Will help to assign positions in the calendar for each month
		for(int i = 0; i < calendar.length; i++) {//2-d Array for creating months of the calendar
			for(int j = 0; j < calendar[i].length; j++) {
				String name = assingNames()[i][j];//Name to be assign to the month
				int day = assingDays()[i][j];//Amount of days to contain
				count++;//Position in the calendar
				calendar [i][j]= new Month(name,day,count);//Creating each month
			}
		}
		
		for(int row = 0; row < calendar.length; row++) {//Going through the calendar
			for(int col = 0; col < calendar[row].length; col++) {
				//IF the position of the month to find matches one in the calendar
				boolean condition = calendar[row][col].getCalendarPosition() == find;
				if (condition) {
					//Show the month that matches the position
					System.out.println(calendar[row][col].showMonth());
				}
			}
		}
		input.close();
	}

}
