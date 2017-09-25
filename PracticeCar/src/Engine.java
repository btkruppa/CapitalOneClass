
public class Engine extends Carpart {


	Boolean engstate;
	int cylin;

    public Engine(int durability,Boolean engstate) {
		super(durability);
		this.engstate=engstate;
		System.out.println("This is engine durability from eng constructor "+ durability);
}



 
   
 
 public void ifengrunning(boolean engstate){
	 if (engstate==true)
	 System.out.println("Yay !!!Engine is running");
	 else
		 System.out.println("Nay :( Engine is NOT running");
 }
 //Uncalled function
 public void howmanycylin(int cylin){
	 if (cylin==4)
		 System.out.println("Your Car hav 4 cylinders");
	 else 
		 System.out.println("Your Car hav 6 cyclinders");
 }
 
 
 public void function(){
	 
	 ifengrunning(engstate);
	 System.out.println("This is overrided engine function " + durability);
 }


}
