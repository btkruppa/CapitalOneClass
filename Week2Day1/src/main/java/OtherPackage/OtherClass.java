package OtherPackage;

public class OtherClass {
	public class InnerClass {
		
	}

	static {
		System.out.println("other class static");
	}

	public OtherClass() {
		super();
		System.out.println("Other class object instatiated");
		// TODO Auto-generated constructor stub
	}

	public InnerClass doSomething() {
		return new InnerClass();

	}

}
