
import java.util.Scanner;

public class QuotientRemainder {
	int Dividend;
	int Divisor;

	void CalculateQuotient() {
		int Quotient = Dividend / Divisor;
		System.out.println("Quotient is:" + Quotient);

	}

	void CalculateRemainder() {
		int Remainder = Dividend % Divisor;
		System.out.println("Remainder is:" + Remainder);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QuotientRemainder obj = new QuotientRemainder();
		System.out.println("Enter the value of Dividend:");
		obj.Dividend = scan.nextInt();
		System.out.println("Enter the value of Divisor:");
		obj.Divisor = scan.nextInt();
		obj.CalculateQuotient();
		obj.CalculateRemainder();
		scan.close();

	}
}
