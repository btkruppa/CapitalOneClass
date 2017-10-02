package Q12Evennumarray;

public class Array {

	private static int x;

	public static void main(String[] args) {
		int [] arr=new int[100];
		//System.out.println(arr[0]);
		
		for (int x=1;x<100;x++)
			{
			arr[x]=x;
			}
		
			for (int ele :arr){
				if (ele%2==0){
			System.out.println(ele);
			}
			}

		}
	}






