package classexample;

class A{
	String name = "bob";
	public void eat() {
		System.out.println("The dog named "+name+" is eating");
	}
}
class B extends A{
	public void run() {
		System.out.println("The dog named "+name+" is running");
	}
}
interface C{
	public void bark();
}
class D extends B implements C{
	public void run() {
		super.run();
		System.out.println("The dog named "+name+" is running \n");
	}
	public void bark() {
		System.out.println("The dog named "+name+" is barking \n");
	}
	public void eat() {
		super.eat();
		System.out.println("The dog named "+name+" is eating \n");
	}
}

public class DimondProblem {
	public static void main(String[] args) {
		D d=new D();
		d.eat();
		d.run();
		d.bark();
	}
}
