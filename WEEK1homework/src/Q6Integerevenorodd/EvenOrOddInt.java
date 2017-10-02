package Q6Integerevenorodd;

public class EvenOrOddInt {
	public int x;
	int y;
	
	public EvenOrOddInt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void findOddorEven(int x){
		this.x=x;
		y=(x/2)*2;
		if (y==x){
			System.out.println("The given number is even");}
		else if (y!=x){
			System.out.println("The given number is odd");	
			}
	}
	
	
}
