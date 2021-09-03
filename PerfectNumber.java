 package logicalproblems;

import java.util.Scanner;

public class PrefectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Decleration part
		int num;
		int sum = 0;
		// get  input from user
		System.out.println("Enter the number");
		num = sc.nextInt();
		// execution part
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}

		}
		if (num == sum) {
			System.out.println("this is  perfect number");
		} else {
			System.out.println("this is not perfect number ");
		}
	}
}
