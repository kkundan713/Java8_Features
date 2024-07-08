package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		List<Person> person=new ArrayList<>();
		person.add(new Person(45,"Kundan"));
		person.add(new Person(89,"Ayush"));
		person.add(new Person(100,"Puja"));
		person.add(new Person(8,"Jyoti"));
		person.add(new Person(50,"Ramesh"));
		
		Comparator<Person> com=new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getPersonId()-o2.getPersonId();
			}
		};
		Collections.sort(person,com);

        System.out.println(" sort persons by age in ascending order");
        for (Person person1 : person) {
            System.out.println(" Person name : " + person1.getPersonName());
        }

	}

}
