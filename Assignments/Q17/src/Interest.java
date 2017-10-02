
public class Interest {

	private double interest;
	private double principal;
	private double time;
	private double total;
	
	public Interest(double inter, double prin, double tm) {
		super();
		this.interest = inter / 100;
		this.principal = prin;
		this.time = tm;
		
		total = principal * interest * time;
		
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
