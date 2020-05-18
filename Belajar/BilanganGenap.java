import java.util.*;

// JPaneOption
// Buffered Reader
// Scanner

public class BilanganGenap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Angka");
		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("Genap");
		}
		else {
			System.out.println("Ganjil");
		}
	}
}