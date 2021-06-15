
import java.util.Scanner;

public class FlipCoin {

	int num;
	int head = 0;
	int tail = 0;

	void HeadTail() {

		num = Math.abs(num);

		for (int i = 0; i < num; i++) {
			double rand = Math.random();
			if (rand < 0.5) {
				tail++;
				System.out.println("Tail");
			} else {
				head++;
				System.out.println("Head");
			}
		}
	}

	void Percentage() {

		float HeadPercentage;
		float TailPercentage;

		HeadPercentage = (float) ((head * 100) / num);
		TailPercentage = (float) ((tail * 100) / num);
		System.out.println("Head Percentage is " + HeadPercentage + "%");
		System.out.println("Tail Percentage is " + TailPercentage + "%");
	}

	void Statement() {
		System.out.println("Enter number of times you want to toss coin:");
	}

	public static void main(String[] args) {

		FlipCoin obj1 = new FlipCoin();
		Scanner scan = new Scanner(System.in);
		obj1.Statement();
		obj1.num = scan.nextInt();
		obj1.HeadTail();
		obj1.Percentage();
		scan.close();

	}
}
