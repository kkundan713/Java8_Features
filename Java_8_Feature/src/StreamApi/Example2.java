package StreamApi;

import java.util.stream.Stream;


public class Example2 {
	
	public static void main(String[] args) {
		
	
	User u1=new User("Kundan", 25);
	User u2=new User("Ayush", 20);
	User u3=new User("Nandani", 30);
	User u4=new User("Chandan", 45);
	User u5=new User("Ram", 55);
	User u6=new User("Priti", 15);
	   Stream<User> data = Stream.of(u1,u2,u3,u4,u5,u6);
	   data.filter(u->u.userAge>30 && u.userName.startsWith("C")).forEach(u->System.out.println(u));
	
	}
	
	
      
          

}

class User{
	String userName;
	int userAge;
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAge=" + userAge + "]";
	}

	public User(String userName, int userAge) {
		
		this.userName = userName;
		this.userAge = userAge;
	}
	
	
        
	
}
