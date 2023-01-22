package com.bridgelabz.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage employeeWage = new EmployeeWage();
		System.out.println("-----Accenture-------");
		employeeWage.wage("Accenture", 20, 22, 90);
		System.out.println("------------------------");
		System.out.println("--------Flipkart--------");
		employeeWage.wage("Flipkart", 18, 26, 95);
		System.out.println("--------------------------");
		System.out.println("--------EasyBuy----------");
		employeeWage.wage("EasyBuy", 25, 24, 98);
	}
}
