package testing.juniTestProject;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.Assumptions;
@DisplayName("testing calculator")
class CalculatorTest {
	private Calculator cal;
	
	@BeforeAll
    static void beforeAll()
	{
		System.out.println("This will run before all");
	}
	
	@AfterAll
	static void  afterAll()
	{
		System.out.println("This will run before all");
	}
	
	@BeforeEach
	void setUP()
	{
	 cal=new Calculator();
	 System.out.println("before each case");
	}
	
	@AfterEach
	void tearDown()
	{
		System.out.println("Clean Up code");
	}
	
	

	@Test
	@DisplayName("testing findMax method")
	public void testFindMax()
	{	
		
		int arr[]=new int[] {-10,-3,-1,-89,-4};
		//assertEquals(10, Calculator.findMax(new int[]{10,3,5,2,9}));
		assertEquals(-1, cal.findMax(arr),"error has occured");
		
	}
	
	@Test
	@DisplayName("testing exception")
	public void testDivide()
	{
		
		assertThrows(ArithmeticException.class,()-> cal.divide(10, 0),"divide by zero should throw");
	}
	
	@Test
	@DisplayName("to check null and true")
	public void test()
	{
		int num=7;
		String name="rajiv";
		
	//checking false condition
		assertFalse(num>10);//asserting condition should false
		
		//checking true condition
		assertTrue(num>10); //expecting true
		
		//check for not null
		assertNotNull(name);//expecting not null
		
		//check for null
		assertNull(name); //expecting null
		
	}
	@Nested
	class AddTest{
	
	@Test
	@DisplayName(value = "additing two positive number")
	@EnabledOnOs(value= {OS.WINDOWS,OS.LINUX})
	void testAddTwoPositiveNumber()
	{
		//conditional test
		boolean assumption=true;
	
		assumeTrue(assumption);
		//if above assumptions is true,then rest of test will proceed
		assertEquals(30, cal.add(20, 10));
	}
	
	@Test
	@DisplayName(value = "additing one positive and one negtative number")
	//@EnabledOnJre(value = JRE.JAVA_8)
	@EnabledForJreRange(min=JRE.JAVA_8,max = JRE.JAVA_16)
	void testAddOnePositiveOneNegativeNumber()
	{
		boolean assumption=false;
	
		assumeFalse(assumption);
		//if above assumptions is false,then rest of test will proceed
		assertEquals(30, cal.add(20, -10));
	}
	
	@Test
	@DisplayName("testing add method")
	public void AddTest() {
	
		
		 int expected=20; int actual=cal.add(10, 12);
		 
		//assertEquals(expected, actual);
		assertEquals(20, cal.add(1, 10),"two number should add");
	}
	
	}//nested class 
	
	@Test
	@DisplayName("to test assertAll annotation")
	void testMultiply()
	{
	 
		assertAll(
		()->assertEquals(4, cal.multiply(2, 2)),
		()->assertEquals(0, cal.multiply(2, 0)),
		()->assertEquals(-2, cal.multiply(2, -1))
		);
	}
	
}
















