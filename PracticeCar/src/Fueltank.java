
public class Fueltank extends Carpart{
 
	int gallon;
	
	public Fueltank(int gallon) {
		super(gallon);
		this.gallon=gallon;
		System.out.println("Fueltank constructor");
		System.out.println("carpart fuel " +  "lll" + durability);
	}



 
 public void function(){
	 whatistanksize();
	 System.out.println("This is overrided Fueltank function " + gallon);
 }
 
public void whatistanksize(){
	 if (gallon<5)
		 System.out.println("Fuel tank Size - small tank:(");
	 else
		 System.out.println("Fuel tank Size - big tank,travel big:)");
 }
}
