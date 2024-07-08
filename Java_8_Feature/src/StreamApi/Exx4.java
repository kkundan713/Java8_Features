package StreamApi;

import java.util.stream.Stream;

class Employee1{
	String name;
	int age;
	double salary;
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
}

public class Exx4 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1("Ramesh",35, 45000.00);
		Employee1 e2=new Employee1("Kundan",25, 55000.00);
		Employee1 e3=new Employee1("Dinesh",35, 45000.00);
		Employee1 e4=new Employee1("RaviTeja",30, 45000.00);
		Employee1 e5=new Employee1("Nandani",35, 65000.00);
		
		
		Stream<Employee1> list = Stream.of(e1,e2,e3,e4,e5);
		list.filter(s->s.salary>=50000.00).map(s->s.name+"-"+ s.age).forEach(i->System.out.println(i));
		

	}

}
