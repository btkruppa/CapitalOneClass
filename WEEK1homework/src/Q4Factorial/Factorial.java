package Q4Factorial;

public class Factorial {

	//5!=5*4*3*2*1 n!=n*(n-1)*(n-2)*(n-3)*(n-4)
	public static void main(String[] args) {
		int n =7;
		int res=1;
		for(int i=1;i<=n;i++){
		res=res*i;
		System.out.println(res);
	}
}
}
	

