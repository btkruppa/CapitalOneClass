package question13;

public class DisplayTriangle {

	public static void main(String[] args) {
		
		
		int x=0;
		for(int outerLoop =1; outerLoop<=4; outerLoop++){
			for(int innerLoop=1; innerLoop<=outerLoop; innerLoop++){
				System.out.print(x + " ");		
			if(x == 0){
				x=1;
			}else{
				x=0;
			}
		}
		
		System.out.print("\n");
		}

//		for (int outer = 1; outer <= 4; outer++) {
//			for (int inner = 1; inner <= outer; inner++)
//			{
//				System.out.print((outer + inner) % 2 + " ");
//			}
//			System.out.println();
//
//		}

	}

}
