package Q9Prime;

import java.util.ArrayList;
import java.util.List;

public class TestPrime {

		public static void main(String[] args) {

			List<Integer> mylist = new ArrayList<>();
			for (int i = 2; i <= 100; i++) {
				for (int j = 2; j <= i; j++) {

					if (j == i) {
						mylist.add(i);
					}
					if (i % j == 0) {
						break;
					}
				}
			}

			for (int element : mylist) {
				System.out.println(element);
			}
		}

}