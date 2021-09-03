package logicalproblems;
import java.util.Scanner;
public class FibonacciSeries {

	Scanner sc = new Scanner(System.in);
// Function for the fibonacciseries
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
 
        int counter = 0;
 
        
        while (counter < N) {
 
            // Print the number
            System.out.print(num1 + " ");
 
            // Swap the number
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
           
        }
    }
 
    //main method
    public static void main(String args[])
    {
     
    Scanner sc = new Scanner(System.in);
//get input for user
    System.out.println("Enter the Number");
    int N = sc.nextInt();
 
        // call the function
        Fibonacci(N);
    }




}

