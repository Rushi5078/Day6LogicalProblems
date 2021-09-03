package logicalproblems;
import java.util.Scanner;
public class ReverseNumber {

     // main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Decleration part
		int num ;
		int rem;
		int rev = 0;
		//user input part
		System.out.println("Enter the number");
		num = sc.nextInt();
		//execution part
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
