
public class Salary extends Employee{
	private double Salary;
	
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	Salary(double Salary,String name, int number){
		super(name,number);
		this.Salary=Salary;
}
	@Override
	public double computePay() {
		return Salary/52.0;
	}
}
