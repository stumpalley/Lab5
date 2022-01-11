
public class GregorianDate {

	private int month;
	private int day;
	private int year;

	private static String[] months = { "skip", "January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October", "November", "December" };

	private static int[] daysInMonth = { 0, 31, -99, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public GregorianDate(String month, int day, int year) {
		for (int i = 1; i != 13; i++) {
			if (months[i].equals(month))
				this.month = i;
		}
		this.day = day;
		this.year = year;
	}

	public String toString() {
		return months[month] + "/" + day + "/" + year;
	}

	/*
	 * changes the date to tomorrow. You should not need to override or
	 * change this - if you do, check with jer
	 */

	public void makeTomorrow() {

		if (isChangedForSpecialDay())
			return;

		boolean changeYear = false;
		if (isLastDay()) {
			changeYear = true;
		}

		if ((month == 2 && day == 28 && !isLeap()) ||
				(month == 2 && day == 29 && isLeap()) ||
				(month != 2 && day == daysInMonth[month])) {
			month = month + 1;
			if (month == 13)
				month = 1;
			day = 1;
		} else
			day = day + 1;

		if (changeYear)
			year = year + 1;
	}

	public boolean isLeap() {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			return true;
		else
			return false;
	}

	public boolean isLastDay() {
		if (month == 12 && day == 31)
			return true;
		else
			return false;
	}

	/*
	 * this method changes the date in special ways, for example if dates were
	 * dropped
	 * when converting to the Gregorian Calendar. It should return true if it
	 * changed
	 * the day, in which case makeTomorrow should NOT change the day
	 */

	public boolean isChangedForSpecialDay() {
		// example of how this would work - not needed and not correct
		if (month == 12 && day == 13 && year == 2001) {
			day = 20;
			return true;
		}
		return false;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int y) {
		year = y;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setDay(int d) {
		day = d;
	}
}
