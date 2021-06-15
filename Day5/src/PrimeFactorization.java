
import java.util.Scanner;

public class PrimeFactorization {

	int n;

	void primefactor() {
		while (n % 2 == 0) {
			System.out.print("2 ");
			n = n / 2;
		}

		for (int i = 3; i <= n; i = i + 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeFactorization obj = new PrimeFactorization();
		System.out.println("Enter number to find prime factors for");
		obj.n = scan.nextInt();
		obj.primefactor();
		scan.close();
	}
}
