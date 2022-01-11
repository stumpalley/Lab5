import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {

		new TestDate().go();
	}

	private void go() {
		String tests = "January 31 2001 Gregorian " +
				"February 28 2000 Gregorian " +
				"February 29 2000 Gregorian " +
				"February 28 1999 Gregorian " +
				"March 24 1500 Scotland " +
				"September 2 1752 Scotland " +
				"February 28 1443 Scotland " +
				"February 28 1444 Scotland " +
				"October 4 1582 Spain " +
				"December 31 1555 Spain " +
				"December 31 1554 Spain " +
				"February 28 1200 Spain " +
				"February 28 1582 Spain ";

		Scanner sc = new Scanner(tests);

		DateFactory df = new DateFactory();

		while (sc.hasNext()) {
			String month = sc.next();
			int day = sc.nextInt();
			int year = sc.nextInt();
			String location = sc.next();

			GregorianDate gd = df.createDate(month, day, year, location);
			System.out.println();
			System.out.println(gd);
			gd.makeTomorrow();
			System.out.println(gd);

		}
	}

}
