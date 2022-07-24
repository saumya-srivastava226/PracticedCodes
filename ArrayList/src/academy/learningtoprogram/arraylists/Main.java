package academy.learningtoprogram.arraylists;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("Jane","Jones",123));
		employeeList.add(new Employee("Mark","Zuckerburg",456));
		employeeList.add(new Employee("Gauri","Srivastava",786)); 
		
		employeeList.forEach(employee->System.out.println(employee));// this is a lambda expression
		
		// An arrayList is backed by an array and if we want to access 2nd element, we will write index1
		System.out.println(employeeList.get(1));
		
		// To check if an arrayList is empty
		System.out.println(employeeList.isEmpty());
		
		// We can replace employee at one position with another employee
		employeeList.set(1, new Employee("Jane","Austen",123));
		employeeList.forEach(employee->System.out.println(employee));

		System.out.println(employeeList.size());
		// We can also add an element at a particular index.
		employeeList.add(2,new Employee("Saumya","Srivastava",777));
		employeeList.forEach(employee->System.out.println(employee));
		
		Employee[] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee:employeeArray) {
			System.out.println(employee);
		}
	}

}
