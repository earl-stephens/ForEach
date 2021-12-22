package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//another way of iterating through an array
		//very common
		
		String[] fruits = {"banana", "pear", "apple", "grape"};
		
		/* Sets the variable fruit and then assigns the variable
		 * to each element in the fruits array.
		 * This method does not give you the index of the array
		 */
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		/* Coding challenge
		 * Write a program that gets three numbers input by the user (keep 
		 * asking until they have entered exactly 3 numbers),
		 * prints the numbers entered, prints the total of the numbers
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int arrayLength = 3;
		int[] userInput = new int[arrayLength];
		
		System.out.println("Enter 3 integers below.");
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.println("Enter a number > ");
			userInput[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0;
		System.out.println("The numbers you entered are: ");
		
		for(int numbers: userInput) {
			System.out.println(numbers);
			total += numbers;
		}
		
		System.out.printf("The sum of the numbers is: %d", total);
	}
}
