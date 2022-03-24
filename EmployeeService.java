package com.testing.juitilminiproject;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
class AccountNumberIncorrectException extends Exception{
	public AccountNumberIncorrectException(String message) {
		super(message);
	}
}

public class EmployeeService {
	List<Employee> ls=new ArrayList<Employee>();
	
	//adding employee details
	public void addEmployee(long id, String name,double salary,String city,String pinCode) {
		Address as=new Address(city,pinCode);
		ls.add(new Employee(id,name,salary,as));
	}
	public void displayAccount() {
		System.out.println("Customer Data");
		for(Employee emp: ls) {
				System.out.println("Employee id : " +emp.getId());
				  System.out.println("Employee name : " +emp.getName());
				  System.out.println("Employee salary : " +emp.getSalary());
				  System.out.println("Employee city : " +emp.getAddress().getCity());
				  System.out.println("Employee pincode : " +emp.getAddress().getPinCode());
		}
	}
	public int employeeLength() {
		int i;
		i=ls.size();
		return i;
	}
	public void employeeNot(long sh) throws Exception {
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).getId()==sh){
				System.out.println("It as the employee");
			}else {
				throw new AccountNumberIncorrectException("Id number not found!");
			}
		}
	}
	public double calYearlySal(long sh) {
		double yearlySal = 0;
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).getId()==sh){
				yearlySal=ls.get(i).getSalary() *12;
			}
		}
		return yearlySal;
	}
	public double calAppraisal(long sh) {
		double Appraisal = 0;
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).getId()==sh){
				if(ls.get(i).getSalary() < 10000) {
					Appraisal = 500;
				}else {
					Appraisal = 1000;
				}
			}
		}
		return Appraisal;
	}
}
