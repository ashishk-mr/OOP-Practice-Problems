
public abstract class Employee {
	private String name;
	private int number;
	
	Employee(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + " Pay="+this.computePay()+"]\n";
	}
	
	public abstract double computePay();
}
