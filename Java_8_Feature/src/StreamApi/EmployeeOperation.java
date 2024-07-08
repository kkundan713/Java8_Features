package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {
	List<Employee> l=new ArrayList<>();
	
	
	
	l.add(new Employee(865,"Kundan",25,45000,"Male"));
	l.add(new Employee(885,"Ayush",26,28000,"Male"));
	l.add(new Employee(840,"Jyoti",19,55000,"Female"));
	l.add(new Employee(128,"Hari",230,65000,"Male"));
	l.add(new Employee(821,"Puja",23,45500,"Female"));
	//System.out.println(l);
	List<Employee> st=l.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
	//System.out.println(st);
	
	List<Employee> st1=l.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
	
	System.out.println("Accending Order="+st1);
	
	
	
	List<Employee> st2=l.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
	System.out.println("Decending Order="+st2);
	
	
	//Employee salary increase 
	List<Employee> increaseSalary=l.stream().map(e->{
		if(e.getAge()>25) {
			e.setSalary(e.getSalary()*1.10);
		}
		
		return e;
	}).collect(Collectors.toList());
	
	System.out.println("Salary Increases="+increaseSalary);
	
	
	
	
	List<Employee> ls=l.stream().sorted((o1, o2) ->(o2.getEmpName().compareTo(o1.getEmpName()))).collect(Collectors.toList());
	
	System.out.println("Name Sorted="+ls);
	}
	
	


}
