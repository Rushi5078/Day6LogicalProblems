package logicalproblems;
import java.util.Scanner;
public class PrimeNumber {

	
	public static void main(String[] args) {
		//Decleration part
		int count=0;
		//user input part
		System.out.println("Enter the number"); 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//execution part
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
			}
			if(count==2)
 				System.out.println("this is prime number");
			else
				System.out.println("this is not prime number");
		}
	}

