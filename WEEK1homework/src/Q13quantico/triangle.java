package Q13quantico;

public class triangle {

	public static void main(String[] args) {

		int x = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				if (x == 0) {
					x = 1;
				} else {
					x = 0;
				}
			}
			System.out.print("\n");

		}
	}

}