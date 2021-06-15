
public class LeapYear {

	private static int a;

	void checkleap(int a) {

		int e = a % 400;
		int f = a % 100;
		int g = a % 4;

		if (e == 0)
			System.out.println("year is leap year");
		else if (f == 0)
			System.out.println("year is not leap year");
		else if (g == 0)
			System.out.println("year is leap year");
		else
			System.out.println("year is not leap year");

	}

	public static void main(String[] args) {

		LeapYear m1 = new LeapYear();
		LeapYear.a = 2000;
		m1.checkleap(a);

	}
}
