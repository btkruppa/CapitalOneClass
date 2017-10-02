package question_13;

public class ForLoop {
	public static void main(String[] args) {

		for (int y = 1; y <= 4; y++) {
			for (int x = 1; x <= y; x++) {

				System.out.print((x + y) % 2 + " ");
				;
			}
			System.out.println();

		}
	}
}
