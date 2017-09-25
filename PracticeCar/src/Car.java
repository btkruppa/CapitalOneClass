import java.util.ArrayList;
import java.util.List;

public class Car {
	
	

	Engine e =new Engine(75,true);
	Fueltank ft=new Fueltank(6);
	Wheels w=new Wheels(4);
	
 public void run(int x){
	 System.out.println("run method from car");
	
		
	 List<Carpart> cp=new ArrayList();
	 cp.add(e);
cp.add(ft);
cp.add(w);
	
	
		
	Object o=(cp.get(x));
	if(o instanceof Carpart)
		((Carpart) o).function();
	
	
 }
}
