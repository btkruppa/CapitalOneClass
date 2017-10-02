package Q15Interfaceaddsubmuldiv;

public class Test implements MathInterface {

	private int i;
	private int j;

	public Test(int i, int j) {
		this.i=i;
		this.j=j;
		
	}
	public static void main(String[] args) {
		Test t=new Test(8,2);
		t.add(8,2);
		t.sub(8,2);
		t.mul(8,2);
		t.div(8,2);

	}
	@Override
	public int add(int x, int y) {
		System.out.println(x+y);
		return 0;
	}
		
	@Override
	public int sub(int x, int y) {
		System.out.println(x-y);
		return 0;
	}

	@Override
	public int mul(int x, int y) {
		System.out.println(x*y)	;
		return 0;
	}

	@Override
	public int div(int x, int y) {
		System.out.println(x/y);
		return 0;	
	}

	
	}


