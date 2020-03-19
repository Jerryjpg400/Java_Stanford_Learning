
public class Clock {
	private int hour;
	private int minute;
	private String amPm;
	
	public Clock(int hour, int minute, String amPm) {
		this.hour = hour;
		this.minute = minute;
		this.amPm = amPm;
	}
	
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
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public String getAmPm() {
		return amPm;
	}
	
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

