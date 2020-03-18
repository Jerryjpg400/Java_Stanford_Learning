
public class Date {
	private int month;
	private int day;
	private int get_day;
	/*
	 * Constructs a new date
	 * representing the given month and day
	 */
	public Date(int month, int day) {
		this.month = month;
		this.day = day;
		this.get_day = 1;
	}

	
	/*
	 * Returns the number of days in the month
	 * stored by your date object
	 */
	public int daysInMonth() {
		return this.day;
	}
	
	/*
	 * Returns the days
	 */
	public int getDay() {
		return this.get_day;
	}
	
	/*
	 * Returns the month
	 */
	public int getMonth() {
		return this.month;
	}
	
	/*
	 * advances the Date to the next day,
	 * wrapping to the next month and/or year if necessary
	 */
	public void nextDay() {
		int next_day = getDay() + 1;
		
		if (this.month <= 12) {
			if (next_day <= this.day) {				// next day <= 30  	next month <= 12
				this.get_day = next_day; 
			} else {								// next day > 30  	next month < 12
				this.month += 1;					// jump to next month
				this.get_day = 1;					// Let day go back to 1
			}
		} else {									// If next month more than 12
			this.month = 1;							// Let month go back to 1;
			this.get_day = 1;						// Let day go back to 1;	
		}
	} 
	
	/*
	 * returns a string representation such as "07/04"
	 */
	public String toString() {
		String date= "";
		// If month and day less than 10
		// we need give a zero
		// Keep "07/04" format
		if (this.month < 10) {
			if (this.get_day < 10) {								
				date = "0" + this.get_day + " / 0" + this.month;
			}
			else {
				date = this.get_day + " / 0" + this.month;
			}
			// If month and day more than 10
			// we do not need give a zero
			// Keep "17/11" format
		} else if (this.month >= 10) {
			if (this.get_day < 10) {
				date = "0" + this.get_day + " / " + this.month;
			} else {
				date = this.get_day + " / " + this.month;
			}
		}
		return date;
	}
	
}
