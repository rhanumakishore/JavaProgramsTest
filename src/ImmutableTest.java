
public class ImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address= new Address("bangalore","karnataka");
		
		Employee emp1 = new Employee("hanuma","kishore",address);
		System.out.println("Before modificiation");
		System.out.println(emp1.getFirstName()+"----------------"+emp1.getLastName());
		System.out.println(emp1.getAddress().getCity()+"------------------"+emp1.getAddress().getState());
		emp1.getAddress().setCity("hyderabad");
		System.out.println("After modificiation");
		System.out.println(emp1.getFirstName()+"----------------"+emp1.getLastName());
		System.out.println(emp1.getAddress().getCity()+"------------------"+emp1.getAddress().getState());
		
		
		
		

	}

}
