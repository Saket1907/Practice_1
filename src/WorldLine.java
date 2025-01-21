import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorldLine {

	public static void main(String[] args) {

		List<Employee> ls1 = new ArrayList<>();
		ls1.add(new Employee(1, 10000));
		ls1.add(new Employee(2, 20000));
		ls1.add(new Employee(3, 30000));
		ls1.add(new Employee(4, 40000));
		ls1.add(new Employee(5, 50000));
		ls1.add(new Employee(6, 60000));
		ls1.add(new Employee(7, 40000));
		List<Employee> ls2 = new ArrayList<>();
		ls2.add(new Employee(1, 60000));
		ls2.add(new Employee(2, 70000));
		List<Employee> ls3 = new ArrayList<>();
		ls3.add(new Employee(1, 80000));
		ls3.add(new Employee(2, 90000));
		ls3.add(new Employee(3, 100000));
		List<List<Employee>> allList = new ArrayList<>();
		allList.add(ls1);
		allList.add(ls2);
		allList.add(ls3);
		
		//allList.stream(q -> Stream.of(q)).filter(k -> k.getSalary() > 30000).distinct().forEach(p -> System.out.print(p));
		
		System.out.println(allList.stream().flatMap(q -> q.stream()).filter(k -> k.getSalary() > 30000).distinct().collect(Collectors.toList()));

	}

}

class Employee {
	int empNum;
	int salary;
	
	
	
	public Employee(int empNum, int salary) {
		super();
		this.empNum = empNum;
		this.salary = salary;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
