package classexample;

class Employee extends Object{
	private int age;
	private String name;
	private long salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		Employee emp=(Employee)obj;
		return this.age==emp.age && this.salary==emp.salary;
	}
	public int hashCode() {
		return this.name.length()%10;
		
	}
}

public class ObjectsMethodAndHashCodeMethod {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setAge(22);
		e1.setName("Ajith Andrew J");
		e1.setSalary(100000);
		Employee e2=new Employee();
		e2.setAge(25);
		e2.setName("Mani Rohit H.P");
		e2.setSalary(100000);
		if(e1.hashCode()==e2.hashCode()) {
			System.out.println(e1.equals(e2));
		}else {
			System.out.println("Not equal");
		}
	}
}
