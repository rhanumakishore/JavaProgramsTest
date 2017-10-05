
public class BinarySearchExample implements Comparable<BinarySearchExample>{
	
	private String city;
	private String state;
	
	
	
	public BinarySearchExample(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int compareTo(BinarySearchExample bin) {
		// TODO Auto-generated method stub
		return this.city.compareTo(bin.getCity());
	}

}
