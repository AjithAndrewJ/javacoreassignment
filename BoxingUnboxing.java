package classexample;

class Final{
	final int id=100;
	String name="Andrew";
}
class Final_1 extends Final{
	public void display() {
		System.out.println("Id : "+id+"\nName : "+name);
	}
}
public class BoxingUnboxing {

	public static void main(String[] args) {
		//final keyword
		Final_1 f=new Final_1();
		f.display();
		
		//boxing
		int a=56;
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		
		//un_boxing
		Character b=Character.valueOf('a');
		char c=b;
		System.out.println(c);
		
		//non_primitive-To-primitive
		String s="23";
		Integer n=Integer.parseInt(s);
		System.out.println(n);
		
		
		BoxingUnboxing ch=new BoxingUnboxing();
		ch=null;
		System.out.println(ch);
		System.gc();
	}
}
