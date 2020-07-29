
public class Box {
	int size = 0;

	public static void main(String[] args) {

		Box box = new Box();
		box.size = 5;
		// Prints 5x5 box with *
		box.printBox();
		// Prints 5x5 box with the letter "c"
		box.printBox('c');

	}

	// Method overload
	public void printBox(char c) {

		for (char row = 1; row <= size; row++) {
			for (char column = 1; column <= size; column++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public void printBox() {

		for (int row = 1; row <= size; row++) {
			// Will print each * in the row
			for (int column = 1; column <= size; column++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
