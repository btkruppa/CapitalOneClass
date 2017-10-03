package q18;

public class MainClass {

	public static void main(String[] args) {
		String str = "Learning Core Java";
		String num = "10";
		ConcreteClass cc = new ConcreteClass();
		System.out.println("Is there an Uppe Case: " + cc.isUpperCase(str));
		System.out.println("Conver Lower to Upper Case: "  + cc.lowerToUpper(str));
		cc.stringToIntAddTen(num);

	}

}
