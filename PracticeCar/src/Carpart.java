
public class Carpart implements Drivable{
 int durability;
 
 
 public Carpart(int durability){
	 //super();
	 this.durability=durability;	
	 System.out.println("carpart constructor " + durability);
 }
 
 public void function(){
	 System.out.println("Have a good drive");
 }
 
 public void status(){
	 
		if (this.durability < 10){
				System.out.println("Driving status -not a good state to drive");
			} else if ( this.durability >= 11 && this.durability <= 50){
				System.out.println("Driving status -need maintenance");
			} else if (this.durability >= 51 && this.durability <=70){
				System.out.println("Driving status -Service due");
			} else if (this.durability >= 71 && this.durability <=100){
				System.out.println("Driving status -Enjoy yr long drive!!!");
			} else {
				System.out.println("Driving status -Status unknown");
	 				}
	 }
 }
 
