
public class Wheels extends Carpart {
	int num;
	
	public Wheels(int num) {
		super(num);
		System.out.println("wheels constructor" +num);
		this.num=num;
		
	}

	public void function(){
		howmanywheels();
		 System.out.println("This is overrided Wheels function " +num);
	 }
	
	
	public void howmanywheels(){
		if (num==4)
			System.out.println("Yor car is a 4 wheeler");
		else
			System.out.println("your vehicle is 6 wheeler");
	}
}
