import java.util.Scanner;

public class HurufVokal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char cc = input.next().charAt(0);

		if (cc == 'a' || cc == 'i' || cc == 'u' || cc == 'e' || cc == 'o') {
			System.out.println("Huruf Vokal");
		}

	}
}