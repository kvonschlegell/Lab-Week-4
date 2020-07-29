
public class Account {
	// Static variable
	private static int numAccounts = 0;

	// Constructor method and adding one to each new variable
	public Account() {
		numAccounts++;
	}

	public static void main(String[] args) {
		// Added a few Account
		Account a = new Account();
		Account b = new Account();
		Account c = new Account();
		Account d = new Account();
		// Prints out the number of accounts. In this case 4.
		System.out.println("Number of accounts is: " + Account.getNumAccounts());
	}

	// Static Method
	public static int getNumAccounts() {

		return numAccounts;
	}
}
