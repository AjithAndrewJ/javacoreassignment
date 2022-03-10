package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classexample.Calculate;

class CalculateTest {
	Calculate cal;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Aj1");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("Aj2");
	}
	@BeforeEach
	void init() {
		cal=new Calculate();
		System.out.println("AjA");
	}
	@AfterEach
	void cleanUp(){
		System.out.println("AjB");
	}
	@Test
	void addTest() {
		assertEquals(20,cal.add(10,10));
	}
	@Test
	void mulTest() {
		assertEquals(10,cal.mul(1,10));
	}
	@Test
	void maxTest() {
		assertEquals(9,cal.max(new int[]{1,2,5,7,8,9}));
	}
	@Test
	void errorTest() {
		assertThrows(ArithmeticException.class,()->cal.divide(10,0),"Exception");
	}
}
