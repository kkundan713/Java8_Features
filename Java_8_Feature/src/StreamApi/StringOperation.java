package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeOpe {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public EmployeeOpe(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}

public class StringOperation {
	public static void main(String[] args) {
		List<EmployeeOpe> emps = new ArrayList<EmployeeOpe>();

		emps.add(new EmployeeOpe(1, "Kundan", 25, "Male", "HR", 2022, 50000.00));
		emps.add(new EmployeeOpe(2, "Ayush", 26, "Male", "Sales", 2021, 55000.00));
		emps.add(new EmployeeOpe(3, "Ashok", 28, "Male", "Finance", 2020, 60000.00));
		emps.add(new EmployeeOpe(4, "Kalyani", 22, "Female", "Security", 2010, 150000.00));
		emps.add(new EmployeeOpe(5, "Suresh", 24, "Male", "Development", 2012, 70000.00));
		emps.add(new EmployeeOpe(6, "Ramesh", 30, "Male", "HR", 2016, 250000.00));
		emps.add(new EmployeeOpe(7, "Gita", 23, "Female", "Infrastructure", 2017, 300000.00));
		emps.add(new EmployeeOpe(8, "Gita", 20, "Female", "Sales", 2019, 650000.00));
		emps.add(new EmployeeOpe(9, "Swathi", 21, "Female", "Security", 2022, 850000.00));
		emps.add(new EmployeeOpe(10, "Nitin", 29, "Male", "Finance", 2015, 950000.00));
		emps.add(new EmployeeOpe(11, "Nandani", 35, "Female", "Development", 2011, 580000.00));
		emps.add(new EmployeeOpe(12, "Buttler", 31, "Male", "IT", 2014, 970000.00));
		emps.add(new EmployeeOpe(13, "Rohit", 32, "Male", "HR", 2024, 100000.00));
		emps.add(new EmployeeOpe(14, "Surya", 27, "Male", "Sales", 2015, 7250000.00));
		emps.add(new EmployeeOpe(15, "Dinessh", 19, "Male", "Security", 2020, 950000.00));
		emps.add(new EmployeeOpe(16, "Sangita", 19, "Female", "IT", 2021, 880000.00));

		// 1.How many male and Female are there in the organization.
		/*
		 * Map<String, Long> count =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getGender,Collectors
		 * .counting())); System.out.println(count);
		 */

		// 2.Print the name of all departments in the organization.
		/*
		 * emps.stream().map(EmployeeOpe::getDepartment)
		 * .distinct().forEach(i->System.out.println(i));
		 */

		// 3.What is average age of male and female employees.
		/*
		 * Map<String, Double> average =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getGender,Collectors
		 * .averagingInt(EmployeeOpe::getAge))); System.out.println(average);
		 */

		/*
		 * //4.Get the details of highest paid employee in the organization.
		 * Optional<EmployeeOpe> salary =
		 * emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeOpe
		 * ::getSalary))); if(salary.isPresent()) { EmployeeOpe emp =salary.get();
		 * System.out.println(emp);
		 */

		// Get the name of all employee who joined after 2015.
		/*
		 * emps.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.name).forEach(i->
		 * System.out.println(i));
		 */

		// 5.Count the no. of employee of each department.
		/*
		 * Map<String, Long> dept =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getDepartment,
		 * Collectors.counting())); System.out.println(dept);
		 */

		// 5.What is average salary of each department.

		/*
		 * Map<String, Double> sal =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getDepartment
		 * ,Collectors.averagingDouble(EmployeeOpe::getSalary)));
		 * System.out.println(sal);
		 *
		 */

		// Get the details of youngest male employee in the Development department.
		/*
		 * Optional<EmployeeOpe> min =
		 * emps.stream().filter(e->e.getGender().equals("Male") &&
		 * e.getDepartment().equals("Development")).min(Comparator.comparing(EmployeeOpe
		 * ::getAge)); if(min.isPresent()) {
		 * 
		 * System.out.println(min.get());
		 */

		// Who is the most expression employee in the Organization.
		/*
		 * Optional<EmployeeOpe> collect =
		 * emps.stream().collect(Collectors.minBy(Comparator.comparing(EmployeeOpe::
		 * getYearOfJoining)));
		 * 
		 * if(collect.isPresent()) { System.out.println(collect.get());
		 */

		// How many males and Females employee are in the sales team.
		/*
		 * Map<String, Long> collect = emps.stream().
		 * filter(e->e.getDepartment().equals("Sales")).
		 * collect(Collectors.groupingBy(EmployeeOpe::getGender,Collectors.counting()));
		 * 
		 * System.out.println(collect);
		 */

		// What is average salary of male and female employees
		/*
		 * Map<String, Double> sal =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getGender
		 * ,Collectors.averagingDouble(EmployeeOpe::getSalary)));
		 * System.out.println(sal);
		 */

		// List down the all employees in each department.

		/*
		 * Map<String, List<EmployeeOpe>> collect =
		 * emps.stream().collect(Collectors.groupingBy(EmployeeOpe::getDepartment));
		 * System.out.println(collect);
		 */

		// What is the average salary and total salary of whole organization.

		/*
		 * DoubleSummaryStatistics collect2 =
		 * emps.stream().collect(Collectors.summarizingDouble(EmployeeOpe::getSalary));
		 * System.out.println(collect2);
		 */       
		
		// Separate the employees who are younger or equals to 25 years from those employee who are older than 25 years.
                 
		/*
		 * Map<Boolean, List<EmployeeOpe>> collect =
		 * emps.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
		 * System.out.println(collect);
		 */
		// who is the oldest employee in the organization/
                  Optional<EmployeeOpe> max = emps.stream().max(Comparator.comparingInt(EmployeeOpe::getAge));
                  if(max.isPresent()) {
                	  System.out.println(max.get());
                  }
	}

}
