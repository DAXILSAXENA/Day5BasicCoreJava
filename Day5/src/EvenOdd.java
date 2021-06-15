
import java.util.Scanner;

public class EvenOdd {

	int num;

	void check() {
		int temp = num % 2;
		if (temp == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EvenOdd obj = new EvenOdd();
		System.out.println("Enter number to check if it is Odd or Even:");
		obj.num = scan.nextInt();
		obj.check();
		scan.close();
	}
}
