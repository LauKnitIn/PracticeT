package segundoPunto;

public class Month {//Creating month class
	
	private String name;//Each month has a name
	private int numDays;//A certain amount of days
	private int calendarPosition;//A unique position in the calendar
	
	Month(String name,int numDays, int calendarPosition){//Creating a month requires to assign 
		this.numDays = numDays;//it's amount of days
		this.calendarPosition = calendarPosition;//it's position among all of the 12 months
		this.name = name;//it's name
	}
	public String showMonth () { //Method to show info about each month
		return "The month you're looking for is:" +"\n" + name + " which has --> "+ numDays + " days";
	}
	public String getName () {//To know the name of the month
		return this.name;
	}
	public int getNumDays () {//To know the amount of days
		return this.numDays;
	}
	public int getCalendarPosition () {//To know the position it has on the calendar
		return this.calendarPosition;
	}
}
