
public class Numbers {

	public static void main(String[] args) {

		int[] numbers = { 100, 58, 17, 5, 30, 433, 16, 98, 201, 155, 43, 34, 8 };
		nextLargest(numbers);
	}

	private static void nextLargest(int[] number) {

		// This loop iterates through the array
		for (int index = 0; index < number.length; index++) {
			// Setting a variable equal the largest integer
			int nextLargestValue = Integer.MAX_VALUE;
			// Setting a variable to examine each index number
			int currentNumber = number[index];

			for (int i = 0; i < number.length; i++) {
				// Looking for the number that is bigger than the current index number but need
				// to narrow down a value that is the next largest value
				if (number[i] > currentNumber && number[i] < nextLargestValue) {
					nextLargestValue = number[i];
				}
			}
			System.out.println(currentNumber + ": " + nextLargestValue);
		}
	}

}