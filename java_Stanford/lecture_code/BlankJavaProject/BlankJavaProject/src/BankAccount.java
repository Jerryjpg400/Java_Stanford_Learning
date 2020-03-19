
public class BankAccount {
	private String id;
	private double balance;
	private int transactions;
	
	/*
	 * Init the field
	 */
	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
	}
	
	
	/*
	 *  The method returns true. 
	 *  If the balance cannot afford all of the fees or has no money left, 
	 *  the balance is left as 0.0 and the method returns false.
	 *  **********************************************
	 *  For example 1
	 *  transactionFee(10.00);
	 *  Then the account would be deducted $10 + $20 + $30 + $40 
	 *  for the four transactions, 
	 *  leaving a final balance of $0.00. The method would return false.
	 *  **********************************************
	 *  For example 2
	 *  transactionFee(10.00);
	 *  Then the account would be deducted $5 + $10 + $15 + $20 
	 *  for the four transactions, 
	 *  leaving a final balance of $90.00. The method would return true. 
	 *  If a second call were made
	 */
	public boolean transactionFee(double amount) {
		double deducted = 0.00;
		for (int i = 1; i <= 4; i++) {
			deducted += i * amount;
		}
		withDraw(deducted);
		if (balance >= 0.00) {
			return true;
		} else {
			balance = 0.00;
			return false;
		}
	}
	/*
	 * Return balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/*
	 * Return ID 
	 */
	public String getID() {
		return id;
	}
	
	/*
	 * Return transactions as string format
	 */
	public String getTransactions() {
		return Integer.toString(transactions);
	}
	
	/*
	 * Adds the amount to the balance if it is between 0-500
	 * Also counts as 1 transaction
	 */
	public void deposit(double amount) {
		balance += amount;
	}
	
	/*
	 * Subtracts the amount from the balance if the user has enough money
	 * Also counts as 1 transaction
	 */
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	
	
	
	
}
