package com.employee.system;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PayrollSystem payrollSystem = new PayrollSystem();

	        FullTime emp1 = new FullTime("John Doe", 101, 5000.0);
	        PartTime emp2 = new PartTime("Jane Smith", 102, 30, 15.0);

	        payrollSystem.addEmployee(emp2);
	        payrollSystem.addEmployee(emp1);

	        System.out.println("Initial Employee Details:");
	        payrollSystem.displayEmployees();

	        System.out.println("\nRemoving Employee...");
	        payrollSystem.removeEmployee(101);

	        System.out.println("\nRemaining Employee Details:");
	        payrollSystem.displayEmployees();
	    }
	}


