package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestSalary {

	public static void main(String[] args) {
		List<Employee> empList  = Arrays.asList ( 
				new Employee(1, "Computer", 22000)
				,new Employee(2, "Computer", 12000)
				,new Employee(3, "Computer", 48000),
				new Employee(4, "Accounts", 35000)
				,new Employee(5, "Accounts", 27000));
		
		System.out.print(empList.stream().sorted((q1, q2) -> q2.getSalary() - q1.getSalary()).findFirst().get().getId());
		
		
			

	}

}
