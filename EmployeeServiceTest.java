package test;


import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import entity.AccountNotFoundException;
import entity.Address;
import entity.Employee;
import entity.EmployeeService;

@TestMethodOrder(value=OrderAnnotation.class)
class EmployeeServiceTest {

	EmployeeService employeeService;
	
	List<Employee>list=new ArrayList<Employee>();
	@BeforeEach
	public  void setUp()
	{
		employeeService=new EmployeeService();	
		
	}
	
	
      @Test
      @DisplayName("testing add employee method")
      @Order(1)
	void AddEmployeetest() {
      employeeService.addEmployee(102, "raj", 30000, "nagpur");
    	  
	     assertEquals(1, employeeService.lengthOfList());
	}
      
      @Test
      @DisplayName("testing employee id present or not")
      @Order(value = 4)
      void findAccountTest()
      {
    	  employeeService.addEmployee(103, "raj", 30000, "nagpur");
    	  assertThrows(AccountNotFoundException.class, 
    			  ()->employeeService.findAccount(105));
      }
      
      
      @Test
      @DisplayName("calculate appriasal")
      @Order(2)
	   public void testCalculateAppriasal() {
    	  employeeService.addEmployee(102, "raj", 3000, "nagpur");
			
	      double appraisal = employeeService.calculateAppraisalById(102);
	      assertEquals(500, appraisal, 0.0);
	   }

	   @Test
	   @DisplayName("calculate yearly salary")
	   @Order(3)
	   public void testCalculateYearlySalary() {
		   employeeService.addEmployee(102, "raj", 30000, "nagpur");
				
	      double salary = employeeService.calculateYearlySalary(102);
	      assertEquals(360000, salary, 0.0);
	   }

	   @Test
	   @Disabled
	   @DisplayName("TDD method,this test should not run")
	   void testDisabled()
	   {
		   fail("This test should disbled");
	   }
	   
	   
	   
}
