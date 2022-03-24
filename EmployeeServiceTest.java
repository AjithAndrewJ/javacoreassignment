package com.testing.juitilminiproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeServiceTest {
	EmployeeService emp;
	@BeforeEach
	void setUp() {
		emp=new EmployeeService();
	}
	@Test
	@DisplayName("employee added or not")
	void checkAddTest() {
		emp.addEmployee(101,"Ajith Andrew J",100000,"Chennai","69");
		assertEquals(1,emp.employeeLength());
	}
	@Test
	@DisplayName("id present or not")
	void idTest() {
		emp.addEmployee(101,"Ajith Andrew J",100000,"Chennai","69");
		assertThrows(AccountNumberIncorrectException.class,()->emp.employeeNot(10));
	}
	@Test
	@DisplayName("calculating yearly sal")
	void calYearlySalTest() {
		emp.addEmployee(101,"Ajith Andrew J",100000,"Chennai","69");
		assertEquals(1200000,emp.calYearlySal(101));
	}
	@Test
	@Disabled
	@DisplayName("calculating appraisal")
	void calAppraisalTest() {
		emp.addEmployee(101,"Ajith Andrew J",100000,"Chennai","69");
		assertEquals(1000,emp.calAppraisal(101));
	}
}
