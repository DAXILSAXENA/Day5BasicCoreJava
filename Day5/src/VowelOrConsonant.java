
import java.util.Scanner;

public class VowelOrConsonant {

	char name;

	void check() {
		if ((name == 'a') || (name == 'e') || (name == 'i') || (name == 'o') || (name == 'u')) {
			System.out.println("Given alphabet is vowel");
		} else {
			System.out.println("Given alphabet is Consonant");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VowelOrConsonant obj = new VowelOrConsonant();
		System.out.println("Enter any aplhabet");
		obj.name = scan.next().charAt(0);
		obj.check();
		scan.close();
	}
}
