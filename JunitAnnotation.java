package testing.juniTestProject;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;
public class JunitAnnotation {
	
	   @BeforeClass
	   public static void beforeClass() {
	      System.out.println("in before class");
	   }

	   @AfterClass
	   public static void  afterClass() {
	      System.out.println("in after class");
	   }

	   @Before
	   public void before() {
	      System.out.println("in before");
	   }
		
	   @After
	   public void after() {
	      System.out.println("in after");
	   }
		
	   //test case
	   @Test
	   public void test() {
	      System.out.println("in test");
	   }
		
	   //test case ignore and will not execute
	   @Ignore
	   public void ignoreTest() {
	      System.out.println("in ignore test");
	   }
}
