
public final class Employee {
	
	private final String firstName;
    private final String lastName;
    private final Address address;

    Employee(String firstName, String lastName, Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(address.getCity(),address.getState());
    }


    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public Address getAddress()
    {
    	return new Address(address.getCity(),address.getState());
    }

}
