package question_13;

public class ForLoop {
	public static void main(String[] args) {

		int initialNumber = 0;
		for (int outerLoop = 0; outerLoop < 4; outerLoop++) {
			for (int innerLoop = 0; innerLoop <= outerLoop; innerLoop++) {
				System.out.print(initialNumber + " ");
				if (initialNumber == 0) {
					initialNumber = 1;
				} else {
					initialNumber = 0;
				}
			}
			System.out.println();

		}
	}
}
