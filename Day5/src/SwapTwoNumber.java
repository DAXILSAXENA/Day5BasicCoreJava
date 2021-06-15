
import java.util.Scanner;

public class SwapTwoNumber {

	int num1;
	int num2;

	void swap() {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapped numbers are:" + "\n" + num1 + "\n" + num2);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SwapTwoNumber obj = new SwapTwoNumber();
		System.out.println("Enter number one to swap:");
		obj.num1 = scan.nextInt();
		System.out.println("Enter number two to swap:");
		obj.num2 = scan.nextInt();
		obj.swap();
		scan.close();
	}
}
