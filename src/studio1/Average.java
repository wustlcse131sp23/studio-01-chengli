package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me the first integer you wanna average.");
		int n1 = in.nextInt();
		System.out.println("Tell me the first integer you wanna average.");
		int n2 = in.nextInt();
		
		double average = ((double)(n1 + n2))/2;
		System.out.println("Your average is " + average + ".");

	}

}
