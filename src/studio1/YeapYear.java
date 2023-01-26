package studio1;

import java.util.Scanner;

public class YeapYear {

	public static void main(String[] args) {
		
		boolean div4;
		boolean div100;
		boolean div400;
		
		Scanner in = new Scanner(System.in);
		System.out.println("What's the year?");
		int year = in.nextInt();
		
		div4 = (year % 4) == 0;
		div100 = (year % 100) == 0;
		div400 = (year % 400) == 0;
		
		boolean leapYear = (div4 && !div100) || div400;
		System.out.println(year + " is a leap year. " + leapYear);

	}

}
