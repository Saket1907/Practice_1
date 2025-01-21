package com.reprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindThroughDeptViaEmployeeId {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        List<Department> empDept = new ArrayList<>();
        List<String> empListToStore = new ArrayList<>();

        empList.add((new Employee("saket", 001)));
        empList.add((new Employee("kumar", 002)));
        empList.add((new Employee("ravi", 003)));
        empList.add((new Employee("kishan", 004)));
        empList.add((new Employee("shuklaji", 005)));
        empList.add((new Employee("bihari", 006)));
        empList.add((new Employee("bengali", 007)));
        empList.add((new Employee("punjabi", 80)));
        empList.add((new Employee("marwari", 77)));

        empDept.add(new Department("Manager", 001));
        empDept.add(new Department("Lead", 002));
        empDept.add(new Department("Developer", 003));
        empDept.add(new Department("Security", 004));

        Map<Integer, Integer> myMapToDoSomeThing = new HashMap<>();
        myMapToDoSomeThing.put(001, 002);
        myMapToDoSomeThing.put(002, 001);
        myMapToDoSomeThing.put(003, 004);
        myMapToDoSomeThing.put(004, 003);
        myMapToDoSomeThing.put(005, 004);
        myMapToDoSomeThing.put(006, 003);
        myMapToDoSomeThing.put(007, 002);
        myMapToDoSomeThing.put(80, 002);
        myMapToDoSomeThing.put(77, 001);

        System.out.println("---- ADDED ----");

        for(Entry<Integer, Integer> entry : myMapToDoSomeThing.entrySet()){
            for(Employee e : empList){
                for(Department d : empDept){
                    if(d.getDeptName().startsWith("S")){
                        System.out.println(entry);
                    }
                }
            }
        }

        System.out.println(empListToStore);
    }
}
