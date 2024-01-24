package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Value for n1?");
		int n1 = in.nextInt();
		System.out.println("Value for n2?");
		int n2 = in.nextInt();
		int add = n1 + n2;
		double avg = add / 2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);
		
	}

}
