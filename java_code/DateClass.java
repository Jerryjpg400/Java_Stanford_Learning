
public class DateClass {
	private int month;
	private int day;
	private int get_day;
	/*
	 * Constructs a new date
	 * representing the given month and day
	 */
	public DateClass(int month, int day) {
		this.month = month;
		this.day = day;
		this.get_day = 1;
	}

	/*
	 * advances the Date to the next day,
	 * wrapping to the next month and/or year if necessary
	 */
	public void nextDay() {
		int next_day = getDay() + 1;
		
		if (next_day <= day) {
			get_day++;
		} else {
			if (month >= 12) {
				month = 1;
				get_day = 1;
			} else {
				month++;
				get_day = 1;
			}
		}
	} 
	
	/*
	 * Returns the number of days in the month
	 * stored by your date object
	 */
	public int daysInMonth() {
		return day;
	}
	
	/*
	 * Returns the days
	 */
	public int getDay() {
		return get_day;
	}
	
	/*
	 * Returns the month
	 */
	public int getMonth() {
		return month;
	}
	
	/*
	 * returns a string representation such as "07/04"
	 */
	public String toString() {
		String date= "";
		// If month and day less than 10
		// we need give a zero
		// Keep "07/04" format
		if (month < 10) {
			if (get_day < 10) {								
				date = "0" + get_day + " / 0" + month;
			}
			else {
				date = get_day + " / 0" + month;
			}
			// If month and day more than 10
			// we do not need give a zero
			// Keep "17/11" format
		} else if (month >= 10) {
			if (get_day < 10) {
				date = "0" + get_day + " / " + month;
			} else {
				date = get_day + " / " + month;
			}
		}
		return date;
	}
	
}
