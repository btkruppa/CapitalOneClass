package Q7Comparator;

import java.util.LinkedList;
import java.util.List;

//import Fruitbeans.Fruit;

public class TestEmp {

	public static void main(String[] args) {
		List<Employee> myList = new LinkedList<>();
		myList.add(new Employee("akila","card", 39));
		myList.add(new Employee("bhargavi","noncard", 19));
		myList.add(new Employee("zrunda","bank", 29));
		myList.add(new Employee("bevi","COF", 49));
		myList.add(new Employee("makila","IRIS", 9));
		
		
		Employee e=new Employee();
		
		myList.sort(e);
		System.out.println(myList);

	}

}
