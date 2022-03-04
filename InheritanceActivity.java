package Employee;

class Employee {
	private long employeeId,employee_Phone;
	private String employeeName,employee_Address;
	protected double basicSalary;
	private double specialAllowance=250.80;
	private double hra=1000.50;
	public Employee(long employeeId, String employeeName, String employee_Address, long employee_Phone,double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employee_Address = employee_Address;
		this.employee_Phone = employee_Phone;
		this.basicSalary=basicSalary;
	}
	public void calculateSalary() {
		double salary;
		salary = basicSalary + ((basicSalary*specialAllowance)/100) + ((basicSalary*hra)/100);
		System.out.println("Id: "+employeeId+"\nName: "+employeeName+"\nAddress: "+employee_Address+"\nPhone: "+employee_Phone+"\nSalary: "+salary);
	}
	public void  calculateTransportAllowance() {
		double  transportAllowance;
		transportAllowance =(10*basicSalary)/100;
		System.out.println("Transport Allowance: "+transportAllowance);
	}
}

class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employee_Address, long employee_Phone, double basicSalary) {
		super(employeeId, employeeName, employee_Address, employee_Phone, basicSalary);
	}
	public void  calculateTransportAllowance() {
		double transportAllowance =(15*basicSalary)/100;
		System.out.println("Transport Allowance: "+transportAllowance);
	}
	
}

class Trainee extends Employee{

	public Trainee(long employeeId, String employeeName, String employee_Address, long employee_Phone, double basicSalary) {
		super(employeeId, employeeName, employee_Address, employee_Phone, basicSalary);
	}
}

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager manager=new Manager(126534,"Peter","Chennai India",237844,65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();
	}
}