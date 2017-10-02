package Q2Fibannacci;

public class Fibanacci {

	public static void main(String[] args) {
		int[] arrayz = new int[25];
		int z = 0;
		int y = 1;
		int x = 0;
		
		arrayz[0] = x;
		arrayz[1] = y;
		
		for (int i = 0; i < arrayz.length - 2; i++) {

			z = x + y;
			x = y;
			y = z;
			arrayz[i + 2] = z;
			System.out.println(arrayz[i]);
		}

		for (int i = 0; i < arrayz.length; i++) {

			System.out.println(arrayz[i]);
		}

	}
}
