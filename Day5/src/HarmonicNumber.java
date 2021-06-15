
import java.util.Scanner;

public class HarmonicNumber {

	int n;

	void Harmonic() {
		if (n == 0)
			System.out.println("error");

		else {
			float value = 0;

			for (int i = 1; i <= n; i++) {
				value += (float) 1 / i;
			}
			System.out.println(value);
		}
	}

	public static void main(String[] args) {

		HarmonicNumber obj = new HarmonicNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Which harmonic number you want:");
		obj.n = scan.nextInt();
		obj.Harmonic();
		scan.close();

	}
}
