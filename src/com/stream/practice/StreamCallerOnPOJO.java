package com.stream.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamCallerOnPOJO {

	public static void main(String[] args) {

		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee("Saket", "Developer", 30, 50000));
		listEmployee.add(new Employee("Kumar", "Sr Developer", 30, 60000));
		listEmployee.add(new Employee("Rahul", "Jr Developer", 30, 70000));
		listEmployee.add(new Employee("Rishi", "Legal", 30, 80000));
		listEmployee.add(new Employee("Ashish", "HR", 30, 90000));
		listEmployee.add(new Employee("Bharat", "Database", 30, 30000));
		listEmployee.add(new Employee("Vivek", "Entertainment", 30, 20000));
		listEmployee.add(new Employee("Dheeraj", "Useless", 30, 20230));
		listEmployee.add(new Employee("Dhananjay", "Useless", 30, 200));
		listEmployee.add(new Employee("Deepika", "Useless", 30, 20000));
		listEmployee.add(new Employee("Deepshikha", "Useless", 30, 205));
		listEmployee.add(new Employee("Dipali", "Useless", 30, 26545));
		listEmployee.add(new Employee("Dholu", "Useless", 30, 45678));
		listEmployee.add(new Employee("Deee", "Useless", 30, 237845));
		listEmployee.add(new Employee("Deee", "Useless", 30, 237845));

		System.out.println(listEmployee.toString());

		System.out.println("=======================================");

		System.out.println(listEmployee.stream()
				.filter(listEmployeeFilterOn -> listEmployeeFilterOn.getEmployeeName().startsWith("R"))
				.filter(listEmployeeFilterOnSalary -> listEmployeeFilterOnSalary.getEmployeeSalary() > 2000)
				.collect(Collectors.toCollection(ArrayList::new)));

		System.out.println("=======================================");

		long i = listEmployee.stream().filter(q -> q.getEmployeeName().startsWith("D")).count();
		System.out.println(i);
		
		long j = listEmployee.stream().count();
		long k = listEmployee.stream().distinct().count();
		System.out.println(j+" "+k);
		
		System.out.println("=======================================");
		
		int sumSal = listEmployee.stream().collect(Collectors.summingInt(Employee::getEmployeeSalary));
		System.out.println(sumSal);
		

		System.out.println("=======================================");

		System.out.println(listEmployee.stream()
				.sorted((dept1, dept2) -> dept1.getEmployeeName().compareTo(dept2.getEmployeeName()))
				.collect(Collectors.toList()));

		System.out.println("=======================================");		

		int avgSal = listEmployee.stream().mapToInt(q -> q.getEmployeeSalary()).sum();
		avgSal = avgSal/listEmployee.size();
		System.out.println(listEmployee.stream().filter(z -> z.getEmployeeSalary() > avgSal).filter(y -> y.getEmployeeName().startsWith("A")));

		listEmployee.stream().filter(k -> k.getEmployeeSalary().compare(listEmployee.stream().mapToInt(q -> q.getEmployeeSalary()).average())).filter(z -> z.getEmployeeName().startsWith("A"));

	}

}
