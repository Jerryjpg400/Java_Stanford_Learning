public class Clock {
	private int hour;
	private int minute;
	private String amPm;
	
	/*
	 * Init the value
	 */
	public Clock(int hour, int minute, String amPm) {
		this.hour = hour;
		this.minute = minute;
		this.amPm = amPm;
	}
	
	/*
	 * Input the minute what user want to advance
	 * give the advance time 
	 */
	public void advance(long minutes) {
		for (int i = 0; i < minutes; i++) {
			minute++;
			if (minute >= 60) {
				minute = 0;
				hour++;
				if (hour == 12) {
					amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
				} else if (hour > 12) {
					hour = 1;
				}
			}
		 }
	}
	
	/*
	 * Return the hour
	 */
	public int getHour() {
		return hour;
	}
	
	/*
	 * Return the minutes
	 */
	public int getMinute() {
		return minute;
	}
	
	/*
	 * Return the time whether am or pm
	 */
	public String getAmPm() {
		return amPm;
	}
	
	/*
	 * If user want to print this class
	 * This is the String format of class
	 */
	public String toString() {
		String tep = "";
		if (minute < 10) {
			tep = hour + ":" + "0" + minute + " " + amPm;
		} else {
			tep = hour + ":" +  minute + " " + amPm;
		}
		return tep;
	}
}