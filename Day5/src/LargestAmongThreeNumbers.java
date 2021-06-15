
import java.util.Scanner;

public class LargestAmongThreeNumbers {

	int num1;
	int num2;
	int num3;

	void display() {

		Scanner scan = new Scanner(System.in);
		LargestAmongThreeNumbers obj = new LargestAmongThreeNumbers();
		System.out.println("Enter First number");
		obj.num1 = scan.nextInt();
		System.out.println("Enter Second number");
		obj.num2 = scan.nextInt();
		System.out.println("Enter Third number");
		obj.num3 = scan.nextInt();
		scan.close();
		obj.compare();

	}

	void compare() {
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is greatest");
		} else if (num2 > num3) {
			System.out.println(num2 + " is greatest");
		} else {
			System.out.println(num3 + " is greatest");
		}

	}

	public static void main(String[] args) {
		LargestAmongThreeNumbers obj = new LargestAmongThreeNumbers();
		System.out.println("Welcome to largest of three number program");
		obj.display();
	}
}
