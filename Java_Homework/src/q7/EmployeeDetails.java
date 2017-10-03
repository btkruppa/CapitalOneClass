package q7;

public class EmployeeDetails {
	
	private String employeeName;
	private String employeeDepartment;
	private int employeeAge;
	
	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(String employeeName, String employeeDepartment, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment
				+ ", employeeAge=" + employeeAge + "]";
	}
	
}
