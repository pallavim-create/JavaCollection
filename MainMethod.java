package collection;

import java.util.ArrayList;

public class MainMethod {
	public static void main(String[] args) {
		ArrayList<EmployeeList> employees = new ArrayList<>();
		
//		ArrayList<Employee> emp=new ArrayList<>();
//		Employee emp=add(new Employee("pallavi",23,"bangalore"));

		// Create and set data using setters
		EmployeeList emp1 = new EmployeeList();

		emp1.setName("Pallavi");
		emp1.setAge(20);
		emp1.setAddress("Bangalore");

		EmployeeList emp2 = new EmployeeList();
		emp2.setName("Prerana");
		emp2.setAge(26);
		emp2.setAddress("Hyderabad");

		EmployeeList emp3 = new EmployeeList();
		emp3.setName("Pranati");
		emp3.setAge(23);
		emp3.setAddress("Pune");

		EmployeeList emp4 = new EmployeeList();
		emp4.setName("Poorvi");
		emp4.setAge(23);
		emp4.setAddress("Chennai");

		// Add to list
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		System.out.println("********Remove********");
		employees.remove(0);
		//employees.get(emp1);

		// Display all employees
		for (EmployeeList emp : employees) {
			emp.display();
		}
	}

	private static Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
