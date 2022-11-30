package pack1.group.by;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMain 
{
	public static void main(String[] args) 
	{
		User u1 = new User("Ram",1000,"India");
		User u2 = new User("Anil",2000,"Caneda");
		User u3 = new User("Sunil",3000,"India");
		User u4 = new User("Orle",4000,"Japan");
		User u5 = new User("Cathie",5000,"UK");
		User u6 = new User("Ching chong",1000,"China");
		
		List<User> users = Arrays.asList(u1,u2,u3,u4,u5,u6);
		
		Map<String,List<User>> groupBy =users.stream()
		.collect(Collectors.groupingBy(s->s.getCountry()));
		
		System.out.println("Groping with respect to Country >> "+groupBy);
		

		
	}

}
