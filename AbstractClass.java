package classexample;

interface demo{
	public void method1();
	public void method2();
}
interface demo1 extends demo{
	public void method1();
	public void method3();
}
class ex implements demo {
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
	public void method3() {
		System.out.println("method3");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		ex c=new ex();
		c.method1();
		c.method2();
		c.method3();
	}
}
