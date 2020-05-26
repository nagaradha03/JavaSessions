
public class Employee {
	public String name;
	public int age;
	private int salary;
	
	public Employee(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void getAddress() {
		System.out.println("Employee address");
	}

	public int getSalary() {
		return salary;
	}
	private void getAccount() {
		System.out.println("Employee getAccount");
	}
	
	public void getEmployeeBankData() {
		getAccount();
	}
	public static void main(String[] args) {
		
		Employee e=new Employee("moni",9,30000);
		System.out.println(e.age);
		
		System.out.println(e.name);
		System.out.println(e.salary);

	}

}
