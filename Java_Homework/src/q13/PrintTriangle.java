package q13;

public class PrintTriangle {

	public static void main(String[] args) {
		int tracker = 0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
//				System.out.print(((i+j)%2)+" ");
				System.out.print(tracker + " ");
				if(tracker == 0) {
					tracker = 1;
				}else tracker = 0;
			}
			System.out.print("\n");
		}

	}

}
