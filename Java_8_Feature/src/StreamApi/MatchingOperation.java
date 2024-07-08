package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person{
	String name;
	String country;
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}

public class MatchingOperation {
	
	


	public static void main(String[] args) {
		
		
		Person p1=new Person("Kundan","INDIA");
		Person p2=new Person("Dollar","USA");
		Person p3=new Person("Maxwal","Aus");
		Person p4=new Person("RaviTeja","India");
		 List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		 persons.stream().filter(p->p.country.equalsIgnoreCase("India"))
		 .map(e->e.name).collect(Collectors.toList()).forEach(i->System.out.println(i));
		 
		 
			/*
			 * persons.stream().filter(p->p.country.equalsIgnoreCase("India"))
			 * .collect(Collectors.toList()).forEach(e->System.out.println(e));
			 */
		
		
		
		
		/*
		 * List<Person> persons = Arrays.asList(p1,p2,p3,p4); Optional<Person> findAny =
		 * persons.stream().filter(p->p.country.equalsIgnoreCase("India")).findFirst();
		 * if(findAny.isPresent()) { System.out.println(findAny.get()); }
		 */
		
		/*
		 * boolean anymatch =
		 * persons.stream().anyMatch(p->p.country.equalsIgnoreCase("India"));
		 * System.out.println("Any Indian Available::?"+anymatch);
		 * 
		 * boolean allmatch =
		 * persons.stream().allMatch(p->p.country.equalsIgnoreCase("India"));
		 * System.out.println("All Indian Available::?"+allmatch);
		 * 
		 * boolean nomatch =
		 * persons.stream().noneMatch(p->p.country.equalsIgnoreCase("canada"));
		 * System.out.println("Any canadan Available::?"+nomatch);
		 */

	}

}
