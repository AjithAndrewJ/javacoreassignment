package classexample;

abstract class animal{
	String name;
	public animal(String name) {
		super();
		this.name=name;
	}
	abstract void eat();
}

class cat extends animal {
	public cat(String name) {
		super(name);
	}
	@Override
	void eat() {
		System.out.println("The cat name is : "+ name);
	}
}

public class InterfaClass {

	public static void main(String[] args) {
		cat c=new cat("Mani");
		c.eat();
	}
}
