
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
	 * 
	 */
	public boolean transactionFee(double amount) {
		double deducted = 0;
		for (int i = 1; i <= 4; i++) {
			deducted += i * amount;
		}
		balance = balance-deducted;
		if (balance >= 0.0) {
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
