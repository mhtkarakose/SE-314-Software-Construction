import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int month, year;
        int number_Of_DaysInMonth = 0; 

		System.out.println("Year: ");
		year = reader.nextInt();
		System.out.println("Month: ");
		month = reader.nextInt();
		
		
		int day [] = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		if(month == 2) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                number_Of_DaysInMonth = day[1];
            } else {
                number_Of_DaysInMonth = day[2];
            }
		}else {
            number_Of_DaysInMonth = day[month - 1];
		}
		
        	System.out.print( year + " has " + number_Of_DaysInMonth + " days\n");



	}
	

}
