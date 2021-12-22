package application;

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
	}
}
